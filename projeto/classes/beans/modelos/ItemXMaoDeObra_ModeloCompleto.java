package beans.modelos;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="item_modelo_x_mao_obra_modelo", prefixo="ixm_o_mod", left_join="INNER JOIN mao_de_obra as m_obra ON ixm_o_mod.fk_mao_obra = m_obra.id_mao_de_obra")
public class ItemXMaoDeObra_ModeloCompleto{


	
@Anot_BD_Campo(nome = "id_item_x_mao_obra_modelo", tipo=int.class, set = "setId_item_x_mao_obra_modelo", get = "getId_item_x_mao_obra_modelo", ehId=true)		
private int id_item_x_mao_obra_modelo;

@Anot_BD_Campo(nome = "fk_item", tipo=int.class, set = "setFk_item", get = "getFk_item")		
private int fk_item;

@Anot_BD_Campo(nome = "fk_mao_obra", tipo=int.class, set = "setFk_mao_obra", get = "getFk_mao_obra")		
private int fk_mao_obra;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;	
	
@Anot_BD_Campo(nome = "coef_produtividade", set = "setCoef_produtividade", get = "getCoef_produtividade")		
private String coef_produtividade;

@Anot_BD_Campo(nome = "valor_hora", set = "setValor_hora", get = "getValor_hora", prefixo="m_obra", select_apenas=true)
private String valor_hora;



public int getId_item_x_mao_obra_modelo() {	return id_item_x_mao_obra_modelo;}
public void setId_item_x_mao_obra_modelo(int id_item_x_mao_obra_modelo) {	this.id_item_x_mao_obra_modelo = id_item_x_mao_obra_modelo;}

public int getFk_item() {	return fk_item;}
public void setFk_item(int fk_item) {	this.fk_item = fk_item;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}

public String getCoef_produtividade() {	return coef_produtividade;}
public void setCoef_produtividade(String coef_produtividade) {	this.coef_produtividade = coef_produtividade;}

public int getFk_mao_obra() {	return fk_mao_obra;}
public void setFk_mao_obra(int fk_mao_obra) {	this.fk_mao_obra = fk_mao_obra;}

public String getValor_hora() {	return valor_hora;}
public void setValor_hora(String valor_hora) {	this.valor_hora = valor_hora;}




}
		
	