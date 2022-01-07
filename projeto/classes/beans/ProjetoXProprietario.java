package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;

@Anot_BD_Tabela(nome="projetos_x_proprietarios", prefixo="prjXprop")
public class ProjetoXProprietario {


@Anot_BD_Campo(nome = "id_projetos_x_proprietarios", tipo=int.class, set = "setId_projetos_x_proprietarios", get = "getId_projetos_x_proprietarios", ehId=true)			
private int id_projetos_x_proprietarios;

@Anot_BD_Campo(nome = "fk_projeto", tipo=int.class, set = "setFk_projeto", get = "getFk_projeto")		
private int fk_projeto;

@Anot_BD_Campo(nome = "fk_proprietario", tipo=int.class, set = "setFk_proprietario", get = "getFk_proprietario")	
private int fk_proprietario;



public int getFk_projeto() {	return fk_projeto;}
public void setFk_projeto(int fk_projeto) {	this.fk_projeto = fk_projeto;}

public int getId_projetos_x_proprietarios() {	return id_projetos_x_proprietarios;}
public void setId_projetos_x_proprietarios(int id_projetos_x_proprietarios) {	this.id_projetos_x_proprietarios = id_projetos_x_proprietarios;}

public int getFk_proprietario() {	return fk_proprietario;}
public void setFk_proprietario(int fk_proprietario) {	this.fk_proprietario = fk_proprietario;}

	
	


}
