
package comuns;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JTextField;

import beans.BDI;
import beans.Cronograma;
import beans.Empresa;
import beans.Encargo_Horista;
import beans.Encargo_Mensalista;
import beans.Endereco;
import beans.Etapa;
import beans.ItemDeOrcamento;
import beans.ItemXEquipamentoCompleto;
import beans.ItemXEquipamento_ModeloCompleto;
import beans.ItemXMaoDeObraCompleto;
import beans.ItemXMaterialCompleto;
import beans.Item_De_Cronograma;
import beans.Projeto;
import beans.Subetapa;
import beans.modelos.ItemXMaoDeObra_ModeloCompleto;
import beans.modelos.ItemXMaterial_ModeloCompleto;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import dao.DAO;





public class Comuns {


	
/******************* comuns de formularios ***********************/

	
public static final String[] ufs = {"PA", "AC", "AL", "AP", "AM",  "BA", "CE",  "DF",  "ES",  "GO",  "MA",  "MT",  "MS",  "MG", "PB",  "PR",  "PE",  "RJ",  "RJ",  "RN",  "RS", "RO",  "RR",  "SC",  "SP",  "SE",  "TO"};
	




/******************* comuns de configuracao ***********************/



	public static void setInfosPadroes(){
	/*
	List<Empresa> empresas= new DAO<Empresa>(Empresa.class).get(null, null, null);		
		
		if(empresas != null && empresas.size()>0){
		
		Comuns.id_municipio_padrao = empresas.get(0).getFk_municipio_padrao();
		Comuns.paisPadrao = empresas.get(0).getPais_padrao()==null?"":empresas.get(0).getPais_padrao();
		Comuns.numMaxDeItensPorPag = empresas.get(0).getItens_por_pagina()==0?15:empresas.get(0).getItens_por_pagina();	
		Comuns.taxa_iptu = empresas.get(0).getTaxa_iptu()==null ||empresas.get(0).getTaxa_iptu().length()==0?"0.00":empresas.get(0).getTaxa_iptu();
		
		Comuns.cod_convenio = empresas.get(0).getCod_convenio()==null || empresas.get(0).getCod_convenio().length()==0?"0000":empresas.get(0).getCod_convenio();
		Comuns.cod_agencia = empresas.get(0).getCod_agencia()==null || empresas.get(0).getCod_agencia().length()==0?"0000":empresas.get(0).getCod_agencia();
		Comuns.num_conta_corrente = empresas.get(0).getNum_conta_corrente()==null || empresas.get(0).getNum_conta_corrente().length()==0?"00000000":empresas.get(0).getNum_conta_corrente();
		Comuns.cod_carteira = empresas.get(0).getCod_carteira()==null || empresas.get(0).getCod_carteira().length()==0?"00":empresas.get(0).getCod_carteira();
		Comuns.id_endereco_prefeitura = empresas.get(0).getFk_endereco();
		Comuns.nome_diretor_tributos = empresas.get(0).getNome_diretor_tributos();
		}
		else{
			
		Comuns.id_municipio_padrao = 0;
		Comuns.paisPadrao = "";
		Comuns.numMaxDeItensPorPag = 15;	
		Comuns.taxa_iptu = "2.00";	
		
		Comuns.cod_convenio = "0000";
		Comuns.cod_agencia = "0000";
		Comuns.num_conta_corrente = "00000000";
		Comuns.cod_carteira = "00";
		Comuns.id_endereco_prefeitura = 0;
		Comuns.nome_diretor_tributos = "";
		}*/
	}






	public static void textFieldErroMode(JTextField field){	
	
	if(field == null)
	return;
	
	if(field.getText().length() == 0)
	field.setBackground(Color.red);
	else
	field.setForeground(Color.red);	
		
	}
	
	
	
	
	
	public static void addEventoDeFoco(List<JTextField> fields){
		
	if(fields == null)
	return;
	
		for( final JTextField field : fields){
	
			field.addFocusListener(new FocusAdapter() {  
			
				@Override
				public void focusGained(FocusEvent e) {
		   
				if(field.getText().length() == 0)
				field.setBackground(Color.white);
				else
				field.setForeground(Color.black);	
				}
			});
		}
	}


	
	

	public static void removeIndicadoresDeErro(JTextField field){
		
	if(field == null)
	return;
			
	if(field.getText().length() == 0)
	field.setBackground(Color.white);
	else
	field.setForeground(Color.black);	
		
	}

	
	
	/******************* search ***********************/

	
	
