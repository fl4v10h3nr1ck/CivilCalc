<?php
header('Content-type: text/html; charset=UTF-8');


include_once 'BD/Opcoes_BD_Gerais.class.php';

$BD = new Opcoes_BD_Gerais;

$reg = $BD->get("select id_unidade, simbolo from unidades");

	
if(count($reg) == 0)
$reg = array();

$sem_unidades = array();


$materiais_ja_processados = array();


$cod = 1;


echo "delete from materiais_modelo;<br>";
echo "ALTER TABLE materiais_modelo AUTO_INCREMENT = 1;<br>";




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
	
	if(count($linha)< 7)
	continue;

	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[1])>0 || strlen($linha[2])==0 || strlen($linha[7])>0)
	continue;

		
	$control = false;
			
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
		
				
	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
	
	$control_valor = false;
	
		for( $i = 2; $i <= 5; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			
			

			case 3:
			$linha[$i] = getUnidade($linha[$i]);
		
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			}
	
		
			if($i== 4){
			
			if($linha[$i]==null || strlen($linha[$i])==0 || strcmp($linha[$i], "#ref!")==0)
			$linha[$i] = "0.00";
			
			/*
				if(strcmp($linha[$i], "#ref!")==0){
				$control_valor = true;
				continue;
				}*/	
			}
		
		
		
		
			if($i== 5){
				
			/*if($control_valor)
			$control_valor = false;
			else*/
			continue;
			}
	
	
		echo  "'".$linha[$i]."'";
	
	
		
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";

	$cod++;
	
	echo "<br>";
	}


echo "<br><br>-- arquivo 1.txt *************************** FIM ";	
echo "<br><br>-- arquivo 2.txt *************************** INICIO ";
echo "<br><br>";
	

	
/******************************************************************************************************/	


	
	
$ponteiro = fopen ("../materiais_oficiais/2.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 13; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	$linha[0] = str_replace("'", "", str_replace('"', "", trim($linha[0])));

	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 || strlen($linha[0])==0 ||
		strcmp($linha[0], "Carpinteiro")==0 || 
		 strcmp($linha[0], "Pintor")==0 || 
		 strcmp($linha[0], "Servente")==0 ||
		 strcmp($linha[0], "Encanador")==0 ||
		 strcmp($linha[0], "Armador")==0 ||
		 strcmp($linha[0], "Pedreiro")==0 ||
		 strcmp($linha[0], "Ajudante")==0 || 
		 strcmp($linha[0], "Eletricista")==0 ||
		 strcmp($linha[0], "Telhadista")==0 
		 )
	continue;

	
	$control = false;
	
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[0], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[0]);
				


	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 0; $i < 3; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			

			case 1:
			$linha[$i] = getUnidade($linha[$i]);
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 2:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			else
			$linha[$i] = str_replace(" ", "", str_replace("R$", "", $linha[$i]));
			
			break;
			}
	
		

		echo  "'".$linha[$i]."'";
	
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";
	
	$cod++;
	
	echo "<br>";
	}	
	
	

echo "<br><br>-- arquivo 2.txt *************************** FIM ";	
echo "<br><br>-- arquivo 3.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	


	
	
$ponteiro = fopen ("../materiais_oficiais/3.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 13; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(strlen($linha[0])==0)
	continue;
	
	if(count($linha)<2)
	continue;
	
	$linha[0] = str_replace("'", "", str_replace('"', "", trim($linha[0])));

	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 || strlen($linha[0])==0 ||
		strcmp($linha[0], "Carpinteiro")==0 || 
		 strcmp($linha[0], "Pintor")==0 || 
		 strcmp($linha[0], "Servente")==0 ||
		 strcmp($linha[0], "Encanador")==0 ||
		 strcmp($linha[0], "Armador")==0 ||
		 strcmp($linha[0], "Pedreiro")==0 ||
		 strcmp($linha[0], "Ajudante")==0 || 
		 strcmp($linha[0], "Eletricista")==0 ||
		 strcmp($linha[0], "Telhadista")==0 ||
		 strcmp($linha[0], "Auxiliar de serralheiro")==0 || 
		 strcmp($linha[0], "Serralheiro")==0 || 
		 strcmp($linha[0], strtoupper ("Ferreiro"))==0 ||
		strcmp($linha[0], strtoupper ("Carpinteiro"))==0 || 
		 strcmp($linha[0], strtoupper ("Pintor"))==0 || 
		 strcmp($linha[0], strtoupper ("Servente"))==0 ||
		 strcmp($linha[0], strtoupper ("Encanador"))==0 ||
		 strcmp($linha[0], strtoupper ("Armador"))==0 ||
		 strcmp($linha[0], strtoupper ("Pedreiro"))==0 ||
		 strcmp($linha[0], strtoupper ("Ajudante"))==0 || 
		 strcmp($linha[0], strtoupper ("Eletricista"))==0 ||
		 strcmp($linha[0], strtoupper ("Auxiliar de Serralheiro"))==0 ||
		 strcmp($linha[0], strtoupper ("Serralheiro"))==0 ||
		 strcmp($linha[0], strtoupper ("Telhadista"))==0 
		 )
	continue;

	
	$control = false;
	
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[0], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[0]);
				


	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 0; $i < 3; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			

			case 1:
			$linha[$i] = getUnidade($linha[$i]);
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 2:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			else
			$linha[$i] = str_replace(" ", "", str_replace("R$", "", $linha[$i]));
			
			break;
			}
	
		

		echo  "'".$linha[$i]."'";
	
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";
	
	$cod++;
	
	echo "<br>";
	}	


	
	
	
	
