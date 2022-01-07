package cadastro.empresa;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import beans.Empresa;
import beans.Endereco;
import cadastro.PainelDeEndereco;
import classes.CampoCNPJ;
import classes.CampoLimitado;
import classes.CampoLimitadoSoDigito;
import classes.CampoTEL;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;

public class PainelDadosGerais extends JPanel{


private static final long serialVersionUID = 1L;

	

protected CampoLimitado tf_codigo;
protected CampoLimitado tf_nome;
protected CampoLimitado tf_nome_fantasia;

protected CampoLimitado tf_lema;
protected CampoCNPJ tf_cpf_cnpj;
protected CampoLimitadoSoDigito tf_insc_municipal;
protected CampoLimitadoSoDigito tf_insc_estadual;

protected CampoTEL tf_tel_1;
protected CampoTEL tf_tel_2;
protected CampoLimitado tf_site;
protected CampoLimitado tf_email;

protected Empresa empresa;

protected PainelDeEndereco endereco;




	public PainelDadosGerais(Empresa empresa){
	
	this.empresa = empresa;	
		
	this.setLayout(new GridBagLayout());
	
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	
	this.adicionarComponentes();
	
	
		if(this.empresa != null ){
			
		tf_nome.setText(empresa.getNome_razao());
		this.tf_codigo.setText(empresa.getCodigo());
		tf_lema.setText(empresa.getLema());
		this.tf_nome_fantasia.setText(empresa.getNome_fantasia());
		this.tf_cpf_cnpj.setText(empresa.getCpf_cnpj());
		this.tf_insc_estadual.setText(empresa.getInsc_estadual());
		this.tf_insc_municipal.setText(empresa.getInsc_municipal());
		
		tf_tel_1.setText(empresa.getTel_1());
		tf_tel_2.setText(empresa.getTel_2());
		tf_site.setText(empresa.getSite());
		tf_email.setText(empresa.getEmail());
		
		
		Endereco endereco  = new DAO<Endereco>(Endereco.class).get(this.empresa.getFk_endereco());
		
		if(endereco!=null)
		this.endereco.setValores(endereco);
		}
	}



	
	
	public void adicionarComponentes() {
	
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 0;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 2, 2);
			
	JPanel p1 = new JPanel(new GridBagLayout());
	this.add(p1, cons);
	p1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
		
	JPanel p2 = new JPanel(new GridBagLayout());
	this.add(p2, cons);
	p2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
		
	JPanel p3 = new JPanel(new GridBagLayout());
	this.add(p3, cons);
	p3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
		
