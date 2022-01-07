<?php
header('Content-type: text/html; charset=UTF-8');


include_once 'BD/Opcoes_BD_Gerais.class.php';
include_once 'Biblioteca_Financeira.class.php';


$bib = new Biblioteca_Financeira;
$BD = new Opcoes_BD_Gerais;



$reg = $BD->get("select id_unidade, simbolo from unidades");	
if(count($reg) == 0)
$reg = array();


$sem_unidades = array();
$itens_ja_processados = array();



echo "<br><br>-- arquivo 1.txt *************************** INICIO ";
echo "<br><br>";


$ponteiro = fopen ("../materiais_oficiais/itens_sinapi.txt","r");
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


	$controle = false;
		
		foreach($itens_ja_processados as $value){
			
			if(strcasecmp($value, $linha[1])==0){
			$controle = true;
			break;
			}
		}
		
	if($controle)
	continue;
	
	else
	array_push($itens_ja_processados, $linha[1]);
						
				
			
	echo "insert into itens_modelo (codigo, descricao, fk_unidade, valor_unitario, status, sem_insumos, tipo) values (";
	
	
		for( $i = 0; $i <= 3; $i++){
	
		$linha[$i] = preparaNome($linha[$i]);
		
			if($i==2){	
				
			$linha[2] = getUnidade($linha[2]);
			
			$control = false;
				
				foreach($reg as $value){
						
					if(strcasecmp($linha[2], $value['simbolo'])==0){
						
					$linha[2] = 	$value['id_unidade'];	
					$control = true;
					break;
					}
				}
				
				if(!$control){
					
				array_push($sem_unidades, $linha[2]);
				$linha[2] = "0";
				}
			}
	
	
			if($i== 3){
			
			if($linha[$i]==null || strlen($linha[$i])==0 || strcmp($linha[$i], "#ref!")==0)
			$linha[$i] = "0.00";
			}
	
	
		echo  "'".$linha[$i]."'";
	
	
		if($i < 3)
		echo  ", ";	
		}
		
	
	echo  ", 'ATIVO', 'SIM', 'SINAPI');";
	echo "<br>";	
	}


/*
echo "<br><br>";
echo "<br><br>";

echo "unidades desconhecidas:<br>";

foreach($sem_unidades as $value)
echo $value."<br>";
	

echo "<br><br>materiais repetidos:<br>";

foreach($itens_ja_processados as $value)
echo $value."<br>";

*/
	
	
	
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

			if(strcmp($param, "T/km")==0)
			$param = "Txkm";

			if(strcmp($param, "M3xkm")==0)
			$param = "M³xkm";

		
		
		return $param;
		}
	
	
	
	
	
	
	function preparaMoeda($nome){
		
	$nome = mb_strtolower(str_replace("'", "", str_replace('"', "", trim($nome))), "UTF-8");
	$nome = preg_replace("/[^(0-9 . , - )]/", "", $nome);
	
	return $nome;
	}





	
?>