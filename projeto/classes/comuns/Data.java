package comuns;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Data {

	
	
	
	public static java.sql.Date getSqlData(java.util.Date data){
		
	return data == null? null: new java.sql.Date(data.getTime());	
	}
	
	
	
	
/*
	public static String getDataAtualComTraco(){
		
	return new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	}
*/	
	
	
	public static String getDataAtual(String delimitador){
		
	return new SimpleDateFormat("dd"+delimitador+"MM"+delimitador+"yyyy").format(new Date());
	}
	
	
	
	
	
	
	public static String converteDataParaString(Date aux){
		
	return aux== null?"":new SimpleDateFormat("dd/MM/yyyy").format(aux);
	}
	
	
	
	
	

	public static String getAnoAtual(){
		
	return new SimpleDateFormat("yyyy").format(new Date());
	}
	
	
	
	
}
