package cadastro.modelos.encargos_mensalistas;

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

import beans.modelos.Encargo_Horista_Modelo;
import beans.modelos.Encargo_Mensalista_Modelo;
import cadastro.PainelDeEncargoMensalista;
import classes.CampoLimitado;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;





public abstract class FormEncargoMensalistaModeloBase extends Dialogo {





private static final long serialVersionUID = 1L;


protected CampoLimitado tf_codigo;




protected Encargo_Mensalista_Modelo retorno;


protected PainelDeEncargoMensalista painel;





	public FormEncargoMensalistaModeloBase(String titulo, Encargo_Mensalista_Modelo retorno) {
		
	super(titulo, 800, 500);
	
	this.retorno =  retorno;
	}


	
	
	
	
	@Override
	public void adicionarComponentes() {
	
	
	GridBagConstraints cons = new GridBagConstraints();  
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	JPanel p1 = new JPanel(new GridBagLayout());
	p1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p1, cons);
	
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.weightx  = 0.4;
	p1.add(new JLabel("<html>Código/Identificação do Encargo:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = 2;
	cons.weightx  = 0.6;
	p1.add(this.tf_codigo = new CampoLimitado(40), cons);
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p1.add(new JLabel(""), cons);

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(0, 2, 2, 2);	
	this.add(this.painel =new PainelDeEncargoMensalista(), cons);
		
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	cons.insets = new Insets(0, 2, 4, 2);
	JButton bt_salvar  = new JButton("Salvar Encargo", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar encargo.");
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
		
	textFieldList.add(this.tf_codigo);
	
	Comuns.addEventoDeFoco(textFieldList);
	}




	


	protected boolean validacao(){
		
		
		if(this.tf_codigo.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe o código/identificação do encargo.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
		
		
		if(!Comuns.codigoPermitido(new DAO<Encargo_Horista_Modelo>(Encargo_Horista_Modelo.class), 
				this.tf_codigo.getText(), this.retorno!=null?this.retorno.getId_encargo_mensalistas_modelo():0)){
			
		Mensagens.msgDeErro("O código/identificação informado já está sendo usado por outro encargo.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
		
	return true;	
	}
	
	
	

	
}	
