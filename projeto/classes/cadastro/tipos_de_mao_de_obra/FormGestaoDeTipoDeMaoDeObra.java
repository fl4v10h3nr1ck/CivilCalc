package cadastro.tipos_de_mao_de_obra;

import beans.TipoDeMaoDeObra;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeTipoDeMaoDeObra extends Recursos<TipoDeMaoDeObra>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeTipoDeMaoDeObra(){
		
	super("Gestão de Tipos de Mão de Obra");
	
	this.motorDePesquisa = new MotorDePesquisa<TipoDeMaoDeObra>("Tipos de Mão de Obra Cadastrados", TipoDeMaoDeObra.class);
	this.motorDePesquisa.tableModel.setWhere("t_m_obra.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by t_m_obra.id_tipo_mao_obra DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoTipoDeMaoDeObra form = new FormNovoTipoDeMaoDeObra();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	TipoDeMaoDeObra selectedItem= (TipoDeMaoDeObra) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterTipoDeMaoDeObra alterForm = new FormAlterTipoDeMaoDeObra( (TipoDeMaoDeObra) new DAO<TipoDeMaoDeObra>(TipoDeMaoDeObra.class).get(selectedItem.getId_tipo_mao_obra()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de tipos de mão de obra para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	TipoDeMaoDeObra selectedItem= (TipoDeMaoDeObra) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
							
		if(selectedItem != null){
		
		if(new DAO<TipoDeMaoDeObra>(TipoDeMaoDeObra.class).desativar(selectedItem.getId_tipo_mao_obra()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de tipos de mão de obra para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

