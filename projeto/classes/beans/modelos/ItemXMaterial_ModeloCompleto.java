package beans.modelos;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_modelo_x_material_modelo", prefixo="ixm_mod", left_join="INNER JOIN materiais as mat ON ixm_mod.fk_material = mat.id_material")
public class ItemXMaterial_ModeloCompleto  {

		
@Anot_BD_Campo(nome = "id_item_x_material_modelo", tipo=int.class, set = "setId_item_x_material_modelo", get = "getId_item_x_material_modelo", ehId=true)		
private int id_item_x_material_modelo;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_material", tipo=int.class, set = "setFk_material", get = "getFk_material")		
private int fk_material;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario", prefixo="mat", select_apenas=true)
private String valor_unitario;




public int getId_item_x_material_modelo() {	return id_item_x_material_modelo;}
public void setId_item_x_material_modelo(int id_item_x_material_modelo) {	this.id_item_x_material_modelo = id_item_x_material_modelo;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public int getFk_material() {	return fk_material;}
public void setFk_material(int fk_material) {	this.fk_material = fk_material;}	

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}	
	


	
}
