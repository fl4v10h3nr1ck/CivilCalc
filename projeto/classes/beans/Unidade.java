package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;

@Anot_BD_Tabela(nome="unidades", prefixo="uni")
public class Unidade {

	
@Anot_BD_Campo(nome = "id_unidade", tipo=int.class, set = "setId_unidade", get = "getId_unidade", ehId=true)		
private int id_unidade;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=20)
@Anot_TB_Coluna(posicao=0, rotulo="Sigla/Símbolo", comprimento = 20)
@Anot_BD_Campo(nome = "simbolo", set = "setSimbolo", get = "getSimbolo")	
private String simbolo;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=80)
@Anot_TB_Coluna(posicao=1, rotulo="Unidade", comprimento = 80)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")	
private String descricao;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;





public int getId_unidade() {	return id_unidade;}
public void setId_unidade(int id_unidade) {	this.id_unidade = id_unidade;}

public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public String getSimbolo() {	return simbolo;}
public void setSimbolo(String simbolo) {	this.simbolo = simbolo;}	
	




}
