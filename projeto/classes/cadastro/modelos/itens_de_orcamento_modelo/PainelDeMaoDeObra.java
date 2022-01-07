package cadastro.modelos.itens_de_orcamento_modelo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import beans.Item;
import beans.modelos.ItemDeOrcamentoModelo;
import beans.modelos.ItemXMaoDeObraModelo;
import beans.modelos.Mao_De_Obra_Modelo;
import cadastro.FormAlteraQuantidade;
import cadastro.modelos.mao_de_obra.FormNovaMaoDeObraModelo;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.FormDeSelecao;
import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;



public class PainelDeMaoDeObra extends JPanel{

	
	
private static final long serialVersionUID = 1L;


protected JTable tb_mao_obra;
protected DefaultTableModel modelo_mao_obra;
protected CampoLimitado tf_temp_mao_obra;
protected CampoMoeda tf_temp_coef_mao_obra;
protected int idTempMao_obra;
protected List<Mao_De_Obra_Modelo> lista_maos_obra;
protected List<String> coefs_maos_obra;


protected JLabel lb_total_mao_obra;

protected String total_mao_obra;

private ItemDeOrcamentoModelo item;

private FormItensDeOrcamentoModelo principal;


private JButton bt_save;
private JButton bt_excluir_mao_de_obra;
private JButton bt_add_mao_obra;
private JButton bt_nova_mao;



