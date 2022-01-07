package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;

@Anot_BD_Tabela(nome="cargos", prefixo="carg")
public class Cargo {

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=10)	
@Anot_BD_Campo(nome = "id_cargo", tipo=int.class, set = "setId_cargo", get = "getId_cargo", ehId=true)		
private int id_cargo;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=20)
@Anot_TB_Coluna(posicao=0, rotulo="Código", comprimento = 20)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;

@Anot_TB_Coluna_Selecao(posicao=2, comprimento=70)
@Anot_TB_Coluna(posicao=1, rotulo="Cargo", comprimento = 80)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")	
private String descricao;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;




public int getId_cargo() {	return id_cargo;}
public void setId_cargo(int id_cargo) {	this.id_cargo = id_cargo;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

	
	
	
	
}
