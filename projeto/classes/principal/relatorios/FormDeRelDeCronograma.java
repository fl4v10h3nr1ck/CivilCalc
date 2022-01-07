package principal.relatorios;

import java.util.ArrayList;
import java.util.List;

import beans.Cronograma;
import beans.ItemDeRelatorioDeCronograma;
import beans.Etapa;
import beans.Item_De_Cronograma;
import beans.ParteParaRelatorioDeCronograma;
import beans.Subetapa;
import comuns.Calculo;
import comuns.Comuns;
import comuns.FabricaDeRelatorios;
import dao.DAO;



public class FormDeRelDeCronograma extends FormDeRelBase {




private static final long serialVersionUID = 1L;




	

	public FormDeRelDeCronograma() {
	
	super("Relatório de Cronograma");
	}


	
	
	
	
	@Override
	public boolean setRelatorio() {
		
	if(!validacao())
	return false;
			
			
	List<ParteParaRelatorioDeCronograma> lista = new ArrayList<ParteParaRelatorioDeCronograma>();
			
	int duracao = Comuns.getQuantMesesDeDuracaoDeProjeto(id_projeto, 0);
	int maior_mes = duracao<12?12:duracao;
	int quant_mes  = (maior_mes/12)+(maior_mes%12>0?1:0);
			

		for(int q_partes = 0; q_partes < quant_mes; q_partes++){
		
		ItemDeRelatorioDeCronograma item_total = new ItemDeRelatorioDeCronograma();	
		
		item_total.setEhEtapa(true);
		item_total.setTitulo("TOTAL");
		
		
		ParteParaRelatorioDeCronograma parte = new ParteParaRelatorioDeCronograma();	
				
		int mes_inicial = (q_partes*12)+1;
				
		parte.setTitulo("CRONOGRAMA PARA O MÊS "+mes_inicial+" à "+(mes_inicial+11));
		parte.setItens(new ArrayList<ItemDeRelatorioDeCronograma>());
				
		parte.setMes_1("MÊS "+(mes_inicial));
		parte.setMes_2("MÊS "+(mes_inicial+1));
		parte.setMes_3("MÊS "+(mes_inicial+2));
		parte.setMes_4("MÊS "+(mes_inicial+3));
		parte.setMes_5("MÊS "+(mes_inicial+4));
		parte.setMes_6("MÊS "+(mes_inicial+5));
		parte.setMes_7("MÊS "+(mes_inicial+6));
		parte.setMes_8("MÊS "+(mes_inicial+7));
		parte.setMes_9("MÊS "+(mes_inicial+8));
		parte.setMes_10("MÊS "+(mes_inicial+9));
		parte.setMes_11("MÊS "+(mes_inicial+10));
		parte.setMes_12("MÊS "+(mes_inicial+11));
					
		lista.add(parte);
			
				
		List<Etapa> lista_etapas  = new DAO<Etapa>(Etapa.class).get(
					null, "etap.status='ATIVO' and etap.fk_projeto="+this.id_projeto, null);

				
			for(Etapa etapa: lista_etapas){
					

			//String valor_etapa = Comuns.getValorTotalEtapa(etapa.getId_etapa());
					
			List<Subetapa> lista_subetapas  = new DAO<Subetapa>(Subetapa.class).get(
					null, "subetap.status='ATIVO' and subetap.fk_etapa="+etapa.getId_etapa(), null);
	
			
			ItemDeRelatorioDeCronograma item = null;
			ItemDeRelatorioDeCronograma referencia_item_etapa = null;
					

				if(lista_subetapas.size()>1){
					
				referencia_item_etapa = new ItemDeRelatorioDeCronograma();	
							
				referencia_item_etapa.setTitulo(etapa.getTitulo());
							
				referencia_item_etapa.setEhEtapa(true);
				referencia_item_etapa.setPorcento_total("");
				referencia_item_etapa.setMes_1("");
				referencia_item_etapa.setMes_2("");
				referencia_item_etapa.setMes_3("");
				referencia_item_etapa.setMes_4("");
				referencia_item_etapa.setMes_5("");
				referencia_item_etapa.setMes_6("");
				referencia_item_etapa.setMes_7("");
				referencia_item_etapa.setMes_8("");
				referencia_item_etapa.setMes_9("");
				referencia_item_etapa.setMes_10("");
				referencia_item_etapa.setMes_11("");
				referencia_item_etapa.setMes_12("");
						
				parte.getItens().add(referencia_item_etapa);
				}	
							
			String valor_total_subetapa__no_periodo = "0.00";	
				
				for(Subetapa subetapa: lista_subetapas){
							
				item = new ItemDeRelatorioDeCronograma();	

				if(lista_subetapas.size()>1)
				item.setTitulo(subetapa.getTitulo());			
				else
				item.setTitulo(etapa.getTitulo());

				
				String valor_total_subetapa = Comuns.getValorTotalSubEtapa(this.id_projeto, subetapa.getId_subetapa());

				String porcento_subetapa = "0.00";
						
				List<Cronograma> cronogramas  = new DAO<Cronograma>(Cronograma.class).get(
									null, "cron.tipo='SUBETAPA' and cron.fk_subetapa="+subetapa.getId_subetapa(), null);
								
								
					if(cronogramas==null || cronogramas.size()==0){
							
					item.setEhEtapa(false);
					item.setValor_total("0,00");
					item.setPorcento_total("");
					item.setMes_1("");
					item.setMes_2("");
					item.setMes_3("");
					item.setMes_4("");
					item.setMes_5("");
					item.setMes_6("");
					item.setMes_7("");
					item.setMes_8("");
					item.setMes_9("");
					item.setMes_10("");
					item.setMes_11("");
					item.setMes_12("");
								
					}		
					else{
							
					List<Item_De_Cronograma> itens  = new DAO<Item_De_Cronograma>(Item_De_Cronograma.class).get(
										null, "i_cron.fk_cronograma="+cronogramas.get(0).getId_cronograma(), null);
										
						if(itens!=null && itens.size()>0){
								
							for(Item_De_Cronograma aux: itens){
							
							String valor = Calculo.formataValor(Calculo.calcPorcentagem(valor_total_subetapa, aux.getValor()));	
							String rotulo_valor = valor+" ("+aux.getValor()+"%)";	
									
							porcento_subetapa = Calculo.soma(porcento_subetapa, aux.getValor());
									
								if((q_partes*12)+1==aux.getMes()){
								item.setMes_1(rotulo_valor);
								item_total.setMes_1(Calculo.soma(item_total.getMes_1(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
										
								if((q_partes*12)+2==aux.getMes()){
								item.setMes_2(rotulo_valor);
								item_total.setMes_2(Calculo.soma(item_total.getMes_2(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
										
								if((q_partes*12)+3==aux.getMes()){
								item.setMes_3(rotulo_valor);
								item_total.setMes_3(Calculo.soma(item_total.getMes_3(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
										
								if((q_partes*12)+4==aux.getMes()){
								item.setMes_4(rotulo_valor);
								item_total.setMes_4(Calculo.soma(item_total.getMes_4(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
								
								if((q_partes*12)+5==aux.getMes()){
								item.setMes_5(rotulo_valor);
								item_total.setMes_5(Calculo.soma(item_total.getMes_5(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
								
								if((q_partes*12)+6==aux.getMes()){
								item.setMes_6(rotulo_valor);
								item_total.setMes_6(Calculo.soma(item_total.getMes_6(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
			
								if((q_partes*12)+7==aux.getMes()){
								item.setMes_7(rotulo_valor);
								item_total.setMes_7(Calculo.soma(item_total.getMes_7(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
								
								if((q_partes*12)+8==aux.getMes()){
								item.setMes_8(rotulo_valor);
								item_total.setMes_8(Calculo.soma(item_total.getMes_8(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
	
								if((q_partes*12)+9==aux.getMes()){
								item.setMes_9(rotulo_valor);
								item_total.setMes_9(Calculo.soma(item_total.getMes_9(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
								
								if((q_partes*12)+10==aux.getMes()){
								item.setMes_10(rotulo_valor);
								item_total.setMes_10(Calculo.soma(item_total.getMes_10(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}	
								
								if((q_partes*12)+11==aux.getMes()){
								item.setMes_11(rotulo_valor);
								item_total.setMes_11(Calculo.soma(item_total.getMes_11(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}
								
								if((q_partes*12)+12==aux.getMes()){
								item.setMes_12(rotulo_valor);
								item_total.setMes_12(Calculo.soma(item_total.getMes_12(), valor));
								item.setValor_total(Calculo.soma(item.getValor_total(), valor));
								}			
							}
						}	
					
					valor_total_subetapa__no_periodo = Calculo.soma(valor_total_subetapa__no_periodo, item.getValor_total());
					item.setValor_total(Calculo.formataValor(item.getValor_total()));
					}
				
				if(referencia_item_etapa!=null)
				referencia_item_etapa.setValor_total(Calculo.formataValor(valor_total_subetapa__no_periodo));		
			
				if(lista_subetapas.size()>1)	
				item.setPorcento_total(Calculo.formataValor(porcento_subetapa));
				else
				item.setEhEtapa(true);
					
				
				parte.getItens().add(item);	
				}		
			}	
		
	
		String valor_total_mes = 
				Calculo.soma(item_total.getMes_1(),
				Calculo.soma(item_total.getMes_2(),
				Calculo.soma(item_total.getMes_3(),
				Calculo.soma(item_total.getMes_4(),
				Calculo.soma(item_total.getMes_5(),
				Calculo.soma(item_total.getMes_6(),
				Calculo.soma(item_total.getMes_7(),
				Calculo.soma(item_total.getMes_8(),
				Calculo.soma(item_total.getMes_9(),
				Calculo.soma(item_total.getMes_10(),
				Calculo.soma(item_total.getMes_11(),item_total.getMes_12())))))))))));
				
		item_total.setValor_total(Calculo.formataValor(valor_total_mes));				
		parte.getItens().add(item_total);
		}	
			
	FabricaDeRelatorios	fabrica = new FabricaDeRelatorios(this.assinatura.isSelected(), this.id_projeto);
	return fabrica.relatorioDeCronograma(lista, duracao+" Mese(s).");
	}
	
	
	
	
	
	
}	


