package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;


@Anot_BD_Tabela(nome="tipos_mao_obra", prefixo="t_m_obra")
public class TipoDeMaoDeObra {
	
	
@Anot_BD_Campo(nome = "id_tipo_mao_obra", tipo=int.class, set = "setId_tipo_mao_obra", get = "getId_tipo_mao_obra", ehId=true)		
private int id_tipo_mao_obra;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=25)
@Anot_TB_Coluna(posicao=0, rotulo="C�digo", comprimento = 20)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;


@Anot_TB_Coluna_Selecao(posicao=1, comprimento=75)
@Anot_TB_Coluna(posicao=1, rotulo="Nome", comprimento = 75)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")	
private String descricao;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;


	
public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public int getId_tipo_mao_obra() {	return id_tipo_mao_obra;}
public void setId_tipo_mao_obra(int id_tipo_mao_obra) {	this.id_tipo_mao_obra = id_tipo_mao_obra;}	
		
		
		
		
		
			
	
	
	
}