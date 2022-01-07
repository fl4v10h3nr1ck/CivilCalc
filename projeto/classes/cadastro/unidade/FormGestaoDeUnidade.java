package cadastro.unidade;


import beans.Unidade;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeUnidade extends Recursos<Unidade>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeUnidade(){
		
	super("Gestão de Equipamentos");
	
	this.motorDePesquisa = new MotorDePesquisa<Unidade>("Unidades Cadastradas", Unidade.class);
	this.motorDePesquisa.tableModel.setWhere("uni.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by uni.id_unidade DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovaUnidade form = new FormNovaUnidade();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Unidade selectedItem= (Unidade) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterUnidade alterForm = new FormAlterUnidade( (Unidade) new DAO<Unidade>(Unidade.class).get(selectedItem.getId_unidade()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de unidades para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Unidade selectedItem= (Unidade) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
								
		if(selectedItem != null){
		
		if(new DAO<Unidade>(Unidade.class).desativar(selectedItem.getId_unidade()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de unidades para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

