<?php
header('Content-type: text/html; charset=UTF-8');


include_once 'BD/Opcoes_BD_Gerais.class.php';
include_once 'Biblioteca_Financeira.class.php';


$bib = new Biblioteca_Financeira;
$BD = new Opcoes_BD_Gerais;



$reg = $BD->get("select id_unidade, simbolo from unidades");	
if(count($reg) == 0)
$reg = array();


$materiais = $BD->get("select id_material_modelo, descricao, valor_unitario from materiais_modelo");	
if(count($materiais) == 0)
$materiais = array();

$mao = $BD->get("select id_mao_de_obra_modelo, descricao, valor_unitario from mao_de_obra_modelo");	
if(count($mao) == 0)
$mao = array();


$id_item_atual = 1;
$cod = 1;
$valor_item_temp = "0,00";


$sem_unidades = array();
$itens_ja_processados = array();


$ativa_novo_item = false;


echo "delete from itens_modelo;<br>";
echo "ALTER TABLE itens_modelo AUTO_INCREMENT = 1;<br>";

echo "delete from item_modelo_x_material_modelo;<br>";
echo "ALTER TABLE item_modelo_x_material_modelo AUTO_INCREMENT = 1;<br>";

echo "delete from item_modelo_x_mao_obra_modelo;<br>";
echo "ALTER TABLE item_modelo_x_mao_obra_modelo AUTO_INCREMENT = 1;<br>";

echo "delete from item_modelo_x_equipamento_modelo;<br>";
echo "ALTER TABLE item_modelo_x_equipamento_modelo AUTO_INCREMENT = 1;<br>";





echo "<br><br>-- arquivo 1.txt *************************** INICIO ";
echo "<br><br>";


$ponteiro = fopen ("../materiais_oficiais/1.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 16; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 2 || strlen($linha[2])==0 || strcasecmp ($linha[2], "#REF!")==0)
	continue;


	$linha[2] = preparaNome($linha[2]);


		if(strlen($linha[1])>0){
		
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
		
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[2])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[2]);
			}			
				
			
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[2]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[3] = getUnidade($linha[3]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[3], $value['simbolo'])==0){
					
				$linha[3] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[3]);
			$linha[3] = "0";
			}
		
		
		echo "'".$linha[3]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		
		$linha[4] = preparaMoeda($linha[4]);
		$linha[6] = preparaMoeda($linha[6]);
		
		$id_material = 0;
		$valor = "0,00"; 	
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[6]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[2], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[2], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[6]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;	
	

echo "<br><br>-- arquivo 1.txt *************************** FIM ";	
echo "<br><br>-- arquivo 2.txt *************************** INICIO ";
echo "<br><br>";
	

	
	

