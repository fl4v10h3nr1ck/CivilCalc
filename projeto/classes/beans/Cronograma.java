package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="cronograma", prefixo="cron")
public class Cronograma {

	
@Anot_BD_Campo(nome = "id_cronograma", tipo=int.class, set = "setId_cronograma", get = "getId_cronograma", ehId=true)			
private int id_cronograma;

@Anot_BD_Campo(nome = "tipo", set = "setTipo", get = "getTipo")	
private String tipo;

@Anot_BD_Campo(nome = "fk_etapa", tipo=int.class, set = "setFk_etapa", get = "getFk_etapa")	
private int fk_etapa;

@Anot_BD_Campo(nome = "fk_subetapa", tipo=int.class, set = "setFk_subetapa", get = "getFk_subetapa")	
private int fk_subetapa;

@Anot_BD_Campo(nome = "duracao_meses", tipo=int.class, set = "setDuracao_meses", get = "getDuracao_meses")	
private int duracao_meses;

@Anot_BD_Campo(nome = "fk_projeto", tipo=int.class, set = "setFk_projeto", get = "getFk_projeto")	
private int fk_projeto;


public int getId_cronograma() {	return id_cronograma;}
public void setId_cronograma(int id_cronograma) {	this.id_cronograma = id_cronograma;}

public String getTipo() {	return tipo;}
public void setTipo(String tipo) {	this.tipo = tipo;}

public int getFk_etapa() {	return fk_etapa;}
public void setFk_etapa(int fk_etapa) {	this.fk_etapa = fk_etapa;}

public int getFk_subetapa() {	return fk_subetapa;}
public void setFk_subetapa(int fk_subetapa) {	this.fk_subetapa = fk_subetapa;}

public int getDuracao_meses() {	return duracao_meses;}
public void setDuracao_meses(int duracao_meses) {	this.duracao_meses = duracao_meses;}

public int getFk_projeto() {	return fk_projeto;}
public void setFk_projeto(int fk_projeto) {	this.fk_projeto = fk_projeto;}

	
	
	
	
}

