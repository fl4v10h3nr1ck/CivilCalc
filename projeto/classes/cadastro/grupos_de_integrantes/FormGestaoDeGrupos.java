package cadastro.grupos_de_integrantes;

import beans.GrupoDeIntegrantes;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeGrupos extends Recursos<GrupoDeIntegrantes>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeGrupos(){
		
	super("Gestão de Grupos de Integrantes");
	
	this.motorDePesquisa = new MotorDePesquisa<GrupoDeIntegrantes>("Grupos Cadastrados", GrupoDeIntegrantes.class);
	this.motorDePesquisa.tableModel.setWhere("grp_inte.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by grp_inte.id_grupo_de_integrante DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoGrupo form = new FormNovoGrupo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	GrupoDeIntegrantes selectedItem= (GrupoDeIntegrantes) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterGrupo alterForm = new FormAlterGrupo( (GrupoDeIntegrantes) new DAO<GrupoDeIntegrantes>(GrupoDeIntegrantes.class).get(selectedItem.getId_grupo_de_integrante()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de grupos para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	GrupoDeIntegrantes selectedItem= (GrupoDeIntegrantes) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
				
		if(selectedItem != null){
		
		if(new DAO<GrupoDeIntegrantes>(GrupoDeIntegrantes.class).desativar(selectedItem.getId_grupo_de_integrante()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de grupos para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