$ponteiro = fopen ("../materiais_oficiais/2.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 12; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 2 || strlen($linha[0])==0 || strcasecmp ($linha[0], "#REF!")==0)
	continue;

	$linha[0] = preparaNome($linha[0]);
	
	
		if(strlen($linha[2])==0){
		
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
	
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[0])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[0]);
			}	
	
	
		
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[0]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[1] = getUnidade($linha[1]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[1], $value['simbolo'])==0){
					
				$linha[1] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[1]);
			$linha[1] = "0";
			}
		
		
		echo "'".$linha[1]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		
		$linha[2] = preparaMoeda($linha[2]);
		$linha[3] = preparaMoeda($linha[3]);
		
		$id_material = 0;
		$valor = "0,00";
		
			foreach($materiais as $value){
					
				if(strcasecmp($linha[0], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[3]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
			//echo $linha[2]." ".$linha[3]." ".$valor_item_temp."<br>";
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[0], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[0], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[3]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
				//echo $linha[2]." ".$linha[3]." ".$valor_item_temp."<br>";
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;



echo "<br><br>-- arquivo 2.txt *************************** FIM ";	
echo "<br><br>-- arquivo 3.txt *************************** INICIO ";
echo "<br><br>";
	

	
	

$ponteiro = fopen ("../materiais_oficiais/3.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 12; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 2 || strlen($linha[0])==0 || strcasecmp ($linha[0], "#REF!")==0)
	continue;

	$linha[0] = preparaNome($linha[0]);
	
	
		if(strlen($linha[2])==0){
		
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
	
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[0])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[0]);
			}	
	
	
		
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[0]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[1] = getUnidade($linha[1]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[1], $value['simbolo'])==0){
					
				$linha[1] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[1]);
			$linha[1] = "0";
			}
		
		
		echo "'".$linha[1]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		$linha[2] = preparaMoeda($linha[2]);
		$linha[3] = preparaMoeda($linha[3]);
		
		$id_material = 0;
		$valor = "0,00"; 
		
			foreach($materiais as $value){
					
				if(strcasecmp($linha[0], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[3]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
			//echo $linha[2]." ".$linha[3]." ".$valor_item_temp."<br>";
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[0], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[0], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[3]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
				//echo $linha[2]." ".$linha[3]." ".$valor_item_temp."<br>";
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;







echo "<br><br>-- arquivo 3.txt *************************** FIM ";	
echo "<br><br>-- arquivo 4.txt *************************** INICIO ";
echo "<br><br>";
	

	
	

$ponteiro = fopen ("../materiais_oficiais/4.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 11; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 2 || strlen($linha[0])==0)
	continue;

	$linha[0] = preparaNome($linha[0]);
	
	
		if(strlen($linha[2])==0){
		
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
	
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[0])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[0]);
			}	
	
	
		
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[0]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[1] = getUnidade($linha[1]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[1], $value['simbolo'])==0){
					
				$linha[1] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[1]);
			$linha[1] = "0";
			}
		
		
		echo "'".$linha[1]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		
		$linha[2] = preparaMoeda($linha[2]);
		$linha[3] = preparaMoeda($linha[3]);
		
		$id_material = 0;
		$valor = "0,00"; 
		
			foreach($materiais as $value){
					
				if(strcasecmp($linha[0], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[3]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
			//echo $linha[2]." ".$linha[3]." ".$valor_item_temp."<br>";
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[0], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[0], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[3]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
				//echo $linha[2]." ".$linha[3]." ".$valor_item_temp."<br>";
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;






echo "<br><br>-- arquivo 4.txt *************************** FIM ";	
echo "<br><br>-- arquivo 5.txt *************************** INICIO ";
echo "<br><br>";
	

	
$indice = 0;	

$ponteiro = fopen ("../materiais_oficiais/5.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 10; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(strlen($linha[0])==0 || strcmp('DISCRIMINAÇÃO', $linha[2])==0)
	continue;
	
		if(strripos($linha[0], "COMPOSIÇÃO")!==false || 
		(strripos($linha[0], "COMP. ")!==false && strlen($linha[3])==0 && strlen($linha[4])==0)){
		
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
	
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[1])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[1]);
			}	
	
		
		
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".preparaNome($linha[1])."', ".
			 "'".$valor_item_temp."', ";
		
		$indice =0;
		if(strripos($linha[0], "COMP.")!==false)
		$indice =1;
		
		
		$linha[6+$indice] = getUnidade($linha[6+$indice]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[6+$indice], $value['simbolo'])==0){
					
				$linha[6+$indice] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[6+$indice]);
			$linha[6+$indice] = "0";
			}
		
		
		echo "'".$linha[6+$indice]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		
		$linha[2] = preparaNome($linha[2]);
		
		
		$linha[4+$indice] = preparaMoeda($linha[4+$indice]);
		$linha[5+$indice] = preparaMoeda($linha[5+$indice]);
		
		$id_material = 0;
		$valor = "0,00"; 
		
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[4+$indice]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[5+$indice]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strripos($linha[2], "Predeiro")!==false){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strripos($linha[2], $value['descricao'])!==false){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[4+$indice]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[4+$indice]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;




echo "<br><br>-- arquivo 5.txt *************************** FIM ";	
echo "<br><br>-- arquivo 6.txt *************************** INICIO ";
echo "<br><br>";
	

	


$ponteiro = fopen ("../materiais_oficiais/6.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 10; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(strlen($linha[0])==0 || strcmp('DISCRIMINAÇÃO', $linha[2])==0)
	continue;
	
		if(strripos($linha[0], "COMPOSIÇÃO")!==false || 
		
		(strripos($linha[0], "COMP. ")!==false && strlen($linha[5])==0 && strlen($linha[4])==0)){
		
		
			if(strcmp($valor_item_temp,"0,00")!=0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
	
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[1])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[1]);
			}	
	
		
		
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".preparaNome($linha[1])."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[7] = getUnidade($linha[7]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[7], $value['simbolo'])==0){
					
				$linha[7] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[7]);
			$linha[7] = "0";
			}
		
		
		echo "'".$linha[7]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		$linha[2] = preparaNome($linha[2]);
		$linha[5] = preparaMoeda($linha[5]);
		
		$id_material = 0;
		$valor = "0,00"; 
		
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[5]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[5]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strripos($linha[2], "Predeiro")!==false){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strripos($linha[2], $value['descricao'])!==false){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[5]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[5]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;








echo "<br><br>-- arquivo 6.txt *************************** FIM ";	
echo "<br><br>-- arquivo 7.txt *************************** INICIO ";
echo "<br><br>";
	

	
	

$ponteiro = fopen ("../materiais_oficiais/7.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 12; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 2 || strlen($linha[0])==0)
	continue;

	$linha[0] = preparaNome($linha[0]);
	
	
		if(strlen($linha[2])==0){
		
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
	
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[0])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[0]);
			}	
	
	
		
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[0]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[1] = getUnidade($linha[1]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[1], $value['simbolo'])==0){
					
				$linha[1] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[1]);
			$linha[1] = "0";
			}
		
		
		echo "'".$linha[1]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		
		//$linha[2] = preparaMoeda($linha[2]);
		
		$valor = "0,00";
		
		$linha[3] = preparaMoeda($linha[3]);
		
		$id_material = 0;
			
			foreach($materiais as $value){
					
				if(strcasecmp($linha[0], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[3]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[0], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[0], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[3]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[3]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;




echo "<br><br>-- arquivo 7.txt *************************** FIM ";	
echo "<br><br>-- arquivo 8.txt *************************** INICIO ";
echo "<br><br>";



$ponteiro = fopen ("../materiais_oficiais/8.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 14; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 6 || strlen($linha[2])==0)
	continue;

	$linha[2] = preparaNome($linha[2]);


		if(strlen(preg_replace("/[^(0-9 . , - )]/", "", $linha[1]))>0){ 
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
		
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[2])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[2]);
			}			
				
			
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[2]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[3] = getUnidade($linha[3]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[3], $value['simbolo'])==0){
					
				$linha[3] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[3]);
			$linha[3] = "0";
			}
		
		
		echo "'".$linha[3]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		$valor = "0,00"; 
		$linha[6] = preparaMoeda($linha[6]);
		
		$id_material = 0;
			
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[6]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[2], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[2], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[6]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;	





