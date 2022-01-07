package cadastro.tipos_de_materiais;


import beans.TipoDeMaterial;
import dao.DAO;




public class FormAlterTipo extends FormTipoBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterTipo(TipoDeMaterial tipo) {
			
	super("Alterar Tipo de Material", 650, 130, tipo);
	
	this.tipo = tipo;
	
	this.adicionarComponentes();
	
	
	this.tf_codigo.setText(this.tipo.getCodigo());
	this.tf_nome.setText(this.tipo.getDescricao());
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	this.tipo.setDescricao(this.tf_nome.getText());
			
	return new DAO<TipoDeMaterial>(TipoDeMaterial.class).altera(this.tipo);
	}

	
	


	
	
}
