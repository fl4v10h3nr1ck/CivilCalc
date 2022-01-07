package cadastro.modelos.mao_de_obra;


import java.util.List;

import comuns.Comuns;
import comuns.Mensagens;
import beans.TipoDeMaoDeObra;
import beans.Unidade;
import beans.modelos.ItemDeOrcamentoModelo;
import beans.modelos.Mao_De_Obra_Modelo;
import dao.DAO;




public class FormAlterMaoDeObraModelo extends FormMaoDeObraModeloBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterMaoDeObraModelo(Mao_De_Obra_Modelo retorno) {
			
	super("Alterar Mão de Obra (Modelo)", retorno);
	
	this.adicionarComponentes();
	
	
	this.tf_codigo.setText(this.retorno.getCodigo());
	this.tf_descricao.setText(this.retorno.getDescricao());
	this.tf_valor.setText(this.retorno.getValor_unitario());
	this.cb_ls_tipo.setSelectedItem(this.retorno.getLs_tipo());
	
	
	
		if(this.retorno.getFk_tipo()>0){
		
			
		TipoDeMaoDeObra tipo  = new DAO<TipoDeMaoDeObra>(TipoDeMaoDeObra.class).get(this.retorno.getFk_tipo());
		
			if(tipo!=null){
		
			this.id_tipo = tipo.getId_tipo_mao_obra();
			this.tf_tipo.setText(tipo.getDescricao());
			}
		}
		
		
		if(this.retorno.getFk_unidade()>0){
			
		Unidade unidade  = new DAO<Unidade>(Unidade.class).get(this.retorno.getFk_unidade());
			
			if(unidade !=null){
					
			this.id_unidade = unidade.getId_unidade();
			this.tf_unidade.setText(unidade.getDescricao());
			}
		}
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	this.retorno.setDescricao(this.tf_descricao.getText());
	
	boolean atualizar_itens =this.tf_valor.getText().compareTo(this.retorno.getValor_unitario())==0?false:true; 
	
	this.retorno.setValor_unitario(this.tf_valor.getText());
	this.retorno.setFk_tipo(this.id_tipo);
	this.retorno.setFk_unidade(this.id_unidade);	
	this.retorno.setLs_tipo(this.cb_ls_tipo.getSelectedItem().toString());
	
	
	
		if(!new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class).altera(this.retorno)){
			
		Mensagens.msgDeErroAoAlterar();	
		return false;
		}
		
		
		if(atualizar_itens){
			
			if(Mensagens.dialogoDeConfirmacao("Deseja atualizar todos os itens de orçamento que utilizam esta mão de obra?")){	
				
			DAO<ItemDeOrcamentoModelo> item_dao = new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class);
				
			List<ItemDeOrcamentoModelo>	itens = item_dao.get(
					"INNER JOIN item_modelo_x_mao_obra_modelo AS ixm_o_mod ON ixm_o_mod.fk_item = itns_mod.id_item_modelo AND ixm_o_mod.fk_mao_obra="+this.retorno.getId_mao_de_obra(), 
					"itns_mod.status='ATIVO' AND (itns_mod.sem_insumos<>'sim' OR itns_mod.sem_insumos IS NULL)", 
					null);
					
				
				for(ItemDeOrcamentoModelo item: itens){
					
				item.setValor_unitario(Comuns.atualizaValorDeItemModelo(item.getId_item_modelo()));	
				item_dao.altera(item);	
				}
			}
		}
		
	return true;	
	}

	
	


	
	
}
