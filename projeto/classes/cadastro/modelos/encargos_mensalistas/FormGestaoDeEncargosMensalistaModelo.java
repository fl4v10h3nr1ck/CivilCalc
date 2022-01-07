package cadastro.modelos.encargos_mensalistas;

import beans.modelos.Encargo_Mensalista_Modelo;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeEncargosMensalistaModelo extends Recursos<Encargo_Mensalista_Modelo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeEncargosMensalistaModelo(){
		
	super("Gestão de Encargos Mensalistas (Modelo)");
	
	this.motorDePesquisa = new MotorDePesquisa<Encargo_Mensalista_Modelo>("Encargos Mensalistas Cadastrados", Encargo_Mensalista_Modelo.class);
	this.motorDePesquisa.tableModel.setWhere("encg_me_m.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by encg_me_m.id_encargo_mensalistas_modelo DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoEncargoMensalistaModelo form = new FormNovoEncargoMensalistaModelo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Encargo_Mensalista_Modelo selectedItem= (Encargo_Mensalista_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterarEncargoMensalistaModelo alterForm = new FormAlterarEncargoMensalistaModelo( (Encargo_Mensalista_Modelo) new DAO<Encargo_Mensalista_Modelo>(Encargo_Mensalista_Modelo.class).get(selectedItem.getId_encargo_mensalistas_modelo()));
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
	
	Encargo_Mensalista_Modelo selectedItem= (Encargo_Mensalista_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
								
		if(selectedItem != null){
		
		if(new DAO<Encargo_Mensalista_Modelo>(Encargo_Mensalista_Modelo.class).desativar(selectedItem.getId_encargo_mensalistas_modelo()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de encargos para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

