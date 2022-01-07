package cadastro.itens_de_orcamento;

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
import beans.ItemDeOrcamento;
import beans.ItemXMaoDeObra;
import beans.Mao_De_Obra;
import beans.Unidade;
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

private List<Item> lista_maos_obra;


protected JLabel lb_total_mao_obra;

protected String total_mao_obra;

private ItemDeOrcamento item;

private FormItensDeOrcamento principal;



private JButton bt_save;
private JButton bt_excluir_mao_de_obra;
private JButton bt_add_mao_obra;
private JButton bt_nova_mao;




	public PainelDeMaoDeObra(ItemDeOrcamento item, FormItensDeOrcamento principal) {
				
	this.lista_maos_obra = new ArrayList<Item>();
	
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
	p_3.add(new JLabel("<html>Coef. Prod. (Serviço/Tempo):<font color=red>*</font></html>"), cons);
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
	
	
		this.modelo_mao_obra = new DefaultTableModel(null, new String[]{"Nome", "Uni.", "Val/Uni (R$)", "Coef. Prod."}){
		
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
	
	this.tb_mao_obra.getColumnModel().getColumn(0).setPreferredWidth(400);
	this.tb_mao_obra.getColumnModel().getColumn(1).setPreferredWidth(100);
	this.tb_mao_obra.getColumnModel().getColumn(2).setPreferredWidth(100);
	this.tb_mao_obra.getColumnModel().getColumn(3).setPreferredWidth(100);
	
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
					

			FormAlteraQuantidade form = new FormAlteraQuantidade(lista_maos_obra.get(selecionado));
			form.mostrar();	
			

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
		
			for(Item aux: this.lista_maos_obra){
				
				if(mao_obra.getId_mao_de_obra() == Integer.parseInt(aux.getParamentro("id_modelo").toString())){
					
					
				Mensagens.msgDeErro("A mão de obra escolhida já foi adicionada.");
				Comuns.textFieldErroMode(this.tf_temp_mao_obra);
				return;	
				}
			}	
		
		String unidade_aux = "";
			
			if(mao_obra.getFk_unidade()>0){
		
			Unidade unidade  = new DAO<Unidade>(Unidade.class).get(mao_obra.getFk_unidade());
			
			if(unidade!=null)
			unidade_aux = unidade.getSimbolo();
			}	
			
		Item item = new Item();
		item.addParamentro("id_mao", this.idTempMao_obra);
		item.addParamentro("quant", this.tf_temp_coef_mao_obra.getText());
		item.addParamentro("preco", mao_obra.getValor_unitario());
		item.addParamentro("descricao", mao_obra.getDescricao());
		item.addParamentro("unidade", unidade_aux);
		item.addParamentro("codigo", mao_obra.getCodigo());
		item.addParamentro("id_modelo", this.idTempMao_obra);
		item.addParamentro("tipo", "MODELO");
		
			
		this.lista_maos_obra.add(item);
		
		this.atualizaTabelaDeMaoDeObra();
		
		this.tf_temp_coef_mao_obra.setText("");
		this.idTempMao_obra = 0;
		this.tf_temp_mao_obra.setText("");
		}		
	}
	
	
	
	
	
	
	
	
	protected void atualizaTabelaDeMaoDeObra(){		
		
	this.modelo_mao_obra.setNumRows(0);
	String[] dados = new String[4];
	
	this.total_mao_obra  ="0.00";
	
	
		for(Item aux: this.lista_maos_obra){
			
		this.total_mao_obra = Calculo.soma(this.total_mao_obra, 
					Calculo.multiplica(aux.getParamentro("preco").toString(), aux.getParamentro("quant").toString()));
					
		dados[0] = aux.getParamentro("descricao").toString();	
		dados[1] = aux.getParamentro("unidade").toString();	
		dados[2] = aux.getParamentro("preco").toString();
		dados[3] = Calculo.formataValor(aux.getParamentro("quant").toString());
		
		this.modelo_mao_obra.addRow(dados);
		}		
	
	
	this.lb_total_mao_obra.setText("Valor Total (R$): "+Calculo.formataValor(this.total_mao_obra));
	}
	
	
	
	

	
	
	private boolean acaoPrincipal(){ 
	
	if(!this.validacao())
	return false; 		
		
	if(this.item==null)
	return false;
	
	
		if(this.item.getSem_insumos()==null || this.item.getSem_insumos().compareTo("SIM")!=0){
		
		DAO<ItemXMaoDeObra> dao_x = new DAO<ItemXMaoDeObra>(ItemXMaoDeObra.class);	
			
			if(!dao_x.removeSemConfirmacao("fk_item="+this.item.getId_item())){
				
			Mensagens.msgDeErroAoAlterar();
			return false;
			}
		
			
			for(Item aux: this.lista_maos_obra){
				
			int id_mao = 0;	
					
				if(aux.getParamentro("tipo").toString().compareTo("MODELO")==0){
					
						
				Mao_De_Obra_Modelo mao = new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class).get(Integer.parseInt(aux.getParamentro("id_mao").toString()));	
						
					if(mao!= null){	
						
					Mao_De_Obra novo_mao  = mao.clona();
					id_mao = new DAO<Mao_De_Obra>(Mao_De_Obra.class).novo(novo_mao);
						
					if(id_mao<=0)
					return false;
					}
				}
				else
				id_mao = Integer.parseInt(aux.getParamentro("id_mao").toString());
				
				
			ItemXMaoDeObra itemXmaoObra = new ItemXMaoDeObra();
				
			itemXmaoObra.setFk_mao_obra(id_mao);
			itemXmaoObra.setFk_item(this.item.getId_item());
			itemXmaoObra.setQuantidade(aux.getParamentro("quant").toString());
						
			if(dao_x.novo(itemXmaoObra)<=0)
			return false;				
			}

		
		this.item.setValor_unitario(this.principal.setValor());
			
		if(!new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).altera(this.item))
		return false;
		}
	
	return true;
	}
	
	
	
	
	
	
	protected void atualiza(ItemDeOrcamento item){
	
	this.item = item;	
	
	this.lista_maos_obra.clear();
	
		if(this.item!=null){
		
		List<ItemXMaoDeObra> itensXMaoDeObra = new DAO<ItemXMaoDeObra>(ItemXMaoDeObra.class)
					.get(null, "ixmo.fk_item="+this.item.getId_item(), null);

		DAO<Mao_De_Obra> maoDAO = new DAO<Mao_De_Obra>(Mao_De_Obra.class);
		DAO<Unidade> unidadeDAO = new DAO<Unidade>(Unidade.class);
		
		
			for(ItemXMaoDeObra aux : itensXMaoDeObra){
			
			Mao_De_Obra mao_De_Obra = maoDAO.get(aux.getFk_mao_obra());
			
				if(mao_De_Obra !=null){
				
				Item aux_item = new Item();
				aux_item.addParamentro("id_mao", mao_De_Obra.getId_mao_de_obra());
				aux_item.addParamentro("quant", Calculo.formataValor(aux.getQuantidade()));
				aux_item.addParamentro("preco", mao_De_Obra.getValor_unitario());
				aux_item.addParamentro("descricao", mao_De_Obra.getDescricao());
				aux_item.addParamentro("codigo", mao_De_Obra.getCodigo());
				aux_item.addParamentro("id_modelo", mao_De_Obra.getFk_modelo());
				aux_item.addParamentro("tipo", "NORMAL");
					
					if(mao_De_Obra.getFk_unidade()>0){
						
					Unidade unidade  = unidadeDAO.get(mao_De_Obra.getFk_unidade());
						
					if(unidade!=null)
					aux_item.addParamentro("unidade", unidade.getSimbolo());
					}	
					
				this.lista_maos_obra.add(aux_item);
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


