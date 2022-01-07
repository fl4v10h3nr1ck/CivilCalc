package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;


@Anot_BD_Tabela(nome="Integrantes", prefixo="inte", left_join="LEFT OUTER JOIN cargos as carg on carg.id_cargo = inte.fk_cargo")
public class Integrante {


@Anot_BD_Campo(nome = "id_integrante", tipo=int.class, set = "setId_integrante", get = "getId_integrante", ehId=true)	
private int id_integrante;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=60)
@Anot_TB_Coluna(posicao=0, rotulo="Nome", comprimento = 35)
@Anot_BD_Campo(nome = "nome", set = "setNome", get = "getNome")	
private String nome;

@Anot_BD_Campo(nome = "cpf_cnpj", set = "setCpf_cnpj", get = "getCpf_cnpj")	
private String cpf_cnpj;

@Anot_BD_Campo(nome = "tel", set = "setTel", get = "getTel")	
private String tel;

@Anot_BD_Campo(nome = "sexo", set = "setSexo", get = "getSexo")	
private String sexo;

@Anot_BD_Campo(nome = "fk_cargo", tipo=int.class, set = "setFk_cargo", get = "getFk_cargo")	
private int fk_cargo;

@Anot_TB_Coluna(posicao=2, rotulo="Tipo", comprimento = 15)
@Anot_BD_Campo(nome = "tipo", set = "setTipo", get = "getTipo")	
private String tipo;

@Anot_BD_Campo(nome = "fk_endereco", tipo=int.class, set = "setFk_endereco", get = "getFk_endereco")	
private int fk_endereco;

@Anot_BD_Campo(nome = "fk_grupo", tipo=int.class, set = "setFk_grupo", get = "getFk_grupo")	
private int fk_grupo;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;

@Anot_TB_Coluna(posicao=1, rotulo="Cargo", comprimento = 35)
@Anot_TB_Coluna_Selecao(posicao=1, comprimento=40)
@Anot_BD_Campo(nome = "descricao", set = "setCargo", get = "getCargo", prefixo="carg", select_apenas = true)
private String cargo;

@Anot_BD_Campo(nome = "path_assinatura", set = "setPath_assinatura", get = "getPath_assinatura")	
private String path_assinatura;




public int getId_integrante() {	return id_integrante;}
public void setId_integrante(int id_integrante) {	this.id_integrante = id_integrante;}

public String getNome() {	return nome;}
public void setNome(String nome) {	this.nome = nome;}

public String getCpf_cnpj() {	return cpf_cnpj;}
public void setCpf_cnpj(String cpf_cnpj) {	this.cpf_cnpj = cpf_cnpj;}

public String getTel() {	return tel;}
public void setTel(String tel) {	this.tel = tel;}

public String getSexo() {	return sexo;}
public void setSexo(String sexo) {	this.sexo = sexo;}

public String getTipo() {	return tipo;}
public void setTipo(String tipo) {	this.tipo = tipo;}

public int getFk_endereco() {	return fk_endereco;}
public void setFk_endereco(int fk_endereco) {	this.fk_endereco = fk_endereco;}

public int getFk_cargo() {	return fk_cargo;}
public void setFk_cargo(int fk_cargo) {	this.fk_cargo = fk_cargo;}

public int getFk_grupo() {	return fk_grupo;}
public void setFk_grupo(int fk_grupo) {	this.fk_grupo = fk_grupo;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public String getCargo() {	return cargo;}
public void setCargo(String cargo) {	this.cargo = cargo;}

public String getPath_assinatura() {	return path_assinatura;}
public void setPath_assinatura(String path_assinatura) {	this.path_assinatura = path_assinatura;}
	
	



}
