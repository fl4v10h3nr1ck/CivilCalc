package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_x_equipamento", prefixo="ixeq")
public class ItemXEquipamento {

	
@Anot_BD_Campo(nome = "id_item_x_equipamento", tipo=int.class, set = "setId_item_x_equipamento", get = "getId_item_x_equipamento", ehId=true)		
private int id_item_x_equipamento;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_equipamento", tipo=int.class, set = "setFk_equipamento", get = "getFk_equipamento")		
private int fk_equipamento;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;




public int getId_item_x_equipamento() {	return id_item_x_equipamento;}
public void setId_item_x_equipamento(int id_item_x_equipamento) {	this.id_item_x_equipamento = id_item_x_equipamento;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public int getFk_equipamento() {	return fk_equipamento;}
public void setFk_equipamento(int fk_equipamento) {	this.fk_equipamento = fk_equipamento;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}
	
	
	
	
}
