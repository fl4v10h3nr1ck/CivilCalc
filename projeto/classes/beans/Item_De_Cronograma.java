package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="itens_de_cronograma", prefixo="i_cron")
public class Item_De_Cronograma {

	
	
@Anot_BD_Campo(nome = "id_item_de_cronograma", tipo=int.class, set = "setId_item_de_cronograma", get = "getId_item_de_cronograma", ehId=true)			
private int id_item_de_cronograma;

@Anot_BD_Campo(nome = "mes", tipo=int.class, set = "setMes", get = "getMes")			
private int mes;

@Anot_BD_Campo(nome = "valor", set = "setValor", get = "getValor")	
private String valor;

@Anot_BD_Campo(nome = "fk_cronograma", tipo=int.class, set = "setFk_cronograma", get = "getFk_cronograma")	
private int fk_cronograma;






public int getId_item_de_cronograma() {	return id_item_de_cronograma;}
public void setId_item_de_cronograma(int id_item_de_cronograma) {	this.id_item_de_cronograma = id_item_de_cronograma;}

public int getMes() {	return mes;}
public void setMes(int mes) {	this.mes = mes;}

public String getValor() {	return valor;}
public void setValor(String valor) {	this.valor = valor;}

public int getFk_cronograma() {	return fk_cronograma;}
public void setFk_cronograma(int fk_cronograma) {	this.fk_cronograma = fk_cronograma;}	
	


	
}