	this.add(this.endereco = new PainelDeEndereco(), cons);
		
			
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;	
	cons.weighty  = 0;
	cons.weightx = 0.1;
	cons.insets = new Insets(2, 2, 0, 2);
	p1.add(new JLabel("Código:"), cons);
	cons.weightx = 0.45;
	p1.add(new JLabel("<html>Razão Social:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p1.add(new JLabel("Nome Fantasia:"), cons);
	
	cons.gridwidth  = 1;	
	cons.weightx = 0.1;
	cons.insets = new Insets(2, 2, 2, 2);
	p1.add(this.tf_codigo = new CampoLimitado(20), cons);
	this.tf_codigo.setEditable(false);
			
	cons.weightx = 0.45;	
	p1.add(this.tf_nome = new CampoLimitado(240), cons);
		
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p1.add(this.tf_nome_fantasia = new CampoLimitado(240), cons);
		
		
		
	cons.gridwidth  = 1;
	cons.weightx = 0.34;	
	cons.insets = new Insets(2, 2, 0, 2);
	p2.add(new JLabel("Lema/Subtítulo:"), cons);
		
	cons.weightx = 0.22;	
	p2.add(new JLabel("CNPJ:"), cons);
	p2.add(new JLabel("Insc. Municipal:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p2.add(new JLabel("Insc. Estadual:"), cons);
		
		
	cons.gridwidth  = 1;
	cons.weightx = 0.34;	
	cons.insets = new Insets(2, 2, 2, 2);
	p2.add(this.tf_lema = new CampoLimitado(240), cons);
		
	cons.weightx = 0.22;
	p2.add(this.tf_cpf_cnpj = new CampoCNPJ(), cons);
		
	p2.add(this.tf_insc_municipal = new CampoLimitadoSoDigito(20), cons);
		
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p2.add(this.tf_insc_estadual = new CampoLimitadoSoDigito(20), cons);
		
		
	cons.gridwidth  = 1;
	cons.weightx = 0.3;	
	cons.insets = new Insets(2, 2, 0, 2);
	p3.add(new JLabel("E-mail:"), cons);
	p3.add(new JLabel("Website:"), cons);
		
	cons.weightx = 0.2;	
	p3.add(new JLabel("TEL:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p3.add(new JLabel("TEL (op):"), cons);
		
		
	cons.gridwidth  = 1;
	cons.weightx = 0.3;	
	cons.insets = new Insets(2, 2, 2, 2);
	p3.add(this.tf_email = new CampoLimitado(240), cons);
		
	cons.weightx = 0.22;
	p3.add(this.tf_site = new CampoLimitado(240), cons);
		
	p3.add(this.tf_tel_1 = new CampoTEL(), cons);
		
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p3.add(this.tf_tel_2 = new CampoTEL(), cons);
		
		

	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.weighty  = 0;
	cons.weightx = 0;
	cons.ipadx = 15;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	JButton bt_salvar  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar dados da empresa");
	this.add(bt_salvar, cons);
			
		
			
		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		if(acaoPrincipal())	
		Mensagens.msgDeSucessoAoSalvar();
		
		}});
			


	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(tf_nome);
	textFieldList.add(this.tf_cpf_cnpj);
	textFieldList.add(this.tf_tel_1);
	textFieldList.add(this.tf_tel_2);
	textFieldList.add(this.tf_email);
		
	Comuns.addEventoDeFoco(textFieldList);
	}
	
	
	
	
	
	
	public  boolean acaoPrincipal(){
		
	if(!this.valida())	
	return false;
	
	
	if(this.empresa == null)	
	this.empresa = new Empresa();
	
	if(this.tf_codigo.getText().length()==0)
	this.tf_codigo.setText(PainelDadosGerais.geraCodigo());
	
	
	empresa.setCodigo(this.tf_codigo.getText());
	empresa.setNome_razao(this.tf_nome.getText());
	empresa.setNome_fantasia(this.tf_nome_fantasia.getText());
	
	
	empresa.setLema(this.tf_lema.getText());
	empresa.setCpf_cnpj(this.tf_cpf_cnpj.getText());
	empresa.setInsc_municipal(this.tf_insc_municipal.getText());
	empresa.setInsc_estadual(this.tf_insc_estadual.getText());
	
	empresa.setTel_1(this.tf_tel_1.getText());
	empresa.setTel_2(this.tf_tel_2.getText());
	empresa.setSite(this.tf_site.getText());
	empresa.setEmail(this.tf_email.getText());

	
		if(this.empresa.getFk_endereco()==0){
		
		int id_endereco = new DAO<Endereco>(Endereco.class).novo(this.endereco.getEndereco());
		
		if(id_endereco==0)
		return false;
		
		this.empresa.setFk_endereco(id_endereco);
		}
		else{
		
		Endereco aux =  this.endereco.getEndereco();
		aux.setId_endereco(empresa.getFk_endereco());
		
		if(!new DAO<Endereco>(Endereco.class).altera(aux))	
		return false;
			
		}
	
	
	if(this.empresa.getId_empresa() == 0)
	return new DAO<Empresa>(Empresa.class).novo(this.empresa)==0?false:true;
	else
	return new DAO<Empresa>(Empresa.class).altera(this.empresa);
	}
	
	
	
	
	

	private boolean valida(){
	
	
		if(this.tf_nome.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe o nome da empresa.");
		Comuns.textFieldErroMode(this.tf_nome);
		return false;	
		}
		
		
		
		if(this.tf_cpf_cnpj.getText().length() > 0){
			if(!this.tf_cpf_cnpj.validacao()){
		
			Mensagens.msgDeErro("Informe um número de CNPJ válido.");
			Comuns.textFieldErroMode(this.tf_cpf_cnpj);
			return false;
			}
		}

		
		if(this.tf_email.getText().length() > 0){
			if(!this.tf_email.validacao()){
		
			Mensagens.msgDeErro("Informe um endereço de e-mail válido.");
			Comuns.textFieldErroMode(this.tf_email);
			return false;
			}
		}
		

		if(this.tf_tel_1.getText().length() > 0){
			if(!this.tf_tel_1.validacao()){
				
			Mensagens.msgDeErro("Informe um telefone 1 válido.");
			Comuns.textFieldErroMode(this.tf_tel_1);
			return false;	
			}
		}
		

		if(this.tf_tel_2.getText().length() > 0){
			if(!this.tf_tel_2.validacao()){
		
			Mensagens.msgDeErro("Informe um telefone 2 válido.");
			Comuns.textFieldErroMode(this.tf_tel_2);
			return false;
			}
		}						
		
		
	return this.endereco.validacao();	
	}




	
	public static String geraCodigo(){
		
	return "EMP"+new Random().nextInt(100000);	
	}





	
}