echo "<br><br>-- arquivo 8.txt *************************** FIM ";	
echo "<br><br>-- arquivo 9.txt *************************** INICIO ";
echo "<br><br>";



$ponteiro = fopen ("../materiais_oficiais/9.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 14; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 6 || strlen($linha[2])==0)
	continue;

	$linha[2] = preparaNome($linha[2]);


		if(strlen(preg_replace("/[^(0-9 . , - )]/", "", $linha[1]))>0){ 
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
		
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[2])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[2]);
			}			
				
			
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[2]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[3] = getUnidade($linha[3]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[3], $value['simbolo'])==0){
					
				$linha[3] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[3]);
			$linha[3] = "0";
			}
		
		
		echo "'".$linha[3]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		$valor = "0,00"; 
		$linha[6] = preparaMoeda($linha[6]);
		
		$id_material = 0;
			
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[6]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[2], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[2], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[6]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;







echo "<br><br>-- arquivo 9.txt *************************** FIM ";	
echo "<br><br>-- arquivo 10.txt *************************** INICIO ";
echo "<br><br>";



$ponteiro = fopen ("../materiais_oficiais/10.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 14; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 6 || strlen($linha[2])==0)
	continue;

	$linha[2] = preparaNome($linha[2]);


		if(strlen(preg_replace("/[^(0-9 . , - )]/", "", $linha[1]))>0){ 
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
		
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[2])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[2]);
			}			
				
			
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[2]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[3] = getUnidade($linha[3]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[3], $value['simbolo'])==0){
					
				$linha[3] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[3]);
			$linha[3] = "0";
			}
		
		
		echo "'".$linha[3]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		$valor = "0,00"; 
		$linha[6] = preparaMoeda($linha[6]);
		
		$id_material = 0;
			
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[6]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[2], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[2], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[6]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;







