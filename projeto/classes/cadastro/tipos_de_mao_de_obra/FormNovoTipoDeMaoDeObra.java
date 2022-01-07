package cadastro.tipos_de_mao_de_obra;

import dao.DAO;
import beans.TipoDeMaoDeObra;



public class FormNovoTipoDeMaoDeObra extends FormTipoDeMaoDeObraBase {

	
	
private static final long serialVersionUID = 1L;




	public FormNovoTipoDeMaoDeObra() {
	
	this(null);
	}



	
	public FormNovoTipoDeMaoDeObra(TipoDeMaoDeObra tipo) {
			
	super("Novo Tipo de Mão de Obra", tipo);
	
	this.adicionarComponentes();
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	if(this.tipo==null)
	this.tipo = new TipoDeMaoDeObra();			
	
	this.tipo.setDescricao(this.tf_nome.getText());
	this.tipo.setCodigo(this.tf_codigo.getText());
	this.tipo.setStatus("ATIVO");
	
	DAO<TipoDeMaoDeObra> dao  =new DAO<TipoDeMaoDeObra>(TipoDeMaoDeObra.class);
	
	int id = dao.novo(this.tipo);
	
	if(id==0)
	return false;
	
	this.tipo.setId_tipo_mao_obra(id);
	
	this.tipo.setCodigo(String.format("TMAO%06d", this.tipo.getId_tipo_mao_obra()));
	
	return dao.altera(this.tipo);
	}

	
	


	
	
}