echo "<br><br>-- arquivo 3.txt *************************** FIM ";	
echo "<br><br>-- arquivo 4.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	


	
	
$ponteiro = fopen ("../materiais_oficiais/4.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 13; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(strlen($linha[0])==0)
	continue;
	
	if(count($linha)<2)
	continue;
	
	$linha[0] = str_replace("'", "", str_replace('"', "", trim($linha[0])));

	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 || strlen($linha[0])==0 ||
		strcmp($linha[0], "Carpinteiro")==0 || 
		 strcmp($linha[0], "Pintor")==0 || 
		 strcmp($linha[0], "Servente")==0 ||
		 strcmp($linha[0], "Encanador")==0 ||
		 strcmp($linha[0], "Armador")==0 ||
		 strcmp($linha[0], "Pedreiro")==0 ||
		 strcmp($linha[0], "Predeiro")==0 ||
		 strcmp($linha[0], "Ajudante")==0 || 
		 strcmp($linha[0], "Eletricista")==0 ||
		 strcmp($linha[0], "Telhadista")==0 ||
		strcmp($linha[0], strtoupper ("Carpinteiro"))==0 || 
		 strcmp($linha[0], strtoupper ("Pintor"))==0 || 
		 strcmp($linha[0], strtoupper ("Servente"))==0 ||
		 strcmp($linha[0], strtoupper ("Encanador"))==0 ||
		 strcmp($linha[0], strtoupper ("Armador"))==0 ||
		 strcmp($linha[0], strtoupper ("Pedreiro"))==0 ||
		 strcmp($linha[0], strtoupper ("Ajudante"))==0 || 
		 strcmp($linha[0], strtoupper ("Eletricista"))==0 ||
		 strcmp($linha[0], strtoupper ("Telhadista"))==0 
		 )
	continue;

	
	$control = false;
	
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[0], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[0]);
				


	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 0; $i < 3; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
			
			switch($i){
			

			case 1:
			$linha[$i] = getUnidade($linha[$i]);
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 2:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			else
			$linha[$i] = str_replace(" ", "", str_replace("R$", "", $linha[$i]));
			
			break;
			}
	
		

		echo  "'".$linha[$i]."'";
	
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";
	
	$cod++;
	
	echo "<br>";
	}	


	
	
	
	
	
	
	
echo "<br><br>-- arquivo 4.txt *************************** FIM ";	
echo "<br><br>-- arquivo 5.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	


	
	
