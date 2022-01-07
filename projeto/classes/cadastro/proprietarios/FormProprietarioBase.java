package cadastro.proprietarios;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import beans.Proprietario;
import cadastro.PainelDeEndereco;
import classes.CampoCNPJ;
import classes.CampoCPF;
import classes.CampoLimitado;
import classes.CampoTEL;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;





public abstract class FormProprietarioBase extends Dialogo {


private static final long serialVersionUID = 1L;



protected CampoLimitado tf_nome;
protected JComboBox<String> tipo;
protected CampoCPF tf_cpf;
protected CampoCNPJ tf_cnpj;

protected CampoTEL tf_tel_1;
protected CampoTEL tf_tel_2;
protected CampoLimitado tf_email;


protected PainelDeEndereco endereco;

protected Proprietario proprietario;




	public FormProprietarioBase(String titulo, int largura, int altura) {
		
	super(titulo, largura, altura);
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

	cons.insets = new Insets( 0, 2, 0, 2);
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_2, cons);
	
	cons.insets = new Insets( 0, 2, 2, 2);
	this.add(this.endereco = new PainelDeEndereco(), cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weightx  = 0.55;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("<html>Nome:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.05;
	p_1.add(new JLabel("Tipo:"), cons);
	cons.weightx  = 0.2;
	p_1.add(new JLabel("CPF:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel("CNPJ:"), cons);
		
		
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.weightx  = 0.55;
	p_1.add(this.tf_nome = new CampoLimitado(200), cons);
		
	cons.weightx  = 0.05;
	p_1.add(this.tipo = new JComboBox<String>(new String[]{"PF", "PJ"}), cons);
	
	cons.weightx  = 0.2;
	p_1.add(this.tf_cpf = new CampoCPF(), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(this.tf_cnpj = new CampoCNPJ(), cons);
	this.tf_cnpj.setEnabled(false);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel("Tel:"), cons);
	p_2.add(new JLabel("Tel:"), cons);
	cons.weightx  = 0.4;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel("Email:"), cons);
		
		
	cons.gridwidth  = 1;	
	cons.weightx  = 0.3;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_2.add(this.tf_tel_1 = new CampoTEL(), cons);
	
	p_2.add(this.tf_tel_2 = new CampoTEL(), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.4;
	p_2.add(this.tf_email = new CampoLimitado(98), cons);
	
	
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
		

	
		this.tipo.addItemListener(new ItemListener(){
		@Override
		public void itemStateChanged(ItemEvent arg0) {
		
			if(tipo.getSelectedIndex()==0){
			
			tf_cnpj.setText("");
			tf_cnpj.setEnabled(false);
			
			tf_cpf.setEnabled(true);
			}	
			else{
				
			tf_cpf.setText("");
			tf_cpf.setEnabled(false);
				
			tf_cnpj.setEnabled(true);
			}	
		}});
	

	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_nome);
	textFieldList.add(this.tf_cnpj);
	textFieldList.add(this.tf_cpf);
	textFieldList.add(this.tf_email);
	textFieldList.add(this.tf_tel_1);
	textFieldList.add(this.tf_tel_2);
	
	Comuns.addEventoDeFoco(textFieldList);
	}




	

	
	

	protected boolean validacao(){
		
		
		if(this.tf_nome.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe o nome do proprietario.");
		Comuns.textFieldErroMode(this.tf_nome);
		return false;	
		}
		
		
		if(this.tf_cpf.isEnabled() && 
				this.tf_cpf.getText().length()>0 && 
					!this.tf_cpf.validacao()){
			
		Mensagens.msgDeErro("Informe um CPF válido.");
		Comuns.textFieldErroMode(this.tf_cpf);
		return false;	
		}
		
		
		if(this.tf_cnpj.isEnabled() && 
				this.tf_cnpj.getText().length()>0 && 
					!this.tf_cnpj.validacao()){
			
		Mensagens.msgDeErro("Informe um CNPJ válido.");
		Comuns.textFieldErroMode(this.tf_cnpj);
		return false;	
		}
		
		
		if(this.tf_tel_1.getText().length()>0 && 
					!this.tf_tel_1.validacao()){
			
		Mensagens.msgDeErro("Informe um TEL válido.");
		Comuns.textFieldErroMode(this.tf_tel_1);
		return false;	
		}
		
		
		if(this.tf_tel_2.getText().length()>0 && 
				!this.tf_tel_2.validacao()){
		
		Mensagens.msgDeErro("Informe um TEL válido.");
		Comuns.textFieldErroMode(this.tf_tel_2);
		return false;	
		}
		
		
		if(this.tf_email.getText().length()>0 && 
				!Comuns.emailValidation(this.tf_email.getText())){
		
		Mensagens.msgDeErro("Informe um Email válido.");
		Comuns.textFieldErroMode(this.tf_email);
		return false;	
		}
		
		
	return this.endereco.validacao();	
	}
	
	

}	
