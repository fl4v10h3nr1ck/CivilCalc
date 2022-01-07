package principal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import cadastro.cronograma.PainelCronograma;
import principal.detalhes.PainelDeDetalhesOrcamentoAnalitico;
import componentes.TabbedPaneModel;





public class PainelDeDetalhes extends JPanel{


	
private static final long serialVersionUID = 1L;

	

private PainelDeDetalhesOrcamentoAnalitico p_analitico;
private PainelCronograma p_cronograma;


private PainelDeProjetos referencia_p_projetos;
private PainelDeEtapas referencia_p_etapas;
private PainelDeSubetapas referencia_p_subetapas;



private JLabel descritor;


	




	public PainelDeDetalhes(){
		
	this.setLayout(new GridBagLayout());
	this.setBorder(BorderFactory.createTitledBorder("Detalhes"));  	

	this.p_analitico = new PainelDeDetalhesOrcamentoAnalitico();
	this.p_cronograma = new PainelCronograma();

	this.referencia_p_projetos = null;
	this.referencia_p_etapas = null;
	this.referencia_p_subetapas = null;
	
	
	this.adicionarComponentes();
	}






	private void adicionarComponentes(){
			
	GridBagConstraints cons = new GridBagConstraints();  
	
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 1;
	cons.weightx = 1;
				
	TabbedPaneModel tabbedPaneModel = new TabbedPaneModel( new Color(190,190,190) , Color.white, Color.black , Color.black);
	JTabbedPane tabbedPane = new JTabbedPane();
	tabbedPane.setUI( tabbedPaneModel );
	tabbedPane.addTab("Orçamento Analítico", null, this.p_analitico);
	tabbedPane.addTab("Cronograma", null, this.p_cronograma);
	this.add(tabbedPane, cons);		
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx = 1;
	this.add(this.descritor = new JLabel(""), cons);
	}
	
	
	
	
	
	
	public void atualizaInfoDetalhes(){
	
	this.p_analitico.atualiza(this.referencia_p_subetapas.getIdItemSelecionado());
	this.p_cronograma.atualiza(this.referencia_p_projetos.getIdItemSelecionado());	
	}
	
	
	
	
	public void atualizaInfoDeCronograma(){
			
	this.p_cronograma.atualiza(this.referencia_p_projetos.getIdItemSelecionado());	
	}
	
	
	
	
	
	
	
	
	protected void setDescritor(){
		
	String aux = this.referencia_p_projetos.getNomeItemSelecionado();
	String descritor = "";
			
		if(aux!=null){
				
		descritor = aux;
		aux = this.referencia_p_etapas.getNomeItemSelecionado();
			
			if(aux!=null){
				
			descritor += " - "+aux;
			aux = this.referencia_p_subetapas.getNomeItemSelecionado();
				
			if(aux!=null)
			descritor += " - "+aux;	
			}
		}
		

	this.descritor.setText(descritor);	
	}
	
	
	
	
	
	

	
	protected void setReferenciaProjetos(PainelDeProjetos referencia){
	
	this.referencia_p_projetos = referencia;
	}
	
	
	
	
	

	protected void setReferenciaSubetapas(PainelDeSubetapas referencia){
	
	this.referencia_p_subetapas = referencia;
	}
	
	

	
	
	
	protected void setReferenciaEtapas(PainelDeEtapas referencia){
	
	this.referencia_p_etapas = referencia;
	}
	
	

	
}

