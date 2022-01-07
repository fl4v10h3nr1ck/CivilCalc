package cadastro.modelos.dbi;


import beans.modelos.BDI_Modelo;
import dao.DAO;




public class FormAlterBDIModelo extends FormBDIModeloBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterBDIModelo(BDI_Modelo bdi) {
			
	super("Alterar BDI (Modelo)", bdi);
	

	this.adicionarComponentes();
	
	
	this.tf_codigo.setText(this.bdi.getCodigo());
	this.painel.tf_despesa_admin.setText(this.bdi.getDespesa_admin());
	this.painel.tf_iss.setText(this.bdi.getIss());
	this.painel.tf_cofins.setText(this.bdi.getCofins());
	this.painel.tf_pis.setText(this.bdi.getPis());
	this.painel.tf_cprb.setText(this.bdi.getCprb());
	this.painel.tf_custo_finan.setText(this.bdi.getCusto_finan());
	this.painel.tf_risco_imprevisto.setText(this.bdi.getRisco_imprevisto());
	this.painel.tf_seguros.setText(this.bdi.getSeguros());
	this.painel.tf_garantias.setText(this.bdi.getGarantias());
	this.painel.tf_bonificacao.setText(this.bdi.getBonificacao());
	this.painel.tf_valor_final.setText(this.bdi.getValor_final());
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	this.painel.calculaBDI();
	
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
			
	return new DAO<BDI_Modelo>(BDI_Modelo.class).altera(this.bdi);
	}

	
	


	
	
}
