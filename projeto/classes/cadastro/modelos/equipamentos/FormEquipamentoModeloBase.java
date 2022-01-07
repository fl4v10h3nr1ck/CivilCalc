package cadastro.modelos.equipamentos;

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

import beans.Unidade;
import beans.modelos.Equipamento_Modelo;
import cadastro.unidade.FormNovaUnidade;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.FormDeSelecao;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;





public abstract class FormEquipamentoModeloBase extends Dialogo {





private static final long serialVersionUID = 1L;


protected CampoLimitado tf_codigo;
protected CampoLimitado tf_descricao;

protected CampoLimitado tf_unidade;
protected int id_unidade;

protected CampoMoeda tf_valor;

protected JComboBox<String> tipo;


protected Equipamento_Modelo equipamento;






	public FormEquipamentoModeloBase(String titulo, int largura, int altura, Equipamento_Modelo equipamento) {
		
	super(titulo, largura, altura);
	
	this.equipamento =  equipamento;
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
	cons.weightx  = 0.3;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("<html>Código:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.7;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel("<html>Nome/Descrição:<font color=red>*</font></html>"), cons);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.weightx  = 0.3;
	p_1.add(this.tf_codigo = new CampoLimitado(200), cons);
	this.tf_codigo.setEditable(false);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.7;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_1.add(this.tf_descricao = new CampoLimitado(200), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.weightx  = 0.3;
	p_1.add(new JLabel("Tipo:"), cons);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("<html>Valor Unitário:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.3;
	p_1.add(new JLabel("<html>Unidade:<font color=red>*</font></html>"), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_1.add(this.tipo = new JComboBox<String>(new String[]{"OPERATRIZ", "TRANSPORTE", "OUTROS"}), cons);
	
	p_1.add(this.tf_valor = new CampoMoeda(8), cons);
	
	p_1.add(this.tf_unidade = new CampoLimitado(45), cons);
	this.tf_unidade.setEditable(false);
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.WEST;
	cons.ipadx = 0;
	cons.weightx = 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_add_nova_unidade  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_add_nova_unidade.setToolTipText("Salvar");
	p_1.add(bt_add_nova_unidade, cons);
	
	
	cons.anchor = GridBagConstraints.CENTER;
	cons.ipadx = 25;
	cons.anchor = GridBagConstraints.EAST;
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
		

		
		
		this.tf_unidade.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
								
		bt_add_nova_unidade.requestFocus();
		Comuns.removeIndicadoresDeErro(tf_unidade);
		
		Unidade retorno = new Unidade();
		
		FormDeSelecao<Unidade> selectionItemForm = 
					new FormDeSelecao<Unidade>("Adicionar Unidade", retorno, Unidade.class, "uni.status='ATIVO'");
		selectionItemForm.mostrar();
		
		
			if(retorno != null && retorno.getId_unidade() > 0){
				
			id_unidade = retorno.getId_unidade();
			tf_unidade.setText(retorno.getDescricao());
			}
		}});
				
			
		
		
		
		bt_add_nova_unidade.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		Unidade retorno = new Unidade();
			
		FormNovaUnidade form = new FormNovaUnidade(retorno);
		form.mostrar();
			
			if(retorno != null && retorno.getId_unidade() > 0){
					
			id_unidade = retorno.getId_unidade();
			tf_unidade.setText(retorno.getDescricao());
			}
		}});
		
		
		
	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_descricao);
	textFieldList.add(this.tf_unidade);
	textFieldList.add(this.tf_valor);
	
	
	Comuns.addEventoDeFoco(textFieldList);
	}




	
	

	protected boolean validacao(){
		
		
		if(this.tf_descricao.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe a nome do equipamento.");
		Comuns.textFieldErroMode(this.tf_descricao);
		return false;	
		}
		
		

		if(this.id_unidade == 0){
		
		Mensagens.msgDeErro("Informe a unidade de medida do equipamento.");
		Comuns.textFieldErroMode(this.tf_unidade);
		return false;	
		}
		

		if(this.tf_valor.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe o valor unitário do equipamento.");
		Comuns.textFieldErroMode(this.tf_valor);
		return false;	
		}
		
		
	return true;	
	}
	
	

}	
