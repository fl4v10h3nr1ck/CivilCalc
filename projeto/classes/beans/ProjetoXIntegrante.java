package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="projetos_x_integrante", prefixo="prjXint")
public class ProjetoXIntegrante {

@Anot_BD_Campo(nome = "id_projetos_x_integrante", tipo=int.class, set = "setId_projetos_x_integrante", get = "getId_projetos_x_integrante", ehId=true)			
private int id_projetos_x_integrante;

@Anot_BD_Campo(nome = "fk_projeto", tipo=int.class, set = "setFk_projeto", get = "getFk_projeto")		
private int fk_projeto;

@Anot_BD_Campo(nome = "fk_integrante", tipo=int.class, set = "setFk_integrante", get = "getFk_integrante")	
private int fk_integrante;





public int getFk_projeto() {	return fk_projeto;}
public void setFk_projeto(int fk_projeto) {	this.fk_projeto = fk_projeto;}

public int getId_projetos_x_integrante() {	return id_projetos_x_integrante;}
public void setId_projetos_x_integrante(int id_projetos_x_integrante) {	this.id_projetos_x_integrante = id_projetos_x_integrante;}

public int getFk_integrante() {	return fk_integrante;}
public void setFk_integrante(int fk_integrante) {	this.fk_integrante = fk_integrante;}

	
	
	


}
