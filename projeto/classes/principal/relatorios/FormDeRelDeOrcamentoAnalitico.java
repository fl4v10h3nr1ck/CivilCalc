package principal.relatorios;

import java.util.ArrayList;
import java.util.List;

import beans.Etapa;
import beans.ItemDeOrcamento;
import beans.ItemDeRelatorioAnalitico;
import beans.Subetapa;
import beans.Unidade;
import comuns.Calculo;
import comuns.Comuns;
import comuns.FabricaDeRelatorios;
import dao.DAO;




public class FormDeRelDeOrcamentoAnalitico  extends FormDeRelBase{


	
private static final long serialVersionUID = 1L;



	public FormDeRelDeOrcamentoAnalitico() {
	
	super("Relatório de Orçamento Analítico");
	}




	@Override
	public boolean setRelatorio() {
	
	List<ItemDeRelatorioAnalitico> lista = new ArrayList<ItemDeRelatorioAnalitico>();	
		
	
	DAO<ItemDeOrcamento> dao_item= new DAO<ItemDeOrcamento>(ItemDeOrcamento.class);
	DAO<Subetapa> dao_subetapa= new DAO<Subetapa>(Subetapa.class);
	DAO<Unidade> dao_unidade= new DAO<Unidade>(Unidade.class);

	
		
	List<Etapa> lista_etapas  = new DAO<Etapa>(Etapa.class).get(
				null, "etap.status='ATIVO' and etap.fk_projeto="+this.id_projeto, null);

		
		for(int i = 0;  i < lista_etapas.size();i++){	
		
		Etapa etapa	 = lista_etapas.get(i);
		
		ItemDeRelatorioAnalitico	item = new ItemDeRelatorioAnalitico();
		
		item.setCodigo("");
		item.setContador(""+(i+1));	
		item.setDescricao(etapa.getTitulo());	
		item.setQuant("");
		item.setUnidade("");
		item.setValor_total(Calculo.formataValor(Comuns.getValorTotalEtapa(this.id_projeto, etapa.getId_etapa())));
		item.setValor_unitario("");
		item.setEtapa(true);
		lista.add(item);
		
		
		List<Subetapa> lista_subetapas  = dao_subetapa.get(
					null, "subetap.status='ATIVO' and subetap.fk_etapa="+etapa.getId_etapa(), null);
	
		
		if(lista_subetapas.size()==0)
		continue;
		
			for(int j = 0;  j < lista_subetapas.size();j++){
		
			Subetapa	subetapa  = lista_subetapas.get(j);
				
				
				if(lista_subetapas.size()>1){
				
				item = new ItemDeRelatorioAnalitico();
				
				item.setCodigo("");
				item.setContador(""+(i+1)+"."+(j+1));	
				item.setDescricao(subetapa.getTitulo());	
				item.setQuant("");
				item.setUnidade("");
				item.setValor_total("");
				item.setValor_unitario("");
				item.setSubetapa(true);
				
				lista.add(item);
				}
			
				
			List<ItemDeOrcamento> lista_itens  = dao_item.get(
						null, "itns.status='ATIVO' and itns.fk_subetapa="+subetapa.getId_subetapa(), null);
			
				
				for(int k = 0;  k < lista_itens.size(); k++){
				
				ItemDeOrcamento	itemOrcamento  = lista_itens.get(k);	
					
				item = new ItemDeRelatorioAnalitico();
				
				item.setCodigo(itemOrcamento.getCodigo());
				item.setContador(""+(i+1)+"."+(j+1)+"."+(k+1));	
				item.setDescricao(itemOrcamento.getDescricao());	
				item.setQuant(itemOrcamento.getQuantidade());
				
				Unidade unidade = dao_unidade.get(itemOrcamento.getFk_unidade());
				
				item.setUnidade(unidade!=null?unidade.getSimbolo():"");
				
				String valor_uni = Calculo.formataValor(Comuns.getValorUnitarioDeItemComTaxas(this.id_projeto, itemOrcamento));
				
				item.setValor_unitario(valor_uni);
				item.setValor_total(Calculo.formataValor(Calculo.multiplica(valor_uni, item.getQuant())));
		
				item.setItem(true);
				
				lista.add(item);	
				}
			}
		}
		
		
	
	//for(ItemDeRelatorioAnalitico aux : lista)
	//System.out.println(aux.getCodigo()+" "+aux.getContador()+" "+aux.getDescricao()+" "+aux.getUnidade()+" "+aux.getValor_unitario()+" "+aux.getQuant()+" "+aux.getValor_total());	
		
	
	FabricaDeRelatorios fabrica = new FabricaDeRelatorios(this.assinatura.isSelected(), this.id_projeto);
		
	return fabrica.relatorioDeOrcamento(lista);
	}
	
	
	
}
