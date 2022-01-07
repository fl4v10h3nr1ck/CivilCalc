package beans;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_x_mao_obra", prefixo="ixmo")
public class ItemXMaoDeObra {

	
	
@Anot_BD_Campo(nome = "id_item_x_mao_obra", tipo=int.class, set = "setId_item_x_mao_obra", get = "getId_item_x_mao_obra", ehId=true)		
private int id_item_x_mao_obra;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_mao_obra", tipo=int.class, set = "setFk_mao_obra", get = "getFk_mao_obra")		
private int fk_mao_obra;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;





public int getId_item_x_mao_obra() {	return id_item_x_mao_obra;}
public void setId_item_x_mao_obra(int id_item_x_mao_obra) {	this.id_item_x_mao_obra = id_item_x_mao_obra;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public int getFk_mao_obra() {	return fk_mao_obra;}
public void setFk_mao_obra(int fk_mao_obra) {	this.fk_mao_obra = fk_mao_obra;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}
	




	
	
}
