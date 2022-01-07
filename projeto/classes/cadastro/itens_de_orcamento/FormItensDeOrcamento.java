package cadastro.itens_de_orcamento;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTabbedPane;

import beans.Equipamento;
import beans.ItemDeOrcamento;
import beans.ItemXEquipamento;
import beans.ItemXMaoDeObra;
import beans.ItemXMaterial;
import beans.Mao_De_Obra;
import beans.Material;
import beans.MaterialXFornecedor;
import componentes.TabbedPaneModel;
import componentes.janelas.Dialogo;
import comuns.Calculo;
import comuns.Preferencias;
import dao.DAO;



public class FormItensDeOrcamento extends Dialogo{


private static final long serialVersionUID = 1L;
	


private PainelDeInfoGerais p_gerais;
private PainelDeMateriais p_materiais;
private PainelDeMaoDeObra p_mao_de_obra;
private PainelDeEquipamentos p_equipamentos;



private JTabbedPane tabbedPane;

private ItemDeOrcamento item;


public int id_subetapa;



	public FormItensDeOrcamento(int id_subetapa, ItemDeOrcamento item) {
	
	super("Item de Orçamento", 700, 500);
	
	this.item = item;
	
	this.id_subetapa =id_subetapa;
	
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
	
		
		if(this.item!=null && this.item.getId_item()>0){
		
		this.tabbedPane.addTab("Materiais", null, this.p_materiais);
		this.tabbedPane.addTab("Mão de Obra", null, this.p_mao_de_obra);
		this.tabbedPane.addTab("Equipamentos", null, this.p_equipamentos);
		
		this.p_materiais.atualiza(this.item);	
		this.p_mao_de_obra.atualiza(this.item);	
		this.p_equipamentos.atualiza(this.item);	
		}	
	
	this.setValor();
	}
	
	
	
	
	
	
	
	protected void setItem(ItemDeOrcamento item){
		
	this.item = item;			
	}
	


	
	

	protected String setValor(){
	
	String valor = Calculo.formataValor(
			Calculo.soma(this.p_materiais.total_material, 
					Calculo.soma(this.p_mao_de_obra.total_mao_obra, this.p_equipamentos.total_equipamento)));
	
	this.p_gerais.tf_val_unitario.setText(valor);
	
		if(this.item!=null){
	
		this.item.setValor_total(
			Calculo.formataValor(
					Calculo.multiplica(this.p_gerais.tf_val_unitario.getText(), this.item.getQuantidade())));
		}
	
	return valor;
	}
	

	
	
	
	
	
	public static boolean removeItem(int id_item){
	
	DAO<ItemXMaterial> ixmat_dao = new 	DAO<ItemXMaterial>(ItemXMaterial.class);
	DAO<ItemXMaoDeObra> ixmao_dao = new 	DAO<ItemXMaoDeObra>(ItemXMaoDeObra.class);
	DAO<ItemXEquipamento> ixeq_dao = new 	DAO<ItemXEquipamento>(ItemXEquipamento.class);
	
	DAO<MaterialXFornecedor> mxf_dao = new DAO<MaterialXFornecedor>(MaterialXFornecedor.class);
	
	DAO<Material> mat_dao = new 	DAO<Material>(Material.class);
	DAO<Mao_De_Obra> mao_dao = new 	DAO<Mao_De_Obra>(Mao_De_Obra.class);
	DAO<Equipamento> eq_dao = new 	DAO<Equipamento>(Equipamento.class);
				
	List<Integer> ids = new ArrayList<Integer>();
	
	
	for(ItemXMaterial ixmat: ixmat_dao.get(null, "ixm.fk_item="+id_item, null))
	ids.add(ixmat.getFk_material());
		
	ixmat_dao.removeSemConfirmacao("fk_item="+id_item);
	
		for(Integer id: ids){
		
		mxf_dao.removeSemConfirmacao("fk_material="+id);	
			
		mat_dao.removeSemConfirmacao(id);
		}
		
	ids.clear();
	
	
	for(ItemXMaoDeObra ixmao: ixmao_dao.get(null, "ixmo.fk_item="+id_item, null))
	ids.add(ixmao.getFk_mao_obra());
		
	ixmao_dao.removeSemConfirmacao("fk_item="+id_item);
	
	for(Integer id: ids)	
	mao_dao.removeSemConfirmacao(id);
	
	ids.clear();
	
	
	for(ItemXEquipamento ixeq: ixeq_dao.get(null, "ixeq.fk_item="+id_item, null))
	ids.add(ixeq.getFk_equipamento());
										
	ixeq_dao.removeSemConfirmacao("fk_item="+id_item);
	
	for(Integer id: ids)	
	eq_dao.removeSemConfirmacao(id);
		
	
	return new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).removeSemConfirmacao(id_item);	
	}
	
	
}
