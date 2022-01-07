package principal.detalhes;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cadastro.itens_de_orcamento.FormItensDeOrcamento;
import classes.CampoLimitado;
import classes.CampoMoeda;
import beans.Equipamento;
import beans.ItemDeOrcamento;
import beans.ItemXEquipamento;
import beans.ItemXMaoDeObra;
import beans.ItemXMaterial;
import beans.Mao_De_Obra;
import beans.Material;
import beans.modelos.Equipamento_Modelo;
import beans.modelos.ItemDeOrcamentoModelo;
import beans.modelos.ItemXEquipamentoModelo;
import beans.modelos.ItemXMaoDeObraModelo;
import beans.modelos.ItemXMaterialModelo;
import beans.modelos.Mao_De_Obra_Modelo;
import beans.modelos.Material_Modelo;
import componentes.FormDeSelecao;
import componentes.tabelas.MotorDePesquisa;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;





public class PainelDeDetalhesOrcamentoAnalitico extends JPanel{

	
private static final long serialVersionUID = 1L;



protected MotorDePesquisa<ItemDeOrcamento> motorDePesquisa;


private int idSubetapa;


private JButton bt_novo;
private JButton bt_alterar;
private JButton bt_deletar;


protected CampoLimitado tf_item;
protected CampoMoeda tf_quant;
protected int id_temp_item;

private JButton bt_add;	