echo "<br><br>-- arquivo 10.txt *************************** FIM ";	
echo "<br><br>-- arquivo 11.txt *************************** INICIO ";
echo "<br><br>";



$ponteiro = fopen ("../materiais_oficiais/11.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 12; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 6 || strlen($linha[2])==0 || strcasecmp ($linha[2], "#REF!")==0)
	continue;

	$linha[2] = preparaNome($linha[2]);


		if(strlen($linha[4])==0 && strlen($linha[5])==0){ 
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
		
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[2])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[2]);
			}			
				
			
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[2]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[3] = getUnidade($linha[3]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[3], $value['simbolo'])==0){
					
				$linha[3] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[3]);
			$linha[3] = "17";
			}
		
		
		echo "'".$linha[3]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		$valor = "0,00"; 
		$linha[6] = preparaMoeda($linha[6]);
		
		$id_material = 0;
			
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[6]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[2], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[2], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[6]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
				}
			}
		
		}
	}
	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;







echo "<br><br>-- arquivo 11.txt *************************** FIM ";	
echo "<br><br>-- arquivo 12.txt *************************** INICIO ";
echo "<br><br>";



$ponteiro = fopen ("../materiais_oficiais/12.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 14; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 6 || strlen($linha[2])==0)
	continue;

	$linha[2] = preparaNome($linha[2]);


		if(strlen(preg_replace("/[^(0-9 . , - )]/", "", $linha[1]))>0){ 
		
			if(strcmp($valor_item_temp,"0,00")>0){
			
			echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
			$valor_item_temp = "0,00";
			}
	
		
		$controle = false;
		
			foreach($itens_ja_processados as $value){
			
				if(strcasecmp($value, $linha[2])==0){
				$controle = true;
				break;
				}
			}
		
			if($controle){
			
			$ativa_novo_item = true;
			continue;
			}
			else{
			
			$ativa_novo_item  = false;
			array_push($itens_ja_processados, $linha[2]);
			}			
				
			
		echo "insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values (";
	
		echo "'".$id_item_atual."', ".
			 "'ITM".str_pad($cod, 6, "0", STR_PAD_LEFT)."', ".
			 "'".$linha[2]."', ".
			 "'".$valor_item_temp."', ";
		
		
		$linha[3] = getUnidade($linha[3]);
		
		$control = false;
			
			foreach($reg as $value){
					
				if(strcasecmp($linha[3], $value['simbolo'])==0){
					
				$linha[3] = 	$value['id_unidade'];	
				$control = true;
				break;
				}
			}
			
			if(!$control){
				
			array_push($sem_unidades, $linha[3]);
			$linha[3] = "17";
			}
		
		
		echo "'".$linha[3]."', 'ATIVO', 'NAO', 'NORMAL');<br>";
		
		
		$id_item_atual++;
		$cod++;
		}
		else{
		
		if($ativa_novo_item)
		continue;
		
		$valor = "0,00"; 
		$linha[6] = preparaMoeda($linha[6]);
		
		$id_material = 0;
			
			foreach($materiais as $value){
					
				if(strcasecmp($linha[2], $value['descricao'])==0){
					
				$id_material = $value['id_material_modelo'];
				$valor = $value['valor_unitario'];
				break;
				}
			}
			
			if($id_material>0){
				
			echo "insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values (";
			echo "'".($id_item_atual-1)."', '".$id_material."', '".$linha[6]."');<br>";

			
			$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
			}
			else{
			

			$id_mao = 0;
			$valor = "0,00"; 
			
				foreach($mao as $value){
				
					if(strcasecmp($linha[2], "Predeiro")==0){
						
					$id_mao = 6;
					$valor = "5,21";
					break;
					}

				
					if(strcasecmp($linha[2], $value['descricao'])==0){
						
					$id_mao = $value['id_mao_de_obra_modelo'];
					$valor = $value['valor_unitario'];
					break;
					}
				}

			
				if($id_mao>0){
					
				echo "insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values (";
				echo "'".($id_item_atual-1)."', '".$id_mao."', '".$linha[6]."');<br>";

				
				$valor_item_temp = $bib->somaValorMonetario($aux = array($valor_item_temp, $bib->formataMoeda($bib->multiplicaValorMonetario($valor, $linha[6]))));
				}
			}
		
		}
	}