$ponteiro = fopen ("../materiais_oficiais/5.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 11; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(strlen($linha[2])==0)
	continue;
	
	$linha[0] = str_replace("'", "", str_replace('"', "", trim($linha[0])));
	
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[0])==0 ||
		strcmp($linha[0], "Carpinteiro")==0 || 
		 strcmp($linha[0], "Pintor")==0 || 
		 strcmp($linha[0], "Servente")==0 ||
		 strcmp($linha[0], "Encanador")==0 ||
		 strcmp($linha[0], "Armador")==0 ||
		 strcmp($linha[0], "Pedreiro")==0 ||
		 strcmp($linha[0], "Ajudante")==0 || 
		 strcmp($linha[0], "Eletricista")==0 ||
		 strcmp($linha[0], "Telhadista")==0 ||
		strcmp($linha[0], strtoupper ("Carpinteiro"))==0 || 
		 strcmp($linha[0], strtoupper ("Pintor"))==0 || 
		 strcmp($linha[0], strtoupper ("Servente"))==0 ||
		 strcmp($linha[0], strtoupper ("Encanador"))==0 ||
		 strcmp($linha[0], strtoupper ("Armador"))==0 ||
		 strcmp($linha[0], strtoupper ("Pedreiro"))==0 ||
		 strcmp($linha[0], strtoupper ("Ajudante"))==0 || 
		 strcmp($linha[0], strtoupper ("Eletricista"))==0 ||
		 strcmp($linha[0], strtoupper ("Telhadista"))==0 ||
		 
		 strripos($linha[2], "Carpinteiro")!==false ||
		  strripos($linha[2], "Pintor")!==false ||
		   strripos($linha[2], "Servente")!==false ||
		    strripos($linha[2], "Encanador")!==false ||
			 strripos($linha[2], "Armador")!==false ||
			  strripos($linha[2], "Pedreiro")!==false ||
				strripos($linha[2], "Ajudante")!==false ||
			 strripos($linha[2], "Eletricista")!==false ||
			 strripos($linha[2], "Telhadista")!==false ||
		 
		 
		 
		 !strripos($linha[0], "COMPOSIÇÃO")===false ||
		 !strripos($linha[0], "SINAPI")===false
		 
		 )
	continue;

	
	$control = false;
	
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
				


	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
	
	$tipo_2 = false;

	
		for( $i = 0; $i <= 6; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
		
		if($i< 2)
		continue;

		
			if($i== 3){
			

				if(strlen($linha[$i])==0){
				$tipo_2  = true;
				continue;
				}
			
			$linha[$i] = getUnidade($linha[$i]);
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				echo "<br><br>".$linha[$i]."<br><br>";
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			}
			
			
			if($i== 4){
			
				if($tipo_2){
					
					
				$linha[$i] = getUnidade($linha[$i]);
		
				$control = false;
			
					foreach($reg as $value){
						
						if(strcasecmp($linha[$i], $value['simbolo'])==0){
						
						$linha[$i] = 	$value['id_unidade'];	
						$control = true;
						break;
						}
					}
				
					if(!$control){
					
					echo "<br><br>".$linha[$i]."<br><br>";
					
					array_push($sem_unidades, $linha[$i]);
					$linha[$i] = "0";
					}		
				}
				else
				continue;
			}
			
			if($i== 5){
			
			if($tipo_2)
			continue;
		
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			else
			$linha[$i] = str_replace(" ", "", str_replace("R$", "", $linha[$i]));
			}
			
			
			if($i== 6){
			
				if($tipo_2){
					
				if($linha[$i]==null || strlen($linha[$i])==0)
				$linha[$i] = "0.00";
				else
				$linha[$i] = str_replace(" ", "", str_replace("R$", "", $linha[$i]));
				}
				else
				continue;
			}
	
		

		echo  "'".$linha[$i]."'";
	
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";
	
	$cod++;
	
	echo "<br>";
	}	


		
	
	
	
	
	
	
	
echo "<br><br>-- arquivo 5.txt *************************** FIM ";	
echo "<br><br>-- arquivo 6.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	


	
	
$ponteiro = fopen ("../materiais_oficiais/6.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 11; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	$linha[0] = str_replace("'", "", str_replace('"', "", trim($linha[0])));
	
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[0])==0 || strlen($linha[2])==0 ||
		
		 
		 strripos($linha[2], "Carpinteiro")!==false ||
		  strripos($linha[2], "Pintor")!==false ||
		   strripos($linha[2], "Servente")!==false ||
		    strripos($linha[2], "Encanador")!==false ||
			 strripos($linha[2], "Armador")!==false ||
			  strripos($linha[2], "Pedreiro")!==false ||
				strripos($linha[2], "Ajudante")!==false ||
			 strripos($linha[2], "Eletricista")!==false ||
			 strripos($linha[2], "Telhadista")!==false ||
		 
		
		strripos($linha[2], "CAMINHAO")!==false ||
		strripos($linha[2], "TRANSPORTE")!==false ||
		
		 
		 strripos($linha[0], "COMPOSIÇÃO")!==false ||
		 strripos($linha[0], "COMP. ")!==false ||
		 !strripos($linha[0], "SINAPI")===false
		 
		 )
	continue;

	
	$control = false;
	
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
				


	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 0; $i <= 6; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
		
		if($i< 2 || $i==3 || $i==5)
		continue;

		
			switch($i){
			

			case 4:
			$linha[$i] = getUnidade($linha[$i]);
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 6:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			else
			$linha[$i] = str_replace(" ", "", str_replace("R$", "", $linha[$i]));
			
			break;
			}
	
		

		echo  "'".$linha[$i]."'";
	
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";
	
	$cod++;
	
	echo "<br>";
	}	


		
		
	
