package principal;

import java.awt.Color;
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

import comuns.Mensagens;
import dao.DAO;



public abstract class PainelBase<T> extends JPanel{

	
private static final long serialVersionUID = 1L;

	
protected List<T> lista;

private List<JPanel> lista_de_itens;

private JPanel painel_itens;

protected DAO<T> dao;

protected int indice_selecionado;	
	

protected  JButton bt_remove;
protected  JButton bt_alterar;
protected  JButton bt_novo;

	


	
	public PainelBase(String titulo, Class<?> tipo){
		
	this.setLayout(new GridBagLayout());
	this.setBorder(BorderFactory.createTitledBorder(titulo));  	
			
	dao  =new DAO<T>(tipo);	
	
	this.lista_de_itens = new ArrayList<JPanel>();
	}

	
	
	


	public void adicionarComponentes(){
		
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.gridwidth  = 1;	
	cons.anchor = GridBagConstraints.EAST;
		
	bt_novo = new JButton(new ImageIcon(getClass().getResource("/icons/novo_mini.png")));
	bt_novo.setToolTipText("Adicionar novo projeto.");
	this.add(bt_novo, cons);
		
	bt_alterar = new JButton(new ImageIcon(getClass().getResource("/icons/alterar_mini.png")));
	bt_alterar.setToolTipText("Alterar projeto selecionado.");
	this.add(bt_alterar, cons);

	bt_remove = new JButton(new ImageIcon(getClass().getResource("/icons/remover_mini.png")));
	bt_remove.setToolTipText("Excluir projeto selecionado.");
	this.add(bt_remove, cons);
		
		
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;	
	cons.weightx= 1;
	this.add(new JLabel(""), cons);
		

	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;	
	cons.weightx= 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_minimiza  = new JButton(new ImageIcon(getClass().getResource("/icons/minimiza.png")));
	bt_minimiza.setToolTipText("Minimizar projetos");
	this.add(bt_minimiza, cons);
		
		
	cons.fill = GridBagConstraints.BOTH;
	cons.anchor = GridBagConstraints.CENTER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	this.add(new JScrollPane(this.painel_itens=new JPanel(new GridBagLayout())), cons);
			
			
		bt_minimiza.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
							    	
		minimiza();
		}});
				
							
			
			
		bt_novo.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
							    	
		
		novoItem();
			
		atualizaInfo();
		}});
				
				
				
				
		bt_alterar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			
		
			if(indice_selecionado >=0){
				
			AlteraItem(lista.get(indice_selecionado));
				
			atualizaInfo();
			}
			else
			Mensagens.msgDeErro("Selecione um item para alteração.");	

		}});
				
				
			
				
				
		bt_remove.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
								    	
		int id  = getIdItemSelecionado();
				
			if(id >0){
				
			if(dao.desativar(id))
			atualizaInfo();
			}
			else
			Mensagens.msgDeErro("Selecione um item para exclusão.");	
				
		}});
				
				
		
		
	this.atualizaInfo();		
	}


	
	
	
	public void atualizaInfo(){
	
	this.painel_itens.removeAll();	
	
	this.lista_de_itens.clear();
	
	if(this.lista==null)
	return;	

	
	GridBagConstraints cons = new GridBagConstraints();  
	
		for(T item: this.lista){
	
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.weighty  = 0;	
		cons.weightx= 1;
		cons.ipadx= 0;
		cons.ipady= 0;
		cons.insets= new Insets(1, 1, 1, 1);
		cons.gridwidth  = GridBagConstraints.REMAINDER;

		JPanel p_aux = new JPanel(new GridBagLayout());
		this.lista_de_itens.add(p_aux);
		
		p_aux.setBackground(Color.WHITE);
		this.painel_itens.add(p_aux, cons);	
		
		cons.gridwidth  = 1;
		cons.gridheight  = 2;
		cons.ipady= 18;
		cons.insets= new Insets(0, 2, 0, 1);
		JLabel lb_projeto = new JLabel(this.getNome(item));
		p_aux.add(lb_projeto, cons);	
		
	
		cons.fill = GridBagConstraints.NONE;
		cons.weightx= 0;
		cons.gridwidth  = 1;
		cons.gridheight  = 1;
		cons.insets= new Insets(0, 0, 0, 1);
		cons.ipadx= 7;
		cons.ipady= 7;
		cons.gridwidth  = GridBagConstraints.REMAINDER;
		JButton bt_pra_cima  = new JButton(new ImageIcon(getClass().getResource("/icons/pra_cima.png")));
		bt_pra_cima.setToolTipText("Mover para cima");
		p_aux.add(bt_pra_cima, cons);
		bt_pra_cima.setBorder(null);
		
		JButton bt_pra_baixo  = new JButton(new ImageIcon(getClass().getResource("/icons/pra_baixo.png")));
		bt_pra_baixo.setToolTipText("Mover para baixo");
		p_aux.add(bt_pra_baixo, cons);
		bt_pra_baixo.setBorder(null);
		
		
			bt_pra_cima.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed( ActionEvent event ){
			
			ordernar(lista.indexOf(item), 1);
			}});
			
			
			bt_pra_baixo.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed( ActionEvent event ){
			
			ordernar(lista.indexOf(item), 0);
			}});
			
			
			lb_projeto.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				
			indice_selecionado = lista.indexOf(item);
						
				if(indice_selecionado>=0){
				
					if(e.getClickCount()==2){	
					
					AlteraItem(item);
							
					atualizaInfo();
					}
					else
					selecionaItem();	
				
				setItemSelecionado(indice_selecionado);		
				}
				
			
				
				/*
				for(Component comps: painel_itens.getComponents()){
				
				boolean control = false;	
					
					if(comps instanceof JPanel){
					
						for(Component aux: ((JPanel)comps).getComponents()){
						
							if(aux instanceof JLabel && aux.equals(lb_projeto)){
								
							comps.setBackground(new Color(127, 221, 255));
							control = true;
							break;
							}		
						}
					
					if(!control)
					comps.setBackground(Color.WHITE);
					}
				}
				*/	
			}}); 
		}
	
		
	cons.fill = GridBagConstraints.BOTH;
	cons.weighty  = 1;	
	cons.weightx= 1;
	cons.insets= new Insets(0, 0, 0, 0);
	this.painel_itens.add(new JLabel(""), cons);		
		
		
	this.painel_itens.repaint();
	this.painel_itens.revalidate();
	}
	
	

	
	
	public void setItemSelecionado(int index){
	
	if(index<0 && index>=this.lista_de_itens.size())	
	return;	
	
		for(int i=0;i < this.lista_de_itens.size();i++){
			
		if(i== index)
		this.lista_de_itens.get(i).setBackground(new Color(127, 221, 255));	
		else
		this.lista_de_itens.get(i).setBackground(Color.WHITE);
		}
	}
	
	
	


	public abstract void novoItem();
	
	
	
	
	
	public abstract void AlteraItem(T item);
	
	
	
	

	public abstract void selecionaItem();
	
	
	
	
	

	
	private void ordernar(int indice, int tipo){
	
	if(indice==0 && tipo ==1)
	return;
	
	if(indice==this.lista.size()-1 && tipo ==0)
	return;
		
	int indice_aux = indice + (tipo ==1?-1:1);
	
	
	List<T> projetos_aux = new ArrayList<T>();
	
		for(int i = 0; i < this.lista.size(); i++){
			
			if(tipo ==1){
				
				if(i == indice_aux){	
				projetos_aux.add(this.lista.get(indice));
				continue;
				}
			
				if(i == indice){
				projetos_aux.add(this.lista.get(indice_aux));
				continue;
				}
			}
			else{
				
				if(i == indice){
				projetos_aux.add(this.lista.get(indice_aux));
				continue;
				}
				
				if(i == indice_aux){	
				projetos_aux.add(this.lista.get(indice));
				continue;
				}
			}
				
		projetos_aux.add(this.lista.get(i));	
		}
	
	this.lista.clear();
	
	this.lista.addAll(projetos_aux);
	
	
		for(int i = 0; i < this.lista.size(); i++){
		
		this.setOrdem( this.lista.get(i), i+1);
		dao.altera(this.lista.get(i));
		}
	
	atualizaInfo();
	}
	
		
	
	
	public abstract String getNome(T item);
	
	
	
	
	protected String getNomeItemSelecionado(){
	
	if(this.lista==null || this.lista.size()==0 || this.indice_selecionado>=this.lista.size())	
	return null;
		
	return this.getNome(this.lista.get(this.indice_selecionado));		
	}
	
	
	
	

	protected abstract void setDados();
		
	
	
	

	protected abstract int getIdItemSelecionado();
		
	
	
	
	protected abstract void setOrdem(T item, int ordem);
		
	
	
	
	protected abstract void minimiza();
}


