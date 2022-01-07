package beans.modelos;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_modelo_x_equipamento_modelo", prefixo="ixeq_mod")
public class ItemXEquipamentoModelo {

	
@Anot_BD_Campo(nome = "id_item_x_equipamento_modelo", tipo=int.class, set = "setId_item_x_equipamento_modelo", get = "getId_item_x_equipamento_modelo", ehId=true)		
private int id_item_x_equipamento_modelo;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_equipamento", tipo=int.class, set = "setFk_equipamento", get = "getFk_equipamento")		
private int fk_equipamento;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;



public int getId_item_x_equipamento_modelo() {	return id_item_x_equipamento_modelo;}
public void setId_item_x_equipamento_modelo(int id_item_x_equipamento_modelo) {	this.id_item_x_equipamento_modelo = id_item_x_equipamento_modelo;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public int getFk_equipamento() {	return fk_equipamento;}
public void setFk_equipamento(int fk_equipamento) {	this.fk_equipamento = fk_equipamento;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}	


}
