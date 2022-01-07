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
import beans.ItemXMaterial;
import beans.Material;
import beans.Unidade;
import beans.modelos.Material_Modelo;
import cadastro.FormAlteraQuantidade;
import cadastro.modelos.materiais.FormNovoMaterialModelo;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.FormDeSelecao;
import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;


public class PainelDeMateriais extends JPanel{

	
	
private static final long serialVersionUID = 1L;


private JTable tb_materiais;
private DefaultTableModel modelo_materiais;
private CampoLimitado tf_temp_material;
private CampoMoeda tf_temp_quant_materiais;
private int idTempMaterial;
private List<Item> lista_materiais;

protected JLabel lb_total_material;

protected String total_material;

private ItemDeOrcamento item;

private FormItensDeOrcamento principal;


private JButton bt_excluir_material;
private JButton bt_add_material;
private JButton bt_save;
private JButton bt_novo_material;



	public PainelDeMateriais(ItemDeOrcamento item, FormItensDeOrcamento principal) {
				
	this.lista_materiais = new ArrayList<Item>();

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
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	this.add(p_2, cons);
	
	cons.fill = GridBagConstraints.NONE;
	cons.gridwidth  = 1;
	cons.weightx = 0;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel(""), cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 0.9;
	p_2.add(new JLabel("<html>Material:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.1;
	p_2.add(new JLabel("<html>QTDe:<font color=red>*</font></html>"), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	p_2.add(new JLabel(""), cons);
	
	
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.gridwidth  = 1;
	this.bt_novo_material  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_novo_material.setToolTipText("Cadastrar novo material");
	p_2.add(bt_novo_material, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 0.9;
	p_2.add(this.tf_temp_material = new CampoLimitado(45), cons);
	this.tf_temp_material.setEditable(false);
	
	cons.weightx  = 0.1;
	p_2.add(this.tf_temp_quant_materiais = new CampoMoeda(8), cons);	

	
	cons.fill = GridBagConstraints.NONE;
	cons.ipadx = 5;
	cons.weightx = 0;
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	this.bt_add_material  = new JButton("Adicionar", new ImageIcon(getClass().getResource("/icons/novo_mini.png")));
	bt_add_material.setToolTipText("Adicionar material selecionado");
	p_2.add(bt_add_material, cons);
	
	
	this.modelo_materiais = new DefaultTableModel(null, new String[]{"Nome", "Uni.", "Val/Uni (R$)", "QTDe"}){
		
		private static final long serialVersionUID = 1L;
		
		public boolean isCellEditable(int row, int col ){  
		            
		return false;
		}};


	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	p_2.add(new JScrollPane(this.tb_materiais=new JTable(this.modelo_materiais)), cons);
	this.tb_materiais.setRowHeight(25);
	
	this.tb_materiais.getColumnModel().getColumn(0).setPreferredWidth(400);
	this.tb_materiais.getColumnModel().getColumn(1).setPreferredWidth(100);
	this.tb_materiais.getColumnModel().getColumn(2).setPreferredWidth(100);
	this.tb_materiais.getColumnModel().getColumn(3).setPreferredWidth(100);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.ipadx = 0;
	cons.weightx = 1;
	cons.weighty  = 0;
	JPanel p_3 = new JPanel(new GridBagLayout());
	p_3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_2.add(p_3, cons);
	
	
	cons.anchor= GridBagConstraints.WEST;
	cons.weightx = 1;
	cons.gridwidth  = 1;
	cons.insets = new Insets( 0, 2, 0, 2);
	p_3.add(this.lb_total_material = new JLabel("Valor Total (R$): 0,00"), cons);
	
	
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	cons.anchor= GridBagConstraints.EAST;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.ipadx = 10;
	cons.insets = new Insets( 0, 0, 0, 0);
	this.bt_excluir_material  = new JButton("Remover", new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_excluir_material.setToolTipText("Remover material selecionado");
	p_3.add(bt_excluir_material, cons);

	
	
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
			

		
		
		this.tf_temp_material.addMouseListener( new MouseAdapter(){			
		@Override
		public void mouseClicked(MouseEvent e) {
						
		Comuns.removeIndicadoresDeErro(tf_temp_material);
			
		tf_temp_quant_materiais.requestFocus();
					
		Material_Modelo retorno = new Material_Modelo();
		
		FormDeSelecao<Material_Modelo> selectionItemForm = 
						new FormDeSelecao<Material_Modelo>("Adicionar Material (Modelo)", retorno, Material_Modelo.class, "mat_m.status='ATIVO'");
		selectionItemForm.mostrar();
			
			
			if(retorno != null && retorno.getId_material() > 0){
			
			idTempMaterial = retorno.getId_material();
			tf_temp_material.setText(retorno.getDescricao());
			
			}
		}});
			

				
		
		bt_add_material.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		addMaterial();
		}});
		
		
		

		bt_excluir_material.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
		
		int selecionado = tb_materiais.getSelectedRow();
			
			if(selecionado>=0){
				
			lista_materiais.remove(selecionado);
			
			atualizaTabelaDeMaterial();
			}
			else
			Mensagens.msgDeErro("Selecione um material para remoção.");	
	
		}});
		

		
		
