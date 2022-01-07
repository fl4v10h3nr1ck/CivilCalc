package cadastro.cronograma;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import beans.Item_De_Cronograma;
import classes.CampoLimitadoSoDigito;
import classes.CampoMoeda;
import componentes.janelas.Dialogo;
import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;



public class FormAlteraItemDeCronograma   extends Dialogo {



private static final long serialVersionUID = 1L;


private Item_De_Cronograma item;
private List<Item_De_Cronograma> itens;

protected CampoLimitadoSoDigito tf_mes;
protected CampoMoeda tf_valor;




	public FormAlteraItemDeCronograma(Item_De_Cronograma item, List<Item_De_Cronograma> itens) {
		
	super("Alterar Item de Cronograma", 600, 120);
	
	this.item = item;
	this.itens = itens;
	
	this.adicionarComponentes();
	
	this.tf_mes.setText(item.getMes());
	this.tf_valor.setText(item.getValor());
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
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	cons.weightx = 0.45;	
	p_1.add(new JLabel("<html>Mês de Projeto:<font color=red>*</font></html>"),cons);
	cons.weightx = 0.45;	
	p_1.add(new JLabel("<html>Custo (%):<font color=red>*</font></html>"),cons);
	cons.weightx = 0.1;	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_1.add(new JLabel(""),cons);
	
	
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);
	cons.weightx = 0.45;	
	p_1.add(this.tf_mes =new CampoLimitadoSoDigito(2), cons);
	
	cons.weightx = 0.45;	
	p_1.add(this.tf_valor =new CampoMoeda(5), cons);
	
	cons.weightx = 0.1;	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JButton bt_save  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_save.setToolTipText("Salvar item.");
	p_1.add(bt_save, cons);
			
	
		bt_save.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		if(acaoPrincipal())	
		dispose();
				
		}});
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_valor);
	textFieldList.add(this.tf_mes);
	
	Comuns.addEventoDeFoco(textFieldList);
	}





	
	
	@Override
	public boolean acaoPrincipal() {
	
		if(this.tf_mes.getText().length() == 0){
			
		Mensagens.msgDeErro("Informe o mês desta fase do projeto.");
		Comuns.textFieldErroMode(this.tf_mes);
		return false;	
		}	
			
			
		if(this.tf_valor.getText().length() == 0){
				
		Mensagens.msgDeErro("Informe a porcentagem do custo da fase do projeto para o mês.");
		Comuns.textFieldErroMode(this.tf_valor);
		return false;	
		}
			
					
		if(Calculo.stringParaDouble(this.tf_valor.getText())>100){
				
		Mensagens.msgDeErro("A porcentagem do custo não pode ser maior que 100%.");
		Comuns.textFieldErroMode(this.tf_valor);
		return false;	
		}

		
	String porcento_total  = this.tf_valor.getText();	
		
	int mes  = Integer.parseInt(this.tf_mes.getText());
	
	
		for(Item_De_Cronograma aux: itens){
		
		if(aux.getId_item_de_cronograma() == item.getId_item_de_cronograma())	
		continue;
			
		porcento_total = Calculo.soma(porcento_total, aux.getValor());	
		
			if(mes==aux.getMes()){
				
			Mensagens.msgDeErro("O mês informado já foi adicionado.");
			return false;	
			}
		}
	
	
		if(Calculo.stringParaDouble(porcento_total)>100){
		
		Mensagens.msgDeErro("A soma das porcentagens de custo não pode ser maior que 100%.");
		return false;	
		}
			
			
	this.item.setMes(mes);		
	this.item.setValor(this.tf_valor.getText());	
	
	return true;
	}
	

	
	
	
	
	

}	