	public static String searchSubQuery(String search, String locale){
		
	
	if(search == null || locale == null || search.length() == 0 || locale.length() == 0) 
	return "";
						
	StringBuilder subquery = new StringBuilder();	
			
	String[] tokens = search.split("\\s");
	String[] fields = locale.split("\\s");
			
		for (int i=0; i<fields.length; i++){
			    
		subquery.append(" ( ");	 
			    
		for (int j=0; j<tokens.length; j++){
		subquery.append(fields[i]+ " like '%"+tokens[j]+"%' ");
				    			 
		if(j< tokens.length-1)
		subquery.append(" AND ");	
		}
				
	subquery.append(" ) ");	
				
		if(i< fields.length-1)
		subquery.append(" OR ");
		}
	
	return subquery.toString();
	}
	



	
	/******************* search ***********************/
	
	
	

	public static boolean emailValidation(String email){

	if(email.length() == 0)
	return false;

	Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");  
	   
	if(pattern.matcher(email).matches())
	return true;
	else
	return false;
	}

	
	
	

	/******************* outros ***********************/
	
	

	
	

	public static boolean codigoPermitido(DAO<?> dao, String codigo, int id_remove){
		
	return Comuns.codigoPermitido(dao,  codigo, id_remove, null);
	}
	
	
	
	

	
	public static boolean codigoPermitido(DAO<?> dao, String codigo, int id_remove, String where_adicional){
		
	Class<?> tipo = dao.getTipo();
	
	String prefixo = tipo.getAnnotation(Anot_BD_Tabela.class).prefixo();
	
	String id = "";
	
		if(id_remove>0){

			for (Field field : tipo.getDeclaredFields()) {
				
				if (field.getAnnotation(Anot_BD_Campo.class).ehId()){
				id +=" AND "+field.getAnnotation(Anot_BD_Campo.class).nome()+"<>"+id_remove;
				break;
				}
			}
		}
		
	return dao.get(null, (where_adicional!=null && where_adicional.length()>0?where_adicional+" AND ":"")
			+prefixo+".codigo='"+codigo+"'"+id, null).size()>0?false:true;	
	}
	
	
	
	
	

	
	public static String atualizaValorDeItemModelo(int id_item){
		
	String valor = "0.00";	
		
	for(ItemXMaterial_ModeloCompleto aux: 
			new DAO<ItemXMaterial_ModeloCompleto>(ItemXMaterial_ModeloCompleto.class).get(null, "ixm_mod.fk_item="+id_item, null))
	valor =  Calculo.soma(valor, Calculo.multiplica(aux.getQuantidade(), aux.getValor_unitario()));	
			
			
	for(ItemXEquipamento_ModeloCompleto aux: 
		new DAO<ItemXEquipamento_ModeloCompleto>(ItemXEquipamento_ModeloCompleto.class).get(null, "ixeq_mod.fk_item="+id_item, null))
	valor =  Calculo.soma(valor, Calculo.multiplica(aux.getQuantidade(), aux.getValor_unitario()));	
		
	
	for(ItemXMaoDeObra_ModeloCompleto aux: 
		new DAO<ItemXMaoDeObra_ModeloCompleto>(ItemXMaoDeObra_ModeloCompleto.class).get(null, "ixm_o_mod.fk_item="+id_item, null))
	valor =  Calculo.soma(valor, Calculo.multiplica(aux.getCoef_produtividade(), aux.getValor_hora()));	
			
	return valor;	
	}
	
	
	
	

	public static Empresa getEmpresa(){
		
	List<Empresa> lista= new DAO<Empresa>(Empresa.class).get(null, null, null);	
				
	if(lista!=null && lista.size()>0)
	return lista.get(0);				
		
	return new Empresa();	
	}
	
	
	
	
	

	
	public static String getDescricaoEndereco(Endereco endereco){
				
	if(endereco ==null)
	return null;
	
	String retorno =  endereco.getLogradouro()
			+(endereco.getNum()!=null && endereco.getNum().length()>0? " "+endereco.getNum(): " S/N")
			+(endereco.getComplemento()!=null && endereco.getComplemento().length()>0?" "+endereco.getComplemento():"")
			+". "
			+(endereco.getBairro()!=null && endereco.getBairro().length()>0?endereco.getBairro():"")
			+(endereco.getCep()!=null &&endereco.getCep().length()>0?" CEP "+endereco.getCep():"")
			+" "
			+(endereco.getCidade()!=null &&endereco.getCidade().length()>0?endereco.getCidade():"")
			+" - "
			+(endereco.getUf()!=null &&endereco.getUf().length()>0?endereco.getUf():"");	
		
	return retorno;
	}
	
	
	
	

