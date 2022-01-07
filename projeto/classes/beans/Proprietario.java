package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;


@Anot_BD_Tabela(nome="Proprietarios", prefixo="prop")
public class Proprietario {

	
@Anot_BD_Campo(nome = "id_proprietario", tipo=int.class, set = "setId_proprietario", get = "getId_proprietario", ehId=true)	
private int id_proprietario;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=73)
@Anot_TB_Coluna(posicao=0, rotulo="Nome", comprimento = 45)
@Anot_BD_Campo(nome = "nome_razao", set = "setNome_razao", get = "getNome_razao")	
private String nome_razao;

@Anot_TB_Coluna(posicao=1, rotulo="Tipo", comprimento = 15)
@Anot_BD_Campo(nome = "tipo", set = "setTipo", get = "getTipo")	
private String tipo;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=27)
@Anot_TB_Coluna(posicao=2, rotulo="CPF/CNPJ", comprimento =20)
@Anot_BD_Campo(nome = "cpf_cnpj", set = "setCpf_cnpj", get = "getCpf_cnpj")	
private String cpf_cnpj;

@Anot_TB_Coluna(posicao=3, rotulo="TEL", comprimento = 20)
@Anot_BD_Campo(nome = "tel_1", set = "setTel_1", get = "getTel_1")	
private String tel_1;

@Anot_BD_Campo(nome = "tel_2", set = "setTel_2", get = "getTel_2")	
private String tel_2;

@Anot_BD_Campo(nome = "email", set = "setEmail", get = "getEmail")	
private String email;

@Anot_BD_Campo(nome = "fk_endereco", tipo=int.class, set = "setFk_endereco", get = "getFk_endereco")	
private int fk_endereco;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;



public int getId_proprietario() {	return id_proprietario;}
public void setId_proprietario(int id_proprietario) {	this.id_proprietario = id_proprietario;}

public String getNome_razao() {	return nome_razao;}
public void setNome_razao(String nome_razao) {	this.nome_razao = nome_razao;}

public String getCpf_cnpj() {	return cpf_cnpj;}
public void setCpf_cnpj(String cpf_cnpj) {	this.cpf_cnpj = cpf_cnpj;}

public String getTipo() {	return tipo;}
public void setTipo(String tipo) {	this.tipo = tipo;}

public String getTel_1() {	return tel_1;}
public void setTel_1(String tel_1) {	this.tel_1 = tel_1;}

public String getTel_2() {	return tel_2;}
public void setTel_2(String tel_2) {	this.tel_2 = tel_2;}

public String getEmail() {	return email;}
public void setEmail(String email) {	this.email = email;}

public int getFk_endereco() {	return fk_endereco;}
public void setFk_endereco(int fk_endereco) {	this.fk_endereco = fk_endereco;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}
	
	
	
	
	


	
	
}
