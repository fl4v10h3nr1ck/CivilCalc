package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;

@Anot_BD_Tabela(nome="enderecos", prefixo="end")
public class Endereco {

@Anot_BD_Campo(nome = "id_endereco", tipo=int.class, set = "setId_endereco", get = "getId_endereco", ehId=true)	
private int id_endereco;

@Anot_BD_Campo(nome = "logradouro", set = "setLogradouro", get = "getLogradouro")	
private String logradouro;

@Anot_BD_Campo(nome = "num", set = "setNum", get = "getNum")	
private String num;

@Anot_BD_Campo(nome = "cep", set = "setCep", get = "getCep")	
private String cep;

@Anot_BD_Campo(nome = "cidade", set = "setCidade", get = "getCidade")	
private String cidade;

@Anot_BD_Campo(nome = "pais", set = "setPais", get = "getPais")	
private String pais;

@Anot_BD_Campo(nome = "bairro", set = "setBairro", get = "getBairro")	
private String bairro;

@Anot_BD_Campo(nome = "complemento", set = "setComplemento", get = "getComplemento")	
private String complemento;

@Anot_BD_Campo(nome = "uf", set = "setUf", get = "getUf")	
private String uf;



public int getId_endereco() {	return id_endereco;}
public void setId_endereco(int id_endereco) {	this.id_endereco = id_endereco;}

public String getLogradouro() {	return logradouro;}
public void setLogradouro(String logradouro) {	this.logradouro = logradouro;}

public String getNum() {	return num;}
public void setNum(String num) {	this.num = num;}

public String getCep() {	return cep;}
public void setCep(String cep) {	this.cep = cep;}

public String getCidade() {	return cidade;}
public void setCidade(String cidade) {	this.cidade = cidade;}

public String getPais() {	return pais;}
public void setPais(String pais) {	this.pais = pais;}

public String getBairro() {	return bairro;}
public void setBairro(String bairro) {	this.bairro = bairro;}

public String getComplemento() {	return complemento;}
public void setComplemento(String complemento) {	this.complemento = complemento;}

public String getUf() {	return uf;}
public void setUf(String uf) {	this.uf = uf;}
	




}
