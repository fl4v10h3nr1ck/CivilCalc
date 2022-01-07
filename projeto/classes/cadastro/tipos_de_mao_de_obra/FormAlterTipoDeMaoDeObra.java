package cadastro.tipos_de_mao_de_obra;


import beans.TipoDeMaoDeObra;
import dao.DAO;




public class FormAlterTipoDeMaoDeObra extends FormTipoDeMaoDeObraBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterTipoDeMaoDeObra(TipoDeMaoDeObra tipo) {
			
	super("Alterar Tipo de Mão de Obra", tipo);
	
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
	this.tipo.setCodigo(this.tf_codigo.getText());
			
	return new DAO<TipoDeMaoDeObra>(TipoDeMaoDeObra.class).altera(this.tipo);
	}

	
	


	
	
}