echo "<br><br>-- arquivo 6.txt *************************** FIM ";	
echo "<br><br>-- arquivo 7.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	


	
	
$ponteiro = fopen ("../materiais_oficiais/7.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 13; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	$linha[0] = str_replace("'", "", str_replace('"', "", trim($linha[0])));
	
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[0])==0 || strlen($linha[2])==0 ||
		
		 
		 strripos($linha[0], "Carpinteiro")!==false ||
		  strripos($linha[0], "Pintor")!==false ||
		   strripos($linha[0], "Servente")!==false ||
		    strripos($linha[0], "Encanador")!==false ||
			 strripos($linha[0], "Armador")!==false ||
			  strripos($linha[0], "Pedreiro")!==false ||
				strripos($linha[0], "Ajudante")!==false ||
			 strripos($linha[0], "Eletricista")!==false ||
			 strripos($linha[0], "Telhadista")!==false 
		 
		 )
	continue;

	
	$control = false;
	
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[0], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[0]);
				


	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 0; $i < 3; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);


		
			switch($i){
			

			case 1:
			$linha[$i] = getUnidade($linha[$i]);
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 2:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			else
			$linha[$i] = str_replace(" ", "", str_replace("R$", "", $linha[$i]));
			
			break;
			}
	
		

		echo  "'".$linha[$i]."'";
	
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";
	
	$cod++;
	
	echo "<br>";
	}	

	
	
	
	
	
echo "<br><br>-- arquivo 7.txt *************************** FIM ";	
echo "<br><br>-- arquivo 8.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	

	
	
	
	
$ponteiro = fopen ("../materiais_oficiais/8.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 15; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)<2)
	continue;
	
		if(count($linha)<4){
		
			if(strlen($linha[2])>0){
			
			$aux =$linha[2];
			
			$linha = array();
			
			array_push($linha, "	");
			array_push($linha, "	");
			array_push($linha, $aux);
			$j++;
			array_push($linha, $campos[$j][1]);
			array_push($linha,  $campos[$j][2]);
			}
		}
	
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 ||
	   strlen($linha[4])==0 || 
	   strripos($linha[2], "Carpinteiro")!==false ||
		  strripos($linha[2], "Pintor")!==false ||
		   strripos($linha[2], "Servente")!==false ||
		    strripos($linha[2], "Encanador")!==false ||
			 strripos($linha[2], "Armador")!==false ||
			  strcmp($linha[2], "Predeiro")!==false ||
			  strripos($linha[2], "Pedreiro")!==false ||
				strripos($linha[2], "Ajudante")!==false ||
			 strripos($linha[2], "Eletricista")!==false ||
			 strripos($linha[2], "Motorista")!==false ||
			 strripos($linha[2], "Telhadista")!==false )
	continue;

		
	$control = false;
			
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
		
				
	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 2; $i < 5; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			
			case 3:
			$linha[$i] = getUnidade($linha[$i]);
		
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 4:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			break;
			}
	
		
	
		echo  "'".$linha[$i]."'";
	
	
		if($i < 4)
		echo  ", ";	
		}

	
	echo  ", 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";

	$cod++;
	
	echo "<br>";
	}
	
	
	
	
	
	
	
echo "<br><br>-- arquivo 8.txt *************************** FIM ";	
echo "<br><br>-- arquivo 9.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	

		
	

