package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;
import comuns.Calculo;


@Anot_BD_Tabela(nome="itens", prefixo="itns")
public class ItemDeOrcamento {


@Anot_BD_Campo(nome = "id_item", tipo=int.class, set = "setId_item", get = "getId_item", ehId=true)		
private int id_item;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=25)
@Anot_TB_Coluna(posicao=0, rotulo="Código", comprimento = 15)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;


@Anot_TB_Coluna_Selecao(posicao=1, comprimento=75)
@Anot_TB_Coluna(posicao=1, rotulo="Item", comprimento = 35)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")
private String descricao;

@Anot_TB_Coluna(posicao=2, rotulo="Val. Uni. (R$)", comprimento = 15)
@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario")
private String valor_unitario;


@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;

@Anot_TB_Coluna(posicao=3, rotulo="QTDe", comprimento = 10)
@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")	
private String quantidade;

@Anot_TB_Coluna(posicao=4, rotulo="Val. Total. (R$)", comprimento = 15)
@Anot_BD_Campo(nome = "valor_total", set = "setValor_total", get = "getValor_total", getTab="getValor_totalFormatado")	
private String valor_total;

@Anot_BD_Campo(nome = "fk_subetapa", tipo=int.class, set = "setFk_subetapa", get = "getFk_subetapa")		
private int fk_subetapa;

@Anot_BD_Campo(nome = "fk_modelo", tipo=int.class, set = "setFk_modelo", get = "getFk_modelo")		
private int fk_modelo;

@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade")		
private int fk_unidade;

@Anot_BD_Campo(nome = "sem_insumos", set = "setSem_insumos", get = "getSem_insumos")	
private String sem_insumos;





public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}
	
public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public int getId_item() {	return id_item;}
public void setId_item(int id_item) {	this.id_item = id_item;}

public String getValor_total() {	return valor_total;}
public void setValor_total(String valor_total) {	this.valor_total = valor_total;}
public String getValor_totalFormatado() {	return Calculo.formataValor(valor_total);}

public int getFk_subetapa() {	return fk_subetapa;}
public void setFk_subetapa(int fk_subetapa) {	this.fk_subetapa = fk_subetapa;}

public int getFk_modelo() {	return fk_modelo;}
public void setFk_modelo(int fk_modelo) {	this.fk_modelo = fk_modelo;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}

public int getFk_unidade() {	return fk_unidade;}
public void setFk_unidade(int fk_unidade) {	this.fk_unidade = fk_unidade;}

public String getSem_insumos() {	return sem_insumos;}
public void setSem_insumos(String sem_insumos) {	this.sem_insumos = sem_insumos;}





}