/*	
echo "UPDATE itens_modelo SET valor_unitario='".$valor_item_temp."' WHERE id_item_modelo=".($id_item_atual-1).";<br><br>";
$valor_item_temp = "0,00";	
$ativa_novo_item = false;
*/






















echo "<br><br>";
echo "<br><br>";

echo "unidades desconhecidas:<br>";

foreach($sem_unidades as $value)
echo $value."<br>";
	

echo "<br><br>materiais repetidos:<br>";

foreach($itens_ja_processados as $value)
echo $value."<br>";


	
	
	
	function preparaNome($nome){
		
	$nome = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($nome))), "UTF-8");
	$nome = strtoupper(substr($nome, 0 , 1)).substr($nome, 1);	
	
	return $nome;
	}
	
	
	
	
	
	
	function getUnidade($param){
	
	$param = str_replace("'", "", str_replace('"', "", trim($param)));
	
	
	if(strcmp($param, "U N")==0)
	$param = "un";
			
			if(strcmp($param, "L")==0)
			$param = "l";
			
			if(strcmp($param, "PÇ")==0)
			$param = "pç";
			
			if(strcmp($param, "M3")==0)
			$param = "m³";
		
			if(strcmp($param, "M2")==0)
			$param = "m²";
		
			if(strcmp($param, "ML")==0)
			$param = "m";
			
			if(strcmp($param, "Ml")==0)
			$param = "m";
		
			if(strcmp($param, "BR")==0)
			$param = "un";
		
			if(strcmp($param, "GL")==0)
			$param = "gal";
		
			if(strcmp($param, "MI")==0)
			$param = "mil";
		
			if(strcmp($param, "SC")==0)
			$param = "sac";
		
			if(strcmp($param, "H")==0)
			$param = "h";
			
			if(strcmp($param, "und")==0)
			$param = "un";	
		
			if(strcmp($param, "unid")==0)
			$param = "un";	
		
			if(strcmp($param, "H")==0)
			$param = "h";	
		
			if(strcmp($param, "h/prod")==0)
			$param = "h";	
		
			if(strcmp($param, "gl")==0)
			$param = "gal";	
		
			if(strcmp($param, "VB")==0)
			$param = "vb";	
		
			if(strcmp($param, "UND")==0)
			$param = "un";	
		
			if(strcmp($param, "Und")==0)
			$param = "un";
		
			if(strcmp($param, "Gl")==0)
			$param = "gal";
		
			if(strcmp($param, "U n")==0)
			$param = "un";
		
			if(strcmp($param, "U  n")==0)
			$param = "un";
			
			if(strcmp($param, "U N")==0)
			$param = "un";
		
			if(strcmp($param, "U N ")==0)
			$param = "un";
			
			if(strcmp($param, "Und.")==0)
			$param = "un";
		
			if(strcmp($param, "Unid")==0)
			$param = "un";
		
			if(strcmp($param, "H/prod")==0)
			$param = "h";
		
			if(strcmp($param, "Sc")==0)
			$param = "sac";
		
			if(strcmp($param, "Cento")==0)
			$param = "Cent";
		
			if(strcmp($param, "Mi")==0)
			$param = "mil";
		
			if(strcmp($param, "Br")==0)
			$param = "un";
		
			if(strcmp($param, " M3 ")==0)
			$param = "m³";
		
			if(strcmp($param, " UND ")==0)
			$param = "un";
		
			if(strcmp($param, "T")==0)
			$param = "h";
		
			if(strcmp($param, "t")==0)
			$param = "h";
		
			if(strcmp($param, "m2")==0)
			$param = "m²";
		
			if(strcmp($param, "m3")==0)
			$param = "m³";
		
			if(strcmp($param, "u n")==0)
			$param = "un";
		
			if(strcmp($param, " u n")==0)
			$param = "un";
		
			if(strcmp($param, "")==0)
			$param = "un";
		
			if(strcmp($param, "UNID")==0)
			$param = "un";
		
		
		
		
		return $param;
		}
	
	
	
	
	
	
	function preparaMoeda($nome){
		
	$nome = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($nome))), "UTF-8");
	$nome = preg_replace("/[^(0-9 . , - )]/", "", $nome);
	
	return $nome;
	}





	
?>