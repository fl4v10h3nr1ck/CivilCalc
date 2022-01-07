package cadastro.fornecedores;


import beans.Fornecedor;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class GestaoDeFornecedores extends Recursos<Fornecedor>{

	

private static final long serialVersionUID = 1L;





	public GestaoDeFornecedores(){
		
	super("Gestão de Fornecedores");
	
	this.motorDePesquisa = new MotorDePesquisa<Fornecedor>("Fornecedores Cadastrados", Fornecedor.class);
	this.motorDePesquisa.tableModel.setWhere("forn.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by forn.id_fornecedor DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoFornecedor form = new FormNovoFornecedor();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Fornecedor selectedItem= (Fornecedor) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterFornecedor alterForm = new FormAlterFornecedor( (Fornecedor) new DAO<Fornecedor>(Fornecedor.class).get(selectedItem.getId_fornecedor()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de fornecedores para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Fornecedor selectedItem= (Fornecedor) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
									
		if(selectedItem != null){
		
		if(new DAO<Fornecedor>(Fornecedor.class).desativar(selectedItem.getId_fornecedor()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de fornecedores para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

