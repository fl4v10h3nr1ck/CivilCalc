package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_x_mao_obra", prefixo="ixmao_c", left_join="INNER JOIN mao_de_obra as mao ON ixmao_c.fk_mao_obra = mao.id_mao_de_obra INNER JOIN unidades as uni ON uni.id_unidade = mao.fk_unidade")
public class ItemXMaoDeObraCompleto {
	
@Anot_BD_Campo(nome = "id_item_x_mao_obra", tipo=int.class, set = "setId_item_x_mao_obra", get = "getId_item_x_mao_obra", ehId=true)		
private int id_item_x_mao_obra;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_mao_obra", tipo=int.class, set = "setFk_mao_obra", get = "getFk_mao_obra")		
private int fk_mao_obra;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario", prefixo="mao", select_apenas=true)
private String valor_unitario;

@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao", prefixo="mao", select_apenas=true)
private String descricao;

@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade", prefixo="mao", select_apenas=true)
private int fk_unidade;

@Anot_BD_Campo(nome = "simbolo", set = "setSimbolo", get = "getSimbolo", prefixo="uni", select_apenas=true)
private String simbolo;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus", prefixo="mao", select_apenas=true)	
private String status;

@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo", prefixo="mao", select_apenas=true)
private String codigo;

@Anot_BD_Campo(nome = "ls_tipo", set = "setLs_tipo", get = "getLs_tipo", prefixo="mao", select_apenas=true)
private String ls_tipo;



public int getFk_item() {
	return fk_item;
}

public void setFk_item(int fk_item) {
	this.fk_item = fk_item;
}

public String getQuantidade() {
	return quantidade;
}

public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}

public String getValor_unitario() {
	return valor_unitario;
}

public void setValor_unitario(String valor_unitario) {
	this.valor_unitario = valor_unitario;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public int getFk_unidade() {
	return fk_unidade;
}

public void setFk_unidade(int fk_unidade) {
	this.fk_unidade = fk_unidade;
}

public String getSimbolo() {
	return simbolo;
}

public void setSimbolo(String simbolo) {
	this.simbolo = simbolo;
}
public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getId_item_x_mao_obra() {
	return id_item_x_mao_obra;
}

public void setId_item_x_mao_obra(int id_item_x_mao_obra) {
	this.id_item_x_mao_obra = id_item_x_mao_obra;
}

public int getFk_mao_obra() {
	return fk_mao_obra;
}

public void setFk_mao_obra(int fk_mao_obra) {
	this.fk_mao_obra = fk_mao_obra;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getLs_tipo() {
	return ls_tipo;
}

public void setLs_tipo(String ls_tipo) {
	this.ls_tipo = ls_tipo;
}











}
