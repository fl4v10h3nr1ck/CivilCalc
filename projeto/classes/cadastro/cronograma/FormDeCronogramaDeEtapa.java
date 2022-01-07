package cadastro.cronograma;

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

import beans.Cronograma;
import beans.Etapa;
import beans.Item_De_Cronograma;
import classes.CampoLimitadoSoDigito;
import classes.CampoMoeda;
import componentes.janelas.Dialogo;
import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;




public class FormDeCronogramaDeEtapa  extends Dialogo {



private static final long serialVersionUID = 1L;


private int id_etapa;

protected JTable tb_itens;
protected DefaultTableModel modelo;
protected CampoLimitadoSoDigito tf_mes;
protected CampoMoeda tf_valor;

protected List<Item_De_Cronograma> lista_de_itens;

protected JButton bt_add;
protected JButton bt_remover;



protected Cronograma cronograma;
protected Etapa etapa;







	public FormDeCronogramaDeEtapa(int id_etapa) {
		
	super("Cronograma de Projeto", 600, 500);
	
	this.id_etapa = id_etapa;
	
	this.etapa = new DAO<Etapa>(Etapa.class).get(id_etapa);
	
	List<Cronograma> aux  = new DAO<Cronograma>(Cronograma.class).get(
			null, "cron.tipo='ETAPA' and cron.fk_etapa="+this.id_etapa, null);
	
	if(aux!=null && aux.size()>0)
	this.cronograma = aux.get(0);
	
	this.adicionarComponentes();
	
	if(this.cronograma!=null)
	this.lista_de_itens  = new DAO<Item_De_Cronograma>(Item_De_Cronograma.class).get(
								null, 
								"i_cron.fk_cronograma="+this.cronograma.getId_cronograma(), 
								null);

	else
	this.lista_de_itens = new ArrayList<Item_De_Cronograma>();
	
	
	this.atualizaTabelaDeItens();
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
	cons.weighty  = 0;
	cons.insets = new Insets( 25, 2, 20, 2);
	p_1.add(new JLabel("<html><b>Etapa: "+(this.etapa==null?"":this.etapa.getTitulo())+"</b></html>"), cons);
	
	
	cons.fill = GridBagConstraints.BOTH;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets( 0, 0, 0, 0);
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	p_2.setBorder(BorderFactory.createTitledBorder("Cronograma"));  
	p_1.add(p_2, cons);
	

	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	cons.weightx = 0.45;	
	p_2.add(new JLabel("<html>Mês de Projeto:<font color=red>*</font></html>"),cons);
	cons.weightx = 0.45;	
	p_2.add(new JLabel("<html>Custo (%):<font color=red>*</font></html>"),cons);
	cons.weightx = 0.1;	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_2.add(new JLabel(""),cons);
	
	
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);
	cons.weightx = 0.45;	
	p_2.add(this.tf_mes =new CampoLimitadoSoDigito(2), cons);
	
	cons.weightx = 0.45;	
	p_2.add(this.tf_valor =new CampoMoeda(5), cons);
	
	cons.weightx = 0.1;	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	this.bt_add  = new JButton("Adicionar", new ImageIcon(getClass().getResource("/icons/add.png")));
	bt_add.setToolTipText("Adicionar item de cronograma.");
	p_2.add(bt_add, cons);
	

	
		this.modelo = new DefaultTableModel(null, new String[]{"Mês de Projeto", "Custo"}){
		
		private static final long serialVersionUID = 1L;
		
		public boolean isCellEditable(int row, int col ){  
		            
		return false;
		}};


	
	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	p_2.add(new JScrollPane(this.tb_itens=new JTable(this.modelo)), cons);
	this.tb_itens.setRowHeight(25);
		
