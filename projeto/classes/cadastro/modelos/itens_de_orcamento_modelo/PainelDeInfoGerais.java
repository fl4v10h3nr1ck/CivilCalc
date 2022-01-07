package cadastro.modelos.itens_de_orcamento_modelo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import beans.Unidade;
import beans.modelos.ItemDeOrcamentoModelo;
import beans.modelos.ItemXEquipamentoModelo;
import beans.modelos.ItemXMaoDeObraModelo;
import beans.modelos.ItemXMaterialModelo;
import cadastro.unidade.FormNovaUnidade;
import classes.CampoLimitado;
import classes.CampoMoeda;
import componentes.FormDeSelecao;
import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;


public class PainelDeInfoGerais extends JPanel{

	
	
private static final long serialVersionUID = 1L;

private JCheckBox chk_sem_insumos;

private CampoLimitado tf_codigo;
private CampoLimitado tf_nome;
protected CampoMoeda tf_val_unitario;

private CampoLimitado tf_unidade;
private int idUnidade;



private ItemDeOrcamentoModelo item;

private FormItensDeOrcamentoModelo principal;





	public PainelDeInfoGerais(ItemDeOrcamentoModelo item, FormItensDeOrcamentoModelo principal) {
				
	this.item = item;
	
	this.principal = principal;
	
	this.setLayout(new GridBagLayout());
	
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);

	this.adicionarComponentes();
	