$ponteiro = fopen ("../materiais_oficiais/9.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 15; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)<2)
	continue;
	
	
		if(count($linha)<4){
			
			if(strlen($linha[2])>0){
			
			$aux =$linha[2];
			
			$linha = array();
			
			array_push($linha, "	");
			array_push($linha, "	");
			array_push($linha, $aux);
			$j++;
			array_push($linha, $campos[$j][1]);
			array_push($linha,  $campos[$j][2]);
			}	
		}
		
	
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 ||
	   strlen($linha[4])==0 || 
	   strripos($linha[2], "Carpinteiro")!==false ||
		  strripos($linha[2], "Pintor")!==false ||
		   strripos($linha[2], "Servente")!==false ||
		    strripos($linha[2], "Encanador")!==false ||
			 strripos($linha[2], "Armador")!==false ||
			  strcmp($linha[2], "Predeiro")!==false ||
			  strripos($linha[2], "Pedreiro")!==false ||
				strripos($linha[2], "Ajudante")!==false ||
			 strripos($linha[2], "Eletricista")!==false ||
			 strripos($linha[2], "Motorista")!==false ||
			 strripos($linha[2], "Telhadista")!==false )
	continue;

		
	$control = false;
			
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
		
				
	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 2; $i < 5; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			
			case 3:
			$linha[$i] = getUnidade($linha[$i]);
		
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 4:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			break;
			}
	
		
	
		echo  "'".$linha[$i]."'";
	
	
		if($i < 4)
		echo  ", ";	
		}

	
	echo  ", 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";

	$cod++;
	
	echo "<br>";
	}
	
	
	
	
	
	
	
echo "<br><br>-- arquivo 9.txt *************************** FIM ";	
echo "<br><br>-- arquivo 10.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	

		
	

$ponteiro = fopen ("../materiais_oficiais/10.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 15; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)<2)
	continue;
	
	
		if(count($linha)<4){
			if(strlen($linha[2])>0){
				
			$aux =$linha[2];
				
			$linha = array();
				
			array_push($linha, "	");
			array_push($linha, "	");
			array_push($linha, $aux);
			$j++;
			array_push($linha, $campos[$j][1]);
			array_push($linha,  $campos[$j][2]);
			}
		}
		
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 ||
	   strlen($linha[4])==0 || 
	   strripos($linha[2], "Carpinteiro")!==false ||
		  strripos($linha[2], "Pintor")!==false ||
		   strripos($linha[2], "Servente")!==false ||
		    strripos($linha[2], "Encanador")!==false ||
			 strripos($linha[2], "Armador")!==false ||
			  strripos($linha[2], "Pedreiro")!==false || 
			   strcmp($linha[2], "Predeiro")!==false ||
				strripos($linha[2], "Ajudante")!==false ||
			 strripos($linha[2], "Eletricista")!==false ||
			 strripos($linha[2], "Motorista")!==false ||
			 strripos($linha[2], "Telhadista")!==false ||
			 strripos($linha[2], "Carpinterio")!==false			 )
	continue;

		
	$control = false;
			
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
		
				
	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 2; $i < 5; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			
			case 3:
			$linha[$i] = getUnidade($linha[$i]);
		
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 4:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			break;
			}
	
		
	
		echo  "'".$linha[$i]."'";
	
	
		if($i < count($linha) - 1)
		echo  ", ";	
		}

	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";

	$cod++;
	
	echo "<br>";
	}
	
	



	

	
echo "<br><br>-- arquivo 10.txt *************************** FIM ";	
echo "<br><br>-- arquivo 11.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	

		
	

$ponteiro = fopen ("../materiais_oficiais/11.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 13; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)<2)
	continue;
	
	
		if(count($linha)<4){
			if(strlen($linha[2])>0){
			
			$aux =$linha[2];
			
			$linha = array();
			
			array_push($linha, "	");
			array_push($linha, "	");
			array_push($linha, $aux);
			$j++;
			array_push($linha, $campos[$j][1]);
			array_push($linha,  $campos[$j][2]);
			}
		}
	
	
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 ||
	   strlen($linha[4])==0 || 
	   strripos($linha[2], "Carpinteiro")!==false ||
		  strripos($linha[2], "Pintor")!==false ||
		   strripos($linha[2], "Servente")!==false ||
		    strripos($linha[2], "Encanador")!==false ||
			 strripos($linha[2], "Armador")!==false ||
			  strripos($linha[2], "Pedreiro")!==false ||
			   strcmp($linha[2], "Predeiro")!==false ||
				strripos($linha[2], "Ajudante")!==false ||
			 strripos($linha[2], "Eletricista")!==false ||
			 strripos($linha[2], "Motorista")!==false ||
			 strripos($linha[2], "Telhadista")!==false ||
			 strripos($linha[2], "Carpinterio")!==false			 )
	continue;

		
	$control = false;
			
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
		
				
	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 2; $i < 5; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			
			case 3:
			$linha[$i] = getUnidade($linha[$i]);
		
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 4:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			break;
			}
	
		
	
		echo  "'".$linha[$i]."'";
	
	
		if($i < 4)
		echo  ", ";	
		}

	
	echo  ", 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";

	$cod++;
	
	echo "<br>";
	}
	
	





	
	
