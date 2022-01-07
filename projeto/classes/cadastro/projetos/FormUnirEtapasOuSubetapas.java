package cadastro.projetos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import beans.Etapa;
import beans.ItemDeOrcamento;
import beans.Projeto;
import beans.Subetapa;
import cadastro.itens_de_orcamento.FormItensDeOrcamento;
import cadastro.subetapas.FormNovaSubetapa;
import cadastro.subetapas.FormSubetapaBase;
import classes.CampoLimitado;
import componentes.FormDeSelecao;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;




public class FormUnirEtapasOuSubetapas extends Dialogo{


private static final long serialVersionUID = 1L;
	

protected CampoLimitado tf_projeto;
private int id_projeto;

protected JComboBox<String> cb_tipo;


protected CampoLimitado tf_item_1;
private int id_item_1;

protected CampoLimitado tf_item_2;
private int id_item_2;


protected JRadioButton rb_nao_copiar;
protected JRadioButton rb_substituir;

private ButtonGroup  rbs;






	public FormUnirEtapasOuSubetapas() {
	
	super("Unir Etapas/Subetapas de Projeto", 620, 340);
	
	adicionarComponentes();
	}

	
	
	
	
	@Override
	public void adicionarComponentes() {
	
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 2, 2);
	JPanel p_0 = new JPanel(new GridBagLayout());
	p_0.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_0, cons);	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 0, 2);
	p_0.add(new JLabel("<html>Projeto:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_0.add(new JLabel(""), cons);
	
	
	cons.insets = new Insets(2, 2, 2, 2);
	cons.gridwidth  = 1;	
	p_0.add(this.tf_projeto =new CampoLimitado(250), cons);
	this.tf_projeto.setEditable(false);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_0.add(new JLabel(""), cons);
	
	cons.insets = new Insets(10, 2, 0, 2);
	cons.gridwidth  = 1;
	p_0.add(new JLabel("<html>Unir Duas:<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_0.add(new JLabel(""), cons);
	
	cons.insets = new Insets(2, 2, 2, 2);
	cons.gridwidth  = 1;
	p_0.add(this.cb_tipo =new JComboBox<String>(new String[]{"ETAPAS", "SUBETAPAS"}), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_0.add(new JLabel(""), cons);
	
	
	cons.insets = new Insets(10, 2, 0, 2);
	cons.gridwidth  = 1;
	p_0.add(new JLabel("<html>Unir <b>ESTE</b> Item de Projeto (Será removido):<font color=red>*</font></html>"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_0.add(new JLabel("<html>Unir <b>NESTE</b> Item de Projeto (Receberá os dados):<font color=red>*</font></html>"), cons);
	
	cons.insets = new Insets(2, 2, 2, 2);
	cons.gridwidth  = 1;	
	p_0.add(this.tf_item_1 =new CampoLimitado(250), cons);
	this.tf_item_1.setEditable(false);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_0.add(this.tf_item_2 =new CampoLimitado(250), cons);
	this.tf_item_2.setEditable(false);
	
	
	cons.insets = new Insets(20, 2, 20, 2);
	p_0.add(new JSeparator(SwingConstants.HORIZONTAL), cons);
	
	
	cons.insets = new Insets(2, 2, 2, 2);
	p_0.add(this.rb_nao_copiar =new JRadioButton("Não copiar itens de orçamento ja existentes.", true), cons);
	p_0.add(this.rb_substituir =new JRadioButton("Substituir itens de orçamento ja existentes."), cons);

	this.rb_nao_copiar.setOpaque(false);
	this.rb_substituir.setOpaque(false);
	
	
	this.rbs = new ButtonGroup();
	
	this.rbs.add(rb_nao_copiar);
	this.rbs.add(rb_substituir);
	
	
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	JButton bt_unir  = new JButton("Unir Itens", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_unir.setToolTipText("Unir dois itens de projeto.");
	this.add(bt_unir, cons);
	
	
	
		this.cb_tipo.addItemListener(new ItemListener(){
		@Override
		public void itemStateChanged(ItemEvent e) {
		
		opcoesDeSubetapas();
		}});
	

	
		bt_unir.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			    	
			if(acaoPrincipal()){
			
			Mensagens.msgDeSucessoAoSalvar();
			dispose();
			}
		}});
	
	
		
		this.tf_projeto.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
								
		Comuns.removeIndicadoresDeErro(tf_projeto);
				
		bt_unir.requestFocus();
				
		addProjeto();			
		}});
		
		
		
		this.tf_item_1.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
									
		Comuns.removeIndicadoresDeErro(tf_item_1);
					
		bt_unir.requestFocus();
					
		addItem1();			
		}});
		
		
		
		this.tf_item_2.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
										
		Comuns.removeIndicadoresDeErro(tf_item_2);
						
		bt_unir.requestFocus();
						
		addItem2();			
		}});
		
		
	this.opcoesDeSubetapas();
		
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_projeto);
	textFieldList.add(this.tf_item_1);
	textFieldList.add(this.tf_item_2);
	
	Comuns.addEventoDeFoco(textFieldList);
	}

	
	
	
	private void opcoesDeSubetapas(){
		
		if(this.cb_tipo.getSelectedIndex()==0){
			
		this.rb_nao_copiar.setEnabled(false);
		this.rb_substituir.setEnabled(false);	
		}
		else{
			
		this.rb_nao_copiar.setEnabled(true);
		this.rb_substituir.setEnabled(true);			
		}
		
	}
	
	
	
	
	
	
	
	public boolean validacao(){
		
		
		if(this.id_projeto==0){
		
		Mensagens.msgDeErro("Selecione um projeto.");
		Comuns.textFieldErroMode(this.tf_projeto);	
		return false;
		}
		
		
		if(this.id_item_1==0){
			
		Mensagens.msgDeErro("Selecione o primeiro item de projeto a ser unido.");
		Comuns.textFieldErroMode(this.tf_item_1);	
		return false;
		}
	
		
		
		if(this.id_item_2==0){
			
		Mensagens.msgDeErro("Selecione o segundo item de projeto a ser unido.");
		Comuns.textFieldErroMode(this.tf_item_2);	
		return false;
		}
		
		
		
		if(this.id_item_1==this.id_item_2){
			
		Mensagens.msgDeErro("Escolha dois itens de projeto diferentes.");
		Comuns.textFieldErroMode(this.tf_item_2);	
		return false;
		}
	
		
	return true;
	}





	
	
	
	
	
	
	private void addProjeto(){
		
	Projeto retorno = new Projeto();
				
	FormDeSelecao<Projeto> selectionItemForm = 
						new FormDeSelecao<Projeto>("Adicionar Projeto", retorno, Projeto.class, "proj.status='ATIVO'");
	selectionItemForm.mostrar();
			
		if(retorno != null && retorno.getId_projeto() > 0){
			
		this.tf_projeto.setText(retorno.getCodigo());
		this.id_projeto  = retorno.getId_projeto();
		
		
		this.tf_item_1.setText("");
		this.tf_item_2.setText("");
		
		this.id_item_1 =0;
		this.id_item_2 =0;
		}
	}
		
	
	
	
	
	
	
	private void addItem1(){
	
		if(this.cb_tipo.getSelectedIndex()==0){
			
		Etapa retorno = new Etapa();
			
		FormDeSelecao<Etapa> selectionItemForm = 
									new FormDeSelecao<Etapa>("Adicionar Etapa", retorno, Etapa.class, "etap.status='ATIVO' and etap.fk_projeto="+this.id_projeto);
		selectionItemForm.mostrar();
						
			if(retorno != null && retorno.getId_etapa() > 0){
						
			this.tf_item_1.setText(retorno.getTitulo());
			this.id_item_1  = retorno.getId_etapa();
			}
		}	
		else{
		
		Subetapa retorno = new Subetapa();
			
		FormDeSelecao<Subetapa> selectionItemForm = 
										new FormDeSelecao<Subetapa>("Adicionar Subetapa", retorno, Subetapa.class, "subetap.status='ATIVO' and etap.fk_projeto="+this.id_projeto);
		selectionItemForm.mostrar();
							
			if(retorno != null && retorno.getId_subetapa() > 0){
							
			this.tf_item_1.setText(retorno.getTitulo_etapa()+" | "+retorno.getTitulo());
			this.id_item_1  = retorno.getId_subetapa();
			}		
		}	
	}
		
		
		
		
	
	
	
	

	
	private void addItem2(){
	
		if(this.cb_tipo.getSelectedIndex()==0){
			
		Etapa retorno = new Etapa();
			
		FormDeSelecao<Etapa> selectionItemForm = 
									new FormDeSelecao<Etapa>("Adicionar Etapa", retorno, Etapa.class, "etap.status='ATIVO' and etap.fk_projeto="+this.id_projeto);
		selectionItemForm.mostrar();
						
			if(retorno != null && retorno.getId_etapa() > 0){
						
			this.tf_item_2.setText(retorno.getTitulo());
			this.id_item_2  = retorno.getId_etapa();
			}
		}	
		else{
		
		Subetapa retorno = new Subetapa();
			
		FormDeSelecao<Subetapa> selectionItemForm = 
										new FormDeSelecao<Subetapa>("Adicionar Subetapa", retorno, Subetapa.class, "subetap.status='ATIVO' and etap.fk_projeto="+this.id_projeto);
		selectionItemForm.mostrar();
							
			if(retorno != null && retorno.getId_subetapa() > 0){
							
			this.tf_item_2.setText(retorno.getTitulo_etapa()+" | "+retorno.getTitulo());
			this.id_item_2  = retorno.getId_subetapa();
			}		
		}	
	}
		
	

	
	
	
	
	
	
	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false;
	
		if(this.cb_tipo.getSelectedIndex()==0){
		
		DAO<Subetapa>	subdao = new DAO<Subetapa>(Subetapa.class);
			
		List<Subetapa>	 subetapas = subdao.get(null, "subetap.fk_etapa="+this.id_item_1, null);
		
		int maior_ordem = FormNovaSubetapa.getMaiorOrdemDeSubetapa(this.id_item_2)+1;
		
			for(Subetapa sub: subetapas){
			
			sub.setFk_etapa(this.id_item_2);
			sub.setOrdem(maior_ordem++);
			
				if(!subdao.altera(sub)){
					
				Mensagens.msgDeErro("Um erro ocorreu ao processar os dados.");
				return false;	
				}
			}
		
			
			if(!new DAO<Etapa>(Etapa.class).removeSemConfirmacao(this.id_item_1)){
				
			Mensagens.msgDeErro("Um erro ocorreu ao processar os dados.");
			return false;	
			}	
		}
		else{
		
			
		DAO<ItemDeOrcamento>	itemdao = new DAO<ItemDeOrcamento>(ItemDeOrcamento.class);
		
		List<ItemDeOrcamento>	 itens_origem = itemdao.get(null, "itns.fk_subetapa="+this.id_item_1, null);
		
		List<ItemDeOrcamento>	 itens_destino = itemdao.get(null, "itns.fk_subetapa="+this.id_item_2, null);
	
		
			for(ItemDeOrcamento item: itens_origem){
			
			boolean existe = false;
			int id_remocao = 0;
				
				for(ItemDeOrcamento item_destino:itens_destino){
					
					if(item.getCodigo().compareTo(item_destino.getCodigo())==0){
						
					id_remocao = item_destino.getId_item();
						
					existe = true;	
						
					break;
					}
				}
			
				
			if(this.rb_nao_copiar.isSelected() && existe)
			continue;
				
			if(this.rb_substituir.isSelected() && existe && id_remocao>0)
			FormItensDeOrcamento.removeItem(id_remocao);					
					
			item.setFk_subetapa(this.id_item_2);
					
			itemdao.altera(item);	
			}
			
		
		FormSubetapaBase.removeSubetapa(this.id_item_1);
		}
	
	
	return true;
	}
	
	
	
	

}

