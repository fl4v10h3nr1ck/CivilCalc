package cadastro.modelos.encargos_horistas;

import beans.modelos.Encargo_Horista_Modelo;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeEncargosHoristasModelo extends Recursos<Encargo_Horista_Modelo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeEncargosHoristasModelo(){
		
	super("Gestão de Encargos Horistas (Modelo)");
	
	this.motorDePesquisa = new MotorDePesquisa<Encargo_Horista_Modelo>("Encargos Horistas Cadastrados", Encargo_Horista_Modelo.class);
	this.motorDePesquisa.tableModel.setWhere("encg_ho_m.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by encg_ho_m.id_encargo_horista DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoEncargoHoristaModelo form = new FormNovoEncargoHoristaModelo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Encargo_Horista_Modelo selectedItem= (Encargo_Horista_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterarEncargoHoristaModelo alterForm = new FormAlterarEncargoHoristaModelo( (Encargo_Horista_Modelo) new DAO<Encargo_Horista_Modelo>(Encargo_Horista_Modelo.class).get(selectedItem.getId_encargo_horista_modelo()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de encargos para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Encargo_Horista_Modelo selectedItem= (Encargo_Horista_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
							
		if(selectedItem != null){
		
		if(new DAO<Encargo_Horista_Modelo>(Encargo_Horista_Modelo.class).desativar(selectedItem.getId_encargo_horista_modelo()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de encargos para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

