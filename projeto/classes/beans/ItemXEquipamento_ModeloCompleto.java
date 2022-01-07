package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_modelo_x_equipamento_modelo", prefixo="ixeq_mod", left_join="INNER JOIN equipamentos as eqp ON ixeq_mod.fk_equipamento = eqp.id_equipamento")
public class ItemXEquipamento_ModeloCompleto {

		
@Anot_BD_Campo(nome = "id_item_x_equipamento_modelo", tipo=int.class, set = "setId_item_x_equipamento_modelo", get = "getId_item_x_equipamento_modelo", ehId=true)		
private int id_item_x_equipamento_modelo;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_equipamento", tipo=int.class, set = "setFk_equipamento", get = "getFk_equipamento")		
private int fk_equipamento;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario", prefixo="eqp", select_apenas=true)
private String valor_unitario;






public int getId_item_x_equipamento_modelo() {	return id_item_x_equipamento_modelo;}
public void setId_item_x_equipamento_modelo(int id_item_x_equipamento_modelo) {	this.id_item_x_equipamento_modelo = id_item_x_equipamento_modelo;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public int getFk_equipamento() {	return fk_equipamento;}
public void setFk_equipamento(int fk_equipamento) {	this.fk_equipamento = fk_equipamento;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}	
	


	
}
