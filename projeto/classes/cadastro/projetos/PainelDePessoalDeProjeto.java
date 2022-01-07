package cadastro.projetos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import beans.Integrante;
import beans.Projeto;
import beans.ProjetoXProprietario;
import beans.ProjetoXIntegrante;
import beans.Proprietario;
import cadastro.integrantes.FormNovoIntegrante;
import cadastro.proprietarios.FormNovoProprietario;
import classes.CampoLimitado;
import componentes.FormDeSelecao;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;

public class PainelDePessoalDeProjeto  extends JPanel{

		
private static final long serialVersionUID = 1L;


private JTable tb_integrantes;
private DefaultTableModel modelo_integrantes;
private CampoLimitado tf_integrante;
private List<Integrante> lista_de_integrantes;


private JTable tb_proprietarios;	
private DefaultTableModel modelo_proprietarios;
private CampoLimitado tf_proprietario;
private List<Proprietario> lista_de_proprietarios;


private Projeto projeto;	



	public PainelDePessoalDeProjeto(Projeto projeto){		
			
	this.setLayout(new GridBagLayout());
		
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
		
	this.lista_de_integrantes = new ArrayList<Integrante>();
	this.lista_de_proprietarios = new ArrayList<Proprietario>();
		
	this.adicionarComponentes();
		
		
	this.atualiza(projeto);	
	}



		
		
	public void adicionarComponentes() {
		
	
	GridBagConstraints cons = new GridBagConstraints();  
		
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 2, 2);
	
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_2, cons);	
	p_2.setBorder(BorderFactory.createTitledBorder("Integrantes"));  
		
	cons.insets = new Insets(1, 1, 2, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JPanel p_3 = new JPanel(new GridBagLayout());
	p_3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_3, cons);	
	p_3.setBorder(BorderFactory.createTitledBorder("Proprietários"));  
		
		
		
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx = 1;	
	cons.insets = new Insets(2, 2, 0, 2);	
	p_2.add(new JLabel("Integrantes:"),cons);
		
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);		
	p_2.add(this.tf_integrante =new CampoLimitado(250), cons);
	this.tf_integrante.setEditable(false);
		
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;
	cons.gridwidth  = 1;	
	cons.weightx= 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_novo_integrante  = new JButton(new ImageIcon(getClass().getResource("/icons/add.png")));
	bt_novo_integrante.setToolTipText("Cadastrar um novo integrante do projeto.");
	p_2.add(bt_novo_integrante, cons);
		
		
		
		this.modelo_integrantes = new DefaultTableModel(null, new String[]{"Nome"}){
			
		private static final long serialVersionUID = 1L;
			
		public boolean isCellEditable(int row, int col ){  
			            
		return false;
		}};


	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	p_2.add(new JScrollPane(this.tb_integrantes=new JTable(this.modelo_integrantes)), cons);
	this.tb_integrantes.setRowHeight(25);
		
	this.tb_integrantes.getColumnModel().getColumn(0).setPreferredWidth(100);
		
		
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.anchor = GridBagConstraints.WEST;
	JButton bt_remove_integrante  = new JButton(new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_remove_integrante.setToolTipText("Remove integrante selecionado.");
	p_2.add(bt_remove_integrante, cons);
		
		
		
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 0, 2);	
	p_3.add(new JLabel("Proprietário:"),cons);
		
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);		
	p_3.add(this.tf_proprietario =new CampoLimitado(250), cons);
	this.tf_proprietario.setEditable(false);
		
		
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;
	cons.gridwidth  = 1;	
	cons.weightx= 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_novo_proprietario  = new JButton(new ImageIcon(getClass().getResource("/icons/add.png")));
	bt_novo_proprietario.setToolTipText("Cadastrar um novo proprietário do projeto.");
	p_3.add(bt_novo_proprietario, cons);

		
		this.modelo_proprietarios = new DefaultTableModel(null, new String[]{"Nome"}){
			
		private static final long serialVersionUID = 1L;
			
		public boolean isCellEditable(int row, int col ){  
			            
		return false;
		}};


	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	p_3.add(new JScrollPane(this.tb_proprietarios=new JTable(this.modelo_proprietarios)), cons);
	this.tb_proprietarios.setRowHeight(25);
		
	this.tb_proprietarios.getColumnModel().getColumn(0).setPreferredWidth(100);
		
		
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.anchor = GridBagConstraints.WEST;
	JButton bt_remove_proprietario  = new JButton(new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_remove_proprietario.setToolTipText("Remove proprietário selecionado.");
	p_3.add(bt_remove_proprietario, cons);
		

		
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	JButton bt_salvar  = new JButton("Salvar Projeto", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar projeto.");
	this.add(bt_salvar, cons);
	
	
	
		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		if(acaoPrincipal())		
		Mensagens.msgDeSucessoAoSalvar();
				
		}});
		
		
			
		bt_novo_integrante.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			
		Integrante integrante = new Integrante();
		FormNovoIntegrante	form = new FormNovoIntegrante(integrante);
		form.mostrar();
			
		if(integrante!=null && integrante.getId_integrante()>0)
		addIntegrante(integrante);
			
		}});
			
			
			
		bt_novo_proprietario.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		Proprietario proprietario = new Proprietario();
		FormNovoProprietario	form = new FormNovoProprietario(proprietario);
		form.mostrar();
				
		if(proprietario!=null && proprietario.getId_proprietario()>0)
		addProprietario(proprietario);	
		}});
		
		
		
		this.tf_integrante.addMouseListener( new MouseAdapter(){		
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
		Comuns.removeIndicadoresDeErro(tf_integrante);
			
		bt_novo_integrante.requestFocus();
								
		addIntegrante(null);	
		}});
		
		
		
		this.tf_proprietario.addMouseListener( new MouseAdapter(){		
			
		@Override
		public void mouseClicked(MouseEvent e) {
				
		Comuns.removeIndicadoresDeErro(tf_proprietario);
			
		bt_novo_proprietario.requestFocus();
				
		addProprietario(null);	
		}});
		
