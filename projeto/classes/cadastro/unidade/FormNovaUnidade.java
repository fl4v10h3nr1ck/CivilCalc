package cadastro.unidade;

import dao.DAO;
import beans.Unidade;



public class FormNovaUnidade extends FormUnidadeBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormNovaUnidade() {
			
	this(null);
	}





	public FormNovaUnidade(Unidade unidade) {
			
	super("Nova Unidade de Medida", unidade);
	
	this.adicionarComponentes();
	}





	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	if(this.unidade==null)
	this.unidade = new Unidade();			
		
	this.unidade.setDescricao(this.tf_descricao.getText());
	this.unidade.setSimbolo(this.tf_simbolo.getText());
	this.unidade.setStatus("ATIVO");

	int id = new DAO<Unidade>(Unidade.class).novo(this.unidade);
	
	if(id==0)
	return false;
	
	this.unidade.setId_unidade(id);
	
	return true;
	}

	
	


	
	
}
