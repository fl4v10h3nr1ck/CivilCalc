package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;

		
@Anot_BD_Tabela(nome="projeto_x_encargos", prefixo="projXEnc")		
public class ProjetoXEncargo {

	
@Anot_BD_Campo(nome = "id_projeto_x_encargos", tipo=int.class, set = "setId_projeto_x_encargos", get = "getId_projeto_x_encargos", ehId=true)		
private int id_projeto_x_encargos;

@Anot_BD_Campo(nome = "fk_projeto", tipo=int.class, set = "setFk_projeto", get = "getFk_projeto")		
private int fk_projeto;

@Anot_BD_Campo(nome = "fk_encargo", tipo=int.class, set = "setFk_encargo", get = "getFk_encargo")		
private int fk_encargo;

@Anot_BD_Campo(nome = "quantidade", set = "setQuantidade", get = "getQuantidade")		
private String quantidade;




public int getId_projeto_x_encargos() {	return id_projeto_x_encargos;}
public void setId_projeto_x_encargos(int id_projeto_x_encargos) {	this.id_projeto_x_encargos = id_projeto_x_encargos;}

public int getFk_projeto() {	return fk_projeto;}
public void setFk_projeto(int fk_projeto) {	this.fk_projeto = fk_projeto;}

public int getFk_encargo() {	return fk_encargo;}
public void setFk_encargo(int fk_encargo) {	this.fk_encargo = fk_encargo;}

public String getQuantidade() {	return quantidade;}
public void setQuantidade(String quantidade) {	this.quantidade = quantidade;}


	
	
	
	
}
