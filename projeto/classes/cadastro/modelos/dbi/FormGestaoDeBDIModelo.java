package cadastro.modelos.dbi;

import beans.modelos.BDI_Modelo;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeBDIModelo extends Recursos<BDI_Modelo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeBDIModelo(){
		
	super("Gestão de BDI (Modelo)");
	
	this.motorDePesquisa = new MotorDePesquisa<BDI_Modelo>("BDI Cadastrados (Modelo)", BDI_Modelo.class);
	this.motorDePesquisa.tableModel.setWhere("bd_i_m.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by bd_i_m.id_bdi_modelo DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoBDIModelo form = new FormNovoBDIModelo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	BDI_Modelo selectedItem= (BDI_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterBDIModelo alterForm = new FormAlterBDIModelo( (BDI_Modelo) new DAO<BDI_Modelo>(BDI_Modelo.class).get(selectedItem.getId_bdi_modelo()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de BDI para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	BDI_Modelo selectedItem= (BDI_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
							
		if(selectedItem != null){
		
		if(new DAO<BDI_Modelo>(BDI_Modelo.class).desativar(selectedItem.getId_bdi_modelo()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de BDI para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

