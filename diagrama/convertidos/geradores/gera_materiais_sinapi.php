<?php
header('Content-type: text/html; charset=UTF-8');


include_once 'BD/Opcoes_BD_Gerais.class.php';

$BD = new Opcoes_BD_Gerais;

$reg = $BD->get("select id_unidade, simbolo from unidades");

	
if(count($reg) == 0)
$reg = array();

$sem_unidades = array();


$materiais_ja_processados = array();


echo "<br><br>-- arquivo 1.txt *************************** INICIO ";
echo "<br><br>";


$ponteiro = fopen ("../materiais_oficiais/insumos_sinapi.txt","r");
$campos = null;

	while (!feof ($ponteiro)) {
	$linha_arq = fgets($ponteiro, 4096);
	$campos[] = explode("	", $linha_arq);
	}

fclose ($ponteiro);	
	
	for( $j = 1; $j < count($campos); $j++){
	
	$linha = $campos[$j];
	
	if(count($linha)< 3)
	continue;
	
	if(strripos($linha[1], "|EM PROCESSO DE DESATIVACAO|")!==false || strripos($linha[1], "!EM PROCESSO DE DESATIVACAO!")!==false)
	continue;

		
	$control = false;
			
		foreach($materiais_ja_processados as $v){
					
			if(strcasecmp($linha[1], $v)==0){
			$control = true;
			break;
			}
		}
			
	if($control)
	continue;
	else
	array_push($materiais_ja_processados, $linha[1]);
		
				
	echo "insert into materiais_modelo (codigo, descricao, fk_unidade, valor_unitario, status, valor_por_fornecedor, valor_padrao_fornecedor, tipo) values (";
	
	
		for( $i = 0; $i <= 3; $i++){
	
		$linha[$i] = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($linha[$i]))), "UTF-8");
		$linha[$i] = strtoupper(substr($linha[$i], 0 , 1)).substr($linha[$i], 1);
		
			
			
			if($i== 2){
			
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
			}
	
		
			if($i== 3){
			
			if($linha[$i]==null || strlen($linha[$i])==0 || strcmp($linha[$i], "#ref!")==0)
			$linha[$i] = "0.00";
			}
		
	
		echo  "'".$linha[$i]."'";
	
	
		
		if($i < count($linha) - 1)
		echo  ", ";	
		}
	
	
	
	echo  ", 'ATIVO', 'NAO', 'SELECIONAR', 'SINAPI');";
	echo "<br>";
	}



	
	
	
echo "<br><br>-- num itens: ".count($campos)."<br><br>";

		
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
		
			if(strcmp($param, "18l")==0)
			$param = "l";
		
			if(strcmp($param, "Mes")==0)
			$param = "mes";

			if(strcmp($param, "M2/mes")==0)
			$param = "m²/mes";
		
			if(strcmp($param, "M/mes")==0)
			$param = "m/mes";
			
			if(strcmp($param, "Dm3")==0)
			$param = "dm³";
			
			if(strcmp($param, "Par")==0)
			$param = "par";
		
			if(strcmp($param, "Jg")==0)
			$param = "jg";
		
			if(strcmp($param, "Dia")==0)
			$param = "dia";
		
			if(strcmp($param, "Sc25kg")==0)
			$param = "25kg";
		
			if(strcmp($param, "Kw/h")==0)
			$param = "kWh";
		
			if(strcmp($param, "100m")==0)
			$param = "m";
		
			if(strcmp($param, "10m")==0)
			$param = "m";
		
			if(strcmp($param, "Fl")==0)
			$param = "m";
		
			if(strcmp($param, "250g")==0)
			$param = "g";
		
			if(strcmp($param, "310ml")==0)
			$param = "ml";

			if(strcmp($param, "Fl")==0)
			$param = "fl";



		
		
		return $param;
		}
	
	
	
	
	
?>