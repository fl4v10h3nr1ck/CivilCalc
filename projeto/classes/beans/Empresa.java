package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;


@Anot_BD_Tabela(nome="empresa", prefixo="emp")
public class Empresa {

@Anot_BD_Campo(nome = "id_empresa", tipo=int.class, set = "setId_empresa", get = "getId_empresa", ehId=true)			
private int id_empresa;

@Anot_BD_Campo(nome = "nome_razao", set = "setNome_razao", get = "getNome_razao")	
private String nome_razao;

@Anot_BD_Campo(nome = "nome_fantasia", set = "setNome_fantasia", get = "getNome_fantasia")	
private String nome_fantasia;

@Anot_BD_Campo(nome = "lema", set = "setLema", get = "getLema")	
private String lema;

@Anot_BD_Campo(nome = "fk_endereco", tipo=int.class, set = "setFk_endereco", get = "getFk_endereco")		
private int fk_endereco;

@Anot_BD_Campo(nome = "tel_1", set = "setTel_1", get = "getTel_1")	
private String tel_1;

@Anot_BD_Campo(nome = "tel_2", set = "setTel_2", get = "getTel_2")	
private String tel_2;

@Anot_BD_Campo(nome = "site", set = "setSite", get = "getSite")	
private String site;

@Anot_BD_Campo(nome = "email", set = "setEmail", get = "getEmail")	
private String email;

@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;

@Anot_BD_Campo(nome = "cpf_cnpj", set = "setCpf_cnpj", get = "getCpf_cnpj")	
private String cpf_cnpj;

@Anot_BD_Campo(nome = "insc_municipal", set = "setInsc_municipal", get = "getInsc_municipal")	
private String insc_municipal;

@Anot_BD_Campo(nome = "insc_estadual", set = "setInsc_estadual", get = "getInsc_estadual")	
private String insc_estadual;

@Anot_BD_Campo(nome = "fk_dados_encargo", tipo=int.class, set = "setFk_dados_encargo", get = "getFk_dados_encargo")		
private int fk_dados_encargo;

@Anot_BD_Campo(nome = "acesso_rapido", set = "setAcesso_rapido", get = "getAcesso_rapido")	
private String acesso_rapido;


public int getId_empresa() {	return id_empresa;}
public void setId_empresa(int id_empresa) {	this.id_empresa = id_empresa;}

public String getNome_razao() {	return nome_razao;}
public void setNome_razao(String nome_razao) {	this.nome_razao = nome_razao;}

public String getNome_fantasia() {	return nome_fantasia;}
public void setNome_fantasia(String nome_fantasia) {	this.nome_fantasia = nome_fantasia;}

public String getLema() {	return lema;}
public void setLema(String lema) {	this.lema = lema;}

public int getFk_endereco() {	return fk_endereco;}
public void setFk_endereco(int fk_endereco) {	this.fk_endereco = fk_endereco;}

public String getTel_1() {	return tel_1;}
public void setTel_1(String tel_1) {	this.tel_1 = tel_1;}

public String getTel_2() {	return tel_2;}
public void setTel_2(String tel_2) {	this.tel_2 = tel_2;}

public String getSite() {	return site;}
public void setSite(String site) {	this.site = site;}

public String getEmail() {	return email;}
public void setEmail(String email) {	this.email = email;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getCpf_cnpj() {	return cpf_cnpj;}
public void setCpf_cnpj(String cpf_cnpj) {	this.cpf_cnpj = cpf_cnpj;}

public String getInsc_municipal() {	return insc_municipal;}
public void setInsc_municipal(String insc_municipal) {	this.insc_municipal = insc_municipal;}

public String getInsc_estadual() {	return insc_estadual;}
public void setInsc_estadual(String insc_estadual) {	this.insc_estadual = insc_estadual;}

public int getFk_dados_encargo() {	return fk_dados_encargo;}
public void setFk_dados_encargo(int fk_dados_encargo) {	this.fk_dados_encargo = fk_dados_encargo;}

public String getAcesso_rapido() {	return acesso_rapido;}
public void setAcesso_rapido(String acesso_rapido) {	this.acesso_rapido = acesso_rapido;}	
	
	





}
