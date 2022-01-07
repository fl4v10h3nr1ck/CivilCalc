package principal.relatorios;

import java.util.ArrayList;
import java.util.List;

import beans.Etapa;
import beans.ItemDeRelDeResumo;
import comuns.Calculo;
import comuns.Comuns;
import comuns.FabricaDeRelatorios;
import dao.DAO;

public class FormDeRelDeResumo extends FormDeRelBase{

	
	
private static final long serialVersionUID = 1L;




	public FormDeRelDeResumo() {
		
	super("Relatório de Resumo");
	}


	
	
	@Override
	public boolean setRelatorio() {
		
	FabricaDeRelatorios fabrica = new FabricaDeRelatorios(this.assinatura.isSelected(), this.id_projeto);
		
	
	List<ItemDeRelDeResumo> lista = new ArrayList<ItemDeRelDeResumo>();
	
		
	List<Etapa> lista_etapas  = new DAO<Etapa>(Etapa.class).get(
			null, "etap.status='ATIVO' and etap.fk_projeto="+this.id_projeto, null);

	
	String valor_projeto = Comuns.getValorTotalProjeto(this.id_projeto);
	String dbi = Comuns.getBDIDeProjeto(this.id_projeto);
	int duracao = Comuns.getQuantMesesDeDuracaoDeProjeto(id_projeto, 0);
	
		for(Etapa etapa: lista_etapas){
	
		String valor = 	Comuns.getValorTotalEtapa(this.id_projeto, etapa.getId_etapa());
			
		ItemDeRelDeResumo item = new ItemDeRelDeResumo();	
		item.setEtapa(etapa.getTitulo());
		item.setValor(Calculo.formataValor(valor));
		item.setPorcento(Calculo.formataValor(Calculo.getPorcentagemCorrespondente(valor_projeto, valor)));
		lista.add(item);
		}
	
	
	return fabrica.relatorioDeResumo(lista, 
			Calculo.formataValor(dbi), 
			Calculo.formataValor(Calculo.soma(valor_projeto, Calculo.calcPorcentagem(valor_projeto, dbi))),
			duracao+" Mese(s).");
	}
	
	

	
	
	
	
	
}
