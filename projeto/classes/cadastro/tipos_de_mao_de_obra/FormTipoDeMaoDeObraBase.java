package cadastro.tipos_de_mao_de_obra;

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

import beans.TipoDeMaoDeObra;
import classes.CampoLimitado;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;




public abstract class FormTipoDeMaoDeObraBase extends Dialogo {





private static final long serialVersionUID = 1L;


protected CampoLimitado tf_codigo;
protected CampoLimitado tf_nome;

protected TipoDeMaoDeObra tipo;




	public FormTipoDeMaoDeObraBase(String titulo, TipoDeMaoDeObra tipo) {
		
	super(titulo, 650, 130);
	
	this.tipo = tipo;
	}


	
	
	@Override
	public void adicionarComponentes() {
		
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_1, cons);

	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weightx  = 0.2;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("<html>C�digo:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.8;
	p_1.add(new JLabel("<html>Nome:<font color=red>*</font></html>"), cons);
	
		
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.weightx  = 0.2;
	p_1.add(this.tf_codigo = new CampoLimitado(40), cons);
	this.tf_codigo.setEnabled(false);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.8;
	p_1.add(this.tf_nome = new CampoLimitado(200), cons);
		
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.ipadx = 25;
	cons.weightx = 0;
	cons.insets = new Insets(2, 2, 2, 2);
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
		
	textFieldList.add(this.tf_nome);
	textFieldList.add(this.tf_codigo);
	
	Comuns.addEventoDeFoco(textFieldList);
	}




	
	

	protected boolean validacao(){
		
		if(this.tf_nome.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe a nome do tipo de m�o de obra.");
		Comuns.textFieldErroMode(this.tf_nome);
		return false;	
		}
			
		
	return true;	
	}
	
	

}	
