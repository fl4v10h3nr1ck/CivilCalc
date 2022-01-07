package cadastro.modelos.mao_de_obra;

import dao.DAO;
import beans.modelos.Mao_De_Obra_Modelo;



public class FormNovaMaoDeObraModelo extends FormMaoDeObraModeloBase {

	
	
private static final long serialVersionUID = 1L;




	
	public FormNovaMaoDeObraModelo() {
			
	this(null);
	}




	
	

	public FormNovaMaoDeObraModelo(Mao_De_Obra_Modelo retorno) {
			
	super("Nova Mão de Obra (Modelo)", retorno);
	
	this.adicionarComponentes();
	}




	
	
	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	if(this.retorno==null)
	this.retorno = new Mao_De_Obra_Modelo();			
		
	this.retorno.setDescricao(this.tf_descricao.getText());
	this.retorno.setValor_unitario(this.tf_valor.getText());
	this.retorno.setFk_tipo(this.id_tipo);
	this.retorno.setFk_unidade(this.id_unidade);
	this.retorno.setStatus("ATIVO");
	this.retorno.setLs_tipo(this.cb_ls_tipo.getSelectedItem().toString());
	
	
	DAO<Mao_De_Obra_Modelo> dao = new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class);
	
	int id = dao.novo(this.retorno);
	
	if(id==0)
	return false;
	
	this.retorno.setId_mao_de_obra(id);
	
	this.retorno.setCodigo(String.format("MAO%06d", this.retorno.getId_mao_de_obra()));
	
	return dao.altera(this.retorno);
	}

	
	


	
	
}