echo "<br><br>-- arquivo 11.txt *************************** FIM ";	
echo "<br><br>-- arquivo 12.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	
	
	
	
	
$ponteiro = fopen ("../materiais_oficiais/12.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 14; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	
	if(count($linha)<2)
	continue;
	
		if(count($linha)<4){
			
			if(strlen($linha[2])>0){
			
			$aux =$linha[2];
			
			$linha = array();
			
			array_push($linha, "	");
			array_push($linha, "	");
			array_push($linha, $aux);
			$j++;
			array_push($linha, $campos[$j][1]);
			array_push($linha,  $campos[$j][2]);
			}
		}
	
	//exclui o itens (so deixa os materiais) e exclui as mao de obra e outros 
	if(strlen($linha[2])==0 ||
	   strlen($linha[4])==0 || 
	   strripos($linha[2], "Carpinteiro")!==false ||
		  strripos($linha[2], "Pintor")!==false ||
		   strripos($linha[2], "Servente")!==false ||
		    strripos($linha[2], "Encanador")!==false ||
			 strripos($linha[2], "Armador")!==false ||
			  strripos($linha[2], "Pedreiro")!==false ||
				strripos($linha[2], "Ajudante")!==false ||
			strripos($linha[2], "Ferreiro")!==false ||
			 strripos($linha[2], "Eletricista")!==false ||
			 strripos($linha[2], "Montador")!==false ||
			 strripos($linha[2], "Motorista")!==false ||
			 strripos($linha[2], "Telhadista")!==false ||
			 strripos($linha[2], "Auxiliar de serralheiro")!==false ||
			  strripos($linha[2], "serralheiro")!==false ||
			 strripos($linha[2], "Carpinterio")!==false			 )
	continue;

		
	$control = false;
			
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[2], $v)==0){
			$control = true;
			break;
			}
		}
			
		if($control)
		continue;
		else
		array_push($materiais_ja_processados, $linha[2]);
		
				
	echo "insert into materiais_modelo (descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 2; $i < 5; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			switch($i){
			
			case 3:
			$linha[$i] = getUnidade($linha[$i]);
		
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			case 4:
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			break;
			}
	
		
	
		echo  "'".$linha[$i]."'";
	
	
		if($i < 5)
		echo  ", ";	
		}

	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";

	$cod++;
	
	echo "<br>";
	}
	
	

	
	
echo "<br><br>-- arquivo 12.txt *************************** FIM ";	
echo "<br><br>-- materiais.txt *************************** INICIO ";
echo "<br><br>";


/******************************************************************************************************/	
	

	

$ponteiro = fopen ("../materiais_oficiais/materiais.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 0; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	
	if(count($linha)<4)
	continue;
	
	echo "insert into materiais_modelo (fk_unidade, descricao, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo, codigo) values (";
		
		for( $i = 2; $i <= 4; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
	
			switch($i){
			
			case 2:
			$linha[$i] = getUnidade($linha[$i]);
		
			$control = false;
			
				foreach($reg as $value){
					
					if(strcasecmp($linha[$i], $value['simbolo'])==0){
					
					$linha[$i] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
			
				if(!$control){
				
				//echo "<br><br>".$linha[$i]."<br><br>";
				
				array_push($sem_unidades, $linha[$i]);
				$linha[$i] = "0";
				}
			
			break;
			
			
			case 4:
			
			if($linha[$i]==null || strlen($linha[$i])==0)
			$linha[$i] = "0.00";
			
			break;
			}
	
		echo  "'".$linha[$i]."'";
	
	
		
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	echo  " 'ATIVO', 'NAO', 'SELECIONAR', 'NORMAL', 'MAT".str_pad($cod, 6, "0", STR_PAD_LEFT)."');";

	$cod++;

	echo "<br>";
	}
	
echo "<br><br>num itens: ".count($campos)."<br><br>";


echo "unidades desconhecidas:<br>";

foreach($sem_unidades as $value)
echo $value."<br>";

	
	
	
	
	
	
	
/*	
	
	
	
	
	

echo "<br><br>unidades desconhecidas:<br>";

foreach($sem_unidades as $value)
echo $value."<br>";



echo "<br><br>materiais repetidos:<br>";

foreach($materiais_ja_processados as $value)
echo $value."<br>";
	
	
*/	
	
	
	
	
	
		function getUnidade($param){
		
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
		
		return $param;
		}
	
	
	
	
	
?>