package cadastro.modelos.materiais;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import beans.Fornecedor;
import beans.Item;
import beans.TipoDeMaterial;
import beans.Unidade;
import beans.modelos.Material_Modelo;
import cadastro.fornecedores.FormNovoFornecedor;
import cadastro.unidade.FormNovaUnidade;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.FormDeSelecao;
import componentes.janelas.Dialogo;
import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;





public abstract class FormMaterialModeloBase extends Dialogo {





private static final long serialVersionUID = 1L;


protected CampoLimitado tf_codigo;
protected CampoLimitado tf_descricao;

protected CampoLimitado tf_unidade;
protected int id_unidade;


protected CampoLimitado tf_tipo;
protected int id_tipo;

protected CampoMoeda tf_valor;

protected JTable tb_fornecedores;
protected DefaultTableModel modelo;
protected CampoLimitado tf_fornecedor;
protected int id_fornecedor;
protected CampoMoeda tf_preco;
protected List<Item> lista_de_fornecedores;
protected JButton bt_add_fornecedor;
protected JButton bt_remover_fornecedor;



protected Material_Modelo material;







	public FormMaterialModeloBase(String titulo, Material_Modelo material) {
		
	super(titulo, 650, 550);
	
	this.material =  material;
	
	this.lista_de_fornecedores = new ArrayList<Item>();
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
	
	cons.insets = new Insets( 0, 2, 0, 2);
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_2, cons);
	
