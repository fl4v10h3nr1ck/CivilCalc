package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_x_equipamento", prefixo="ixeq_c", left_join="INNER JOIN equipamentos as eq ON ixeq_c.fk_equipamento = eq.id_equipamento INNER JOIN unidades as uni ON uni.id_unidade = eq.fk_unidade")
public class ItemXEquipamentoCompleto {
	
@Anot_BD_Campo(nome = "id_item_x_equipamento", tipo=int.class, set = "setId_item_x_equipamento", get = "getId_item_x_equipamento", ehId=true)		
private int 	id_item_x_equipamento;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_equipamento", tipo=int.class, set = "setFk_equipamento", get = "getFk_equipamento")		
private int fk_equipamento;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario", prefixo="eq", select_apenas=true)
private String valor_unitario;

@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao", prefixo="eq", select_apenas=true)
private String descricao;

@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade", prefixo="eq", select_apenas=true)
private int fk_unidade;

@Anot_BD_Campo(nome = "simbolo", set = "setSimbolo", get = "getSimbolo", prefixo="uni", select_apenas=true)
private String simbolo;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus", prefixo="eq", select_apenas=true)	
private String status;

@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo", prefixo="eq", select_apenas=true)
private String codigo;





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

public int getId_item_x_equipamento() {
	return id_item_x_equipamento;
}

public void setId_item_x_equipamento(int id_item_x_equipamento) {
	this.id_item_x_equipamento = id_item_x_equipamento;
}

public int getFk_equipamento() {
	return fk_equipamento;
}

public void setFk_equipamento(int fk_equipamento) {
	this.fk_equipamento = fk_equipamento;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}









}
