package cadastro.cargos;

import beans.Cargo;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeCargos extends Recursos<Cargo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeCargos(){
		
	super("Gestão de Cargos");
	
	this.motorDePesquisa = new MotorDePesquisa<Cargo>("Cargos Cadastrados", Cargo.class);
	this.motorDePesquisa.tableModel.setWhere("carg.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by carg.id_cargo DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoCargo form = new FormNovoCargo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Cargo selectedItem= (Cargo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterCargo alterForm = new FormAlterCargo( (Cargo) new DAO<Cargo>(Cargo.class).get(selectedItem.getId_cargo()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de cargos para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Cargo selectedItem= (Cargo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
					
		if(selectedItem != null){
		
		if(new DAO<Cargo>(Cargo.class).desativar(selectedItem.getId_cargo()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de cargos para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

