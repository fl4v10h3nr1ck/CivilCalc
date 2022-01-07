package cadastro.projetos;

import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JTabbedPane;

import beans.BDI;
import beans.Encargo_Horista;
import beans.Encargo_Mensalista;
import beans.Projeto;
import componentes.TabbedPaneModel;
import componentes.janelas.Dialogo;
import comuns.Preferencias;
import dao.DAO;




public class FormProjeto extends Dialogo{


private static final long serialVersionUID = 1L;
	



private PainelDeDadosGeraisDeProjeto p_gerais;
private PainelDePessoalDeProjeto p_pessoal;
private PainelDeBDIDeProjeto p_bdi;
private PainelDeEncargosHoristaDeProjeto p_horista;
private PainelDeEncargosMensalistaDeProjeto p_mensalista;

protected Projeto projeto;


private JTabbedPane tabbedPane;




	public FormProjeto(Projeto projeto) {
	
	super("Projeto", 900, 550);
	
	this.setProjeto(projeto);
		
	p_gerais = new PainelDeDadosGeraisDeProjeto(this.projeto, this);
	p_pessoal = new PainelDePessoalDeProjeto(this.projeto);
	
	p_bdi = new PainelDeBDIDeProjeto(null);
	p_horista = new PainelDeEncargosHoristaDeProjeto(null);
	p_mensalista = new PainelDeEncargosMensalistaDeProjeto(null);
		
	
	this.getContentPane().setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	this.adicionarComponentes();
	}

	
	
	
	
	@Override
	public void adicionarComponentes() {
	
		
	GridBagConstraints cons = new GridBagConstraints();  
		
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 1;
	cons.weightx = 1;
						
	TabbedPaneModel tabbedPaneModel = new TabbedPaneModel( new Color(190,190,190) , Color.white, Color.black , Color.black);
	this.tabbedPane = new JTabbedPane();
	tabbedPane.setUI( tabbedPaneModel );
	tabbedPane.addTab("Informações Gerais", null, this.p_gerais);
	this.add(tabbedPane, cons);			
		
	
	this.ativarOpcoesAvancadas();
	}





	@Override
	public boolean acaoPrincipal() {return false;}

	
	
	
	
	
	
	protected void ativarOpcoesAvancadas(){
		
		if(this.projeto!=null && this.projeto.getId_projeto()>0){
		
		this.tabbedPane.addTab("Proprietários e Responsáveis", null, this.p_pessoal);
		this.tabbedPane.addTab("BDI", null, this.p_bdi);
		this.tabbedPane.addTab("Encargo Horista", null, this.p_horista);
		this.tabbedPane.addTab("Encargo Mensalista", null, this.p_mensalista);
		
		this.p_pessoal.atualiza(this.projeto);	
			
		if(this.projeto.getFk_encargo_horista()>0)
		this.p_horista.atualiza(new DAO<Encargo_Horista>(Encargo_Horista.class).get(this.projeto.getFk_encargo_horista()));	
		
		if(this.projeto.getFk_encargo_mensalista()>0)
		this.p_mensalista.atualiza(new DAO<Encargo_Mensalista>(Encargo_Mensalista.class).get(this.projeto.getFk_encargo_mensalista()));	
		
		if(this.projeto.getFk_bdi()>0)
		this.p_bdi.atualiza(new DAO<BDI>(BDI.class).get(this.projeto.getFk_bdi()));	
			
		}	
	}
	
	
	
	
	
	
	
	protected void setProjeto(Projeto projeto){
		
	this.projeto = projeto;			
	}
	

	
	
	
}
