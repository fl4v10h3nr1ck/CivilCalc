package cadastro.integrantes;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import beans.Cargo;
import beans.GrupoDeIntegrantes;
import beans.Integrante;
import cadastro.PainelDeEndereco;
import cadastro.cargos.FormNovoCargo;
import cadastro.grupos_de_integrantes.FormNovoGrupo;
import classes.CampoCNPJ;
import classes.CampoCPF;
import classes.CampoLimitado;
import classes.CampoTEL;
import componentes.FormDeSelecao;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;





public abstract class FormIntegranteBase extends Dialogo {





private static final long serialVersionUID = 1L;



protected CampoLimitado tf_nome;
protected JComboBox<String> tipo;
protected CampoCPF tf_cpf;
protected CampoCNPJ tf_cnpj;


protected CampoTEL tf_tel;
protected JComboBox<String> sexo;

protected int id_cargo;
protected CampoLimitado tf_cargo;

protected int id_grupo;
protected CampoLimitado tf_grupo;

protected PainelDeEndereco endereco;

protected Integrante integrante;

protected CampoLimitado tf_assinatura;






	public FormIntegranteBase(String titulo, int largura, int altura) {
		
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
	
	cons.insets = new Insets( 0, 2, 0, 2);
	this.add(this.endereco = new PainelDeEndereco(), cons);
	
	cons.insets = new Insets( 0, 2, 2, 2);
	JPanel p_3 = new JPanel(new GridBagLayout());
	p_3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_3, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weighty  = 0;
	cons.weightx  = 0.55;
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
	cons.weightx  = 0.2;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel("Tel:"), cons);
	p_2.add(new JLabel("Sexo:"), cons);
	cons.weightx  = 0.3;
	p_2.add(new JLabel("<html>Cargo:<font color=red>*</font></html>"), cons);
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	p_2.add(new JLabel(""), cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx = 1;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel("Grupo:"), cons);
		
		
	cons.gridwidth  = 1;	
	cons.weightx  = 0.2;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_2.add(this.tf_tel = new CampoTEL(), cons);
	
	p_2.add(this.sexo = new JComboBox<String>(new String[]{"MASC", "FEM"}), cons);
		
	cons.weightx  = 0.3;
	p_2.add(this.tf_cargo = new CampoLimitado(200), cons);
	this.tf_cargo.setEditable(false);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	cons.insets = new Insets( 0, 0, 0, 0);
	JButton bt_novo_cargo  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_novo_cargo.setToolTipText("Cadastrar novo cargo.");
	p_2.add(bt_novo_cargo, cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx = 1;
	p_2.add(this.tf_grupo = new CampoLimitado(200), cons);
	this.tf_grupo.setEditable(false);
	

	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.insets = new Insets( 0, 0, 0, 0);
	JButton bt_novo_grupo  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_novo_grupo.setToolTipText("Cadastrar novo grupo.");
	p_2.add(bt_novo_grupo, cons);
	
	

	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weightx  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_3.add(new JLabel("Assinatura:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_3.add(new JLabel(""), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_3.add(this.tf_assinatura = new CampoLimitado(250), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_3.add(new JLabel(""), cons);
	
		
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.ipadx = 25;
	cons.weightx = 0;
	cons.insets = new Insets( 4, 2, 2, 2);
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
	
	
	
	
		this.tf_cargo.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
				
		Comuns.removeIndicadoresDeErro(tf_cargo);
		
		bt_novo_cargo.requestFocus();
		
		addCargo();		
		}});
		
		
		
		bt_novo_cargo.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		
		Cargo retorno = new Cargo();
			
		FormNovoCargo form = new FormNovoCargo(retorno);
		form.mostrar();
					
