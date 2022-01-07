package cadastro.modelos.equipamentos;


import java.util.List;

import comuns.Comuns;
import comuns.Mensagens;
import beans.Unidade;
import beans.modelos.Equipamento_Modelo;
import beans.modelos.ItemDeOrcamentoModelo;
import dao.DAO;




public class FormAlterEquipamentoModelo extends FormEquipamentoModeloBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterEquipamentoModelo(Equipamento_Modelo equipamento) {
			
	super("Alterar Equipamento (Modelo)", 650, 190, equipamento);
	
	this.adicionarComponentes();
	
	this.tf_codigo.setText(this.equipamento.getCodigo());
	this.tf_descricao.setText(this.equipamento.getDescricao());
	this.tf_valor.setText(this.equipamento.getValor_unitario());
	this.tipo.setSelectedItem(this.equipamento.getTipo());
			
		if(this.equipamento.getFk_unidade()>0){
		
		Unidade unidade  = new DAO<Unidade>(Unidade.class).get(this.equipamento.getFk_unidade());
		
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
		
	this.equipamento.setDescricao(this.tf_descricao.getText());
	this.equipamento.setFk_unidade(this.id_unidade);
	this.equipamento.setTipo(this.tipo.getSelectedItem().toString());
	
	boolean atualizar_itens =this.tf_valor.getText().compareTo(this.equipamento.getValor_unitario())==0?false:true; 
	
	this.equipamento.setValor_unitario(this.tf_valor.getText());
	
	
		if(!new DAO<Equipamento_Modelo>(Equipamento_Modelo.class).altera(this.equipamento)){
		
		Mensagens.msgDeErroAoAlterar();	
		return false;
		}
	
	
		if(atualizar_itens){
	
			if(Mensagens.dialogoDeConfirmacao("Deseja atualizar todos os itens de orçamento que utilizam este equipamento?")){	
			
			DAO<ItemDeOrcamentoModelo> item_dao = new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class);
			
			List<ItemDeOrcamentoModelo>	itens = item_dao.get(
					"INNER JOIN item_modelo_x_equipamento_modelo AS ixeq_mod ON ixeq_mod.fk_item = itns_mod.id_item_modelo AND ixeq_mod.fk_equipamento="+this.equipamento.getId_equipamento(), 
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
