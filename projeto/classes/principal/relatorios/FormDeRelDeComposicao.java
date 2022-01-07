package principal.relatorios;

import java.util.ArrayList;
import java.util.List;

import beans.Etapa;
import beans.ItemDeOrcamento;
import beans.ItemDeRelDeComposicao;
import beans.ItemXEquipamentoCompleto;
import beans.ItemXMaoDeObraCompleto;
import beans.ItemXMaterialCompleto;
import beans.Subetapa;
import beans.Unidade;
import comuns.Calculo;
import comuns.Comuns;
import comuns.FabricaDeRelatorios;
import dao.DAO;



public class FormDeRelDeComposicao extends FormDeRelBase{


	
private static final long serialVersionUID = 1L;



	public FormDeRelDeComposicao() {
	
	super("Relatório de Composição de Preço Unitário");
	}



	

	@Override
	public boolean setRelatorio() {
	
	List<ItemDeRelDeComposicao> lista = new ArrayList<ItemDeRelDeComposicao>();	
		
	
	DAO<ItemDeOrcamento> dao_item= new DAO<ItemDeOrcamento>(ItemDeOrcamento.class);
	DAO<Subetapa> dao_subetapa= new DAO<Subetapa>(Subetapa.class);
	DAO<Unidade> dao_unidade= new DAO<Unidade>(Unidade.class);
	DAO<ItemXMaterialCompleto> dao_material= new DAO<ItemXMaterialCompleto>(ItemXMaterialCompleto.class);
	DAO<ItemXEquipamentoCompleto> dao_equipamento= new DAO<ItemXEquipamentoCompleto>(ItemXEquipamentoCompleto.class);
	DAO<ItemXMaoDeObraCompleto> dao_mao= new DAO<ItemXMaoDeObraCompleto>(ItemXMaoDeObraCompleto.class);

	
	
	String bdi = Comuns.getBDIDeProjeto(this.id_projeto);
	String ls_horista = Comuns.getLSHoristaDeProjeto(this.id_projeto);
	String ls_mensalista = Comuns.getLSMensalistaDeProjeto(this.id_projeto);
				
		
	List<Etapa> lista_etapas  = new DAO<Etapa>(Etapa.class).get(
				null, "etap.status='ATIVO' and etap.fk_projeto="+this.id_projeto, null);

		
		for(Etapa etapa: lista_etapas){	
		
		List<Subetapa> lista_subetapas  = dao_subetapa.get(
					null, "subetap.status='ATIVO' and subetap.fk_etapa="+etapa.getId_etapa(), null);
	
			for(Subetapa	subetapa: lista_subetapas){	
			
			List<ItemDeOrcamento> lista_itens  = dao_item.get(
						null, "itns.status='ATIVO' and itns.fk_subetapa="+subetapa.getId_subetapa(), null);
			
				
				for(ItemDeOrcamento	itemOrcamento: lista_itens){
				
				boolean ja_existe = false;
					for(ItemDeRelDeComposicao	item: lista){
					
						if(item.getCodigo()==null || 
								itemOrcamento.getCodigo().compareTo(item.getCodigo())==0){
							
						ja_existe = true;
						break;
						}		
					}
					
				
				if(ja_existe)
				continue;	
				
			
			
				
				ItemDeRelDeComposicao novo = new ItemDeRelDeComposicao();
					
				novo.setCodigo(itemOrcamento.getCodigo());
				novo.setDescricao("<html><b>"+itemOrcamento.getDescricao()+"</b></html>");
				novo.setQuant("");
				novo.setValor_unitario("");
				novo.setValor_total("");
				
				
				Unidade unidade = dao_unidade.get(itemOrcamento.getFk_unidade());
				
				novo.setUnidade(unidade!=null?unidade.getSimbolo():"");
					
				lista.add(novo);
				
				
				
				List<ItemXMaterialCompleto> materiais = dao_material.get(null, "mat.status='ATIVO' and ixmat_c.fk_item="+itemOrcamento.getId_item(), null);


					for(ItemXMaterialCompleto item : materiais){

					novo = new ItemDeRelDeComposicao();
					
					novo.setCodigo(item.getCodigo());
					novo.setDescricao(item.getDescricao());
					novo.setUnidade(item.getSimbolo());
					novo.setQuant(Calculo.formataValor(item.getQuantidade()));
					novo.setValor_unitario(item.getValor_unitario());
					novo.setValor_total(Calculo.formataValor(Calculo.multiplica(item.getQuantidade(), item.getValor_unitario())));	
					lista.add(novo);	
					}
				
				
					
				List<ItemXEquipamentoCompleto> equipamentos = dao_equipamento.get(null, "eq.status='ATIVO' and ixeq_c.fk_item="+itemOrcamento.getId_item(), null);


					for(ItemXEquipamentoCompleto item : equipamentos){

					novo = new ItemDeRelDeComposicao();
					
					novo.setCodigo(item.getCodigo());
					novo.setDescricao(item.getDescricao());
					novo.setUnidade(item.getSimbolo());
					novo.setQuant(Calculo.formataValor(item.getQuantidade()));
					novo.setValor_unitario(item.getValor_unitario());
					novo.setValor_total(Calculo.formataValor(Calculo.multiplica(item.getQuantidade(), item.getValor_unitario())));	
					lista.add(novo);	
					}	
					
					
				List<ItemXMaoDeObraCompleto> maos = dao_mao.get(null, "mao.status='ATIVO' and ixmao_c.fk_item="+itemOrcamento.getId_item(), null);
				
				boolean existe_mensalista = false;


					for(ItemXMaoDeObraCompleto item : maos){

					novo = new ItemDeRelDeComposicao();
					
					novo.setCodigo(item.getCodigo());
					novo.setDescricao(item.getDescricao());
					novo.setUnidade(item.getSimbolo());
					novo.setQuant(Calculo.formataValor(item.getQuantidade()));
					novo.setValor_unitario(item.getValor_unitario());
					novo.setValor_total(Calculo.formataValor(Calculo.multiplica(item.getQuantidade(), item.getValor_unitario())));	
					lista.add(novo);	
					
					if(item.getLs_tipo()!=null && item.getLs_tipo().compareTo("MENSALISTA")==0)
					existe_mensalista =true;
					}	
					
					
					
				novo = new ItemDeRelDeComposicao();
				novo.setCodigo("");
				novo.setDescricao("");
				novo.setUnidade("");
				novo.setQuant("Val. S/ Taxas: ");
				novo.setValor_unitario("");
				novo.setValor_total("R$: "+Calculo.formataValor(itemOrcamento.getValor_unitario()));	
				lista.add(novo);	
					
				
				novo = new ItemDeRelDeComposicao();	
				novo.setCodigo("");
				novo.setDescricao("");
				novo.setUnidade("");
				novo.setQuant("BDI (%):");
				novo.setValor_unitario("");
				novo.setValor_total(Calculo.formataValor(bdi));	
				lista.add(novo);
				
				novo = new ItemDeRelDeComposicao();
				novo.setCodigo("");
				novo.setDescricao("");
				novo.setUnidade("");
				novo.setQuant("LS Hor. (%):");
				novo.setValor_unitario("");
				novo.setValor_total(Calculo.formataValor(ls_horista));	
				lista.add(novo);
				
					if(existe_mensalista){
					
					novo = new ItemDeRelDeComposicao();
					novo.setCodigo("");
					novo.setDescricao("");
					novo.setUnidade("");
					novo.setQuant("LS Men. (%):");
					novo.setValor_unitario("");
					novo.setValor_total(Calculo.formataValor(ls_mensalista));	
					lista.add(novo);	
					}
				

				novo = new ItemDeRelDeComposicao();
				novo.setCodigo("");
				novo.setDescricao("");
				novo.setUnidade("");
				novo.setQuant("Valor Total: ");
				novo.setValor_unitario("");
				novo.setValor_total("R$: "+Calculo.formataValor(Comuns.getValorUnitarioDeItemComTaxas(this.id_projeto, itemOrcamento.getId_item())));	
				lista.add(novo);
				
				
				novo = new ItemDeRelDeComposicao();
				novo.setCodigo("");
				novo.setDescricao("");
				novo.setUnidade("");
				novo.setQuant("");
				novo.setValor_unitario("");
				novo.setValor_total("");	
				lista.add(novo);
				}
			}
		}
	
		
	//for(ItemDeRelDeComposicao aux : lista)
	//System.out.println(aux.getCodigo()+" "+" "+aux.getDescricao()+" "+aux.getUnidade()+" "+aux.getValor_unitario()+" "+aux.getQuant()+" "+aux.getValor_total());	
			
		
		
	FabricaDeRelatorios fabrica = new FabricaDeRelatorios(this.assinatura.isSelected(), this.id_projeto);
		
	return fabrica.relatorioDeComposicao(lista);
	}
	
	
	
}