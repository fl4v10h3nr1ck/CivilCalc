package cadastro.modelos.mao_de_obra;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import beans.TipoDeMaoDeObra;
import beans.Unidade;
import beans.modelos.Mao_De_Obra_Modelo;
import cadastro.tipos_de_mao_de_obra.FormNovoTipoDeMaoDeObra;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.FormDeSelecao;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;




public abstract class FormMaoDeObraModeloBase extends Dialogo {



private static final long serialVersionUID = 1L;


protected CampoLimitado tf_codigo;
protected CampoLimitado tf_descricao;
protected CampoMoeda tf_valor;

protected CampoLimitado tf_tipo;
protected int id_tipo;

protected Mao_De_Obra_Modelo retorno;

protected CampoLimitado tf_unidade;
protected int id_unidade;

protected JComboBox<String> cb_ls_tipo;







	public FormMaoDeObraModeloBase(String titulo, Mao_De_Obra_Modelo retorno) {
		
	super(titulo, 650, 210);
	
	this.retorno =  retorno;
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
	
	
	cons.insets = new Insets( 0, 2, 2, 2);
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_2, cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weighty  = 0;
	cons.weightx  = 0.2;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Código:"), cons);
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
	p_1.add(this.tf_descricao = new CampoLimitado(200), cons);
	

	cons.gridwidth  = 1;
	cons.weightx  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel("<html>Valor/Hora:<font color=red>*</font></html>"), cons);
	p_2.add(new JLabel("<html>Unidade:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel("Tipo:"), cons);

	
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 2, 2, 2, 2);
	p_2.add(this.tf_valor = new CampoMoeda(8), cons);
	
	p_2.add(this.tf_unidade = new CampoLimitado(45), cons);
	this.tf_unidade.setEditable(false);
	
	p_2.add(this.tf_tipo = new CampoLimitado(45), cons);
	this.tf_tipo.setEditable(false);
	
	cons.fill = GridBagConstraints.NONE;
	cons.ipadx = 0;
	cons.weightx = 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_add_novo_tipo  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_add_novo_tipo.setToolTipText("Salvar");
	p_2.add(bt_add_novo_tipo, cons);
	
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx = 1;
	cons.gridwidth  = 1;
	cons.weightx  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel("<html>Regime de Trabalho:<font color=red>*</font></html>"), cons);
	p_2.add(new JLabel(""), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel(""), cons);
	
	

	
	cons.gridwidth  = 1;
	cons.weightx  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(this.cb_ls_tipo = new JComboBox<String>(new String[]{"HORISTA", "MENSALISTA"}), cons);
	p_2.add(new JLabel(""), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel(""), cons);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	cons.anchor = GridBagConstraints.EAST;
	cons.ipadx = 25;
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
		

	
		
		this.tf_tipo.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
							
		Comuns.removeIndicadoresDeErro(tf_tipo);
			
		bt_save.requestFocus();
			
		TipoDeMaoDeObra retorno = new TipoDeMaoDeObra();
		
		FormDeSelecao<TipoDeMaoDeObra> selectionItemForm = 
					new FormDeSelecao<TipoDeMaoDeObra>("Adicionar Tipo", retorno, TipoDeMaoDeObra.class, "t_m_obra.status='ATIVO'");
		selectionItemForm.mostrar();
				
			if(retorno != null && retorno.getId_tipo_mao_obra() > 0){
							
			id_tipo = retorno.getId_tipo_mao_obra();
			tf_tipo.setText(retorno.getDescricao());		
			}		
		}});
			
		
		
		
		
		
		this.tf_unidade.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
								
		Comuns.removeIndicadoresDeErro(tf_unidade);
				
		bt_save.requestFocus();
				
		Unidade retorno = new Unidade();
			
		FormDeSelecao<Unidade> selectionItemForm = 
						new FormDeSelecao<Unidade>("Adicionar Unidade", retorno, Unidade.class, "uni.status='ATIVO'");
		selectionItemForm.mostrar();
					
			if(retorno != null && retorno.getId_unidade() > 0){
				
			id_unidade = retorno.getId_unidade();
			tf_unidade.setText(retorno.getDescricao());		
			}		
		}});
				
			
		
		
		
		
		bt_add_novo_tipo.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		TipoDeMaoDeObra retorno = new TipoDeMaoDeObra();
		
		FormNovoTipoDeMaoDeObra form = new FormNovoTipoDeMaoDeObra(retorno);
		form.mostrar();
					
			if(retorno != null && retorno.getId_tipo_mao_obra() > 0){
								
			id_tipo = retorno.getId_tipo_mao_obra();
			tf_tipo.setText(retorno.getDescricao());		
			}	
	
		}});
		
		
		
	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_descricao);
	textFieldList.add(this.tf_valor);
	textFieldList.add(this.tf_codigo);
	textFieldList.add(this.tf_unidade);
	
	
	Comuns.addEventoDeFoco(textFieldList);
	}




	

	protected boolean validacao(){
	
	/*	
		if(this.tf_codigo.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe o código da mão de obra.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
			
			
		if(!Comuns.codigoPermitido(new DAO<Mao_De_Obra>(Mao_De_Obra.class), 
					this.tf_codigo.getText(), this.retorno!=null?this.retorno.getId_mao_de_obra():0)){
				
		Mensagens.msgDeErro("O código informado já está sendo usado por outra mão de obra.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
	*/		

		if(this.tf_descricao.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe a descrição da mão de obra.");
		Comuns.textFieldErroMode(this.tf_descricao);
		return false;	
		}

		
		if(this.id_unidade ==0){
			
		Mensagens.msgDeErro("Informe a unidade da mão de obra.");
		Comuns.textFieldErroMode(this.tf_unidade);
		return false;	
		}
		
		

		if(this.tf_valor.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe o valor/hora da mão de obra.");
		Comuns.textFieldErroMode(this.tf_valor);
		return false;	
		}	
		
		
		
	return true;	
	}
	
	

}	
