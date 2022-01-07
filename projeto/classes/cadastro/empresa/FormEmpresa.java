package cadastro.empresa;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.util.List;

import javax.swing.JTabbedPane;

import beans.Empresa;
import componentes.TabbedPaneModel;
import componentes.janelas.Dialogo;
import comuns.Preferencias;
import dao.DAO;



public class FormEmpresa extends Dialogo{

	

private static final long serialVersionUID = 1L;


private PainelDadosGerais p_DadosGerais;
private PainelDadosDeEncargo p_DadosDeEncargo;

protected Empresa empresa;




	public FormEmpresa() {
		
	super("Informações Da Empresa", 900, 500);
	
	List<Empresa> empresas = new DAO<Empresa>(Empresa.class).get(null, null, null);
	
	if(empresas!=null && empresas.size()>0)
	this.empresa = empresas.get(0);
	
	p_DadosGerais = new PainelDadosGerais(this.empresa);
	p_DadosDeEncargo = new PainelDadosDeEncargo(this.empresa);
	
	
	this.getContentPane().setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	this.adicionarComponentes();
	}
	

	
	
	
	
	@Override
	public void adicionarComponentes(){
	
	GridBagConstraints cons = new GridBagConstraints();  
		
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 1;
	cons.weightx = 1;
					
	TabbedPaneModel tabbedPaneModel = new TabbedPaneModel( new Color(190,190,190) , Color.white, Color.black , Color.black);
	JTabbedPane tabbedPane = new JTabbedPane();
	tabbedPane.setUI( tabbedPaneModel );
	tabbedPane.addTab("Informações Gerais", null, this.p_DadosGerais);
	tabbedPane.addTab("Para Cálculo de Encargos", null, this.p_DadosDeEncargo);

	this.add(tabbedPane, cons);			
	}






	@Override
	public boolean acaoPrincipal() {return false;}
	
	



	
	
	
	
	
	




}
