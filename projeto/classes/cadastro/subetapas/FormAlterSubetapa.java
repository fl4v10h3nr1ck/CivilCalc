package cadastro.subetapas;


import beans.Subetapa;
import dao.DAO;




public class FormAlterSubetapa extends FormSubetapaBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterSubetapa(int id_etapa, Subetapa subetapa) {
			
	super(id_etapa, "Alterar Subetapa", 700, 350);
		
	this.subetapa = subetapa;
	
	this.adicionarComponentes();
	
	this.setDados();
	}



	
	
	
	private void setDados(){
		

	tf_titulo.setText(this.subetapa.getTitulo());
	ta_objetivo.setText(this.subetapa.getObjetivo());
	tf_obs.setText(this.subetapa.getObs());
	}
	
	
	
	

	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false;
							
	this.subetapa.setTitulo(this.tf_titulo.getText());
	this.subetapa.setObjetivo(this.ta_objetivo.getText());
	this.subetapa.setObs(this.tf_obs.getText());
	
	return new DAO<Subetapa>(Subetapa.class).altera(this.subetapa);
	}

	
	


	
	
}
