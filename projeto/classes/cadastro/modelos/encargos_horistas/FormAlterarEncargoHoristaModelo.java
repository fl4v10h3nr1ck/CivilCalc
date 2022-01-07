package cadastro.modelos.encargos_horistas;


import beans.modelos.Encargo_Horista_Modelo;
import dao.DAO;




public class FormAlterarEncargoHoristaModelo extends FormEncargoHoristaModeloBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterarEncargoHoristaModelo(Encargo_Horista_Modelo retorno) {
			
	super("Alterar Encargo Horista (Modelo)", retorno);
	
	this.adicionarComponentes();
	
	
	this.tf_codigo.setText(this.retorno.getCodigo());
	this.painel.tf_valor_total.setText(this.retorno.getValor_total());
	this.painel.tf_inss_previdencia.setText(this.retorno.getInss_previdencia());
	this.painel.tf_fgts.setText(this.retorno.getFgts());
	this.painel.tf_salario_edu.setText(this.retorno.getSalario_edu());
	this.painel.tf_sesi.setText(this.retorno.getSesi());
	this.painel.tf_senai.setText(this.retorno.getSenai());
	this.painel.tf_sebrae.setText(this.retorno.getSebrae());
	this.painel.tf_incra.setText(this.retorno.getIncra());
	this.painel.tf_inss_seguro.setText(this.retorno.getInss_seguro());
	this.painel.tf_seconci.setText(this.retorno.getSeconci());
	this.painel.tf_repouso_semanal.setText(this.retorno.getRepouso_semanal());
	this.painel.tf_aux_enfermidade.setText(this.retorno.getAux_enfermidade());
	this.painel.tf_licen_paternidade.setText(this.retorno.getLicen_paternidade());
	this.painel.tf_salario_13.setText(this.retorno.getSalario_13());
	this.painel.tf_imprevistos.setText(this.retorno.getImprevistos());
	this.painel.tf_sem_justa_causa.setText(this.retorno.getSem_justa_causa());
	this.painel.tf_ferias.setText(this.retorno.getFerias());
	this.painel.tf_aviso_previo.setText(this.retorno.getAviso_previo());
	this.painel.tf_reincidencia_a_b.setText(this.retorno.getReincidencia_a_b());
	this.painel.tf_vale_transporte.setText(this.retorno.getVale_transporte());
	this.painel.tf_cafe_manha.setText(this.retorno.getCafe_manha());
	this.painel.tf_refeicao.setText(this.retorno.getRefeicao());
	this.painel.tf_seguro_vida.setText(this.retorno.getSeguro_vida());
	this.painel.tf_eq_protecao_indiv.setText(this.retorno.getEq_protecao_indiv());
	this.painel.tf_ferramentas_manu.setText(this.retorno.getFerramentas_manu());


	painel.tf_jornada_mensal.setText(this.retorno.getJornada_mensal());
	painel.tf_repouso_semanal_remu.setText(this.retorno.getRepouso_semanal_remu());
	painel.tf_feriados.setText(this.retorno.getFeriados());
	painel.tf_aux_enfermidade_dias.setText(this.retorno.getAux_enfermidade_dias());
	painel.tf_licen_paternidade_dias.setText(this.retorno.getLicen_paternidade_dias());
	painel.tf_licen_maternidade_dias.setText(this.retorno.getLicen_maternidade_dias());
	painel.tf_faltas_justificadas.setText(this.retorno.getFaltas_justificadas());
	painel.tf_dias_chuva.setText(this.retorno.getDias_chuva());
	painel.tf_aux_acidente.setText(this.retorno.getAux_acidente());
	painel.tf_ferias_dias.setText(this.retorno.getFerias_dias());
	painel.tf_ano_produtivo.setText(this.retorno.getAno_produtivo());
	painel.tf_ano_produtivo_sem_horas_trab.setText(this.retorno.getAno_produtivo_sem_horas_trab());
	painel.tf_salario_13_dias.setText(this.retorno.getSalario_13_dias());
	painel.tf_aviso_previo_indenizado.setText(this.retorno.getAviso_previo_indenizado());
	painel.tf_aviso_previo_trabalhado.setText(this.retorno.getAviso_previo_trabalhado());
	painel.tf_ferias_indenizadas.setText(this.retorno.getFerias_indenizadas());
	painel.tf_despedida_injusta.setText(this.retorno.getDespedida_injusta());
	painel.tf_indenizacao_adicional.setText(this.retorno.getIndenizacao_adicional());
	
