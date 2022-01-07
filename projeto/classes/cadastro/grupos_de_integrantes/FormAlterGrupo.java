package cadastro.grupos_de_integrantes;


import beans.GrupoDeIntegrantes;
import dao.DAO;




public class FormAlterGrupo extends FormGrupoBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterGrupo(GrupoDeIntegrantes grupo) {
			
	super("Alterar Grupo de Integrantes", grupo);
	
	
	this.adicionarComponentes();
	
	
	this.tf_codigo.setText(this.grupo.getCodigo());
	this.tf_descricao.setText(this.grupo.getDescricao());
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	this.grupo.setDescricao(this.tf_descricao.getText());
			
	return new DAO<GrupoDeIntegrantes>(GrupoDeIntegrantes.class).altera(this.grupo);
	}

	
	


	
	
}
