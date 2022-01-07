package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;

@Anot_BD_Tabela(nome="item_x_material", prefixo="ixmat_c", left_join="INNER JOIN materiais as mat ON ixmat_c.fk_material = mat.id_material INNER JOIN unidades as uni ON uni.id_unidade = mat.fk_unidade")
public class ItemXMaterialCompleto {

	
@Anot_BD_Campo(nome = "id_item_x_material", tipo=int.class, set = "setId_item_x_material", get = "getId_item_x_material", ehId=true)		
private int id_item_x_material;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_material", tipo=int.class, set = "setFk_material", get = "getFk_material")		
private int fk_material;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario", prefixo="mat", select_apenas=true)
private String valor_unitario;

@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao", prefixo="mat", select_apenas=true)
private String descricao;

@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo", prefixo="mat", select_apenas=true)
private String codigo;

@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade", prefixo="mat", select_apenas=true)
private int fk_unidade;

@Anot_BD_Campo(nome = "simbolo", set = "setSimbolo", get = "getSimbolo", prefixo="uni", select_apenas=true)
private String simbolo;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus", prefixo="mat", select_apenas=true)	
private String status;






public int getId_item_x_material() {
	return id_item_x_material;
}

public void setId_item_x_material(int id_item_x_material) {
	this.id_item_x_material = id_item_x_material;
}

public int getFk_item() {
	return fk_item;
}

public void setFk_item(int fk_item) {
	this.fk_item = fk_item;
}

public int getFk_material() {
	return fk_material;
}

public void setFk_material(int fk_material) {
	this.fk_material = fk_material;
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

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
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










}