	painel.tf_custo_conducao.setText(this.retorno.getCusto_conducao());
	painel.tf_custo_cafe_manha.setText(this.retorno.getCusto_cafe_manha());
	painel.tf_custo_refeicao.setText(this.retorno.getCusto_refeicao());
	painel.tf_custo_seguro.setText(this.retorno.getCusto_seguro());
	painel.tf_custo_epi.setText(this.retorno.getCusto_epi());
	painel.tf_salario_minimo.setText(this.retorno.getSalario_minimo());
	
	painel.tf_desligamentos.setText(this.retorno.getDesligamentos());
	painel.tf_dispensa_injusta.setText(this.retorno.getDispensa_injusta());
	painel.tf_dispensa_justa.setText(this.retorno.getDispensa_justa());
	painel.tf_espontaneos.setText(this.retorno.getEspontaneos());
	painel.tf_fim_de_contrato.setText(this.retorno.getFim_de_contrato());
	painel.tf_termino_de_contrato.setText(this.retorno.getTermino_de_contrato());
	painel.tf_aposentados.setText(this.retorno.getAposentados());
	painel.tf_mortos.setText(this.retorno.getMortos());
	painel.tf_transferencias.setText(this.retorno.getTransferencias());
	painel.tf_estoque.setText(this.retorno.getEstoque());
	painel.tf_estoque_recuperado_inicio.setText(this.retorno.getEstoque_recuperado_inicio());
	painel.tf_estoque_recuperado_fim.setText(this.retorno.getEstoque_recuperado_fim());
	painel.tf_estoque_medio.setText(this.retorno.getEstoque_medio());
	painel.tf_dispensados_descontados.setText(this.retorno.getDispensados_descontados());
	painel.tf_dispensados.setText(this.retorno.getDispensados());
	painel.tf_rotatividade_descontada.setText(this.retorno.getRotatividade_descontada());
	painel.tf_rotatividade_nao_descontada.setText(this.retorno.getRotatividade_nao_descontada());
	painel.tf_desligados_espontaneos.setText(this.retorno.getDesligados_espontaneos());
	painel.tf_duracao_media_emprego.setText(this.retorno.getDuracao_media_emprego());
	this.painel.tf_percentual_dispensa_injusta.setText(this.retorno.getPercentual_dispensa_injusta());
	
	this.painel.tf_num_conducoes.setText(this.retorno.getNum_conducao());
	this.painel.tf_num_ferramentas_manu.setText(this.retorno.getNum_ferramentas_manu());
	this.painel.tf_num_refeicoes.setText(this.retorno.getNum_refeicoes());
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
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
	
