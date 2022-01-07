package cadastro.tipos_de_materiais;

import beans.TipoDeMaterial;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeTipo extends Recursos<TipoDeMaterial>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeTipo(){
		
	super("Gestão de Tipos de Materiais");
	
	this.motorDePesquisa = new MotorDePesquisa<TipoDeMaterial>("Tipos de Materiais Cadastrados", TipoDeMaterial.class);
	this.motorDePesquisa.tableModel.setWhere("tp_mat.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by tp_mat.id_tipo_material DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoTipo form = new FormNovoTipo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	TipoDeMaterial selectedItem= (TipoDeMaterial) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterTipo alterForm = new FormAlterTipo( (TipoDeMaterial) new DAO<TipoDeMaterial>(TipoDeMaterial.class).get(selectedItem.getId_tipo_material()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de tipos para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	TipoDeMaterial selectedItem= (TipoDeMaterial) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
						
		if(selectedItem != null){
		
		if(new DAO<TipoDeMaterial>(TipoDeMaterial.class).desativar(selectedItem.getId_tipo_material()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de tipos para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

