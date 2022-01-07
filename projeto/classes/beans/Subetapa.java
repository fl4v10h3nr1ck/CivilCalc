package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;

@Anot_BD_Tabela(nome="subetapas", prefixo="subetap", left_join ="INNER JOIN etapas as etap ON subetap.fk_etapa = etap.id_etapa")
public class Subetapa {

@Anot_BD_Campo(nome = "id_subetapa", tipo=int.class, set = "setId_subetapa", get = "getId_subetapa", ehId=true)		
private int id_subetapa;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=50)
@Anot_TB_Coluna(posicao=1, rotulo="Subetapa", comprimento = 50)
@Anot_BD_Campo(nome = "titulo", set = "setTitulo", get = "getTitulo")	
private String titulo;

@Anot_BD_Campo(nome = "fk_etapa", tipo=int.class, set = "setFk_etapa", get = "getFk_etapa")	
private int fk_etapa;

@Anot_BD_Campo(nome = "objetivo", set = "setObjetivo", get = "getObjetivo")	
private String objetivo;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")
private String status;

@Anot_BD_Campo(nome = "obs", set = "setObs", get = "getObs")
private String obs;

@Anot_BD_Campo(nome = "ordem", tipo=int.class, set = "setOrdem", get = "getOrdem")
private int ordem;


@Anot_TB_Coluna_Selecao(posicao=0, comprimento=50)
@Anot_TB_Coluna(posicao=0, rotulo="Etapa", comprimento = 50)
@Anot_BD_Campo(nome = "titulo", set = "setTitulo_etapa", get = "getTitulo_etapa", prefixo="etap", select_apenas=true)
private String titulo_etapa;



public String getTitulo() {	return titulo;}
public void setTitulo(String titulo) {	this.titulo = titulo;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public String getObs() {	return obs;}
public void setObs(String obs) {	this.obs = obs;}

public int getId_subetapa() {	return id_subetapa;}
public void setId_subetapa(int id_subetapa) {	this.id_subetapa = id_subetapa;}

public int getFk_etapa() {	return fk_etapa;}
public void setFk_etapa(int fk_etapa) {	this.fk_etapa = fk_etapa;}

public String getObjetivo() {	return objetivo;}
public void setObjetivo(String objetivo) {	this.objetivo = objetivo;}	
		
public int getOrdem() {	return ordem;}
public void setOrdem(int ordem) {	this.ordem = ordem;}

public String getTitulo_etapa() {	return titulo_etapa;}
public void setTitulo_etapa(String titulo_etapa) {	this.titulo_etapa = titulo_etapa;}
			

//public String getNomeCompleto() {return titulo_etapa+" | "+this.titulo;}



}
