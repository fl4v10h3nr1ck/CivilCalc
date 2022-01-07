package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;

@Anot_BD_Tabela(nome="etapas", prefixo="etap")
public class Etapa {

@Anot_BD_Campo(nome = "id_etapa", tipo=int.class, set = "setId_etapa", get = "getId_etapa", ehId=true)		
private int id_etapa;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=100)
@Anot_TB_Coluna(posicao=0, rotulo="Título", comprimento = 100)
@Anot_BD_Campo(nome = "titulo", set = "setTitulo", get = "getTitulo")	
private String titulo;

@Anot_BD_Campo(nome = "fk_projeto", tipo=int.class, set = "setFk_projeto", get = "getFk_projeto")	
private int fk_projeto;

@Anot_BD_Campo(nome = "objetivo", set = "setObjetivo", get = "getObjetivo")	
private String objetivo;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")
private String status;

@Anot_BD_Campo(nome = "obs", set = "setObs", get = "getObs")
private String obs;

@Anot_BD_Campo(nome = "ordem", tipo=int.class, set = "setOrdem", get = "getOrdem")
private int ordem;



public int getId_etapa() {	return id_etapa;}
public void setId_etapa(int id_etapa) {	this.id_etapa = id_etapa;}

public String getTitulo() {	return titulo;}
public void setTitulo(String titulo) {	this.titulo = titulo;}

public int getFk_projeto() {	return fk_projeto;}
public void setFk_projeto(int fk_projeto) {	this.fk_projeto = fk_projeto;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public String getObs() {	return obs;}
public void setObs(String obs) {	this.obs = obs;}	
	
public String getObjetivo() {	return objetivo;}
public void setObjetivo(String objetivo) {	this.objetivo = objetivo;}	
	
public int getOrdem() {	return ordem;}
public void setOrdem(int ordem) {	this.ordem = ordem;}
	




}
