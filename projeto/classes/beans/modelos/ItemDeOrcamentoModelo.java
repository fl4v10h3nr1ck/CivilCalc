package beans.modelos;

import beans.ItemDeOrcamento;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;
import comuns.Calculo;


@Anot_BD_Tabela(nome="itens_modelo", prefixo="itns_mod", left_join="left outer join unidades as uni on uni.id_unidade=itns_mod.fk_unidade")
public class ItemDeOrcamentoModelo {


@Anot_BD_Campo(nome = "id_item_modelo", tipo=int.class, set = "setId_item_modelo", get = "getId_item_modelo", ehId=true)		
private int id_item_modelo;

@Anot_TB_Coluna_Selecao(posicao=0, comprimento=10)
@Anot_TB_Coluna(posicao=0, rotulo="Código", comprimento = 10)
@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")	
private String codigo;


@Anot_TB_Coluna_Selecao(posicao=1, comprimento=70)
@Anot_TB_Coluna(posicao=1, rotulo="Item", comprimento = 57)
@Anot_BD_Campo(nome = "descricao", set = "setDescricao", get = "getDescricao")
private String descricao;


@Anot_BD_Campo(nome = "fk_unidade", tipo=int.class, set = "setFk_unidade", get = "getFk_unidade")		
private int fk_unidade;

@Anot_TB_Coluna_Selecao(posicao=2, comprimento=10)
@Anot_TB_Coluna(posicao=2, rotulo="Unidade", comprimento = 10)
@Anot_BD_Campo(nome = "simbolo", set = "setUnidade", get = "getUnidade", prefixo="uni", select_apenas=true)	
private String unidade;


@Anot_TB_Coluna(posicao=3, rotulo="Val. Uni. (R$)", comprimento = 13)
@Anot_BD_Campo(nome = "valor_unitario", set = "setValor_unitario", get = "getValor_unitario", getTab="getValor_unitarioFormatado")
private String valor_unitario;

@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
private String status;

@Anot_BD_Campo(nome = "sem_insumos", set = "setSem_insumos", get = "getSem_insumos")	
private String sem_insumos;

@Anot_TB_Coluna_Selecao(posicao=3, comprimento=10)
@Anot_TB_Coluna(posicao=4, rotulo="Tipo", comprimento = 10)
@Anot_BD_Campo(nome = "tipo", set = "setTipo", get = "getTipo", getTab="getTipoParaTab")	
private String tipo;





public int getId_item_modelo() {return id_item_modelo;}
public void setId_item_modelo(int id_item_modelo) {this.id_item_modelo = id_item_modelo;}

public String getDescricao() {	return descricao;}
public void setDescricao(String descricao) {	this.descricao = descricao;}

public String getValor_unitario() {	return valor_unitario;}
public void setValor_unitario(String valor_unitario) {	this.valor_unitario = valor_unitario;}
public String getValor_unitarioFormatado() {	return Calculo.formataValor(valor_unitario);}

public String getCodigo() {	return codigo;}
public void setCodigo(String codigo) {	this.codigo = codigo;}

public String getStatus() {	return status;}
public void setStatus(String status) {	this.status = status;}

public int getFk_unidade() {	return fk_unidade;}
public void setFk_unidade(int fk_unidade) {	this.fk_unidade = fk_unidade;}

public String getSem_insumos() {	return sem_insumos;}
public void setSem_insumos(String sem_insumos) {	this.sem_insumos = sem_insumos;}

public String getTipo() {	return tipo;}
public void setTipo(String tipo) {	this.tipo = tipo;}
public String getTipoParaTab() {return "<html><font color="+(tipo!=null && tipo.compareTo("SINAPI")==0?"blue":"green")+">"+tipo+"</font></html>";}
		
public String getUnidade() {return unidade;}
public void setUnidade(String unidade) {	this.unidade = unidade;}




	public ItemDeOrcamento clona(String quantidade, int id_subetapa){
		
	ItemDeOrcamento	item = new ItemDeOrcamento();
	
	item.setDescricao(this.getDescricao());
	item.setValor_unitario(this.getValor_unitario());
	item.setCodigo(this.getCodigo());
	item.setStatus("ATIVO");
	item.setValor_total(Calculo.multiplica(quantidade, this.valor_unitario));
	item.setFk_subetapa(id_subetapa);
	item.setFk_modelo(this.getId_item_modelo());
	item.setQuantidade(quantidade);
	item.setFk_unidade(this.getFk_unidade());
	item.setSem_insumos(this.getSem_insumos());
	
	return item;
	}
	
	
	
	
}