	this.tb_itens.getColumnModel().getColumn(0).setPreferredWidth(250);
	this.tb_itens.getColumnModel().getColumn(1).setPreferredWidth(250);
		
		
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.anchor = GridBagConstraints.WEST;
	this.bt_remover  = new JButton(new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_remover.setToolTipText("Remove item selecionado.");
	p_2.add(bt_remover, cons);
		

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
		

	
	
		
		this.bt_remover.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
							    	
				
		int selectedItem= tb_itens.getSelectedRow();
				
			if(selectedItem >=0){
				
			lista_de_itens.remove(selectedItem);
					
			atualizaTabelaDeItens();
			}
			else
			Mensagens.msgDeErro("Selecione uma linha da tabela para exclusão.");	
			
			}});
				
			
			
		
	
		
		this.bt_add.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
							    	
				
		addItem();
		}});
				
			
		
		
		
		this.tb_itens.addMouseListener(new MouseAdapter(){
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(e.getClickCount()==2){
			
				if(cronograma!=null){	
					
				FormAlteraItemDeCronograma	form = new FormAlteraItemDeCronograma(lista_de_itens.get(tb_itens.getSelectedRow()), lista_de_itens);
				form.mostrar();
				
				atualizaTabelaDeItens();
				}	
			}	
		}});
		
		
		
		if(this.cronograma==null){
		
		this.bt_add.setEnabled(false);
		this.bt_remover.setEnabled(false);
		bt_save.setEnabled(false);
		
		Mensagens.msgDeErro("Dados do cronograma inacessível.");
		}
		
		
	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_valor);
	textFieldList.add(this.tf_mes);
	
	Comuns.addEventoDeFoco(textFieldList);
	}



	




	@Override
	public boolean acaoPrincipal() {
	
	
	DAO<Item_De_Cronograma> item_dao = new DAO<Item_De_Cronograma>(Item_De_Cronograma.class);	
	
	
		if(!item_dao.removeSemConfirmacao("fk_cronograma="+this.cronograma.getId_cronograma())){
			
		Mensagens.msgDeErro("Um erro ocorreu ao salvar as informações.");
		return false;	
		}	
		
	
		for(Item_De_Cronograma aux: lista_de_itens){
			
			if(item_dao.novo(aux)<=0){
				
			Mensagens.msgDeErro("Um erro ocorreu ao salvar as informações.");
			return false;	
			}	
		}	
	
		
	this.cronograma.setDuracao_meses(lista_de_itens.size());	

	return new DAO<Cronograma>(Cronograma.class).altera(this.cronograma);
	}
	

	
	
	
	
	private void addItem(){
		
	
		if(this.tf_mes.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe o mês desta fase do projeto.");
		Comuns.textFieldErroMode(this.tf_mes);
		return;	
		}	
		
		
		if(this.tf_valor.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe a porcentagem do custo da fase do projeto para o mês.");
		Comuns.textFieldErroMode(this.tf_valor);
		return;	
		}
		
		
		
		if(Calculo.stringParaDouble(this.tf_valor.getText())>100){
			
		Mensagens.msgDeErro("A porcentagem do custo não pode ser maior que 100%.");
		Comuns.textFieldErroMode(this.tf_valor);
		return;	
		}
		
		
	String porcento_total  = this.tf_valor.getText();	
		
	int mes  = Integer.parseInt(this.tf_mes.getText());
	
	
		for(Item_De_Cronograma aux: lista_de_itens){
		
		porcento_total = Calculo.soma(porcento_total, aux.getValor());	
		
			if(mes==aux.getMes()){
				
			Mensagens.msgDeErro("O mês informado já foi adicionado.");
			return;	
			}
		}
	
	
		if(Calculo.stringParaDouble(porcento_total)>100){
		
		Mensagens.msgDeErro("A soma das porcentagens de custo não pode ser maior que 100%.");
		return;	
		}
		
		
	Item_De_Cronograma	item = new Item_De_Cronograma();
	item.setFk_cronograma(this.cronograma.getId_cronograma());
	item.setMes(mes);
	item.setValor(this.tf_valor.getText());
	this.lista_de_itens.add(item);
	
	this.tf_mes.setText("");
	this.tf_valor.setText("");
	
	
	this.atualizaTabelaDeItens();
	}
	

	
	
	
	
	public void atualizaTabelaDeItens(){
	
		
	this.modelo.setNumRows(0);
	String[] dados = new String[2];
	
		for(Item_De_Cronograma aux: lista_de_itens){
			
		dados[0] = ""+aux.getMes();
		dados[1] = aux.getValor();
		
		this.modelo.addRow(dados);
		}	
	}
	
	
	
	
}	

