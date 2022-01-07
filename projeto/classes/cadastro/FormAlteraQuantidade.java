package cadastro;

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

import beans.Item;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;



public class FormAlteraQuantidade  extends Dialogo {


private static final long serialVersionUID = 1L;


protected CampoMoeda tf_quantidade;
protected CampoLimitado tf_descricao;


protected Item item;







	public FormAlteraQuantidade(Item item) {
		
	super("Alterar Quantidade", 720, 120);
	
	this.item  = item;
	
	this.adicionarComponentes();
	}


	
	

	
	@Override
	public void adicionarComponentes() {
		
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_1, cons);
		
		
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
		
	cons.weightx  = 0.6;
	p_1.add(new JLabel("Item:"), cons);
	cons.weightx  = 0.3;
	p_1.add(new JLabel("<html>Quantidade:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.1;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel(""), cons);
			
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.weightx  = 0.6;
	p_1.add(this.tf_descricao = new CampoLimitado(200, item.getParamentro("descricao").toString()), cons);
		
	cons.weightx  = 0.3;
	p_1.add(this.tf_quantidade = new CampoMoeda(40, item.getParamentro("quant").toString()), cons);
			
		
	//cons.anchor = GridBagConstraints.CENTER;
	//cons.ipadx = 25;
	//cons.insets = new Insets( 4, 2, 5, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_save  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_save.setToolTipText("Salvar");
	p_1.add(bt_save, cons);
				
		
		
		
		
		bt_save.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
			if(acaoPrincipal()){	
							
			Mensagens.msgDeSucessoAoSalvar();
			dispose();
			}	
		}});
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
			
	textFieldList.add(this.tf_descricao);
	textFieldList.add(this.tf_quantidade);
		
	Comuns.addEventoDeFoco(textFieldList);		
	}


	
	
	
	
	protected boolean validacao(){
		
		
		if(this.tf_quantidade.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe a quantidade.");
		Comuns.textFieldErroMode(this.tf_quantidade);
		return false;	
		}
	
	return true;	
	}
	
	
	



	@Override
	public boolean acaoPrincipal() {
		
	if(!this.validacao())
	return false; 	
	
	this.item.setParamentro("quant", this.tf_quantidade.getText());
	return true;
	}
	

	
}	