			if(retorno != null && retorno.getId_cargo() > 0){
								
			id_cargo = retorno.getId_cargo();
			tf_cargo.setText(retorno.getDescricao());		
			}	
		}});
		
		
		
		
		this.tf_grupo.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
						
		Comuns.removeIndicadoresDeErro(tf_grupo);
		
		bt_novo_grupo.requestFocus();
		
		addGrupo();		
		}});
		
		
		
		bt_novo_grupo.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
			
		GrupoDeIntegrantes retorno = new GrupoDeIntegrantes();
				
		FormNovoGrupo form = new FormNovoGrupo(retorno);
			form.mostrar();
						
			if(retorno != null && retorno.getId_grupo_de_integrante() > 0){
									
			id_grupo = retorno.getId_grupo_de_integrante();
			tf_cargo.setText(retorno.getDescricao());		
			}	
		}});
		
		
		
		

		this.tf_assinatura.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
						
		Comuns.removeIndicadoresDeErro(tf_assinatura);
		
		bt_save.requestFocus();
		
		addAssinatura();		
		}});
		
		
		
		
		
		
		
	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_nome);
	textFieldList.add(this.tf_cargo);
	textFieldList.add(this.tf_cnpj);
	textFieldList.add(this.tf_cpf);
	textFieldList.add(this.tf_tel);
	
	Comuns.addEventoDeFoco(textFieldList);
	}




	
	private void addCargo(){
		
	Cargo retorno = new Cargo();
		
	FormDeSelecao<Cargo> selectionItemForm = 
				new FormDeSelecao<Cargo>("Adicionar Cargo", retorno, Cargo.class, "carg.status='ATIVO'");
	selectionItemForm.mostrar();
			
		if(retorno != null && retorno.getId_cargo() > 0){
						
		this.id_cargo = retorno.getId_cargo();
		this.tf_cargo.setText(retorno.getDescricao());		
		}
	}
	
	
	
	
	
	

	private void addGrupo(){
		
	GrupoDeIntegrantes retorno = new GrupoDeIntegrantes();
		
	FormDeSelecao<GrupoDeIntegrantes> selectionItemForm = 
				new FormDeSelecao<GrupoDeIntegrantes>("Adicionar Grupo", retorno, GrupoDeIntegrantes.class, "grp_inte.status='ATIVO'");
	selectionItemForm.mostrar();
			
		if(retorno != null && retorno.getId_grupo_de_integrante() > 0){
						
		this.id_grupo = retorno.getId_grupo_de_integrante();
		this.tf_grupo.setText(retorno.getDescricao());		
		}	
	}
	
	
	
	
	
	
	private void addAssinatura(){
		
	JFileChooser fc = new JFileChooser();
	fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
				
		fc.setFileFilter(new javax.swing.filechooser.FileFilter(){
				      
			public boolean accept(File f){
				    
			if (f.isDirectory()) {return true;}	
						
			return f.getName().toLowerCase().endsWith(".jpg") || 
							f.getName().toLowerCase().endsWith(".png") ||
								f.getName().toLowerCase().endsWith(".gif");
			}

			public String getDescription() {
				
			return "Arquivos de Imagens (jpg, png ou gif)";
			}
		});
			
			
	int returnVal = fc.showOpenDialog(this);

	if (returnVal == JFileChooser.APPROVE_OPTION)
	this.tf_assinatura.setText(fc.getSelectedFile().getAbsolutePath());
		
		
	}
	
	
	
	
	
	
	
	

	protected boolean validacao(){
		
		
		if(this.tf_nome.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe o nome do integrante.");
		Comuns.textFieldErroMode(this.tf_nome);
		return false;	
		}
		
		
		if(this.id_cargo == 0){
			
		Mensagens.msgDeErro("Selecione o cargo do integrante.");
		Comuns.textFieldErroMode(this.tf_cargo);
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
		
		
		if(this.tf_tel.getText().length()>0 && 
					!this.tf_tel.validacao()){
			
		Mensagens.msgDeErro("Informe um TEL válido.");
		Comuns.textFieldErroMode(this.tf_tel);
		return false;	
		}
				
		
	return this.endereco.validacao();	
	}
	
	
	
	

}	
