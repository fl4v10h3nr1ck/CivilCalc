package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;

@Anot_BD_Tabela(nome="item_x_material", prefixo="ixm")
public class ItemXMaterial {

@Anot_BD_Campo(nome = "id_item_x_material", tipo=int.class, set = "setId_item_x_material", get = "getId_item_x_material", ehId=true)		
private int id_item_x_material;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_material", tipo=int.class, set = "setFk_material", get = "getFk_material")		
private int fk_material;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;




public int getId_item_x_material() {	return id_item_x_material;}
public void setId_item_x_material(int id_item_x_material) {	this.id_item_x_material = id_item_x_material;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public int getFk_material() {	return fk_material;}
public void setFk_material(int fk_material) {	this.fk_material = fk_material;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}







}






