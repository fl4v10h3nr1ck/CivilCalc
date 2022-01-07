package cadastro.modelos.itens_de_orcamento_modelo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;

import beans.modelos.ItemDeOrcamentoModelo;
import componentes.TabbedPaneModel;
import componentes.janelas.Dialogo;
import comuns.Calculo;
import comuns.Preferencias;



public class FormItensDeOrcamentoModelo extends Dialogo{


private static final long serialVersionUID = 1L;
	


private PainelDeInfoGerais p_gerais;
private PainelDeMateriais p_materiais;
private PainelDeMaoDeObra p_mao_de_obra;
private PainelDeEquipamentos p_equipamentos;



private JTabbedPane tabbedPane;

private ItemDeOrcamentoModelo item;




	public FormItensDeOrcamentoModelo(ItemDeOrcamentoModelo item) {
	
	super("Item de Orçamento (Modelo)", 700, 500);
	
	this.item = item;
	
	
	p_gerais = new PainelDeInfoGerais(this.item, this);
	p_materiais = new PainelDeMateriais(this.item, this);
	p_mao_de_obra = new PainelDeMaoDeObra(this.item, this);
	p_equipamentos = new PainelDeEquipamentos(this.item, this);
		
	
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
	
		
		if(this.item!=null && this.item.getId_item_modelo()>0){
		
		this.tabbedPane.addTab("Materiais", null, this.p_materiais);
		this.tabbedPane.addTab("Mão de Obra", null, this.p_mao_de_obra);
		this.tabbedPane.addTab("Equipamentos", null, this.p_equipamentos);
		
		this.p_materiais.atualiza(this.item);	
		this.p_mao_de_obra.atualiza(this.item);	
		this.p_equipamentos.atualiza(this.item);	
		}	
	
	this.setValor();
	}
	
	
	
	
	
	
	
	protected void setItem(ItemDeOrcamentoModelo item){
		
	this.item = item;			
	}
	


	
	

	protected String setValor(){
	
	String valor = Calculo.formataValor(
			Calculo.soma(this.p_materiais.total_material, 
					Calculo.soma(this.p_mao_de_obra.total_mao_obra, this.p_equipamentos.total_equipamento)));
	
	this.p_gerais.tf_val_unitario.setText(valor);
	
	return valor;
	}
	

	
	
}