	public static String getValorTotalProjeto(int id_projeto){
	
	String valor_total = "0.00";	
		
	for(Etapa etapa : new DAO<Etapa>(Etapa.class).get(
								null, "etap.status='ATIVO' and etap.fk_projeto="+id_projeto, null))
	valor_total = Calculo.soma(valor_total,Comuns.getValorTotalEtapa(id_projeto, etapa.getId_etapa()));
		
	return valor_total; 
	}
	
	
	
	
	
	
	
	public static String getValorTotalEtapa(int id_projeto, int id_etapa){
	
	String valor_total = "0.00";	
		
	for(Subetapa subetapa : new DAO<Subetapa>(Subetapa.class).get(
													null,
													"subetap.status='ATIVO' and subetap.fk_etapa="+id_etapa, 
													null))
	valor_total = Calculo.soma(valor_total,Comuns.getValorTotalSubEtapa(id_projeto, subetapa.getId_subetapa()));
		
	
	return valor_total; 
	}
	
	
	
	
	
	
	

	public static String getValorTotalSubEtapa(int id_projeto, int id_subetapa){
	
	String valor_total = "0.00";	
		
	Subetapa subetapa = new DAO<Subetapa>(Subetapa.class).get(id_subetapa);

		if(subetapa!=null){
			
		for(ItemDeOrcamento item : new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).get(
													null,
													"itns.status='ATIVO' and itns.fk_subetapa="+subetapa.getId_subetapa(), 
													null))
		valor_total = Calculo.soma(valor_total, 
					Calculo.multiplica(Comuns.getValorUnitarioDeItemComTaxas(id_projeto, item), item.getQuantidade()));
		}
		