	public PainelDeDetalhesOrcamentoAnalitico(){
	
	this.setLayout(new GridBagLayout());	
		
	this.adicionarComponentes();
	}
	


	
	
	
	private void adicionarComponentes(){
		
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;	
	cons.weightx= 1;
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 0, 2, 0, 0);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_1.setBorder(BorderFactory.createTitledBorder("Adicionar Itens"));  
	this.add(p_1, cons);
	
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.ipady = 19;
	cons.insets = new Insets( 0, 0, 0, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_2.setBorder(BorderFactory.createTitledBorder("Opções"));  
	this.add(p_2, cons);
	

	cons.ipady = 0;
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;	
	cons.weightx= 1;
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.weightx  = 0.7;
	p_1.add(new JLabel("<html>Item de Orçamento:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.3;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel("<html>QTDe:<font color=red>*</font></html>"), cons);
	
	cons.gridwidth  = 1;	
	cons.insets = new Insets( 2, 2, 2, 2);
	cons.weightx  = 0.7;
	p_1.add(this.tf_item = new CampoLimitado(250), cons);
	this.tf_item.setEditable(false);

	p_1.add(this.tf_quant = new CampoMoeda(10), cons);
		
	
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	bt_add = new JButton("Adicionar", new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_add.setToolTipText("Adicionar item ao orçamento.");
	p_1.add(bt_add, cons);

	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.gridwidth  = 1;	
	cons.anchor = GridBagConstraints.EAST;
	
	bt_novo = new JButton(new ImageIcon(getClass().getResource("/icons/novo_mini.png")));
	bt_novo.setToolTipText("Cadastrar novo item de orçamento.");
	p_2.add(bt_novo, cons);
	
	
	bt_alterar = new JButton(new ImageIcon(getClass().getResource("/icons/alterar_mini.png")));
	bt_alterar.setToolTipText("Alterar item selecionado.");
	p_2.add(bt_alterar, cons);
	
	
	bt_deletar = new JButton(new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_deletar.setToolTipText("Excluir item selecionado.");
	p_2.add(bt_deletar, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;	
	cons.weightx= 1;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel(""), cons);
	

	
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 1;
	cons.weightx = 1;	
	this.motorDePesquisa = new MotorDePesquisa<ItemDeOrcamento>("Itens de Orçamento", ItemDeOrcamento.class);
	this.motorDePesquisa.tableModel.setWhere("itns.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by itns.id_item DESC");
	this.add(this.motorDePesquisa, cons);		
	
	
	
	
	
		this.tf_item.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
		
		tf_quant.requestFocus();	
			
			if(idSubetapa>0){
				
			Comuns.removeIndicadoresDeErro(tf_item);
				
			ItemDeOrcamentoModelo retorno = new ItemDeOrcamentoModelo();
				
			FormDeSelecao<ItemDeOrcamentoModelo> selectionItemForm = 
							new FormDeSelecao<ItemDeOrcamentoModelo>("Adicionar Item", retorno, ItemDeOrcamentoModelo.class, "itns_mod.status='ATIVO'");
			selectionItemForm.mostrar();
				
				if(retorno != null && retorno.getId_item_modelo() > 0){
	
				id_temp_item = retorno.getId_item_modelo();
				tf_item.setText(retorno.getDescricao());
				}
			}
			else
			Mensagens.msgDeErro("Nenhuma subetapa de projeto selecionada.");
			
		}});
	
	
	

		
		bt_add.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
		
			if(idSubetapa>0){
			
			adicionarItem();
			
			motorDePesquisa.update();
			}
			else
			Mensagens.msgDeErro("Nenhuma subetapa de projeto selecionada.");
			
		}});
	
	
	
		
	
	
		bt_novo.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
		
			if(idSubetapa>0){
			
			FormItensDeOrcamento form = new FormItensDeOrcamento(idSubetapa, null);
			form.mostrar();
			
			motorDePesquisa.update();
			}
			else
			Mensagens.msgDeErro("Nenhuma subetapa de projeto selecionada.");
			
		}});
	
	
	
		
		
		
		bt_alterar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		alterarItem();
		}});
	
	
		
		
		
		
		bt_deletar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		
		ItemDeOrcamento selectedItem= (ItemDeOrcamento) motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
			
			if(selectedItem != null){
			
			
			if(new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).desativar(selectedItem.getId_item()))
			motorDePesquisa.update();
			}
			else
			Mensagens.msgDeErro("Selecione uma linha da tabela de itens para exclusão.");	
			
			
			
		}});
	
		
		
		
		
		
		
		motorDePesquisa.table.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
			
			if(e.getClickCount()==2)
			alterarItem();
			
			}}); 
		
		
		
		
		
	atualiza(0);
	}



	
	

	public void atualiza(int idSubetapa){
	
	boolean ativar = false;
	
		if(idSubetapa>0){
		
		this.idSubetapa = idSubetapa;
		ativar = true;
		}
		else
		this.idSubetapa = -1;	
	
	
	this.motorDePesquisa.tableModel.setWhere("itns.fk_subetapa="+this.idSubetapa+" AND itns.status='ATIVO'");	
	this.motorDePesquisa.update();	
		
	this.opcoesHabilitadas(ativar);
	}
	
	
	
	
	
	
	public void alterarItem(){
		
	ItemDeOrcamento selectedItem= (ItemDeOrcamento) motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormItensDeOrcamento form = new FormItensDeOrcamento(idSubetapa, new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).get(selectedItem.getId_item()));	
		form.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de itens para alteração.");	
		
	}
	
	
	
	
	
	
	public void opcoesHabilitadas( boolean opcao){

	tf_item.setEnabled(opcao);
	tf_quant.setEnabled(opcao);
	id_temp_item = 0;	
	bt_add.setEnabled(opcao);
	
	bt_novo.setEnabled(opcao);
	bt_alterar.setEnabled(opcao);
	bt_deletar.setEnabled(opcao);
	}
	
	
	
	
	
	public void adicionarItem(){
		
	
		if(this.id_temp_item<=0){
			
		Mensagens.msgDeErro("Selecione um item de orçamento para adicioná-la.");
		Comuns.textFieldErroMode(this.tf_item);
		return;	
		}

			
		if(this.tf_quant.getText().length()==0){
				
		Mensagens.msgDeErro("Informe a quantidade do item selecionado.");
		Comuns.textFieldErroMode(this.tf_quant);
		return;	
		}
			
		
	ItemDeOrcamentoModelo modelo = new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class).get(this.id_temp_item);	
			
	if(modelo== null)
	return;
			
		for(ItemDeOrcamento aux: this.motorDePesquisa.tableModel.linhas){
					
			if(aux.getFk_modelo()==modelo.getId_item_modelo()){
					
			Mensagens.msgDeErro("O item escolhido já foi adicionado anteriormente.");
			Comuns.textFieldErroMode(this.tf_item);
			return;	
			}
		}	
	
	ItemDeOrcamento	novo_item = modelo.clona(this.tf_quant.getText(), this.idSubetapa);
			
	int id = new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).novo(novo_item);
	
	if(id==0)
	return;
	
	novo_item.setId_item(id);
	
	
	List<ItemXMaterialModelo> itens_x_materiais_modelo = new DAO<ItemXMaterialModelo>(ItemXMaterialModelo.class).get(null, "ixm_mod.fk_item="+modelo.getId_item_modelo(), null);
	
	DAO<Material> dao_material = new DAO<Material>(Material.class);
	DAO<Material_Modelo> dao_material_modelo = new DAO<Material_Modelo>(Material_Modelo.class);
	DAO<ItemXMaterial> dao_IteXMat = new DAO<ItemXMaterial>(ItemXMaterial.class);
	
		for(ItemXMaterialModelo aux: itens_x_materiais_modelo){
		
		Material_Modelo material_modelo = dao_material_modelo.get(aux.getFk_material()); 	
		
			if(material_modelo!=null){
				
			id = dao_material.novo(material_modelo.clona());
	
			
			ItemXMaterial	item = new ItemXMaterial();
			
			item.setFk_item(novo_item.getId_item());
			item.setFk_material(id);
			item.setQuantidade(aux.getQuantidade());
			
			dao_IteXMat.novo(item);	
			}
		}	
		
	
	List<ItemXMaoDeObraModelo> item_x_mao_obra_modelo = new DAO<ItemXMaoDeObraModelo>(ItemXMaoDeObraModelo.class).get(null, "ixm_o_mod.fk_item="+modelo.getId_item_modelo(), null);
	
	DAO<Mao_De_Obra> dao_mao_de_obra = new DAO<Mao_De_Obra>(Mao_De_Obra.class);
	DAO<Mao_De_Obra_Modelo> dao_mao_de_obra_modelo = new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class);
	DAO<ItemXMaoDeObra> dao_IteXMaodOb = new DAO<ItemXMaoDeObra>(ItemXMaoDeObra.class);
	
		for(ItemXMaoDeObraModelo aux: item_x_mao_obra_modelo){
		
		Mao_De_Obra_Modelo mao_de_obra_modelo = dao_mao_de_obra_modelo.get(aux.getFk_mao_obra()); 	
		
			if(mao_de_obra_modelo!=null){
				
			id = dao_mao_de_obra.novo(mao_de_obra_modelo.clona());
	
			ItemXMaoDeObra	item = new ItemXMaoDeObra();
			
			item.setFk_item(novo_item.getId_item());
			item.setFk_mao_obra(id);
			item.setQuantidade(aux.getQuantidade());
			
			dao_IteXMaodOb.novo(item);	
			}
		}	
		
		

	List<ItemXEquipamentoModelo> item_x_equipamentos_modelo = new DAO<ItemXEquipamentoModelo>(ItemXEquipamentoModelo.class).get(null, "ixeq_mod.fk_item="+modelo.getId_item_modelo(), null);
	
	DAO<Equipamento> dao_equipamento = new DAO<Equipamento>(Equipamento.class);
	DAO<Equipamento_Modelo> dao_equipamento_modelo = new DAO<Equipamento_Modelo>(Equipamento_Modelo.class);
	DAO<ItemXEquipamento> dao_IteXequi = new DAO<ItemXEquipamento>(ItemXEquipamento.class);
	
		for(ItemXEquipamentoModelo aux: item_x_equipamentos_modelo){
		
		Equipamento_Modelo equipamento_modelo = dao_equipamento_modelo.get(aux.getFk_equipamento()); 	
		
			if(equipamento_modelo!=null){
				
			id = dao_equipamento.novo(equipamento_modelo.clona());
	
			ItemXEquipamento item = new ItemXEquipamento();
			
			item.setFk_item(novo_item.getId_item());
			item.setFk_equipamento(id);
			item.setQuantidade(aux.getQuantidade());
			
			dao_IteXequi.novo(item);	
			}
		}
	
	this.atualiza(this.idSubetapa);
			
	this.tf_item.setText("");
	this.id_temp_item = 0;
	this.tf_quant.setText("");
	}
	
	
	
	
	
}
