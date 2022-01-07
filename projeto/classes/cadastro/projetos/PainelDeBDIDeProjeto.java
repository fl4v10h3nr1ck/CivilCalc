package cadastro.projetos;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import beans.BDI;
import cadastro.PainelDeBDI;
import comuns.Mensagens;
import dao.DAO;




public class PainelDeBDIDeProjeto extends PainelDeBDI{

	
private static final long serialVersionUID = 1L;




private BDI bdi;




	public PainelDeBDIDeProjeto(BDI bdi){
	
	super();
		
		
	GridBagConstraints cons = new GridBagConstraints();  
	
	cons.fill = GridBagConstraints.BOTH;
	cons.weighty  = 1;
	cons.gridwidth  = 1;	
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	this.add(new JLabel(""), cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.gridwidth  = 1;		
	cons.weightx  = 1;
	cons.insets = new Insets( 0, 0, 0, 0);
	this.add(new JLabel(""), cons);
	this.add(new JLabel(""), cons);
	this.add(new JLabel(""), cons);
	this.add(new JLabel(""), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.WEST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	cons.insets = new Insets(10, 2, 2, 2);
	JButton bt_salvar  = new JButton("Salvar Projeto", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar projeto.");
	this.add(bt_salvar, cons);
		
		
		
		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		if(acaoPrincipal())
		Mensagens.msgDeSucessoAoSalvar();
				
		}});
		
	this.atualiza(bdi);
	}


		
	
	
	
	
	public void atualiza(BDI bdi){
	
	this.bdi = bdi;	
		
		if(this.bdi!=null){
			
		this.tf_despesa_admin.setText(this.bdi.getDespesa_admin());
		this.tf_iss.setText(this.bdi.getIss());
		this.tf_cofins.setText(this.bdi.getCofins());
		this.tf_pis.setText(this.bdi.getPis());
		this.tf_cprb.setText(this.bdi.getCprb());
		this.tf_custo_finan.setText(this.bdi.getCusto_finan());
		this.tf_risco_imprevisto.setText(this.bdi.getRisco_imprevisto());
		this.tf_seguros.setText(this.bdi.getSeguros());
		this.tf_garantias.setText(this.bdi.getGarantias());
		this.tf_bonificacao.setText(this.bdi.getBonificacao());
		this.tf_valor_final.setText(this.bdi.getValor_final());
		}
	}

	

	
	
	
		
	public  boolean acaoPrincipal(){
	
	if(this.bdi==null)
	this.bdi = new BDI();
			
	this.bdi.setDespesa_admin(this.tf_despesa_admin.getText());
	this.bdi.setIss(this.tf_iss.getText());
	this.bdi.setCofins(this.tf_cofins.getText());
	this.bdi.setPis(this.tf_pis.getText());
	this.bdi.setCprb(this.tf_cprb.getText());
	this.bdi.setCusto_finan(this.tf_custo_finan.getText());
	this.bdi.setRisco_imprevisto(this.tf_risco_imprevisto.getText());
	this.bdi.setSeguros(this.tf_seguros.getText());
	this.bdi.setGarantias(this.tf_garantias.getText());
	this.bdi.setBonificacao(this.tf_bonificacao.getText());
	this.bdi.setValor_final(this.tf_valor_final.getText());
	this.bdi.setStatus("ATIVO");
			
	
	if(this.bdi.getId_bdi()>0)
	return new DAO<BDI>(BDI.class).altera(this.bdi);
		else{
		
		int id =  new DAO<BDI>(BDI.class).novo(this.bdi);
		
		if(id>0)
		this.bdi.setId_bdi(id);
		else
		return false;
		}
	
	return true;
	}
		
		
			
}

