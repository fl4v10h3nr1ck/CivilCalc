package cadastro.etapas;


import beans.Etapa;
import dao.DAO;




public class FormAlterEtapa extends FormEtapaBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterEtapa(int id_projeto, Etapa etapa) {
			
	super(id_projeto, "Alterar Etapa", 700, 350);
		
	this.etapa = etapa;
	
	this.adicionarComponentes();
	
	this.setDados();
	}



	
	
	
	private void setDados(){
		

	tf_titulo.setText(this.etapa.getTitulo());
	ta_objetivo.setText(this.etapa.getObjetivo());
	tf_obs.setText(this.etapa.getObs());
	}
	
	
	
	

	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false;
							
	this.etapa.setTitulo(this.tf_titulo.getText());
	this.etapa.setObjetivo(this.ta_objetivo.getText());
	this.etapa.setObs(this.tf_obs.getText());
	
	return new DAO<Etapa>(Etapa.class).altera(this.etapa);
	}

	
	


	
	
}
