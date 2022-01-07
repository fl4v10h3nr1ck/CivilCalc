package cadastro.unidade;


import beans.Unidade;
import dao.DAO;




public class FormAlterUnidade extends FormUnidadeBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterUnidade(Unidade unidade) {
			
	super("Alterar Unidade de Medida", unidade);
	
	this.adicionarComponentes();
	
	this.tf_descricao.setText(this.unidade.getDescricao());	
	this.tf_simbolo.setText(this.unidade.getSimbolo());	
	
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	this.unidade.setDescricao(this.tf_descricao.getText());
	this.unidade.setSimbolo(this.tf_simbolo.getText());
	
	
	return new DAO<Unidade>(Unidade.class).altera(this.unidade);
	}

	
	


	
	
}
