<?php



include_once 'Biblioteca.class.php';




class Biblioteca_Financeira extends Biblioteca{
	
	
	
	
	
	
/*	
	public function  validaMoeda($valor, $pode_zero =false) {
	
	
	$aux = str_replace('.', '', $valor);
	$aux = str_replace(',', '', $aux);
		
	if(!$this->somenteNUM($aux, $pode_zero, 1, 15))
	return false;
	
	if(substr_count($valor, ',') > 1 )
	return false;
	
	//nao importa onde esteja o ponto, o campo será formatado depois
	//porem a virgula decimal, caso haja, deverá está no local correto
	
	if( strripos($valor, ',') ===false || strripos($valor, ',') == (strlen($valor) - 3) || strripos($valor, ',') == (strlen($valor) - 2))
	return true;	
		
	return false;
	}
	
	
	
	
	
*/	
	
	
	
	
	
	public function  formataMoeda($valor) {
	
	$valor = explode( '.', $this->getValorDoubleDeMoeda( $valor).'.');
	
	$negativo = false;
		if($valor[0][0] == '-' ){
		$valor[0] = substr($valor[0], 1 );
		$negativo = true;
		}
		
		switch(strlen($valor[1])){
		
		case 0:
		$valor[1] = '0';
		case 1:
			$valor[1] .='0';
				case 2:
				break;
					default:
					$valor[1] = substr($valor[1], 0 , 2);
		}
	
	$valor_format = '';
	$resto = strlen($valor[0])%3;
	$primeira_parte = substr($valor[0], 0, $resto);
	$segunda_parte = substr($valor[0], $resto, strlen($valor[0]));
	
	for($i = 0; $i<strlen($segunda_parte); $i+=3)
	$valor_format.=substr($segunda_parte, $i, 3).($i == (strlen($segunda_parte)-3)?"":".");
	
	$final = $primeira_parte;
	if( strlen($segunda_parte)>0 && strlen($primeira_parte)>0)
	$final .="."; 
	
	
	return ($negativo?'-':'').$final.$valor_format.','.$valor[1];
	}
	
	
	
	
	
	
	
	
	
	
	

	public function somaValorMonetario(&$reg){
	
	$cont = "0.00";
		foreach($reg  as $valor){
		
		$aux = str_replace(".","",$valor);
		$aux = str_replace(",",".",$aux);
		
		$cont += $aux;
		
		$cd=explode(".",$cont);
		
		if (empty($cd)) 
		$cont .=".00";
		elseif (count($cd) < 2)
		$cont .=".0";
		}
	
	$cont= str_replace(".",",",$cont);
	
	return $this->formataMoeda($cont);
	}
	
	
		
	
	
	
	
	
	
	//retorna um double
	public function subtraiValorMonetario($minuendo , $subtraendo){
	
	return $this->getValorDoubleDeMoeda($minuendo) - $this->getValorDoubleDeMoeda($subtraendo);
	}
	
	
	
	
	
	
	
	
	public function getValorDoubleDeMoeda( $valor){
	
	if( strlen($valor) == 0)
	return (double)0;
	
	
	if(is_float($valor))
	return $valor;


	$valor = preg_replace("/[^(0-9 . , - )]/", "", $valor);
	return (double)str_replace(",",".", str_replace(".","", $valor));
	}
	
	
	
	
	
	
	
	
	//retorna um double
	public function multiplicaValorMonetario($multiplicando , $multiplicador=0){
	
	return $this->getValorDoubleDeMoeda($multiplicando) * $this->getValorDoubleDeMoeda($multiplicador);
	}
	
	
	
	
	
	
	
	//retorna um double
	public function dividiValorMonetario($dividendo , $divisor){
	
	if( $divisor == 0)
	return false;
	
	return $this->getValorDoubleDeMoeda($dividendo) / $this->getValorDoubleDeMoeda($divisor);
	}
	
	
	
	
	
	
	

	
	
	
/*************************************** funcoes para treinamento ***********************************/	
	
	
	
	

	
	public function getValorTotalTreinamento(&$reg, $nome_campo){
	
	$valores = array();
		if(count($reg) > 0 && array_key_exists( $nome_campo, $reg[0])){
		
		foreach($reg  as $value)
		$valores [] =$value[$nome_campo]; 
		
		return $this->somaValorMonetario($valores);
		}

	return "0,00";
	}
	
	


	
	
	
	
	
	
	
	public function getCargaHorarioTotalTreinamento(&$reg , $nome_campo){
	
	$cont = 0;
		if(count($reg) > 0 && array_key_exists( $nome_campo, $reg[0])){
		
		foreach($reg  as $linha)
		$cont += (int)$linha[$nome_campo]; 
		}
	return $cont;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

?>