		this.tb_materiais.addMouseListener(new MouseAdapter(){
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(e.getClickCount()==2){	
			
			int selecionado = tb_materiais.getSelectedRow();	
				

			FormAlteraQuantidade form = new FormAlteraQuantidade(lista_materiais.get(selecionado));
			form.mostrar();	
			
			atualizaTabelaDeMaterial();
			}	
		}}); 	
			
			
		
		
		this.bt_novo_material.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		Material_Modelo material = new Material_Modelo();
		FormNovoMaterialModelo form = new FormNovoMaterialModelo(material);	
		form.mostrar();
			
			if(material.getId_material()>0){
			
			idTempMaterial = material.getId_material();
			tf_temp_material.setText(material.getDescricao());
			}
		}});
		
		
		
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
			
	textFieldList.add(this.tf_temp_material);
	
		
	Comuns.addEventoDeFoco(textFieldList);
	}


		
		
		

	protected boolean validacao(){
				
	return true;	
	}
		
		
			

	
	
	

	private void addMaterial(){
	
		
		if(this.idTempMaterial<=0){
			
		Mensagens.msgDeErro("Selecione um material.");
		Comuns.textFieldErroMode(this.tf_temp_material);
		return;	
		}

		
		if(this.tf_temp_quant_materiais.getText().length()==0){
			
		Mensagens.msgDeErro("Informe a quantidade do material selecionado.");
		Comuns.textFieldErroMode(this.tf_temp_quant_materiais);
		return;	
		}
		
	
	Material_Modelo material = new DAO<Material_Modelo>(Material_Modelo.class).get(this.idTempMaterial);	
		
		if(material!= null){
		
			for(Item aux: this.lista_materiais){
				
				if(material.getId_material() == Integer.parseInt(aux.getParamentro("id_modelo").toString())){
				
				Mensagens.msgDeErro("O material escolhido já foi adicionado.");
				Comuns.textFieldErroMode(this.tf_temp_material);
				return;	
				}
			}	
		
			
		String unidade_aux = "";
			
			if(material.getFk_unidade()>0){
		
			Unidade unidade  = new DAO<Unidade>(Unidade.class).get(material.getFk_unidade());
			
			if(unidade!=null)
			unidade_aux = unidade.getSimbolo();
			}	
			
		Item item = new Item();
		item.addParamentro("id_material", this.idTempMaterial);
		item.addParamentro("quant", this.tf_temp_quant_materiais.getText());
		item.addParamentro("preco", material.getValor_unitario());
		item.addParamentro("descricao", material.getDescricao());
		item.addParamentro("unidade", unidade_aux);
		item.addParamentro("codigo", material.getCodigo());
		item.addParamentro("id_modelo", this.idTempMaterial);
		item.addParamentro("tipo", "MODELO");
		
			
		this.lista_materiais.add(item);
		
		
		this.atualizaTabelaDeMaterial();
		
		this.tf_temp_quant_materiais.setText("");
		this.idTempMaterial = 0;
		this.tf_temp_material.setText("");
		}
	}	
	
		
	
	
	
	
	
	protected void atualizaTabelaDeMaterial(){		
		
	this.modelo_materiais.setNumRows(0);
	String[] dados = new String[4];
	
	this.total_material = "0.00";
	
		for(Item aux: this.lista_materiais){
		
		this.total_material = Calculo.soma(this.total_material, 
				Calculo.multiplica(aux.getParamentro("preco").toString(), aux.getParamentro("quant").toString()));
		
		dados[0] = aux.getParamentro("descricao").toString();	
		dados[1] = aux.getParamentro("unidade").toString();	
		dados[2] = aux.getParamentro("preco").toString();
		dados[3] = Calculo.formataValor(aux.getParamentro("quant").toString());
		
		this.modelo_materiais.addRow(dados);
		}		
	
	this.lb_total_material.setText("Valor Total (R$): "+Calculo.formataValor(this.total_material));
	}
	
	
	

	
	
	private boolean acaoPrincipal(){ 
	
	if(!this.validacao())
	return false; 		
		
	if(this.item==null)
	return false;
	
	
		if(this.item.getSem_insumos()==null || this.item.getSem_insumos().compareTo("SIM")!=0){
		
		DAO<ItemXMaterial> dao_x = new DAO<ItemXMaterial>(ItemXMaterial.class);	
			
			if(!dao_x.removeSemConfirmacao("fk_item="+this.item.getId_item())){
				
			Mensagens.msgDeErroAoAlterar();
			return false;
			}
		
			
			for(Item aux: this.lista_materiais){
			
			int id_material = 0;	
				
				if(aux.getParamentro("tipo").toString().compareTo("MODELO")==0){
				
					
				Material_Modelo material = new DAO<Material_Modelo>(Material_Modelo.class).get(Integer.parseInt(aux.getParamentro("id_material").toString()));	
					
					if(material!= null){	
					
					Material novo_material  = material.clona();
					id_material = new DAO<Material>(Material.class).novo(novo_material);
					
					if(id_material<=0)
					return false;
					}
				}
				else
				id_material = Integer.parseInt(aux.getParamentro("id_material").toString());
			
			
			ItemXMaterial	itemXmaterial = new ItemXMaterial();
				
			itemXmaterial.setFk_material(id_material);
			itemXmaterial.setFk_item(this.item.getId_item());
			itemXmaterial.setQuantidade(aux.getParamentro("quant").toString());
				
			if(new DAO<ItemXMaterial>(ItemXMaterial.class).novo(itemXmaterial)<=0)
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
	
	this.lista_materiais.clear();
	
		if(this.item!=null){
		
		List<ItemXMaterial> itensXMateriais = new DAO<ItemXMaterial>(ItemXMaterial.class)
					.get(null, "ixm.fk_item="+this.item.getId_item(), null);

		DAO<Material> materialDAO = new DAO<Material>(Material.class);
		DAO<Unidade> unidadeDAO = new DAO<Unidade>(Unidade.class);

			for(ItemXMaterial aux : itensXMateriais){

			Material material = materialDAO.get(aux.getFk_material());

				if(material !=null){

				Item aux_item = new Item();
				aux_item.addParamentro("id_material", material.getId_material());
				aux_item.addParamentro("quant", Calculo.formataValor(aux.getQuantidade()));
				aux_item.addParamentro("preco", material.getValor_unitario());
				aux_item.addParamentro("descricao", material.getDescricao());
				aux_item.addParamentro("codigo", material.getCodigo());
				aux_item.addParamentro("id_modelo", material.getFk_modelo());
				aux_item.addParamentro("tipo", "NORMAL");
				
					if(material.getFk_unidade()>0){
					
					Unidade unidade  = unidadeDAO.get(material.getFk_unidade());
					
					if(unidade!=null)
					aux_item.addParamentro("unidade", unidade.getSimbolo());
					}	
				
				this.lista_materiais.add(aux_item);
				}
			}

		this.atualizaTabelaDeMaterial();	
		
		
			if(this.item.getSem_insumos()!=null && 
						this.item.getSem_insumos().compareTo("SIM")==0){
				
				
			this.bt_excluir_material.setEnabled(false);
			this.bt_add_material.setEnabled(false);
			this.bt_save.setEnabled(false);
			this.bt_novo_material.setEnabled(false);
			}
			else{
				
			this.bt_excluir_material.setEnabled(true);
			this.bt_add_material.setEnabled(true);
			this.bt_save.setEnabled(true);
			this.bt_novo_material.setEnabled(true);
			}
		}
	}



}	

