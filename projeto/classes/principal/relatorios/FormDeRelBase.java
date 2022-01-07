package principal.relatorios;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import beans.Projeto;
import classes.CampoLimitado;
import componentes.FormDeSelecao;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;




public abstract class FormDeRelBase extends Dialogo {





private static final long serialVersionUID = 1L;


protected CampoLimitado tf_projeto;
protected int id_projeto;


protected CampoLimitado tf_logo;
protected JPanel painel_logo;

protected JCheckBox assinatura;





	public FormDeRelBase(String titulo) {
		
	super(titulo, 650, 300);
	
	
	this.tf_logo = new CampoLimitado(250);
	
	this.adicionarComponentes();
	}


	
	
	
	
	@Override
	public void adicionarComponentes() {
		
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 1;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_1, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("<html>Projeto:<font color=red>*</font></html>"), cons);
		
	cons.insets = new Insets( 2, 2, 2, 2);
	p_1.add(this.tf_projeto = new CampoLimitado(250), cons);
	this.tf_projeto.setEditable(false);
	
	
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = 1;
	cons.weightx  = 0.3;
	cons.weighty  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_2, cons);
	
	cons.weightx  = 0.3;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	this.painel_logo = new JPanel(new GridBagLayout()){

		private static final long serialVersionUID = 1L;
			
			
			public void paintComponent(Graphics g){
			
			super.paintComponent(g);
				
			Graphics2D g2 = (Graphics2D) g.create();	
			
				try {
				
					if(tf_logo.getText().length()>0){
						
					BufferedImage	logo = ImageIO.read(new File(tf_logo.getText()));
					
					g2.drawImage( logo, 10, 10,   this.getWidth() - 20, this.getHeight()-20, null);
					}
				
					
				} 
				catch (IOException e) {e.printStackTrace();} 	
			}	
			
		};
	painel_logo.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	painel_logo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	this.add(painel_logo, cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.insets = new Insets( 0, 2, 5, 2);
	cons.weightx  = 1;
	JPanel p_3 = new JPanel(new GridBagLayout());
	p_3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_3, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 1;
	cons.weighty  = 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel("Logotipo do Projeto:"), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_2.add(this.tf_logo, cons);
	this.tf_logo.setEditable(false);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 5, 2, 10, 2);
	p_3.add(this.assinatura = new JCheckBox("Adicionar assinatura digital do responsável.", true), cons);
	this.assinatura.setOpaque(false);
	

	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.ipadx = 25;
	cons.weightx = 0;
	cons.insets = new Insets( 4, 2, 2, 2);
	JButton bt_gerar  = new JButton("Gerar Relatório", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
	bt_gerar.setToolTipText("Gerar relatório.");
	this.add(bt_gerar, cons);
			
	
		this.tf_projeto.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
					
		Comuns.removeIndicadoresDeErro(tf_projeto);
			
		bt_gerar.requestFocus();
			
		addProjeto();		
		}});
			
	
	
	
		bt_gerar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
			if(acaoPrincipal()){	
						
			Mensagens.msgDeSucessoAoSalvar();
			dispose();
			}	
		}});
		

	
		
		this.tf_logo.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
					
		Comuns.removeIndicadoresDeErro(tf_logo);
			
		bt_gerar.requestFocus();
			
		addlogo();		
		}});
			
	
		
	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_projeto);
	
	Comuns.addEventoDeFoco(textFieldList);
	}



	
	


	@Override
	public boolean acaoPrincipal() {
	
	if(!validacao())
	return false;
	
	DAO<Projeto> dao = new DAO<Projeto>(Projeto.class);
	
	Projeto projeto = dao.get(this.id_projeto);
		
	projeto.setPath_logo(this.tf_logo.getText());	
	
	dao.altera(projeto);
	
	return setRelatorio();
	}
	
	

		
	
	
	

	protected boolean validacao(){
		

		if(this.id_projeto==0){
			
		Mensagens.msgDeErro("Selecione um Projeto.");
		Comuns.textFieldErroMode(this.tf_projeto);
		return false;	
		}
		
	return true;	
	}




	
	
	
	private void addProjeto(){
		
	Projeto retorno = new Projeto();
		
	FormDeSelecao<Projeto> selectionItemForm = 
					new FormDeSelecao<Projeto>("Adicionar Projeto", retorno, Projeto.class, "proj.status='ATIVO'");
	selectionItemForm.mostrar();
				
		if(retorno != null && retorno.getId_projeto() > 0){
							
		this.id_projeto = retorno.getId_projeto();
		this.tf_projeto.setText(retorno.getCodigo());	
		
		Projeto projeto = new DAO<Projeto>(Projeto.class).get(this.id_projeto);
		
		if(projeto!=null && projeto.getPath_logo()!=null && projeto.getPath_logo().length()>0)
		this.carregaLogoDeProjeto(projeto.getPath_logo());
			
		}	
	}
	
	
	
	
	
	
	private void addlogo(){
	
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
	this.carregaLogoDeProjeto(fc.getSelectedFile().getAbsolutePath());

		
	
	}
	
	
	
	
	
	
	private void carregaLogoDeProjeto(String path){
	
		
	File arq = 	new File(path);	
		
		if(arq!=null && arq.exists()){	
		
			try {
		
			BufferedImage logo = ImageIO.read(new File(path));
		
			if(logo.getWidth()!= logo.getHeight())
			Mensagens.msgDeAlerta("A imagem escolhida não é quadrada, você pode continuar, porém, o formato não é apropriado.");
			
			
			if(logo.getWidth() > 500 || logo.getHeight() > 500)
			Mensagens.msgDeAlerta("O tamanho da imagem escolhida é inapropriado, você pode continuar, porém, a imagem será redimensionada.");
				
			} 
			catch (IOException e) {e.printStackTrace();}
			
		this.tf_logo.setText(path);
		painel_logo.repaint();
		}
		else
		this.tf_logo.setText("");
	}
	
	
	
	
	
	
	
	public abstract boolean setRelatorio();

}	

