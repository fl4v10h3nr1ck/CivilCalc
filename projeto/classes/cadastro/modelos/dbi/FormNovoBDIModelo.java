package cadastro.modelos.dbi;

import dao.DAO;
import beans.modelos.BDI_Modelo;



public class FormNovoBDIModelo extends FormBDIModeloBase {

	
	
private static final long serialVersionUID = 1L;



	public FormNovoBDIModelo() {
	
	this(null);
	}




	
	public FormNovoBDIModelo(BDI_Modelo bdi) {
			
	super("Novo BDI (Modelo)", bdi);
	
	this.adicionarComponentes();
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	this.painel.calculaBDI();
	
	if(this.bdi==null)
	this.bdi = new BDI_Modelo();			
		

	this.bdi.setDespesa_admin(this.painel.tf_despesa_admin.getText());
	this.bdi.setIss(this.painel.tf_iss.getText());
	this.bdi.setCofins(this.painel.tf_cofins.getText());
	this.bdi.setPis(this.painel.tf_pis.getText());
	this.bdi.setCprb(this.painel.tf_cprb.getText());
	this.bdi.setCusto_finan(this.painel.tf_custo_finan.getText());
	this.bdi.setRisco_imprevisto(this.painel.tf_risco_imprevisto.getText());
	this.bdi.setSeguros(this.painel.tf_seguros.getText());
	this.bdi.setGarantias(this.painel.tf_garantias.getText());
	this.bdi.setBonificacao(this.painel.tf_bonificacao.getText());
	this.bdi.setValor_final(this.painel.tf_valor_final.getText());
	this.bdi.setCodigo(this.tf_codigo.getText());
	this.bdi.setStatus("ATIVO");
	
	int id  =new DAO<BDI_Modelo>(BDI_Modelo.class).novo(this.bdi);
	
	if(id==0)
	return false;
	
	
	this.bdi.setId_bdi_modelo(id);
	
	return true;
	}

	
	


	
	
}