	return valor_total; 
	}
	
	
	
	

	
	
	public static String getValorUnitarioDeItemComTaxas(int id_projeto, int id_item){
		
		
	return Comuns.getValorUnitarioDeItemComTaxas(id_projeto, new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).get(id_item)); 
	}
	
	
	
	
	

	public static String getValorUnitarioDeItemComTaxas(int id_projeto, ItemDeOrcamento item){
		
	if(item==null)
	return "0.00";
	
	
	String tmat = "0.00";
	for(ItemXMaterialCompleto material : new DAO<ItemXMaterialCompleto>(ItemXMaterialCompleto.class).get(null, "mat.status='ATIVO' and ixmat_c.fk_item="+item.getId_item(), null))
	tmat  = Calculo.multiplica(material.getValor_unitario(), material.getQuantidade());

	String teq = "0.00";
	for(ItemXEquipamentoCompleto equipamento : new DAO<ItemXEquipamentoCompleto>(ItemXEquipamentoCompleto.class).get(null, "eq.status='ATIVO' and ixeq_c.fk_item="+item.getId_item(), null))
		teq  = Calculo.multiplica(equipamento.getValor_unitario(), equipamento.getQuantidade());

	int nhor = 0;
	int nme = 0;
	String tme = "0.00";
	String thor = "0.00";
	
		for(ItemXMaoDeObraCompleto mao : new DAO<ItemXMaoDeObraCompleto>(ItemXMaoDeObraCompleto.class).get(null, "mao.status='ATIVO' and ixmao_c.fk_item="+item.getId_item(), null)){
		
			if(mao.getLs_tipo()!=null && mao.getLs_tipo().compareTo("MENSALISTA")==0){
			nme++;
			tme  = Calculo.multiplica(mao.getValor_unitario(), mao.getQuantidade());
			}
			else{
			nhor++;	
			thor  = Calculo.multiplica(mao.getValor_unitario(), mao.getQuantidade());
			}
		}
	
	
	String tg = Calculo.soma(Calculo.soma(Calculo.soma(tmat, teq), thor), tme);
	
	
	
	String phor = Calculo.dividi(Comuns.getLSHoristaDeProjeto(id_projeto), "100", 4);	
	String pme = Calculo.dividi(Comuns.getLSMensalistaDeProjeto(id_projeto), "100", 4);	
	String bdi = Calculo.dividi(Comuns.getBDIDeProjeto(id_projeto), "100", 4);	
	
	String phor_me = "0.00";
	
	if(nhor+nme==0)
	phor_me  =Calculo.multiplica(tg, phor);	
	else
	phor_me  =Calculo.dividi(Calculo.soma(Calculo.multiplica(phor, ""+nhor), Calculo.multiplica(pme, ""+nme)),""+(nhor+nme), 4);	
	
	
	return Calculo.soma(tg,
					Calculo.soma(
							Calculo.soma(
									Calculo.soma(
										Calculo.multiplica(Calculo.soma(tmat, teq), phor_me),
										Calculo.multiplica(thor, phor)),
										Calculo.multiplica(tme, pme)),
										Calculo.multiplica(tg, bdi)));
	
	/* 
	 
	  
	tg = tmat + teq + thor + tme; 
	
	phor_me  = (nhor * phor + nme * pme) / nhor + nme
	
	
	 v = tg + ((tm + teq) * phor_me)
	  + (thor * phor) + (tme * pme) + (tg * bdi);
	 
	
	 */
	}
	
	
	
	
	
	
	
	public static String getBDIDeProjeto(int id_projeto){
		
	return Comuns.getBDIDeProjeto(new DAO<Projeto>(Projeto.class).get(id_projeto)); 
	}
	
	
	
	

	
	public static String getBDIDeProjeto(Projeto projeto){
		
	if(projeto==null)
	return "0.00";
		
	BDI bdi = new DAO<BDI>(BDI.class).get(projeto.getFk_bdi());
	
	if(bdi!=null)
	return bdi.getValor_final();		
			
	return "0.00"; 
	}
	
	
	



	public static String getLSMensalistaDeProjeto(int id_projeto){
		
	return Comuns.getLSMensalistaDeProjeto(new DAO<Projeto>(Projeto.class).get(id_projeto));  
	}
	
	
	
	
	
	

	public static String getLSMensalistaDeProjeto(Projeto projeto){
		
	if(projeto==null)
	return "0.00";
				
	Encargo_Mensalista encargo = new DAO<Encargo_Mensalista>(Encargo_Mensalista.class).get(projeto.getFk_encargo_mensalista());
			
	if(encargo!=null)
	return encargo.getValor_total();		
					
	return "0.00";  
	}
	
	
	
	
	
	
	
	
	
	

	public static String getLSHoristaDeProjeto(int id_projeto){
		
	return Comuns.getLSHoristaDeProjeto(new DAO<Projeto>(Projeto.class).get(id_projeto));  
	}
	
	
	
	
	
	

	public static String getLSHoristaDeProjeto(Projeto projeto){
		
	if(projeto==null)
	return "0.00";
				
	Encargo_Horista encargo = new DAO<Encargo_Horista>(Encargo_Horista.class).get(projeto.getFk_encargo_horista());
			
	if(encargo!=null)
	return encargo.getValor_total();		
					
	return "0.00";  
	}
	
	
	
	
	
	
	

	
	public static int getQuantMesesDeDuracaoDeProjeto(int id_projeto, int quant_minimo){
	
	List<Cronograma> cronogramas  = new DAO<Cronograma>(Cronograma.class).get(
						null, "cron.fk_projeto="+id_projeto, null);
	
	int quant = quant_minimo;
	
		for(Cronograma cronograma: cronogramas){
	
		List<Item_De_Cronograma> itens  = new DAO<Item_De_Cronograma>(Item_De_Cronograma.class).get(
					null, "i_cron.fk_cronograma="+cronograma.getId_cronograma(), null);
		

			for(Item_De_Cronograma item: itens){
				
			if(item.getMes()>quant)	
			quant = item.getMes();
			}	
		}
		
		
	return quant;
	}
	
	
	
	
	
	
	public static int calculaIdadeRetornaInteiro(Date nascimento){
	
	if(nascimento == null)
	return 0;
		
	Calendar dateOfBirth = new GregorianCalendar();
	dateOfBirth.setTime(nascimento);
	
	Calendar today = Calendar.getInstance();

	int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
	dateOfBirth.add(Calendar.YEAR, age);
	
	if (today.before(dateOfBirth))
	age--;

	return age;
	}
	
	
	

	
	public static String calculaIdade(Date nascimento){
		
	if(nascimento == null)
	return "";
			
	Calendar dateOfBirth = new GregorianCalendar();
	dateOfBirth.setTime(nascimento);
		
	Calendar today = Calendar.getInstance();

	int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
	
		if(age == 0){
		
		int meses = today.get(Calendar.MONTH) - dateOfBirth.get(Calendar.MONTH);	
		
			if(meses > 0){
			
			if(today.get(Calendar.DAY_OF_MONTH) - dateOfBirth.get(Calendar.DAY_OF_MONTH)<0	)
			meses--;
			}
			else if(meses==0){
					
			int dias =today.get(Calendar.DAY_OF_MONTH) - dateOfBirth.get(Calendar.DAY_OF_MONTH); 	
			
			return dias+" dia(s)";
			}
			
		
		return meses +" mes(es)";
		}
		else{
		
		if (today.before(dateOfBirth))
		age--;
		}
		
	return age+" ano(s)";
	}
		
	
	
	

	public static String addPaddingAEsquerda(String valor, int num, String add){
		
	
	for(int i  = valor.length(); i < num; i++)
	valor = add+valor;
		
	return valor;	
	}
	
		
}	