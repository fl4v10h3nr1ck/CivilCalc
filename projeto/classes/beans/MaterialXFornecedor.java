package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="material_x_fornecedor", prefixo="mXf")
public class MaterialXFornecedor {

	
@Anot_BD_Campo(nome = "id_material_x_fornecedor", tipo=int.class, set = "setId_material_x_fornecedor", get = "getId_material_x_fornecedor", ehId=true)		
private int id_material_x_fornecedor;

@Anot_BD_Campo(nome = "fk_material", tipo=int.class, set = "setFk_material", get = "getFk_material")
private int fk_material;

@Anot_BD_Campo(nome = "fk_fornecedor", tipo=int.class, set = "setFk_fornecedor", get = "getFk_fornecedor")
private int fk_fornecedor;

@Anot_BD_Campo(nome = "preco", set = "setPreco", get = "getPreco")
private String preco;




public int getId_material_x_fornecedor() {	return id_material_x_fornecedor;}
public void setId_material_x_fornecedor(int id_material_x_fornecedor) {	this.id_material_x_fornecedor = id_material_x_fornecedor;}

public int getFk_material() {	return fk_material;}
public void setFk_material(int fk_material) {	this.fk_material = fk_material;}

public int getFk_fornecedor() {	return fk_fornecedor;}
public void setFk_fornecedor(int fk_fornecedor) {	this.fk_fornecedor = fk_fornecedor;}

public String getPreco() {	return preco;}
public void setPreco(String preco) {	this.preco = preco;}
	




}
