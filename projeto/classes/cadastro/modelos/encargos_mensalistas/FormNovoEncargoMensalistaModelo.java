package cadastro.modelos.encargos_mensalistas;

import java.util.List;

import dao.DAO;
import beans.Dados_Encargos;
import beans.modelos.Encargo_Mensalista_Modelo;



public class FormNovoEncargoMensalistaModelo extends FormEncargoMensalistaModeloBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormNovoEncargoMensalistaModelo() {
			
	this(null);
	}


	
	
	

	public FormNovoEncargoMensalistaModelo(Encargo_Mensalista_Modelo retorno) {
			
	super("Novo Encargo Mensalista (Modelo)", retorno);
	
	this.adicionarComponentes();
	
	
	List<Dados_Encargos> dados_encargo = new DAO<Dados_Encargos>(Dados_Encargos.class).get(null, null, null);
		
	if(dados_encargo==null || dados_encargo.size()==0)
	return;	
		
		
	painel.tf_jornada_mensal.setText(dados_encargo.get(0).getJornada_mensal());
	painel.tf_repouso_semanal_remu.setText(dados_encargo.get(0).getRepouso_semanal());
	painel.tf_feriados.setText(dados_encargo.get(0).getFeriados());
	painel.tf_aux_enfermidade_dias.setText(dados_encargo.get(0).getAux_enfermidade());
	painel.tf_licen_paternidade_dias.setText(dados_encargo.get(0).getLicen_paternidade());
	painel.tf_licen_maternidade_dias.setText(dados_encargo.get(0).getLicen_maternidade());
	painel.tf_faltas_justificadas.setText(dados_encargo.get(0).getFaltas_justificadas());
	painel.tf_dias_chuva.setText(dados_encargo.get(0).getDias_chuva());
	painel.tf_aux_acidente.setText(dados_encargo.get(0).getAux_acidente());
	painel.tf_ferias_dias.setText(dados_encargo.get(0).getFerias());
	painel.tf_ano_produtivo.setText(dados_encargo.get(0).getAno_produtivo());
	painel.tf_ano_produtivo_sem_horas_trab.setText(dados_encargo.get(0).getAno_produtivo_sem_horas_trab());
	painel.tf_salario_13_dias.setText(dados_encargo.get(0).getSalario_13());
	painel.tf_aviso_previo_indenizado.setText(dados_encargo.get(0).getAviso_previo_indenizado());
	painel.tf_aviso_previo_trabalhado.setText(dados_encargo.get(0).getAviso_previo_trabalhado());
	painel.tf_ferias_indenizadas.setText(dados_encargo.get(0).getFerias_indenizadas());
	painel.tf_despedida_injusta.setText(dados_encargo.get(0).getDespedida_injusta());
	painel.tf_indenizacao_adicional.setText(dados_encargo.get(0).getIndenizacao_adicional());
		
	painel.tf_custo_conducao.setText(dados_encargo.get(0).getCusto_conducao());
	painel.tf_custo_cafe_manha.setText(dados_encargo.get(0).getCusto_cafe_manha());
	painel.tf_custo_refeicao.setText(dados_encargo.get(0).getCusto_refeicao());
	painel.tf_custo_seguro.setText(dados_encargo.get(0).getCusto_seguro());
	painel.tf_custo_epi.setText(dados_encargo.get(0).getCusto_epi());
	painel.tf_salario_minimo.setText(dados_encargo.get(0).getSalario_minimo());
		
	painel.tf_desligamentos.setText(dados_encargo.get(0).getDesligamentos());
	painel.tf_dispensa_injusta.setText(dados_encargo.get(0).getDispensa_injusta());
	painel.tf_dispensa_justa.setText(dados_encargo.get(0).getDispensa_justa());
	painel.tf_espontaneos.setText(dados_encargo.get(0).getEspontaneos());
	painel.tf_fim_de_contrato.setText(dados_encargo.get(0).getFim_de_contrato());
	painel.tf_termino_de_contrato.setText(dados_encargo.get(0).getTermino_de_contrato());
	painel.tf_aposentados.setText(dados_encargo.get(0).getAposentados());
	painel.tf_mortos.setText(dados_encargo.get(0).getMortos());
	painel.tf_transferencias.setText(dados_encargo.get(0).getTransferencias());
	painel.tf_estoque.setText(dados_encargo.get(0).getEstoque());
	painel.tf_estoque_recuperado_inicio.setText(dados_encargo.get(0).getEstoque_recuperado_inicio());
	painel.tf_estoque_recuperado_fim.setText(dados_encargo.get(0).getEstoque_recuperado_fim());
	painel.tf_estoque_medio.setText(dados_encargo.get(0).getEstoque_medio());
	painel.tf_dispensados_descontados.setText(dados_encargo.get(0).getDispensados_descontados());
	painel.tf_dispensados.setText(dados_encargo.get(0).getDispensados());
	painel.tf_rotatividade_descontada.setText(dados_encargo.get(0).getRotatividade_descontada());
	painel.tf_rotatividade_nao_descontada.setText(dados_encargo.get(0).getRotatividade_nao_descontada());
	painel.tf_desligados_espontaneos.setText(dados_encargo.get(0).getDesligados_espontaneos());
	painel.tf_duracao_media_emprego.setText(dados_encargo.get(0).getDuracao_media_emprego());
	painel.tf_percentual_dispensa_injusta.setText(dados_encargo.get(0).getPercentual_dispensa_injusta());

	painel.tf_num_conducoes.setText(dados_encargo.get(0).getNum_conducao());
	painel.tf_num_refeicoes.setText(dados_encargo.get(0).getNum_refeicoes());
	painel.tf_num_ferramentas_manu.setText(dados_encargo.get(0).getNum_ferramentas_manu());
	}




	
	
	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	this.painel.calculaEncargo();
	
	if(this.retorno==null)
	this.retorno = new Encargo_Mensalista_Modelo();			
	
	this.retorno.setCodigo(this.tf_codigo.getText());
	this.retorno.setInss_previdencia(this.painel.tf_inss_previdencia.getText());
	this.retorno.setFgts(this.painel.tf_fgts.getText());
	this.retorno.setSalario_edu(this.painel.tf_salario_edu.getText());
	this.retorno.setSesi(this.painel.tf_sesi.getText());
	this.retorno.setSenai(this.painel.tf_senai.getText());
	this.retorno.setSebrae(this.painel.tf_sebrae.getText());
	this.retorno.setIncra(this.painel.tf_incra.getText());
	this.retorno.setInss_seguro(this.painel.tf_inss_seguro.getText());
	this.retorno.setSeconci(this.painel.tf_seconci.getText());
	
	this.retorno.setSalario(this.painel.tf_salario.getText());
	this.retorno.setSem_justa_causa(this.painel.tf_sem_justa_causa.getText());
	this.retorno.setFerias(this.painel.tf_ferias.getText());
	this.retorno.setAviso_previo(this.painel.tf_aviso_previo.getText());
	this.retorno.setReincidencia_a_b(this.painel.tf_reincidencia_a_b.getText());
	this.retorno.setReincidencia_a2_c3(this.painel.tf_reincidencia_a2_c3.getText());
	this.retorno.setVale_transporte(this.painel.tf_vale_transporte.getText());
	this.retorno.setCafe_manha(this.painel.tf_cafe_manha.getText());
	this.retorno.setRefeicao(this.painel.tf_refeicao.getText());
	this.retorno.setSeguro_vida(this.painel.tf_seguro_vida.getText());
	this.retorno.setEq_protecao_indiv(this.painel.tf_eq_protecao_indiv.getText());
	this.retorno.setFerramentas_manu(this.painel.tf_ferramentas_manu.getText());
	this.retorno.setValor_total(this.painel.tf_valor_total.getText());
	this.retorno.setImprevistos(this.painel.tf_imprevistos.getText());
	this.retorno.setStatus("ATIVO");
	
	
	this.retorno.setJornada_mensal(this.painel.tf_jornada_mensal.getText());
	this.retorno.setRepouso_semanal_remu(this.painel.tf_repouso_semanal_remu.getText());
	this.retorno.setFeriados(this.painel.tf_feriados.getText());
	this.retorno.setAux_enfermidade_dias(this.painel.tf_aux_enfermidade_dias.getText());
	this.retorno.setLicen_paternidade_dias(this.painel.tf_licen_paternidade_dias.getText());
	this.retorno.setLicen_maternidade_dias(this.painel.tf_licen_maternidade_dias.getText());
	this.retorno.setFaltas_justificadas(this.painel.tf_faltas_justificadas.getText());
	this.retorno.setDias_chuva(this.painel.tf_dias_chuva.getText());
	this.retorno.setAux_acidente(this.painel.tf_aux_acidente.getText());
	this.retorno.setFerias_dias(this.painel.tf_ferias_dias.getText());
	this.retorno.setAno_produtivo(this.painel.tf_ano_produtivo.getText());
	this.retorno.setAno_produtivo_sem_horas_trab(this.painel.tf_ano_produtivo_sem_horas_trab.getText());
	this.retorno.setSalario_13_dias(this.painel.tf_salario_13_dias.getText());
	this.retorno.setAviso_previo_indenizado(this.painel.tf_aviso_previo_indenizado.getText());
	this.retorno.setAviso_previo_trabalhado(this.painel.tf_aviso_previo_trabalhado.getText());
	this.retorno.setFerias_indenizadas(this.painel.tf_ferias_indenizadas.getText());
	this.retorno.setDespedida_injusta(this.painel.tf_despedida_injusta.getText());
	this.retorno.setIndenizacao_adicional(this.painel.tf_indenizacao_adicional.getText());
	this.retorno.setCusto_conducao(this.painel.tf_custo_conducao.getText());
	this.retorno.setCusto_cafe_manha(this.painel.tf_custo_cafe_manha.getText());
	this.retorno.setCusto_refeicao(this.painel.tf_custo_refeicao.getText());
	this.retorno.setCusto_seguro(this.painel.tf_custo_seguro.getText());
	this.retorno.setCusto_epi(this.painel.tf_custo_epi.getText());
	this.retorno.setSalario_minimo(this.painel.tf_salario_minimo.getText());
	this.retorno.setDesligamentos(this.painel.tf_desligamentos.getText());
	this.retorno.setDispensa_injusta(this.painel.tf_dispensa_injusta.getText());
	this.retorno.setDispensa_justa(this.painel.tf_dispensa_justa.getText());
	this.retorno.setEspontaneos(this.painel.tf_espontaneos.getText());
	this.retorno.setFim_de_contrato(this.painel.tf_fim_de_contrato.getText());
	this.retorno.setTermino_de_contrato(this.painel.tf_termino_de_contrato.getText());
	this.retorno.setAposentados(this.painel.tf_aposentados.getText());
	this.retorno.setMortos(this.painel.tf_mortos.getText());
	this.retorno.setTransferencias(this.painel.tf_transferencias.getText());
	this.retorno.setEstoque(this.painel.tf_estoque.getText());
	this.retorno.setEstoque_recuperado_inicio(this.painel.tf_estoque_recuperado_inicio.getText());
	this.retorno.setEstoque_recuperado_fim(this.painel.tf_estoque_recuperado_fim.getText());
	this.retorno.setEstoque_medio(this.painel.tf_estoque_medio.getText());
	this.retorno.setDispensados_descontados(this.painel.tf_dispensados_descontados.getText());
	this.retorno.setDispensados(this.painel.tf_dispensados.getText());
	this.retorno.setRotatividade_descontada(this.painel.tf_rotatividade_descontada.getText());
	this.retorno.setRotatividade_nao_descontada(this.painel.tf_rotatividade_nao_descontada.getText());
	this.retorno.setDesligados_espontaneos(this.painel.tf_desligados_espontaneos.getText());
	this.retorno.setDuracao_media_emprego(this.painel.tf_duracao_media_emprego.getText());	
	this.retorno.setPercentual_dispensa_injusta(this.painel.tf_percentual_dispensa_injusta.getText());	
	this.retorno.setNum_conducao(this.painel.tf_num_conducoes.getText().length()==0?0:Integer.parseInt(this.painel.tf_num_conducoes.getText()));
	this.retorno.setNum_ferramentas_manu(this.painel.tf_num_ferramentas_manu.getText().length()==0?0:Integer.parseInt(this.painel.tf_num_ferramentas_manu.getText()));
	this.retorno.setNum_refeicoes(this.painel.tf_num_refeicoes.getText().length()==0?0:Integer.parseInt(this.painel.tf_num_refeicoes.getText()));
	
	this.retorno.setVal_a(this.painel.a);
	this.retorno.setVal_b(this.painel.b);
	this.retorno.setVal_c(this.painel.c);
	this.retorno.setVal_d(this.painel.d);
	this.retorno.setVal_e(this.painel.e);
	
	
	
	int id = new DAO<Encargo_Mensalista_Modelo>(Encargo_Mensalista_Modelo.class).novo(this.retorno);
	
	if(id<=0)
	return false;
	
	this.retorno.setId_encargo_mensalistas_modelo(id);
	
	return true;
	}

	
	


	
	
}
