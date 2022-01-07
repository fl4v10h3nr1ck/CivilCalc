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

import beans.Equipamento;
import beans.Item;
import beans.ItemDeOrcamento;
import beans.ItemXEquipamento;
import beans.Unidade;
import beans.modelos.Equipamento_Modelo;
import cadastro.FormAlteraQuantidade;
import cadastro.modelos.equipamentos.FormNovoEquipamentoModelo;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.FormDeSelecao;
import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;



public class PainelDeEquipamentos extends JPanel{

	
	
private static final long serialVersionUID = 1L;


protected JTable tb_equipamento;
protected DefaultTableModel modelo_equipamento;
protected CampoLimitado tf_temp_equipamento;
protected CampoMoeda tf_temp_quant_equipamento;
protected int idTempEquipamento;
protected List<Item> lista_equipamentos;


protected JLabel lb_total_equipamento;

protected String total_equipamento;


private ItemDeOrcamento item;

private FormItensDeOrcamento principal;


private JButton bt_save;
private JButton bt_excluir_equipamento;
private JButton bt_add_equipamento;
private JButton bt_novo_equi;



	public PainelDeEquipamentos(ItemDeOrcamento item, FormItensDeOrcamento principal) {
				
	this.lista_equipamentos = new ArrayList<Item>();
	
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
	JPanel p_4 = new JPanel(new GridBagLayout());
	p_4.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	this.add(p_4, cons);
	
	cons.fill = GridBagConstraints.NONE;
	cons.gridwidth  = 1;
	cons.weightx = 0;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_4.add(new JLabel(""), cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 0.7;
	p_4.add(new JLabel("<html>Equipamento:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.3;
	p_4.add(new JLabel("<html>QTDe:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	p_4.add(new JLabel(""), cons);
	
	
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.gridwidth  = 1;
	this.bt_novo_equi  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_novo_equi.setToolTipText("Cadastrar novo equipamento");
	p_4.add(bt_novo_equi, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 0.7;
	p_4.add(this.tf_temp_equipamento = new CampoLimitado(45), cons);
	this.tf_temp_equipamento.setEditable(false);
	
	cons.weightx  = 0.3;
	p_4.add(this.tf_temp_quant_equipamento = new CampoMoeda(8), cons);	

	
	cons.fill = GridBagConstraints.NONE;
	cons.ipadx = 5;
	cons.weightx = 0;
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	this.bt_add_equipamento  = new JButton("Adicionar", new ImageIcon(getClass().getResource("/icons/novo_mini.png")));
	bt_add_equipamento.setToolTipText("Adicionar equipamento selecionado");
	p_4.add(bt_add_equipamento, cons);
	
	
		this.modelo_equipamento = new DefaultTableModel(null, new String[]{"Nome", "Uni", "Val/Uni (R$)", "QTDe"}){
		
		private static final long serialVersionUID = 1L;
		
		public boolean isCellEditable(int row, int col ){  
		            
		return false;
		}};


	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	p_4.add(new JScrollPane(this.tb_equipamento=new JTable(this.modelo_equipamento)), cons);
	this.tb_equipamento.setRowHeight(25);
	
	this.tb_equipamento.getColumnModel().getColumn(0).setPreferredWidth(500);
	this.tb_equipamento.getColumnModel().getColumn(1).setPreferredWidth(100);
	this.tb_equipamento.getColumnModel().getColumn(2).setPreferredWidth(100);
	this.tb_equipamento.getColumnModel().getColumn(3).setPreferredWidth(100);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.ipadx = 0;
	cons.weightx = 1;
	cons.weighty  = 0;
	JPanel p_5 = new JPanel(new GridBagLayout());
	p_5.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_4.add(p_5, cons);
	
	
	cons.anchor= GridBagConstraints.WEST;
	cons.weightx = 1;
	cons.gridwidth  = 1;
	cons.insets = new Insets( 0, 2, 0, 2);
	p_5.add(this.lb_total_equipamento = new JLabel("Valor Total (R$): 0,00"), cons);
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	cons.anchor= GridBagConstraints.EAST;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.ipadx = 10;
	cons.insets = new Insets( 0, 0, 0, 0);
	this.bt_excluir_equipamento  = new JButton("Remover", new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_excluir_equipamento.setToolTipText("Remover equipamento selecionado");
	p_5.add(bt_excluir_equipamento, cons);
	

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
			

	
		
		this.tf_temp_equipamento.addMouseListener( new MouseAdapter(){			
		@Override
		public void mouseClicked(MouseEvent e) {
						
		Comuns.removeIndicadoresDeErro(tf_temp_equipamento);
					
		tf_temp_quant_equipamento.requestFocus();
					
		Equipamento_Modelo retorno = new Equipamento_Modelo();
			
		FormDeSelecao<Equipamento_Modelo> selectionItemForm = 
						new FormDeSelecao<Equipamento_Modelo>("Adicionar Equipamento", retorno, Equipamento_Modelo.class, "eqp_m.status='ATIVO'");
		selectionItemForm.mostrar();
			
			
			if(retorno != null && retorno.getId_equipamento() > 0){
			
			idTempEquipamento = retorno.getId_equipamento();
			tf_temp_equipamento.setText(retorno.getDescricao());
			}
		}});
			
				
			
			

		bt_add_equipamento.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		addEquipamento();
		}});
			
			
		
		
		

		bt_excluir_equipamento.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			
		int selecionado = tb_equipamento.getSelectedRow();
				
			if(selecionado>=0){
					
			lista_equipamentos.remove(selecionado);
				
			atualizaTabelaDeEquipamentos();
			}
			else
			Mensagens.msgDeErro("Selecione um equipamento para remoção.");	
		
		}});
			

		
		
		this.tb_equipamento.addMouseListener(new MouseAdapter(){
		@Override
		public void mouseClicked(MouseEvent e) {
					
			if(e.getClickCount()==2){	
					
			int selecionado = tb_equipamento.getSelectedRow();	

			FormAlteraQuantidade form = new FormAlteraQuantidade(lista_equipamentos.get(selecionado));
			form.mostrar();	
			
			atualizaTabelaDeEquipamentos();
			}		
		}}); 	
		
	

		
		this.bt_novo_equi.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		Equipamento_Modelo equipamento = new Equipamento_Modelo();
		FormNovoEquipamentoModelo form = new FormNovoEquipamentoModelo(equipamento);	
		form.mostrar();
			
			if(equipamento.getId_equipamento()>0){
			
			idTempEquipamento = equipamento.getId_equipamento();
			tf_temp_equipamento.setText(equipamento.getDescricao());
			}
		}});
		
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
			
	textFieldList.add(this.tf_temp_equipamento);
	textFieldList.add(this.tf_temp_quant_equipamento);
		
	Comuns.addEventoDeFoco(textFieldList);
	}


		
		
		

	protected boolean validacao(){
				
	return true;	
	}
		
		
			


	
	
	private void addEquipamento(){
		

		if(this.idTempEquipamento<=0){
			
		Mensagens.msgDeErro("Selecione um equipamento.");
		Comuns.textFieldErroMode(this.tf_temp_equipamento);
		return;	
		}

		
		if(this.tf_temp_quant_equipamento.getText().length()==0){
			
		Mensagens.msgDeErro("Informe a quantidade do equipamento selecionado.");
		Comuns.textFieldErroMode(this.tf_temp_quant_equipamento);
		return;	
		}
		
	
	Equipamento_Modelo equipamento = new DAO<Equipamento_Modelo>(Equipamento_Modelo.class).get(this.idTempEquipamento);	
		
		if(equipamento!= null){
		
			for(Item aux: this.lista_equipamentos){
				
				if(equipamento.getId_equipamento() == Integer.parseInt(aux.getParamentro("id_modelo").toString())){
					
				Mensagens.msgDeErro("O equipamento já foi adicionado.");
				Comuns.textFieldErroMode(this.tf_temp_equipamento);
				return;	
				}
			}	
		
		String unidade_aux = "";
			
			if(equipamento.getFk_unidade()>0){
		
			Unidade unidade  = new DAO<Unidade>(Unidade.class).get(equipamento.getFk_unidade());
			
			if(unidade!=null)
			unidade_aux = unidade.getSimbolo();
			}	
			
		Item item = new Item();
		item.addParamentro("id_equipamento", this.idTempEquipamento);
		item.addParamentro("quant", this.tf_temp_quant_equipamento.getText());
		item.addParamentro("preco", equipamento.getValor_unitario());
		item.addParamentro("descricao", equipamento.getDescricao());
		item.addParamentro("unidade", unidade_aux);
		item.addParamentro("codigo", equipamento.getCodigo());
		item.addParamentro("id_modelo", this.idTempEquipamento);
		item.addParamentro("tipo", "MODELO");
		
			
		this.lista_equipamentos.add(item);
		
		this.atualizaTabelaDeEquipamentos();
	
		this.tf_temp_equipamento.setText("");
		this.idTempEquipamento = 0;
		this.tf_temp_quant_equipamento.setText("");
		}		
	}
	
	
	
	
	

	
	
	protected void atualizaTabelaDeEquipamentos(){		
		
	this.modelo_equipamento.setNumRows(0);
	String[] dados = new String[4];
	
	this.total_equipamento = "0.00";
	
		for(Item aux: this.lista_equipamentos){
		
		this.total_equipamento = Calculo.soma(this.total_equipamento, 
				Calculo.multiplica(aux.getParamentro("preco").toString(), aux.getParamentro("quant").toString()));
		
		dados[0] = aux.getParamentro("descricao").toString();	
		dados[1] = aux.getParamentro("unidade").toString();	
		dados[2] = aux.getParamentro("preco").toString();
		dados[3] = Calculo.formataValor(aux.getParamentro("quant").toString());
		
		this.modelo_equipamento.addRow(dados);
		}		


	this.lb_total_equipamento.setText("Valor Total (R$): "+Calculo.formataValor(total_equipamento));
	}
	
	
	
	
	

	
	
	private boolean acaoPrincipal(){ 
	
	if(!this.validacao())
	return false; 		
		
	if(this.item==null)
	return false;
	
	
		if(this.item.getSem_insumos()==null || this.item.getSem_insumos().compareTo("SIM")!=0){
		
		DAO<ItemXEquipamento> dao_x = new DAO<ItemXEquipamento>(ItemXEquipamento.class);		
		DAO<Equipamento_Modelo> dao_equi_modelo = new DAO<Equipamento_Modelo>(Equipamento_Modelo.class);		
		DAO<Equipamento> dao_equi = new DAO<Equipamento>(Equipamento.class);
		
			if(!dao_x.removeSemConfirmacao("fk_item="+this.item.getId_item())){
				
			Mensagens.msgDeErroAoAlterar();
			return false;	
			}	
			
			
			for(Item aux: this.lista_equipamentos){
				
			int id_equipamento = 0;	
					
				if(aux.getParamentro("tipo").toString().compareTo("MODELO")==0){
							
				Equipamento_Modelo equipamento = dao_equi_modelo.get(Integer.parseInt(aux.getParamentro("id_equipamento").toString()));	
						
					if(equipamento!= null){	
						
					Equipamento novo_equipamento  = equipamento.clona();
					id_equipamento = dao_equi.novo(novo_equipamento);
						
					if(id_equipamento<=0)
					return false;
					}
				}
				else
				id_equipamento = Integer.parseInt(aux.getParamentro("id_equipamento").toString());
				
				
			ItemXEquipamento	itemXequipamento = new ItemXEquipamento();
					
			itemXequipamento.setFk_equipamento(id_equipamento);
			itemXequipamento.setFk_item(this.item.getId_item());
			itemXequipamento.setQuantidade(aux.getParamentro("quant").toString());
					
			if(dao_x.novo(itemXequipamento)<=0)
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
	
	this.lista_equipamentos.clear();
	
		if(this.item!=null){
		
		List<ItemXEquipamento> itensXEquipamentos = new DAO<ItemXEquipamento>(ItemXEquipamento.class)
					.get(null, "ixeq.fk_item="+this.item.getId_item(), null);
	
		DAO<Equipamento> materialDAO = new DAO<Equipamento>(Equipamento.class);
		DAO<Unidade> unidadeDAO = new DAO<Unidade>(Unidade.class);
		
			for(ItemXEquipamento aux : itensXEquipamentos){
			
			Equipamento equipamento = materialDAO.get(aux.getFk_equipamento());

				if(equipamento !=null){

				Item aux_item = new Item();
				aux_item.addParamentro("id_equipamento", equipamento.getId_equipamento());
				aux_item.addParamentro("quant", Calculo.formataValor(aux.getQuantidade()));
				aux_item.addParamentro("preco", equipamento.getValor_unitario());
				aux_item.addParamentro("descricao", equipamento.getDescricao());
				aux_item.addParamentro("codigo", equipamento.getCodigo());
				aux_item.addParamentro("id_modelo", equipamento.getFk_modelo());
				aux_item.addParamentro("tipo", "NORMAL");
				
					if(equipamento.getFk_unidade()>0){
					
					Unidade unidade  = unidadeDAO.get(equipamento.getFk_unidade());
					
					if(unidade!=null)
					aux_item.addParamentro("unidade", unidade.getSimbolo());
					}	
				
				this.lista_equipamentos.add(aux_item);
				}
			}

		this.atualizaTabelaDeEquipamentos();	
		
			if(this.item.getSem_insumos()!=null && 
					this.item.getSem_insumos().compareTo("SIM")==0){
			
			
			this.bt_excluir_equipamento.setEnabled(false);
			this.bt_add_equipamento.setEnabled(false);
			this.bt_save.setEnabled(false);
			this.bt_novo_equi.setEnabled(false);
			}
			else{
				
			this.bt_excluir_equipamento.setEnabled(true);
			this.bt_add_equipamento.setEnabled(true);
			this.bt_save.setEnabled(true);
			this.bt_novo_equi.setEnabled(true);
			}
		}
	}



	
	
}	


