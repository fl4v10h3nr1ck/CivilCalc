package cadastro.etapas;

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import classes.CampoLimitado;
import beans.Etapa;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;




public abstract class FormEtapaBase extends Dialogo{


private static final long serialVersionUID = 1L;


protected Etapa etapa;	
	
protected int id_projeto;

protected CampoLimitado tf_titulo;

protected JTextArea ta_objetivo;

protected CampoLimitado tf_obs;
	
	
	


	public FormEtapaBase(int id_projeto, String title, int width, int height) {
	
	super(title, width, height);
	
	this.id_projeto  = id_projeto;
	}

	
	
	
	
	@Override
	public void adicionarComponentes() {
	
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 0, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_1, cons);	

	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx = 1;	
	cons.insets = new Insets(2, 2, 0, 2);	
	p_1.add(new JLabel("<html>Título:<font color=red>*</font></html>"),cons);
	
	cons.insets = new Insets(2, 2, 2, 2);		
	p_1.add(tf_titulo =new CampoLimitado(40), cons);
	
	cons.insets = new Insets(2, 2, 0, 2);
	p_1.add(new JLabel("<html>Objetivo:<font color=red>*</font></html>"),cons);
	
	cons.fill = GridBagConstraints.BOTH;
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 2, 2);	
	p_1.add(new JScrollPane(ta_objetivo =new JTextArea()), cons);	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 0, 2);	
	p_1.add(new JLabel("Obs:"),cons);
	
	cons.insets = new Insets(2, 2, 2, 2);		
	p_1.add(this.tf_obs =new CampoLimitado(250), cons);
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	JButton bt_salvar  = new JButton("Salvar Etapa", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar etapa de projeto.");
	this.add(bt_salvar, cons);
	
	


		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			    	
			if(acaoPrincipal()){
			
			Mensagens.msgDeSucessoAoSalvar();
			dispose();
			}
		
		}});
	

		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(tf_titulo);
		
	Comuns.addEventoDeFoco(textFieldList);
	}

	
	
	
	
	
	public boolean validacao(){
		
		
		if(this.tf_titulo.getText().length()==0){
		
		Mensagens.msgDeErro("Informe o código/nome da etapa.");
		Comuns.textFieldErroMode(this.tf_titulo);	
		return false;
		}
		
	
		
		if(this.ta_objetivo.getText().length()==0){
			
		Mensagens.msgDeErro("Informe o objectivo da etapa.");
		return false;
		}
		
		
	return true;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}