/*			
		this.tf_integrante.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
						
		Comuns.removeIndicadoresDeErro(tf_integrante);
				
		bt_novo_integrante.requestFocus();
						
		addIntegrante(null);		
		}});
				
				
				
		this.tf_proprietario.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
								
		Comuns.removeIndicadoresDeErro(tf_proprietario);
			
		bt_novo_proprietario.requestFocus();
				
		addProprietario(null);		
		}});
			
*/			
			
			
		bt_remove_integrante.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
							    	
				
		int selectedItem= tb_integrantes.getSelectedRow();
				
			if(selectedItem >=0){
				
			lista_de_integrantes.remove(selectedItem);
					
			atualizaTabelaDeIntegrantes();
			}
			else
			Mensagens.msgDeErro("Selecione uma linha da tabela de responsáveis para exclusão.");	
			
		}});
				
			
			

		bt_remove_proprietario.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		int selectedItem= tb_proprietarios.getSelectedRow();
				
			if(selectedItem >=0){
				
			lista_de_proprietarios.remove(selectedItem);
					
			atualizaTabelaDeProprietarios();
			}
			else
			Mensagens.msgDeErro("Selecione uma linha da tabela de proprietários para exclusão.");	
				
		}});
		
		
			
	List<JTextField> textFieldList = new ArrayList<JTextField>();
			
	textFieldList.add(this.tf_integrante);
	textFieldList.add(this.tf_proprietario);
		
	Comuns.addEventoDeFoco(textFieldList);
	}
		
		
		
	
	
	public  boolean acaoPrincipal(){
	
	if(this.projeto==null || this.projeto.getId_projeto()==0)	
	return false;
	
	DAO<ProjetoXIntegrante> dao1 = new DAO<ProjetoXIntegrante>(ProjetoXIntegrante.class);
	
	dao1.removeSemConfirmacao("fk_projeto="+this.projeto.getId_projeto());
	
		for(Integrante integrante: this.lista_de_integrantes){
			
		ProjetoXIntegrante aux = new ProjetoXIntegrante();
		aux.setFk_projeto(this.projeto.getId_projeto());
		aux.setFk_integrante(integrante.getId_integrante());
				
		dao1.novo(aux); 
		}
			
			
	DAO<ProjetoXProprietario> dao2 = new DAO<ProjetoXProprietario>(ProjetoXProprietario.class);
	
	dao2.removeSemConfirmacao("fk_projeto="+this.projeto.getId_projeto());
	
	
		for(Proprietario proprietario: this.lista_de_proprietarios){
			
		ProjetoXProprietario aux = new ProjetoXProprietario();
		aux.setFk_projeto(this.projeto.getId_projeto());
		aux.setFk_proprietario(proprietario.getId_proprietario());
				
		dao2.novo(aux); 
		}	
	

	return true;
	}
		
		
		

	
	
	private void addIntegrante(Integrante retorno){
		
		if(retorno==null){	
			
		retorno = new Integrante();
			
		FormDeSelecao<Integrante> selectionItemForm = 
					new FormDeSelecao<Integrante>("Adicionar Integrante", retorno, Integrante.class, "inte.status='ATIVO'");
		selectionItemForm.mostrar();
		}
		
		if(retorno != null && retorno.getId_integrante() > 0){
		
			for(Integrante aux: this.lista_de_integrantes){
			
				if(aux.getId_integrante() == retorno.getId_integrante()){
				Mensagens.msgDeErro("Você já adicionou este responsável.");
				return;
				}
			}	
			
		Integrante aux = new DAO<Integrante>(Integrante.class).get(retorno.getId_integrante());	
		
			if(aux!=null){
			
			this.lista_de_integrantes.add(aux);
			this.atualizaTabelaDeIntegrantes();
			}
		}
	}
	

	
	
	
	
	
	
	private void addProprietario(Proprietario retorno){
		
		if(retorno==null){	
			
		retorno = new Proprietario();
		
		FormDeSelecao<Proprietario> selectionItemForm = 
						new FormDeSelecao<Proprietario>("Adicionar Proprietário", retorno, Proprietario.class, "prop.status='ATIVO'");
			selectionItemForm.mostrar();
		}
		
		if(retorno != null && retorno.getId_proprietario() > 0){
			
			for(Proprietario aux: this.lista_de_proprietarios){
					
				if(aux.getId_proprietario() == retorno.getId_proprietario()){
				Mensagens.msgDeErro("Você já adicionou este responsável.");
				return;
				}
			}
			
		Proprietario aux = new DAO<Proprietario>(Proprietario.class).get(retorno.getId_proprietario());	
			
			if(aux!=null){
				
			this.lista_de_proprietarios.add(aux);
			this.atualizaTabelaDeProprietarios();
			}
		}
	}
		
	
	
	
	
	
	
	
	protected void atualizaTabelaDeIntegrantes(){
		
	this.modelo_integrantes.setNumRows(0);
	String[] dados = new String[1];
				
		for(Integrante aux: this.lista_de_integrantes){
				
		dados[0] = aux.getNome();
		this.modelo_integrantes.addRow(dados);
		}	
	}
		

		
		
	
		

	protected void atualizaTabelaDeProprietarios(){
			
	this.modelo_proprietarios.setNumRows(0);
	String[] dados = new String[1];
				
		for(Proprietario aux: this.lista_de_proprietarios){
				
		dados[0] = aux.getNome_razao();
		this.modelo_proprietarios.addRow(dados);
		}	
	}

	
	
	
	
	

	public void atualiza(Projeto projeto){
	
	this.projeto = projeto;
	
		if(this.projeto!=null && this.projeto.getId_projeto()>0){
		
		
		this.lista_de_integrantes = 
				new DAO<Integrante>(Integrante.class).
				get("INNER JOIN projetos_x_integrante as prjXint on prjXint.fk_integrante= inte.id_integrante AND prjXint.fk_projeto="+this.projeto.getId_projeto(),
				null, null);	
		
		
		this.lista_de_proprietarios = 
			new DAO<Proprietario>(Proprietario.class).
			get("INNER JOIN projetos_x_proprietarios as prjXprop on prjXprop.fk_proprietario= prop.id_proprietario AND prjXprop.fk_projeto="+this.projeto.getId_projeto(),
			null, null);	
	
		this.atualizaTabelaDeIntegrantes();
		this.atualizaTabelaDeProprietarios();
		}
	}

	

		
}