package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;

@Anot_BD_Tabela(nome="materiais", prefixo="mat")
public class Material {

	
@Anot_BD_Campo(nome = "id_material", tipo=int.class, set = "setId_material", get = "getId_material", ehId=true)			
private int id_material;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=20)
@Anot_TB_Coluna(posicao=0, rotulo="Código", comprimento = 30)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=80)
@Anot_TB_Coluna(posicao=1, rotulo="Nome", comprimento = 50)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")
private String descricao;

@Anot_BD_Campo(nome = "fk_tipo", tipo=int.class, set = "setFk_tipo", get = "getFk_tipo")
private int fk_tipo;

@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario")
private String valor_unitario;

@Anot_BD_Campo(nome = "coeficiente", set = "setCoeficiente", get = "getCoeficiente")
private String coeficiente;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;

@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade")		
private int fk_unidade;


@Anot_BD_Campo(nome = "valor_por_fornecedor", set = "setValor_por_fornecedor", get = "getValor_por_fornecedor")	
private String valor_por_fornecedor;

@Anot_BD_Campo(nome = "valor_padrao_fornecedor", set = "setValor_padrao_fornecedor", get = "getValor_padrao_fornecedor")	
private String valor_padrao_fornecedor;

@Anot_BD_Campo(nome = "fk_modelo", tipo=int.class, set = "setFk_modelo", get = "getFk_modelo")	
private int fk_modelo;




public int getId_material() {	return id_material;}
public void setId_material(int id_material) {	this.id_material = id_material;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}

public String getCoeficiente() {	return coeficiente;}
public void setCoeficiente(String coeficiente) {	this.coeficiente = coeficiente;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public int getFk_tipo() {	return fk_tipo;}
public void setFk_tipo(int fk_tipo) {	this.fk_tipo = fk_tipo;}	
	
public int getFk_unidade() {	return fk_unidade;}
public void setFk_unidade(int fk_unidade) {	this.fk_unidade = fk_unidade;}


public String getValor_por_fornecedor() {	return valor_por_fornecedor;}
public void setValor_por_fornecedor(String valor_por_fornecedor) {	this.valor_por_fornecedor = valor_por_fornecedor;}

public String getValor_padrao_fornecedor() {	return valor_padrao_fornecedor;}
public void setValor_padrao_fornecedor(String valor_padrao_fornecedor) {	this.valor_padrao_fornecedor = valor_padrao_fornecedor;}

public int getFk_modelo() {	return fk_modelo;}
public void setFk_modelo(int fk_modelo) {	this.fk_modelo = fk_modelo;}


	
}
