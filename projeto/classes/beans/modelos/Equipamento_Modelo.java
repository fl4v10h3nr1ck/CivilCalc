package beans.modelos;

import beans.Equipamento;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;


@Anot_BD_Tabela(nome="equipamentos_modelo", prefixo="eqp_m")
public class Equipamento_Modelo {

@Anot_BD_Campo(nome = "id_equipamento_modelo", tipo=int.class, set = "setId_equipamento", get = "getId_equipamento", ehId=true)	
private int id_equipamento;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=80)
@Anot_TB_Coluna(posicao=1, rotulo="Nome", comprimento = 65)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")
private String descricao;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario")
private String valor_unitario;
	
@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;

@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade")		
private int fk_unidade;

@Anot_TB_Coluna(posicao=2, rotulo="Tipo", comprimento = 20)
@Anot_BD_Campo(nome = "tipo", set = "setTipo", get = "getTipo")	
private String tipo;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=20)
@Anot_TB_Coluna(posicao=0, rotulo="C�digo", comprimento = 15)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")
private String codigo;





public int getId_equipamento() {	return id_equipamento;}
public void setId_equipamento(int id_equipamento) {	this.id_equipamento = id_equipamento;}

public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public int getFk_unidade() {	return fk_unidade;}
public void setFk_unidade(int fk_unidade) {	this.fk_unidade = fk_unidade;}

public String getTipo() {	return tipo;}
public void setTipo(String tipo) {	this.tipo = tipo;}

public String getCodigo() {return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}



	public Equipamento clona(){
		
	Equipamento equipamento =  new Equipamento();	
	equipamento.setDescricao(this.getDescricao());
	equipamento.setValor_unitario(this.getValor_unitario());
	equipamento.setStatus("ATIVO");
	equipamento.setTipo(this.getTipo());
	equipamento.setFk_unidade(this.getFk_unidade());
	equipamento.setCodigo(this.getCodigo());
	equipamento.setFk_modelo(this.getId_equipamento());
	
	
	return equipamento;	
	}
}
