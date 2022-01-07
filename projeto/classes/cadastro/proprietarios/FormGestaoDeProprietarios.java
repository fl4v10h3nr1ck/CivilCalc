package cadastro.proprietarios;

import beans.Proprietario;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeProprietarios extends Recursos<Proprietario>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeProprietarios(){
		
	super("Gestão de Proprietários");
	
	this.motorDePesquisa = new MotorDePesquisa<Proprietario>("Proprietários Cadastrados", Proprietario.class);
	this.motorDePesquisa.tableModel.setWhere("prop.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by prop.id_proprietario DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoProprietario form = new FormNovoProprietario();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Proprietario selectedItem= (Proprietario) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterProprietario alterForm = new FormAlterProprietario((Proprietario) new DAO<Proprietario>(Proprietario.class).get(selectedItem.getId_proprietario()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de proprietários para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Proprietario selectedItem= (Proprietario) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
				
		if(selectedItem != null){
		
		if(new DAO<Proprietario>(Proprietario.class).desativar(selectedItem.getId_proprietario()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de proprietários para exclusão.");	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

