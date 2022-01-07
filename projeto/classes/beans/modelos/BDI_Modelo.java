package beans.modelos;

import beans.BDI;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;

@Anot_BD_Tabela(nome="bdi_modelo", prefixo="bd_i_m")
public class BDI_Modelo {

	
@Anot_BD_Campo(nome = "id_bdi_modelo", tipo=int.class, set = "setId_bdi_modelo", get = "getId_bdi_modelo", ehId=true)		
private int id_bdi_modelo;

@Anot_BD_Campo(nome = "despesa_admin", set = "setDespesa_admin", get = "getDespesa_admin")		
private String despesa_admin;

@Anot_BD_Campo(nome = "iss", set = "setIss", get = "getIss")	
private String iss;

@Anot_BD_Campo(nome = "cofins", set = "setCofins", get = "getCofins")	
private String cofins;

@Anot_BD_Campo(nome = "pis", set = "setPis", get = "getPis")	
private String pis;

@Anot_BD_Campo(nome = "cprb", set = "setCprb", get = "getCprb")	
private String cprb;

@Anot_BD_Campo(nome = "custo_finan", set = "setCusto_finan", get = "getCusto_finan")	
private String custo_finan;

@Anot_BD_Campo(nome = "risco_imprevisto", set = "setRisco_imprevisto", get = "getRisco_imprevisto")	
private String risco_imprevisto;

@Anot_BD_Campo(nome = "seguros", set = "setSeguros", get = "getSeguros")	
private String seguros;

@Anot_BD_Campo(nome = "garantias", set = "setGarantias", get = "getGarantias")	
private String garantias;

@Anot_BD_Campo(nome = "bonificacao", set = "setBonificacao", get = "getBonificacao")	
private String bonificacao;

@Anot_TB_Coluna_Selecao(posicao=1, comprimento=30)
@Anot_TB_Coluna(posicao=1, rotulo="Valor (%)", comprimento = 30)
@Anot_BD_Campo(nome = "valor_final", set = "setValor_final", get = "getValor_final")	
private String valor_final;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=70)
@Anot_TB_Coluna(posicao=0, rotulo="Código/Identificador", comprimento = 70)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;






public int getId_bdi_modelo() {	return id_bdi_modelo;}
public void setId_bdi_modelo(int id_bdi_modelo) {	this.id_bdi_modelo = id_bdi_modelo;}

public String getDespesa_admin() {	return despesa_admin;}
public void setDespesa_admin(String despesa_admin) {	this.despesa_admin = despesa_admin;}

public String getIss() {	return iss;}
public void setIss(String iss) {	this.iss = iss;}

public String getCofins() {	return cofins;}
public void setCofins(String cofins) {	this.cofins = cofins;}

public String getPis() {	return pis;}
public void setPis(String pis) {	this.pis = pis;}

public String getCprb() {	return cprb;}
public void setCprb(String cprb) {	this.cprb = cprb;}

public String getCusto_finan() {	return custo_finan;}
public void setCusto_finan(String custo_finan) {	this.custo_finan = custo_finan;}

public String getRisco_imprevisto() {	return risco_imprevisto;}
public void setRisco_imprevisto(String risco_imprevisto) {	this.risco_imprevisto = risco_imprevisto;}

public String getSeguros() {	return seguros;}
public void setSeguros(String seguros) {	this.seguros = seguros;}

public String getGarantias() {	return garantias;}
public void setGarantias(String garantias) {	this.garantias = garantias;}

public String getBonificacao() {	return bonificacao;}
public void setBonificacao(String bonificacao) {	this.bonificacao = bonificacao;}

public String getValor_final() {	return valor_final;}
public void setValor_final(String valor_final) {	this.valor_final = valor_final;}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}




	public BDI clona(){
		
	BDI aux = new BDI();	
		
	aux.setDespesa_admin(this.getDespesa_admin());
	aux.setIss(this.getIss());
	aux.setCofins(this.getCofins());
	aux.setPis(this.getPis());
	aux.setCprb(this.getCprb());
	aux.setCusto_finan(this.getCusto_finan());
	aux.setRisco_imprevisto(this.getRisco_imprevisto());
	aux.setSeguros(this.getSeguros());
	aux.setGarantias(this.getGarantias());
	aux.setBonificacao(this.getBonificacao());
	aux.setValor_final(this.getValor_final());
	aux.setCodigo(this.getCodigo());
	aux.setStatus(this.getStatus());

	return aux;
	}


}
