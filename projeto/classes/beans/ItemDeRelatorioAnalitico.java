package beans;

public class ItemDeRelatorioAnalitico {

	
private String codigo;	
private String contador;	
private String descricao;	
private String unidade;	
private String valor_unitario;	
private String quant;	
private String valor_total;
private boolean etapa;
private boolean subetapa;
private boolean item;




public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getUnidade() {	return unidade;}
public void setUnidade(String unidade) {	this.unidade = unidade;}

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}

public String getQuant() {	return quant;}
public void setQuant(String quant) {	this.quant = quant;}

public String getValor_total() {	return valor_total;}
public void setValor_total(String valor_total) {	this.valor_total = valor_total;}

public String getContador() {	return contador;}
public void setContador(String contador) {	this.contador = contador;}

public boolean isEtapa() {	return etapa;}
public void setEtapa(boolean etapa) {	this.etapa = etapa;}

public boolean isSubetapa() {	return subetapa;}
public void setSubetapa(boolean subetapa) {	this.subetapa = subetapa;}

public boolean isItem() {	return item;}
public void setItem(boolean item) {	this.item = item;}	

	
	
}