	public PainelDeMaoDeObra(ItemDeOrcamentoModelo item, FormItensDeOrcamentoModelo principal) {
				
	this.lista_maos_obra = new ArrayList<Mao_De_Obra_Modelo>();
	this.coefs_maos_obra = new ArrayList<String>();
	
	this.principal = principal;
	
	this.setLayout(new GridBagLayout());
	
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	this.adicionarComponentes();
	
	this.atualiza(item);
	}


		
		
	
	public void adicionarComponentes() {
			
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	JPanel p_3 = new JPanel(new GridBagLayout());
	p_3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	this.add(p_3, cons);
	

	cons.fill = GridBagConstraints.NONE;
	cons.gridwidth  = 1;
	cons.weightx = 0;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_3.add(new JLabel(""), cons);
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 0.7;
	p_3.add(new JLabel("<html>Mão de Obra:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.3;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_3.add(new JLabel("<html>Coef. Prod. (Tempo/Serviço):<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	p_3.add(new JLabel(""), cons);
	
	
	
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.gridwidth  = 1;
	this.bt_nova_mao  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_nova_mao.setToolTipText("Cadastrar nova mão de obra");
	p_3.add(bt_nova_mao, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 0.7;
	p_3.add(this.tf_temp_mao_obra = new CampoLimitado(45), cons);
	this.tf_temp_mao_obra.setEditable(false);
	
	cons.weightx  = 0.3;
	p_3.add(this.tf_temp_coef_mao_obra = new CampoMoeda(8), cons);	

	
	cons.fill = GridBagConstraints.NONE;
	cons.ipadx = 5;
	cons.weightx = 0;
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	this.bt_add_mao_obra  = new JButton("Adicionar", new ImageIcon(getClass().getResource("/icons/novo_mini.png")));
	bt_add_mao_obra.setToolTipText("Adicionar mão de obra selecionado");
	p_3.add(bt_add_mao_obra, cons);
	
	
		this.modelo_mao_obra = new DefaultTableModel(null, new String[]{"Nome", "Val/Uni (R$)", "Coef. Prod."}){
		
		private static final long serialVersionUID = 1L;
		
		public boolean isCellEditable(int row, int col ){  
		            
		return false;
		}};


	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	p_3.add(new JScrollPane(this.tb_mao_obra=new JTable(this.modelo_mao_obra)), cons);
	this.tb_mao_obra.setRowHeight(25);
	
	this.tb_mao_obra.getColumnModel().getColumn(0).setPreferredWidth(500);
	this.tb_mao_obra.getColumnModel().getColumn(1).setPreferredWidth(100);
	this.tb_mao_obra.getColumnModel().getColumn(2).setPreferredWidth(100);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.ipadx = 0;
	cons.weightx = 1;
	cons.weighty  = 0;
	JPanel p_4 = new JPanel(new GridBagLayout());
	p_4.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_3.add(p_4, cons);
	
	
	cons.anchor= GridBagConstraints.WEST;
	cons.weightx = 1;
	cons.gridwidth  = 1;
	cons.insets = new Insets( 0, 2, 0, 2);
	p_4.add(this.lb_total_mao_obra = new JLabel("Valor Total (R$): 0,00"), cons);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	cons.anchor= GridBagConstraints.EAST;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.ipadx = 10;
	cons.insets = new Insets( 0, 0, 0, 0);
	this.bt_excluir_mao_de_obra  = new JButton("Remover", new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_excluir_mao_de_obra.setToolTipText("Remover mão de obra selecionada");
	p_4.add(bt_excluir_mao_de_obra, cons);
	
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.ipadx = 25;
	cons.weightx = 0;
	cons.insets = new Insets( 4, 2, 5, 2);
	this.bt_save  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_save.setToolTipText("Salvar");
	this.add(bt_save, cons);
				
	
		
		bt_save.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		if(acaoPrincipal())	
		Mensagens.msgDeSucessoAoSalvar();
				
		}});
			

	
		
		this.tf_temp_mao_obra.addMouseListener( new MouseAdapter(){			
		@Override
		public void mouseClicked(MouseEvent e) {
					
		Comuns.removeIndicadoresDeErro(tf_temp_mao_obra);
				
		tf_temp_coef_mao_obra.requestFocus();
				
		Mao_De_Obra_Modelo retorno = new Mao_De_Obra_Modelo();
		
		FormDeSelecao<Mao_De_Obra_Modelo> selectionItemForm = 
					new FormDeSelecao<Mao_De_Obra_Modelo>("Adicionar Mão de Obra", retorno, Mao_De_Obra_Modelo.class, "m_obra_m.status='ATIVO'");
		selectionItemForm.mostrar();
		
		
			if(retorno != null && retorno.getId_mao_de_obra() > 0){
		
			idTempMao_obra = retorno.getId_mao_de_obra();
			tf_temp_mao_obra.setText(retorno.getDescricao());
			}
		}});
		
			
		
		

		bt_add_mao_obra.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		addMaoDeObra();
		}});
		
		
		

		bt_excluir_mao_de_obra.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
		
		int selecionado = tb_mao_obra.getSelectedRow();
			
			if(selecionado>=0){
				
			lista_maos_obra.remove(selecionado);
			coefs_maos_obra.remove(selecionado);
			
			atualizaTabelaDeMaoDeObra();
			}
			else
			Mensagens.msgDeErro("Selecione uma mão de obra para remoção.");	
	
		}});
		

		
		
		this.tb_mao_obra.addMouseListener(new MouseAdapter(){
		@Override
		public void mouseClicked(MouseEvent e) {
					
			if(e.getClickCount()==2){	
					
			int selecionado = tb_mao_obra.getSelectedRow();	
						
			Item item = new Item();
			item.setParamentro("descricao", lista_maos_obra.get(selecionado).getDescricao());
			item.setParamentro("quant", coefs_maos_obra.get(selecionado));
				
				
			FormAlteraQuantidade form = new FormAlteraQuantidade(item);
			form.mostrar();	
				
				
			List<String> lista_aux = new ArrayList<String>();
				
			for(String aux: coefs_maos_obra)
			lista_aux.add(aux);			
				
			coefs_maos_obra.clear();
				
				for(int i = 0; i < lista_aux.size(); i++){
					
				if(i == selecionado)
				coefs_maos_obra.add(item.getParamentro("quant").toString());
				else
				coefs_maos_obra.add(lista_aux.get(i));			
				}

			atualizaTabelaDeMaoDeObra();
			}		
		}}); 	
					
		
		
		this.bt_nova_mao.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
								    	
		Mao_De_Obra_Modelo mao = new Mao_De_Obra_Modelo();
		FormNovaMaoDeObraModelo form = new FormNovaMaoDeObraModelo(mao);	
		form.mostrar();
					
			if(mao.getId_mao_de_obra()>0){
					
			idTempMao_obra = mao.getId_mao_de_obra();
			tf_temp_mao_obra.setText(mao.getDescricao());
			}
		}});
	
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
			
	textFieldList.add(this.tf_temp_mao_obra);
	textFieldList.add(this.tf_temp_coef_mao_obra);
		
	Comuns.addEventoDeFoco(textFieldList);
	}


		
		
		

	protected boolean validacao(){
				
	return true;	
	}
		
		
			

	
	

	
	private void addMaoDeObra(){
		

		if(this.idTempMao_obra<=0){
			
		Mensagens.msgDeErro("Selecione uma mão de obra.");
		Comuns.textFieldErroMode(this.tf_temp_mao_obra);
		return;	
		}

		
		if(this.tf_temp_coef_mao_obra.getText().length()==0){
			
		Mensagens.msgDeErro("Informe o coeficiente de produtividade da mão de obra selecionada.");
		Comuns.textFieldErroMode(this.tf_temp_coef_mao_obra);
		return;	
		}
		
	
	Mao_De_Obra_Modelo mao_obra = new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class).get(this.idTempMao_obra);	
		
		if(mao_obra!= null){
		
			for(Mao_De_Obra_Modelo aux: this.lista_maos_obra){
				
				if(aux.getId_mao_de_obra()==this.idTempMao_obra){
				
				Mensagens.msgDeErro("A mão de obra escolhida já foi adicionada.");
				Comuns.textFieldErroMode(this.tf_temp_mao_obra);
				return;	
				}
			}	
		
		this.lista_maos_obra.add(mao_obra);
		this.coefs_maos_obra.add(this.tf_temp_coef_mao_obra.getText());
		
		
		this.atualizaTabelaDeMaoDeObra();
		
		this.tf_temp_coef_mao_obra.setText("");
		this.idTempMao_obra = 0;
		this.tf_temp_mao_obra.setText("");
		}		
	}
	
	
	
	
	
	
	
	
	protected void atualizaTabelaDeMaoDeObra(){		
		
	this.modelo_mao_obra.setNumRows(0);
	String[] dados = new String[3];
	
	String valor = "0.00";
	String coef = "0.00";

		for(Mao_De_Obra_Modelo aux: this.lista_maos_obra){
		
		coef = this.coefs_maos_obra.get(this.lista_maos_obra.indexOf(aux));	
			
		valor = Calculo.soma(valor, Calculo.multiplica(aux.getValor_unitario(), coef));
				
		dados[0] = aux.getDescricao();
		dados[1] = aux.getValor_unitario();
		dados[2] = Calculo.formataValor(coef);
		
		this.modelo_mao_obra.addRow(dados);
		}		
	
	
	this.total_mao_obra  = valor;
	this.lb_total_mao_obra.setText("Valor Total (R$): "+Calculo.formataValor(valor));
	}
	
	
	
	

	
	
	private boolean acaoPrincipal(){ 
	
	if(!this.validacao())
	return false; 		
		
	if(this.item==null)
	return false;
	
	
		if(this.item.getSem_insumos()==null || this.item.getSem_insumos().compareTo("SIM")!=0){
		
			if(!new DAO<ItemXMaoDeObraModelo>(ItemXMaoDeObraModelo.class).removeSemConfirmacao("fk_item="+this.item.getId_item_modelo())){
				
			Mensagens.msgDeErroAoAlterar();	
			return false;	
			}
			
			
			for(Mao_De_Obra_Modelo aux: this.lista_maos_obra){
				
			ItemXMaoDeObraModelo itemXmaoObra = new ItemXMaoDeObraModelo();
					
			itemXmaoObra.setFk_mao_obra(aux.getId_mao_de_obra());
			itemXmaoObra.setFk_item(this.item.getId_item_modelo());
			itemXmaoObra.setQuantidade(this.coefs_maos_obra.get(this.lista_maos_obra.indexOf(aux)));
				
			if(new DAO<ItemXMaoDeObraModelo>(ItemXMaoDeObraModelo.class).novo(itemXmaoObra)<=0)
			return false;
			}		
		
		this.item.setValor_unitario(this.principal.setValor());
			
		if(!new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class).altera(this.item))
		return false;
		}
	
	return true;
	}
	
	
	
	
	
	
	protected void atualiza(ItemDeOrcamentoModelo item){
	
	this.item = item;	
	
	this.lista_maos_obra.clear();
	this.coefs_maos_obra.clear();
	
	
		if(this.item!=null){
		
		List<ItemXMaoDeObraModelo> itensXMaoDeObra = new DAO<ItemXMaoDeObraModelo>(ItemXMaoDeObraModelo.class)
					.get(null, "ixm_o_mod.fk_item="+this.item.getId_item_modelo(), null);

			for(ItemXMaoDeObraModelo aux : itensXMaoDeObra){
			
			Mao_De_Obra_Modelo mao_De_Obra = new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class).get(aux.getFk_mao_obra());
			
				if(mao_De_Obra !=null){
				
				this.lista_maos_obra.add(mao_De_Obra);
				this.coefs_maos_obra.add(Calculo.formataValor(aux.getQuantidade()));
				}
			}

		this.atualizaTabelaDeMaoDeObra();
		
			if(this.item.getSem_insumos()!=null && 
					this.item.getSem_insumos().compareTo("SIM")==0){
			
			
			this.bt_excluir_mao_de_obra.setEnabled(false);
			this.bt_add_mao_obra.setEnabled(false);
			this.bt_save.setEnabled(false);
			this.bt_nova_mao.setEnabled(false);
			}
			else{
				
			this.bt_excluir_mao_de_obra.setEnabled(true);
			this.bt_add_mao_obra.setEnabled(true);
			this.bt_save.setEnabled(true);
			this.bt_nova_mao.setEnabled(true);
			}
		}
	}



}	