	this.retorno.setRepouso_semanal(this.painel.tf_repouso_semanal.getText());
	this.retorno.setAux_enfermidade(this.painel.tf_aux_enfermidade.getText());
	this.retorno.setLicen_paternidade(this.painel.tf_licen_paternidade.getText());
	this.retorno.setSalario_13(this.painel.tf_salario_13.getText());
	this.retorno.setImprevistos(this.painel.tf_imprevistos.getText());
	this.retorno.setSem_justa_causa(this.painel.tf_sem_justa_causa.getText());
	this.retorno.setFerias(this.painel.tf_ferias.getText());
	this.retorno.setAviso_previo(this.painel.tf_aviso_previo.getText());
	this.retorno.setReincidencia_a_b(this.painel.tf_reincidencia_a_b.getText());
	this.retorno.setVale_transporte(this.painel.tf_vale_transporte.getText());
	this.retorno.setCafe_manha(this.painel.tf_cafe_manha.getText());
	this.retorno.setRefeicao(this.painel.tf_refeicao.getText());
	this.retorno.setSeguro_vida(this.painel.tf_seguro_vida.getText());
	this.retorno.setEq_protecao_indiv(this.painel.tf_eq_protecao_indiv.getText());
	this.retorno.setFerramentas_manu(this.painel.tf_ferramentas_manu.getText());
	this.retorno.setValor_total(this.painel.tf_valor_total.getText());
	this.retorno.setStatus("ATIVO");
	
	
	this.retorno.setJornada_mensal(painel.tf_jornada_mensal.getText());
	this.retorno.setRepouso_semanal_remu(painel.tf_repouso_semanal_remu.getText());
	this.retorno.setFeriados(painel.tf_feriados.getText());
	this.retorno.setAux_enfermidade_dias(painel.tf_aux_enfermidade_dias.getText());
	this.retorno.setLicen_paternidade_dias(painel.tf_licen_paternidade_dias.getText());
	this.retorno.setLicen_maternidade_dias(painel.tf_licen_maternidade_dias.getText());
	this.retorno.setFaltas_justificadas(painel.tf_faltas_justificadas.getText());
	this.retorno.setDias_chuva(painel.tf_dias_chuva.getText());
	this.retorno.setAux_acidente(painel.tf_aux_acidente.getText());
	this.retorno.setFerias_dias(painel.tf_ferias_dias.getText());
	this.retorno.setAno_produtivo(this.painel.tf_ano_produtivo.getText());
	this.retorno.setAno_produtivo_sem_horas_trab(this.painel.tf_ano_produtivo_sem_horas_trab.getText());
	this.retorno.setSalario_13_dias(painel.tf_salario_13_dias.getText());
	this.retorno.setAviso_previo_indenizado(painel.tf_aviso_previo_indenizado.getText());
	this.retorno.setAviso_previo_trabalhado(painel.tf_aviso_previo_trabalhado.getText());
	this.retorno.setFerias_indenizadas(painel.tf_ferias_indenizadas.getText());
	this.retorno.setDespedida_injusta(painel.tf_despedida_injusta.getText());
	this.retorno.setIndenizacao_adicional(painel.tf_indenizacao_adicional.getText());
	this.retorno.setCusto_conducao(painel.tf_custo_conducao.getText());
	this.retorno.setCusto_cafe_manha(painel.tf_custo_cafe_manha.getText());
	this.retorno.setCusto_refeicao(painel.tf_custo_refeicao.getText());
	this.retorno.setCusto_seguro(painel.tf_custo_seguro.getText());
	this.retorno.setCusto_epi(painel.tf_custo_epi.getText());
	this.retorno.setSalario_minimo(painel.tf_salario_minimo.getText());
	this.retorno.setDesligamentos(painel.tf_desligamentos.getText());
	this.retorno.setDispensa_injusta(painel.tf_dispensa_injusta.getText());
	this.retorno.setDispensa_justa(painel.tf_dispensa_justa.getText());
	this.retorno.setEspontaneos(painel.tf_espontaneos.getText());
	this.retorno.setFim_de_contrato(painel.tf_fim_de_contrato.getText());
	this.retorno.setTermino_de_contrato(this.painel.tf_termino_de_contrato.getText());
	this.retorno.setAposentados(painel.tf_aposentados.getText());
	this.retorno.setMortos(painel.tf_mortos.getText());
	this.retorno.setTransferencias(painel.tf_transferencias.getText());
	this.retorno.setEstoque(painel.tf_estoque.getText());
	this.retorno.setEstoque_recuperado_inicio(painel.tf_estoque_recuperado_inicio.getText());
	this.retorno.setEstoque_recuperado_fim(painel.tf_estoque_recuperado_fim.getText());
	this.retorno.setEstoque_medio(painel.tf_estoque_medio.getText());
	this.retorno.setDispensados_descontados(painel.tf_dispensados_descontados.getText());
	this.retorno.setDispensados(painel.tf_dispensados.getText());
	this.retorno.setRotatividade_descontada(painel.tf_rotatividade_descontada.getText());
	this.retorno.setRotatividade_nao_descontada(painel.tf_rotatividade_nao_descontada.getText());
	this.retorno.setDesligados_espontaneos(painel.tf_desligados_espontaneos.getText());
	this.retorno.setDuracao_media_emprego(painel.tf_duracao_media_emprego.getText());	
	this.retorno.setPercentual_dispensa_injusta(this.painel.tf_percentual_dispensa_injusta.getText());	
	this.retorno.setNum_conducao(this.painel.tf_num_conducoes.getText().length()==0?0:Integer.parseInt(this.painel.tf_num_conducoes.getText()));
	this.retorno.setNum_ferramentas_manu(this.painel.tf_num_ferramentas_manu.getText().length()==0?0:Integer.parseInt(this.painel.tf_num_ferramentas_manu.getText()));
	this.retorno.setNum_refeicoes(this.painel.tf_num_refeicoes.getText().length()==0?0:Integer.parseInt(this.painel.tf_num_refeicoes.getText()));
	
	this.retorno.setVal_a(this.painel.a);
	this.retorno.setVal_b(this.painel.b);
	this.retorno.setVal_c(this.painel.c);
	this.retorno.setVal_d(this.painel.d);
	this.retorno.setVal_e(this.painel.e);
	
	
	return new DAO<Encargo_Horista_Modelo>(Encargo_Horista_Modelo.class).altera(this.retorno);
	}

	
	


	
	
}
