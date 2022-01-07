package beans.modelos;

import beans.ItemXMaoDeObra;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_modelo_x_mao_obra_modelo", prefixo="ixm_o_mod")
public class ItemXMaoDeObraModelo {


@Anot_BD_Campo(nome = "id_item_x_mao_obra_modelo", tipo=int.class, set = "setId_item_x_mao_obra_modelo", get = "getId_item_x_mao_obra_modelo", ehId=true)		
private int id_item_x_mao_obra_modelo;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_mao_obra", tipo=int.class, set = "setFk_mao_obra", get = "getFk_mao_obra")		
private int fk_mao_obra;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;	
	



public int getId_item_x_mao_obra_modelo() {	return id_item_x_mao_obra_modelo;}
public void setId_item_x_mao_obra_modelo(int id_item_x_mao_obra_modelo) {	this.id_item_x_mao_obra_modelo = id_item_x_mao_obra_modelo;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}

public int getFk_mao_obra() {	return fk_mao_obra;}
public void setFk_mao_obra(int fk_mao_obra) {	this.fk_mao_obra = fk_mao_obra;}	
		
	
	
	public ItemXMaoDeObra clona(int id_item){
	
	ItemXMaoDeObra	item = new ItemXMaoDeObra();
	
	item.setFk_item(id_item);
	item.setFk_mao_obra(this.getFk_mao_obra());
	item.setQuantidade(quantidade);
	
	return item;
	}



}
