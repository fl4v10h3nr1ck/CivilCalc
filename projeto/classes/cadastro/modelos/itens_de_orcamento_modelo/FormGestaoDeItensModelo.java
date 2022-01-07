package cadastro.modelos.itens_de_orcamento_modelo;

import beans.modelos.ItemDeOrcamentoModelo;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeItensModelo extends Recursos<ItemDeOrcamentoModelo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeItensModelo(){
		
	super("Gestão de Itens de Orçamento (Modelo)");
	
	this.motorDePesquisa = new MotorDePesquisa<ItemDeOrcamentoModelo>("Itens de Orçamento Cadastrados", ItemDeOrcamentoModelo.class);
	this.motorDePesquisa.tableModel.setWhere("itns_mod.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by itns_mod.id_item_modelo DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormItensDeOrcamentoModelo form = new FormItensDeOrcamentoModelo(null);
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	ItemDeOrcamentoModelo selectedItem= (ItemDeOrcamentoModelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormItensDeOrcamentoModelo alterForm = new FormItensDeOrcamentoModelo( (ItemDeOrcamentoModelo) new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class).get(selectedItem.getId_item_modelo()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de itens para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	ItemDeOrcamentoModelo selectedItem= (ItemDeOrcamentoModelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
						
		if(selectedItem != null){
		
		if(new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class).desativar(selectedItem.getId_item_modelo()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de itens para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