		if(this.item!=null){
	
		this.tf_codigo.setText(this.item.getCodigo());
		this.tf_nome.setText(this.item.getDescricao());	
		this.tf_val_unitario.setText(Calculo.formataValor(this.item.getValor_unitario()));
		
		this.chk_sem_insumos.setSelected(this.item.getSem_insumos()!=null && this.item.getSem_insumos().compareTo("SIM")==0);
	
	
			if(this.item.getFk_unidade()>0){
			
			Unidade unidade  = new DAO<Unidade>(Unidade.class).get(this.item.getFk_unidade());
			
				if(unidade !=null){
					
				this.idUnidade = unidade.getId_unidade();
				this.tf_unidade.setText(unidade.getDescricao());
				}
			}
		}
	}


		
		
	
	public void adicionarComponentes() {
			
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
	this.add(p_1, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 1;
	cons.weighty = 0;
	cons.insets = new Insets( 4, 2, 5, 2);
	p_1.add(this.chk_sem_insumos = new JCheckBox("Sem Insumos Definidos.", false), cons);
	this.chk_sem_insumos.setOpaque(false);
	cons.insets = new Insets( 2, 0, 15, 0);
	p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);
		
			
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.weightx  = 0.3;
	p_1.add(new JLabel("Valor Unitário (R$) (sem BDI e sem SL):"), cons);
	
	cons.weightx  = 0.7;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel(""), cons);
	

	cons.gridwidth  = 1;
	cons.weightx  = 0.3;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_1.add(this.tf_val_unitario = new CampoMoeda(12), cons);
	this.tf_val_unitario.setEditable(false);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.7;
	p_1.add(new JLabel(""), cons);
	
	

	cons.gridwidth  = 1;
	cons.weightx  = 0.3;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("<html>Código:<font color=red>*</font></html>"), cons);
	cons.weightx  = 0.7;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel("<html>Nome:<font color=red>*</font></html>"), cons);
	
	
	cons.gridwidth  = 1;
	cons.weightx  = 0.3;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_1.add(this.tf_codigo = new CampoLimitado(45), cons);
	this.tf_codigo.setEnabled(false);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.7;
	p_1.add(this.tf_nome = new CampoLimitado(240), cons);
	
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.weightx  = 0.3;
	p_1.add(new JLabel("<html>Unidade:<font color=red>*</font></html>"), cons);
	
	cons.weightx  = 0.7;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel(""), cons);
	

	cons.gridwidth  = 1;
	cons.weightx  = 0.3;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_1.add(this.tf_unidade = new CampoLimitado(200), cons);
	this.tf_unidade.setEditable(false);
	
	/*
	cons.fill = GridBagConstraints.BOTH;
	cons.weightx = 1;
	cons.weighty = 1;
	p_1.add(new JLabel(""), cons);
		
	*/
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.WEST;
	cons.ipadx = 0;
	cons.weightx = 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_add_nova_unidade  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_add_nova_unidade.setToolTipText("Salvar");
	p_1.add(bt_add_nova_unidade, cons);
	
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.ipadx = 25;
	cons.weightx = 0;
	cons.insets = new Insets( 4, 2, 5, 2);
	JButton bt_save  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_save.setToolTipText("Salvar");
	this.add(bt_save, cons);
				
		
		this.tf_unidade.addMouseListener( new MouseAdapter(){			
		@Override
		public void mouseClicked(MouseEvent e) {
									
		bt_add_nova_unidade.requestFocus();
		Comuns.removeIndicadoresDeErro(tf_unidade);
			
		Unidade retorno = new Unidade();
			
		FormDeSelecao<Unidade> selectionItemForm = 
						new FormDeSelecao<Unidade>("Adicionar Unidade", retorno, Unidade.class, "uni.status='ATIVO'");
		selectionItemForm.mostrar();
			
			
			if(retorno != null && retorno.getId_unidade() > 0){
					
			idUnidade = retorno.getId_unidade();
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
							
			idUnidade = retorno.getId_unidade();
			tf_unidade.setText(retorno.getDescricao());
			}
		}});
			
		
		
		
		
		bt_save.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		if(acaoPrincipal())	
		Mensagens.msgDeSucessoAoSalvar();
				
		}});
			

		
		this.chk_sem_insumos.addItemListener(new ItemListener(){
		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(chk_sem_insumos.isSelected()){
					
			tf_val_unitario.setEditable(true);
				
			}
			else{
					
			tf_val_unitario.setEditable(false);
			
			}
		}});
			
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
			
	textFieldList.add(this.tf_nome);
	textFieldList.add(this.tf_codigo);
	textFieldList.add(this.tf_unidade);
		
	Comuns.addEventoDeFoco(textFieldList);
	}


		
		
		

	protected boolean validacao(){
			
	/*		
		if(this.tf_codigo.getText().length() == 0){
				
		Mensagens.msgDeErro("Informe o código do item de orçamento.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
			
			
		if(!Comuns.codigoPermitido(new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class), 
					this.tf_codigo.getText(), this.item!=null?this.item.getId_item_modelo():0)){
				
		Mensagens.msgDeErro("O código informado já está sendo usado por outro item de orçamento.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
			
	*/		
			
		if(this.tf_nome.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe o nome do item de orçamento.");
		Comuns.textFieldErroMode(this.tf_nome);
		return false;	
		}
		
			
		if(this.idUnidade == 0){
				
		Mensagens.msgDeErro("Informe a unidade do item de orçamento.");
		Comuns.textFieldErroMode(this.tf_unidade);
		return false;	
		}
			
			
	return true;	
	}
		
			
	
	
	
	private boolean acaoPrincipal(){ 
	
	if(!this.validacao())
	return false; 		
	
	this.principal.setValor();
	
	if(this.item==null)
	this.item = new ItemDeOrcamentoModelo();
	
	
	this.item.setCodigo(this.tf_codigo.getText());
	this.item.setDescricao(this.tf_nome.getText());
	this.item.setFk_unidade(this.idUnidade);
	this.item.setValor_unitario(this.tf_val_unitario.getText());
	this.item.setStatus("ATIVO");
	this.item.setSem_insumos(this.chk_sem_insumos.isSelected()?"SIM":"NAO");
	
	
		if(this.item.getId_item_modelo()>0){
		
			
			if(this.chk_sem_insumos.isSelected()){
			
				
				if(!new DAO<ItemXMaterialModelo>(ItemXMaterialModelo.class).removeSemConfirmacao("fk_item="+this.item.getId_item_modelo())){
					
				Mensagens.msgDeErroAoAlterar();
				return false;
				}
							
				if(!new DAO<ItemXMaoDeObraModelo>(ItemXMaoDeObraModelo.class).removeSemConfirmacao("fk_item="+this.item.getId_item_modelo())){
					
				Mensagens.msgDeErroAoAlterar();	
				return false;	
				}
					
				if(!new DAO<ItemXEquipamentoModelo>(ItemXEquipamentoModelo.class).removeSemConfirmacao("fk_item="+this.item.getId_item_modelo())){
					
				Mensagens.msgDeErroAoAlterar();
				return false;	
				}	
			}	
		
		this.principal.ativarOpcoesAvancadas();	
			
		if(!new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class).altera(this.item))
		return false;
		}
		else{
		
			
		this.item.setTipo("NORMAL");
					
		int id_item = new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class).novo(this.item);
		
		if(id_item<=0)
		return false;
		
		this.item.setId_item_modelo(id_item);
		
		this.item.setCodigo(String.format("ITM%06d", id_item));
		
		new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class).altera(this.item);
		
		this.tf_codigo.setText(this.item.getCodigo());
		
		this.principal.setItem(item);	
		
		this.principal.ativarOpcoesAvancadas();
		}

	return true;
	}

	
	
}	

