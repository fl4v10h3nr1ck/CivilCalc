package beans.modelos;

import beans.Mao_De_Obra;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;


@Anot_BD_Tabela(nome="mao_de_obra_modelo", prefixo="m_obra_m")
public class Mao_De_Obra_Modelo {

	
@Anot_BD_Campo(nome = "id_mao_de_obra_modelo", tipo=int.class, set = "setId_mao_de_obra", get = "getId_mao_de_obra", ehId=true)		
private int id_mao_de_obra;


@Anot_TB_Coluna_Selecao(posicao=0, comprimento=15)
@Anot_TB_Coluna(posicao=0, rotulo="Código", comprimento = 15)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;


@Anot_TB_Coluna_Selecao(posicao=1, comprimento=70)
@Anot_TB_Coluna(posicao=1, rotulo="Descrição", comprimento = 70)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")
private String descricao;

@Anot_BD_Campo(nome = "fk_tipo", tipo=int.class, set = "setFk_tipo", get = "getFk_tipo")
private int fk_tipo;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario")
private String valor_unitario;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")
private String status;

@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade")		
private int fk_unidade;

@Anot_TB_Coluna_Selecao(posicao=2, comprimento=15)
@Anot_TB_Coluna(posicao=2, rotulo="L.S.", comprimento = 15)
@Anot_BD_Campo(nome = "ls_tipo", set = "setLs_tipo", get = "getLs_tipo", getTab="getLs_tipoTab")	
private String ls_tipo;







public int getId_mao_de_obra() {	return id_mao_de_obra;}
public void setId_mao_de_obra(int id_mao_de_obra) {	this.id_mao_de_obra = id_mao_de_obra;}

public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public int getFk_tipo() {	return fk_tipo;}
public void setFk_tipo(int fk_tipo) {	this.fk_tipo = fk_tipo;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}

public int getFk_unidade() {	return fk_unidade;}
public void setFk_unidade(int fk_unidade) {	this.fk_unidade = fk_unidade;}

public String getLs_tipo() {	return ls_tipo;}
public void setLs_tipo(String ls_tipo) {	this.ls_tipo = ls_tipo;}
public String getLs_tipoTab() {	return "<html><font color="+(ls_tipo!=null && ls_tipo.compareTo("MENSALISTA")==0?"green>":"blue>")+this.ls_tipo+"</font></html>";}





	public Mao_De_Obra clona(){
		
	
	Mao_De_Obra mao_d_obra =  new Mao_De_Obra();	
	mao_d_obra.setCodigo(this.getCodigo());
	mao_d_obra.setDescricao(this.getDescricao());
	mao_d_obra.setValor_unitario(this.getValor_unitario());
	mao_d_obra.setStatus("ATIVO");
	mao_d_obra.setFk_tipo(this.getFk_tipo());
	
	mao_d_obra.setFk_unidade(this.getFk_unidade());
	mao_d_obra.setFk_modelo(this.getId_mao_de_obra());
	mao_d_obra.setLs_tipo(this.getLs_tipo());
	
	return mao_d_obra;	
	}





}
