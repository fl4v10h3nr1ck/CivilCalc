package cadastro.grupos_de_integrantes;

import dao.DAO;
import beans.GrupoDeIntegrantes;



public class FormNovoGrupo extends FormGrupoBase {

	
	
private static final long serialVersionUID = 1L;



	public FormNovoGrupo() {
	
	this(null);
	}




	
	public FormNovoGrupo(GrupoDeIntegrantes grupo) {
			
	super("Novo Grupo de Integrantes", grupo);
	
	this.adicionarComponentes();
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	if(this.grupo==null)
	this.grupo = new GrupoDeIntegrantes();			
		

	this.grupo.setDescricao(this.tf_descricao.getText());
	this.grupo.setStatus("ATIVO");
	
	DAO<GrupoDeIntegrantes> dao  =new DAO<GrupoDeIntegrantes>(GrupoDeIntegrantes.class);
	
	
	int id = dao.novo(this.grupo);
	
	if(id==0)
	return false;
	
	this.grupo.setId_grupo_de_integrante(id);
	
	this.grupo.setCodigo(String.format("GRP%06d", this.grupo.getId_grupo_de_integrante()));
	
	return dao.altera(this.grupo);
	}

	
	


	
	
}
