package cadastro.modelos.dbi;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import beans.BDI;
import beans.modelos.BDI_Modelo;
import cadastro.PainelDeBDI;
import classes.CampoLimitado;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;





public abstract class FormBDIModeloBase extends Dialogo {


private static final long serialVersionUID = 1L;



protected CampoLimitado tf_codigo;


protected BDI_Modelo bdi;

protected PainelDeBDI painel;





	public FormBDIModeloBase(String titulo, BDI_Modelo bdi) {
		
	super(titulo, 650, 435);
	
	this.bdi  =bdi;
	}


	
	
	
	
	@Override
	public void adicionarComponentes() {
		
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weighty  = 0;
	cons.weightx  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	JPanel p_0 = new JPanel(new GridBagLayout());
	p_0.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_0, cons);
	
	cons.fill = GridBagConstraints.BOTH;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets(0, 2, 2, 2);	
	this.add(this.painel =new PainelDeBDI(), cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weighty  = 0;
	cons.weightx  = 1;
	cons.insets = new Insets( 4, 2, 0, 2);
	p_0.add(new JLabel("<html>Código/Identificação do BDI:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_0.add(new JLabel(""), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_0.add(this.tf_codigo = new CampoLimitado(40), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_0.add(new JLabel(""), cons);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.ipadx = 25;
	cons.weightx = 0;
	cons.insets = new Insets( 2, 2, 2, 2);
	JButton bt_save  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_save.setToolTipText("Salvar");
	this.add(bt_save, cons);
			
	
		bt_save.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
			if(acaoPrincipal()){	
						
			Mensagens.msgDeSucessoAoSalvar();
			dispose();
			}	
		}});
	
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_codigo);
	
	Comuns.addEventoDeFoco(textFieldList);
	}




	
	

	protected boolean validacao(){
		
		
		if(this.tf_codigo.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe o código/identificação do BDI.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
		
		
		if(!Comuns.codigoPermitido(new DAO<BDI>(BDI.class), 
				this.tf_codigo.getText(), this.bdi!=null?this.bdi.getId_bdi_modelo():0)){
			
		Mensagens.msgDeErro("O código/identificação informado já está sendo usado por outro BDI.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
		
	return true;	
	}
	
	
	
	

	
}	
