package cadastro.tipos_de_materiais;

import dao.DAO;
import beans.TipoDeMaterial;



public class FormNovoTipo extends FormTipoBase {

	
	
private static final long serialVersionUID = 1L;



	public FormNovoTipo() {
	
	this(null);
	}






	
	public FormNovoTipo(TipoDeMaterial tipo) {
			
	super("Novo Tipo de Material", 650, 130, tipo);
	
	this.adicionarComponentes();
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	if(this.tipo==null)
	this.tipo = new TipoDeMaterial();			
		
	this.tipo.setDescricao(this.tf_nome.getText());
	this.tipo.setStatus("ATIVO");
	
	DAO<TipoDeMaterial> dao =  new DAO<TipoDeMaterial>(TipoDeMaterial.class);
	
	
	
	int id = dao.novo(this.tipo);
	
	if(id==0)
	return false;
	
	this.tipo.setId_tipo_material(id);
	
	this.tipo.setCodigo(String.format("TMAT%06d", this.tipo.getId_tipo_material()));
	
	return dao.altera(this.tipo);
	}

	
	


	
	
}