	cons.fill = GridBagConstraints.BOTH;
	cons.weighty  = 1;
	JPanel p_3 = new JPanel(new GridBagLayout());
	p_3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_3, cons);
	p_3.setBorder(BorderFactory.createTitledBorder("Fornecedores"));  
	
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = 1;
	cons.weighty  = 0;
	cons.weightx  = 0.2;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("<html>Código:<font color=red>*</font></html>"), cons);
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
	
	/*
	cons.weightx  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.gridwidth  = 1;
	p_2.add(new JLabel("Tipo de Valor:"), cons);
	p_2.add(new JLabel(""), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel(""), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_2.add(this.tipo_valor = new JComboBox<String>(new String[]{"Valor Unitário Fixo", "Valor por Fornecedor"}), cons);
	p_2.add(this.valor_padrao = new JComboBox<String>(new String[]{"MAIOR PREÇO", "MENOR PREÇO", "PREÇO MÉDIO", "SEMPRE SELECIONAR"}), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel(""), cons);
	*/
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel("Tipo:"), cons);
	p_2.add(new JLabel("<html>Valor Unitário:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel("<html>Unidade:<font color=red>*</font></html>"), cons);
	
	
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 2, 2, 2, 2);
	p_2.add(this.tf_tipo = new CampoLimitado(45), cons);
	this.tf_tipo.setEditable(false);
	
	p_2.add(this.tf_valor = new CampoMoeda(8), cons);
	
	p_2.add(this.tf_unidade = new CampoLimitado(45), cons);
	this.tf_unidade.setEditable(false);
	
	cons.fill = GridBagConstraints.NONE;
	cons.ipadx = 0;
	cons.weightx = 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_add_nova_unidade  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_add_nova_unidade.setToolTipText("Cadastrar nova unidade.");
	p_2.add(bt_add_nova_unidade, cons);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx  = 0;
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	p_3.add(new JLabel(""),cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 1;
	cons.weightx = 0.75;	
	p_3.add(new JLabel("<html>Fornecedor:<font color=red>*</font></html>"),cons);
	p_3.add(new JLabel("<html>Preço:<font color=red>*</font></html>"),cons);
	cons.weightx = 0.15;	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx = 0.1;	
	p_3.add(new JLabel(""),cons);
	
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx  = 0;
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	JButton bt_novo_add_fornecedor  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_novo_add_fornecedor.setToolTipText("Cadastrar um novo fornecedor.");
	p_3.add(bt_novo_add_fornecedor, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 1;
	cons.gridwidth  = 1;	
	cons.weightx = 0.75;	
	p_3.add(this.tf_fornecedor =new CampoLimitado(250), cons);
	this.tf_fornecedor.setEditable(false);
	
	cons.weightx = 0.15;	
	p_3.add(this.tf_preco =new CampoMoeda(8), cons);
	
	cons.weightx = 0.1;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	this.bt_add_fornecedor  = new JButton("Adicionar", new ImageIcon(getClass().getResource("/icons/add.png")));
	bt_add_fornecedor.setToolTipText("Adicionar fornecedor selecionado.");
	p_3.add(bt_add_fornecedor, cons);
	
	
		this.modelo = new DefaultTableModel(null, new String[]{"Fornecedor", "preço"}){
		
		private static final long serialVersionUID = 1L;
		
		public boolean isCellEditable(int row, int col ){  
		            
		return false;
		}};


	
	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	p_3.add(new JScrollPane(this.tb_fornecedores=new JTable(this.modelo)), cons);
	this.tb_fornecedores.setRowHeight(25);
		
	this.tb_fornecedores.getColumnModel().getColumn(0).setPreferredWidth(500);
	this.tb_fornecedores.getColumnModel().getColumn(1).setPreferredWidth(200);
		
		
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.anchor = GridBagConstraints.WEST;
	this.bt_remover_fornecedor  = new JButton(new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_remover_fornecedor.setToolTipText("Remove responsável selecionado.");
	p_3.add(bt_remover_fornecedor, cons);
		

	
	cons.anchor = GridBagConstraints.CENTER;
	cons.ipadx = 25;
	cons.insets = new Insets( 4, 2, 5, 2);
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
		

		
		
		bt_novo_add_fornecedor.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
		
		Fornecedor retorno = new  Fornecedor();	
		
		FormNovoFornecedor form = new FormNovoFornecedor(retorno);
		form.mostrar();
		
			if(retorno != null && retorno.getId_fornecedor() > 0){
			
			id_fornecedor = retorno.getId_fornecedor();
			tf_fornecedor.setText(retorno.getNome_razao());
			}
		
		
		}});
		
		
	
		this.tf_tipo.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
							
		Comuns.removeIndicadoresDeErro(tf_tipo);
			
		tf_valor.requestFocus();
			
		TipoDeMaterial retorno = new TipoDeMaterial();
		
		FormDeSelecao<TipoDeMaterial> selectionItemForm = 
					new FormDeSelecao<TipoDeMaterial>("Adicionar Tipo", retorno, TipoDeMaterial.class, "tp_mat.status='ATIVO'");
		selectionItemForm.mostrar();
				
			if(retorno != null && retorno.getId_tipo_material() > 0){
							
			id_tipo = retorno.getId_tipo_material();
			tf_tipo.setText(retorno.getDescricao());		
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
		
		
		
	/*	
		this.tipo_valor.addItemListener(new ItemListener(){
		@Override
		public void itemStateChanged(ItemEvent e) {
				
			
		setTipoDeValor();	
			
		}});
		
		
	*/	
		
		
		this.bt_remover_fornecedor.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
							    	
				
		int selectedItem= tb_fornecedores.getSelectedRow();
				
			if(selectedItem >=0){
				
			lista_de_fornecedores.remove(selectedItem);
					
			atualizaTabelaDeFornecedores();
			}
			else
			Mensagens.msgDeErro("Selecione uma linha da tabela de fornecedores para exclusão.");	
			
			}});
				
			
			
		
		

		
		this.bt_add_fornecedor.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
							    	
				
		addFornecedor();
		}});
				
			
		
		

		
		this.tf_fornecedor.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
								
		tf_preco.requestFocus();
		Comuns.removeIndicadoresDeErro(tf_fornecedor);
		
		Fornecedor retorno = new Fornecedor();
		
		FormDeSelecao<Fornecedor> selectionItemForm = 
					new FormDeSelecao<Fornecedor>("Adicionar Fornecedor", retorno, Fornecedor.class, "forn.status='ATIVO'");
		selectionItemForm.mostrar();
		
		
			if(retorno != null && retorno.getId_fornecedor() > 0){
				
			id_fornecedor = retorno.getId_fornecedor();
			tf_fornecedor.setText(retorno.getNome_razao());
			}
		}});
				
			
		
		
		
		
		
	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_descricao);
	textFieldList.add(this.tf_codigo);
	textFieldList.add(this.tf_unidade);
	textFieldList.add(this.tf_valor);
	textFieldList.add(this.tf_fornecedor);
	textFieldList.add(this.tf_preco);
	
	
	Comuns.addEventoDeFoco(textFieldList);
	
	//setTipoDeValor();
	}



	

	protected boolean validacao(){
		
	/*	
		if(this.tf_codigo.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe o código do material.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
		
		
		if(!Comuns.codigoPermitido(new DAO<Material>(Material.class), 
				this.tf_codigo.getText(), this.material!=null?this.material.getId_material():0)){
			
		Mensagens.msgDeErro("O código informado já está sendo usado por outro material.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
	*/	
		
		if(this.tf_descricao.getText().length() == 0){
		
		Mensagens.msgDeErro("Informe a nome do material.");
		Comuns.textFieldErroMode(this.tf_descricao);
		return false;	
		}
		
		

		if(this.id_unidade == 0){
		
		Mensagens.msgDeErro("Informe a unidade de medida do material.");
		Comuns.textFieldErroMode(this.tf_unidade);
		return false;	
		}
		

		//if(this.tipo_valor.getSelectedIndex()==0){
		
			if(this.tf_valor.getText().length() == 0){
			
			Mensagens.msgDeErro("Informe o valor unitário do material.");
			Comuns.textFieldErroMode(this.tf_valor);
			return false;	
			}
	/*	}
		else{
			
		
			if(this.lista_de_fornecedores.size()==0){
				
			Mensagens.msgDeErro("Adicione ao menos um fornecedor.");
			Comuns.textFieldErroMode(this.tf_fornecedor);
			return false;	
			}	
			
		}*/
		
	return true;	
	}
	
	
	
	
	
	public void atualizaTabelaDeFornecedores(){
	
		
	this.modelo.setNumRows(0);
	String[] dados = new String[2];
	
		for(Item aux: this.lista_de_fornecedores){
			
		dados[0] = aux.getParamentro("nome").toString();
		dados[1] = aux.getParamentro("preco").toString();
		
		this.modelo.addRow(dados);
		}		
	}
	
	
	
	
	

	
	private void addFornecedor(){
	
		if(this.id_fornecedor==0){
		
		Mensagens.msgDeErro("Nenhum fornecedor selecionado.");
		Comuns.textFieldErroMode(this.tf_fornecedor);
		return;			
		}	
		
		
		if(this.tf_preco.getText().length()==0){
			
		Mensagens.msgDeErro("Preço de fornecedor indefinido.");
		Comuns.textFieldErroMode(this.tf_preco);
		return;			
		}
	
			
		for(Item aux: this.lista_de_fornecedores){
					
			if(aux.getParamentro("id_fornecedor").toString()!=null && 
				Integer.parseInt(aux.getParamentro("id_fornecedor").toString())==this.id_fornecedor){
				
			Mensagens.msgDeErro("Você já adicionou este fornecedor.");
			return;
			}
		}
			
	Item item = new Item();
	item.addParamentro("id_fornecedor", this.id_fornecedor);
	item.addParamentro("nome", this.tf_fornecedor.getText());
	item.addParamentro("preco", Calculo.formataValor(this.tf_preco.getText()));
	
	this.lista_de_fornecedores.add(item);
	
	this.atualizaTabelaDeFornecedores();
	
	this.tf_fornecedor.setText("");
	this.tf_preco.setText("");
	
	this.id_fornecedor =0;
	
	}
	

	
	
	
	
	
	

}	
