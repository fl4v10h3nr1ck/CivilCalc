package beans.modelos;

import beans.Encargo_Mensalista;
import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;
import componentes.anotacoes.Anot_TB_Coluna;
import componentes.anotacoes.Anot_TB_Coluna_Selecao;


@Anot_BD_Tabela(nome="encargos_mensalistas_modelo", prefixo="encg_me_m")
public class Encargo_Mensalista_Modelo {

@Anot_BD_Campo(nome = "id_encargo_mensalistas_modelo", tipo=int.class, set = "setId_encargo_mensalistas_modelo", get = "getId_encargo_mensalistas_modelo", ehId=true)		
private int id_encargo_mensalistas_modelo;

	@Anot_TB_Coluna_Selecao(posicao=0, comprimento=70)	
	@Anot_TB_Coluna(posicao=0, rotulo="Código/Identificador", comprimento = 70)
	@Anot_BD_Campo(nome = "codigo", set = "setCodigo", get = "getCodigo")		
	private String codigo;

	@Anot_BD_Campo(nome = "inss_previdencia", set = "setInss_previdencia", get = "getInss_previdencia")
	private String inss_previdencia;

	@Anot_BD_Campo(nome = "fgts", set = "setFgts", get = "getFgts")
	private String fgts;

	@Anot_BD_Campo(nome = "salario_edu", set = "setSalario_edu", get = "getSalario_edu")
	private String salario_edu;

	@Anot_BD_Campo(nome = "sesi", set = "setSesi", get = "getSesi")
	private String sesi;

	@Anot_BD_Campo(nome = "senai", set = "setSenai", get = "getSenai")
	private String senai;

	@Anot_BD_Campo(nome = "sebrae", set = "setSebrae", get = "getSebrae")
	private String sebrae;

	@Anot_BD_Campo(nome = "incra", set = "setIncra", get = "getIncra")
	private String incra;

	@Anot_BD_Campo(nome = "inss_seguro", set = "setInss_seguro", get = "getInss_seguro")
	private String inss_seguro;

	@Anot_BD_Campo(nome = "seconci", set = "setSeconci", get = "getSeconci")
	private String seconci;



	@Anot_BD_Campo(nome = "salario", set = "setSalario", get = "getSalario")
	private String salario;

	@Anot_BD_Campo(nome = "sem_justa_causa", set = "setSem_justa_causa", get = "getSem_justa_causa")
	private String sem_justa_causa;

	@Anot_BD_Campo(nome = "ferias", set = "setFerias", get = "getFerias")
	private String ferias;

	@Anot_BD_Campo(nome = "aviso_previo", set = "setAviso_previo", get = "getAviso_previo")
	private String aviso_previo;

	@Anot_BD_Campo(nome = "imprevistos", set = "setImprevistos", get = "getImprevistos")
	private String imprevistos;

	@Anot_BD_Campo(nome = "reincidencia_a_b", set = "setReincidencia_a_b", get = "getReincidencia_a_b")
	private String reincidencia_a_b;

	@Anot_BD_Campo(nome = "reincidencia_a2_c3", set = "setReincidencia_a2_c3", get = "getReincidencia_a2_c3")
	private String reincidencia_a2_c3;
	
	@Anot_BD_Campo(nome = "vale_transporte", set = "setVale_transporte", get = "getVale_transporte")
	private String vale_transporte;

	@Anot_BD_Campo(nome = "cafe_manha", set = "setCafe_manha", get = "getCafe_manha")
	private String cafe_manha;

	@Anot_BD_Campo(nome = "refeicao", set = "setRefeicao", get = "getRefeicao")
	private String refeicao;

	@Anot_BD_Campo(nome = "seguro_vida", set = "setSeguro_vida", get = "getSeguro_vida")
	private String seguro_vida;

	@Anot_BD_Campo(nome = "eq_protecao_indiv", set = "setEq_protecao_indiv", get = "getEq_protecao_indiv")
	private String eq_protecao_indiv;

	@Anot_BD_Campo(nome = "ferramentas_manu", set = "setFerramentas_manu", get = "getFerramentas_manu")
	private String ferramentas_manu;

	@Anot_TB_Coluna_Selecao(posicao=1, comprimento=30)	
	@Anot_TB_Coluna(posicao=1, rotulo="Valor (%)", comprimento = 30)
	@Anot_BD_Campo(nome = "valor_total", set = "setValor_total", get = "getValor_total")
	private String valor_total;	

	@Anot_BD_Campo(nome = "status", set = "setStatus", get = "getStatus")	
	private String status;




	@Anot_BD_Campo(nome = "jornada_mensal", set = "setJornada_mensal", get = "getJornada_mensal")		
	private String jornada_mensal;

	@Anot_BD_Campo(nome = "repouso_semanal_remu", set = "setRepouso_semanal_remu", get = "getRepouso_semanal_remu")
	private String repouso_semanal_remu;

	@Anot_BD_Campo(nome = "feriados", set = "setFeriados", get = "getFeriados")
	private String feriados;

	@Anot_BD_Campo(nome = "aux_enfermidade_dias", set = "setAux_enfermidade_dias", get = "getAux_enfermidade_dias")
	private String aux_enfermidade_dias;

	@Anot_BD_Campo(nome = "licen_paternidade_dias", set = "setLicen_paternidade_dias", get = "getLicen_paternidade_dias")
	private String licen_paternidade_dias;

	@Anot_BD_Campo(nome = "licen_maternidade_dias", set = "setLicen_maternidade_dias", get = "getLicen_maternidade_dias")
	private String licen_maternidade_dias;

	@Anot_BD_Campo(nome = "faltas_justificadas", set = "setFaltas_justificadas", get = "getFaltas_justificadas")
	private String faltas_justificadas;

	@Anot_BD_Campo(nome = "dias_chuva", set = "setDias_chuva", get = "getDias_chuva")
	private String dias_chuva;

	@Anot_BD_Campo(nome = "aux_acidente", set = "setAux_acidente", get = "getAux_acidente")
	private String aux_acidente;

	@Anot_BD_Campo(nome = "ferias_dias", set = "setFerias_dias", get = "getFerias_dias")
	private String ferias_dias;

	@Anot_BD_Campo(nome = "ano_produtivo", set = "setAno_produtivo", get = "getAno_produtivo")
	private String ano_produtivo;

	@Anot_BD_Campo(nome = "ano_produtivo_sem_horas_trab", set = "setAno_produtivo_sem_horas_trab", get = "getAno_produtivo_sem_horas_trab")
	private String ano_produtivo_sem_horas_trab;

	@Anot_BD_Campo(nome = "salario_13_dias", set = "setSalario_13_dias", get = "getSalario_13_dias")
	private String salario_13_dias;

	@Anot_BD_Campo(nome = "aviso_previo_indenizado", set = "setAviso_previo_indenizado", get = "getAviso_previo_indenizado")
	private String aviso_previo_indenizado;

	@Anot_BD_Campo(nome = "aviso_previo_trabalhado", set = "setAviso_previo_trabalhado", get = "getAviso_previo_trabalhado")
	private String aviso_previo_trabalhado;

	@Anot_BD_Campo(nome = "ferias_indenizadas", set = "setFerias_indenizadas", get = "getFerias_indenizadas")
	private String ferias_indenizadas;

	@Anot_BD_Campo(nome = "despedida_injusta", set = "setDespedida_injusta", get = "getDespedida_injusta")
	private String despedida_injusta;

	@Anot_BD_Campo(nome = "indenizacao_adicional", set = "setIndenizacao_adicional", get = "getIndenizacao_adicional")
	private String indenizacao_adicional;

	@Anot_BD_Campo(nome = "custo_conducao", set = "setCusto_conducao", get = "getCusto_conducao")
	private String custo_conducao;

	@Anot_BD_Campo(nome = "custo_cafe_manha", set = "setCusto_cafe_manha", get = "getCusto_cafe_manha")
	private String custo_cafe_manha;

	@Anot_BD_Campo(nome = "custo_refeicao", set = "setCusto_refeicao", get = "getCusto_refeicao")
	private String custo_refeicao;

	@Anot_BD_Campo(nome = "custo_seguro", set = "setCusto_seguro", get = "getCusto_seguro")
	private String custo_seguro;

	@Anot_BD_Campo(nome = "custo_epi", set = "setCusto_epi", get = "getCusto_epi")
	private String custo_epi;

	@Anot_BD_Campo(nome = "salario_minimo", set = "setSalario_minimo", get = "getSalario_minimo")
	private String salario_minimo;

	@Anot_BD_Campo(nome = "desligamentos", set = "setDesligamentos", get = "getDesligamentos")
	private String desligamentos;

	@Anot_BD_Campo(nome = "dispensa_injusta", set = "setDispensa_injusta", get = "getDispensa_injusta")
	private String dispensa_injusta;

	@Anot_BD_Campo(nome = "dispensa_justa", set = "setDispensa_justa", get = "getDispensa_justa")
	private String dispensa_justa;

	@Anot_BD_Campo(nome = "espontaneos", set = "setEspontaneos", get = "getEspontaneos")
	private String espontaneos;

	@Anot_BD_Campo(nome = "fim_de_contrato_por_prazo", set = "setFim_de_contrato", get = "getFim_de_contrato")
	private String fim_de_contrato;

	@Anot_BD_Campo(nome = "termino_de_contrato", set = "setTermino_de_contrato", get = "getTermino_de_contrato")
	private String termino_de_contrato;

	@Anot_BD_Campo(nome = "aposentados", set = "setAposentados", get = "getAposentados")
	private String aposentados;

	@Anot_BD_Campo(nome = "mortos", set = "setMortos", get = "getMortos")
	private String mortos;

	@Anot_BD_Campo(nome = "transferencias", set = "setTransferencias", get = "getTransferencias")
	private String transferencias;

	@Anot_BD_Campo(nome = "estoque", set = "setEstoque", get = "getEstoque")
	private String estoque;

	@Anot_BD_Campo(nome = "estoque_recuperado_inicio", set = "setEstoque_recuperado_inicio", get = "getEstoque_recuperado_inicio")
	private String estoque_recuperado_inicio;

	@Anot_BD_Campo(nome = "estoque_recuperado_fim", set = "setEstoque_recuperado_fim", get = "getEstoque_recuperado_fim")
	private String estoque_recuperado_fim;

	@Anot_BD_Campo(nome = "estoque_medio", set = "setEstoque_medio", get = "getEstoque_medio")
	private String estoque_medio;

	@Anot_BD_Campo(nome = "dispensados_descontados", set = "setDispensados_descontados", get = "getDispensados_descontados")
	private String dispensados_descontados;

	@Anot_BD_Campo(nome = "dispensados", set = "setDispensados", get = "getDispensados")
	private String dispensados;

	@Anot_BD_Campo(nome = "rotatividade_descontada", set = "setRotatividade_descontada", get = "getRotatividade_descontada")
	private String rotatividade_descontada;

	@Anot_BD_Campo(nome = "rotatividade_nao_descontada", set = "setRotatividade_nao_descontada", get = "getRotatividade_nao_descontada")
	private String rotatividade_nao_descontada;

	@Anot_BD_Campo(nome = "desligados_espontaneos", set = "setDesligados_espontaneos", get = "getDesligados_espontaneos")
	private String desligados_espontaneos;

	@Anot_BD_Campo(nome = "duracao_media_emprego", set = "setDuracao_media_emprego", get = "getDuracao_media_emprego")
	private String duracao_media_emprego;

	@Anot_BD_Campo(nome = "percentual_dispensa_injusta", set = "setPercentual_dispensa_injusta", get = "getPercentual_dispensa_injusta")
	private String percentual_dispensa_injusta;

	@Anot_BD_Campo(nome = "num_refeicoes", tipo=int.class, set = "setNum_refeicoes", get = "getNum_refeicoes")
	private int num_refeicoes;

	@Anot_BD_Campo(nome = "num_conducao", tipo=int.class, set = "setNum_conducao", get = "getNum_conducao")
	private int num_conducao;

	@Anot_BD_Campo(nome = "num_ferramentas_manu", tipo=int.class, set = "setNum_ferramentas_manu", get = "getNum_ferramentas_manu")
	private int num_ferramentas_manu;


	@Anot_BD_Campo(nome = "val_a", set = "setVal_a", get = "getVal_a")
	private String val_a;

	@Anot_BD_Campo(nome = "val_b", set = "setVal_b", get = "getVal_b")
	private String val_b;

	@Anot_BD_Campo(nome = "val_c", set = "setVal_c", get = "getVal_c")
	private String val_c;

	@Anot_BD_Campo(nome = "val_d", set = "setVal_d", get = "getVal_d")
	private String val_d;

	@Anot_BD_Campo(nome = "val_e", set = "setVal_e", get = "getVal_e")
	private String val_e;

	
	
	
	
	public int getId_encargo_mensalistas_modelo() {
		return id_encargo_mensalistas_modelo;
	}

	public void setId_encargo_mensalistas_modelo(int id_encargo_mensalistas_modelo) {
		this.id_encargo_mensalistas_modelo = id_encargo_mensalistas_modelo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getInss_previdencia() {
		return inss_previdencia;
	}

	public void setInss_previdencia(String inss_previdencia) {
		this.inss_previdencia = inss_previdencia;
	}

	public String getFgts() {
		return fgts;
	}

	public void setFgts(String fgts) {
		this.fgts = fgts;
	}

	public String getSalario_edu() {
		return salario_edu;
	}

	public void setSalario_edu(String salario_edu) {
		this.salario_edu = salario_edu;
	}

	public String getSesi() {
		return sesi;
	}

	public void setSesi(String sesi) {
		this.sesi = sesi;
	}

	public String getSenai() {
		return senai;
	}

	public void setSenai(String senai) {
		this.senai = senai;
	}

	public String getSebrae() {
		return sebrae;
	}

	public void setSebrae(String sebrae) {
		this.sebrae = sebrae;
	}

	public String getIncra() {
		return incra;
	}

	public void setIncra(String incra) {
		this.incra = incra;
	}

	public String getInss_seguro() {
		return inss_seguro;
	}

	public void setInss_seguro(String inss_seguro) {
		this.inss_seguro = inss_seguro;
	}

	public String getSeconci() {
		return seconci;
	}

	public void setSeconci(String seconci) {
		this.seconci = seconci;
	}

	
	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getSem_justa_causa() {
		return sem_justa_causa;
	}

	public void setSem_justa_causa(String sem_justa_causa) {
		this.sem_justa_causa = sem_justa_causa;
	}

	public String getFerias() {
		return ferias;
	}

	public void setFerias(String ferias) {
		this.ferias = ferias;
	}

	public String getAviso_previo() {
		return aviso_previo;
	}

	public void setAviso_previo(String aviso_previo) {
		this.aviso_previo = aviso_previo;
	}

	public String getReincidencia_a_b() {
		return reincidencia_a_b;
	}

	public void setReincidencia_a_b(String reincidencia_a_b) {
		this.reincidencia_a_b = reincidencia_a_b;
	}

	public String getVale_transporte() {
		return vale_transporte;
	}

	public void setVale_transporte(String vale_transporte) {
		this.vale_transporte = vale_transporte;
	}

	public String getCafe_manha() {
		return cafe_manha;
	}

	public void setCafe_manha(String cafe_manha) {
		this.cafe_manha = cafe_manha;
	}

	public String getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(String refeicao) {
		this.refeicao = refeicao;
	}

	public String getSeguro_vida() {
		return seguro_vida;
	}

	public void setSeguro_vida(String seguro_vida) {
		this.seguro_vida = seguro_vida;
	}

	public String getEq_protecao_indiv() {
		return eq_protecao_indiv;
	}

	public void setEq_protecao_indiv(String eq_protecao_indiv) {
		this.eq_protecao_indiv = eq_protecao_indiv;
	}

	public String getFerramentas_manu() {
		return ferramentas_manu;
	}

	public void setFerramentas_manu(String ferramentas_manu) {
		this.ferramentas_manu = ferramentas_manu;
	}

	public String getValor_total() {
		return valor_total;
	}

	public void setValor_total(String valor_total) {
		this.valor_total = valor_total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJornada_mensal() {
		return jornada_mensal;
	}

	public void setJornada_mensal(String jornada_mensal) {
		this.jornada_mensal = jornada_mensal;
	}

	public String getRepouso_semanal_remu() {
		return repouso_semanal_remu;
	}

	public void setRepouso_semanal_remu(String repouso_semanal_remu) {
		this.repouso_semanal_remu = repouso_semanal_remu;
	}

	public String getFeriados() {
		return feriados;
	}

	public void setFeriados(String feriados) {
		this.feriados = feriados;
	}

	public String getAux_enfermidade_dias() {
		return aux_enfermidade_dias;
	}

	public void setAux_enfermidade_dias(String aux_enfermidade_dias) {
		this.aux_enfermidade_dias = aux_enfermidade_dias;
	}

	public String getLicen_paternidade_dias() {
		return licen_paternidade_dias;
	}

	public void setLicen_paternidade_dias(String licen_paternidade_dias) {
		this.licen_paternidade_dias = licen_paternidade_dias;
	}

	public String getLicen_maternidade_dias() {
		return licen_maternidade_dias;
	}

	public void setLicen_maternidade_dias(String licen_maternidade_dias) {
		this.licen_maternidade_dias = licen_maternidade_dias;
	}

	public String getFaltas_justificadas() {
		return faltas_justificadas;
	}

	public void setFaltas_justificadas(String faltas_justificadas) {
		this.faltas_justificadas = faltas_justificadas;
	}

	public String getDias_chuva() {
		return dias_chuva;
	}

	public void setDias_chuva(String dias_chuva) {
		this.dias_chuva = dias_chuva;
	}

	public String getAux_acidente() {
		return aux_acidente;
	}

	public void setAux_acidente(String aux_acidente) {
		this.aux_acidente = aux_acidente;
	}

	public String getFerias_dias() {
		return ferias_dias;
	}

	public void setFerias_dias(String ferias_dias) {
		this.ferias_dias = ferias_dias;
	}

	public String getAno_produtivo() {
		return ano_produtivo;
	}

	public void setAno_produtivo(String ano_produtivo) {
		this.ano_produtivo = ano_produtivo;
	}

	public String getAno_produtivo_sem_horas_trab() {
		return ano_produtivo_sem_horas_trab;
	}

	public void setAno_produtivo_sem_horas_trab(String ano_produtivo_sem_horas_trab) {
		this.ano_produtivo_sem_horas_trab = ano_produtivo_sem_horas_trab;
	}

	public String getSalario_13_dias() {
		return salario_13_dias;
	}

	public void setSalario_13_dias(String salario_13_dias) {
		this.salario_13_dias = salario_13_dias;
	}

	public String getAviso_previo_indenizado() {
		return aviso_previo_indenizado;
	}

	public void setAviso_previo_indenizado(String aviso_previo_indenizado) {
		this.aviso_previo_indenizado = aviso_previo_indenizado;
	}

	public String getAviso_previo_trabalhado() {
		return aviso_previo_trabalhado;
	}

	public void setAviso_previo_trabalhado(String aviso_previo_trabalhado) {
		this.aviso_previo_trabalhado = aviso_previo_trabalhado;
	}

	public String getFerias_indenizadas() {
		return ferias_indenizadas;
	}

	public void setFerias_indenizadas(String ferias_indenizadas) {
		this.ferias_indenizadas = ferias_indenizadas;
	}

	public String getDespedida_injusta() {
		return despedida_injusta;
	}

	public void setDespedida_injusta(String despedida_injusta) {
		this.despedida_injusta = despedida_injusta;
	}

	public String getIndenizacao_adicional() {
		return indenizacao_adicional;
	}

	public void setIndenizacao_adicional(String indenizacao_adicional) {
		this.indenizacao_adicional = indenizacao_adicional;
	}

	public String getCusto_conducao() {
		return custo_conducao;
	}

	public void setCusto_conducao(String custo_conducao) {
		this.custo_conducao = custo_conducao;
	}

	public String getCusto_cafe_manha() {
		return custo_cafe_manha;
	}

	public void setCusto_cafe_manha(String custo_cafe_manha) {
		this.custo_cafe_manha = custo_cafe_manha;
	}

	public String getCusto_refeicao() {
		return custo_refeicao;
	}

	public void setCusto_refeicao(String custo_refeicao) {
		this.custo_refeicao = custo_refeicao;
	}

	public String getCusto_seguro() {
		return custo_seguro;
	}

	public void setCusto_seguro(String custo_seguro) {
		this.custo_seguro = custo_seguro;
	}

	public String getCusto_epi() {
		return custo_epi;
	}

	public void setCusto_epi(String custo_epi) {
		this.custo_epi = custo_epi;
	}

	public String getSalario_minimo() {
		return salario_minimo;
	}

	public void setSalario_minimo(String salario_minimo) {
		this.salario_minimo = salario_minimo;
	}

	public String getDesligamentos() {
		return desligamentos;
	}

	public void setDesligamentos(String desligamentos) {
		this.desligamentos = desligamentos;
	}

	public String getDispensa_injusta() {
		return dispensa_injusta;
	}

	public void setDispensa_injusta(String dispensa_injusta) {
		this.dispensa_injusta = dispensa_injusta;
	}

	public String getDispensa_justa() {
		return dispensa_justa;
	}

	public void setDispensa_justa(String dispensa_justa) {
		this.dispensa_justa = dispensa_justa;
	}

	public String getEspontaneos() {
		return espontaneos;
	}

	public void setEspontaneos(String espontaneos) {
		this.espontaneos = espontaneos;
	}

	public String getFim_de_contrato() {
		return fim_de_contrato;
	}

	public void setFim_de_contrato(String fim_de_contrato) {
		this.fim_de_contrato = fim_de_contrato;
	}

	public String getTermino_de_contrato() {
		return termino_de_contrato;
	}

	public void setTermino_de_contrato(String termino_de_contrato) {
		this.termino_de_contrato = termino_de_contrato;
	}

	public String getAposentados() {
		return aposentados;
	}

	public void setAposentados(String aposentados) {
		this.aposentados = aposentados;
	}

	public String getMortos() {
		return mortos;
	}

	public void setMortos(String mortos) {
		this.mortos = mortos;
	}

	public String getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(String transferencias) {
		this.transferencias = transferencias;
	}

	public String getEstoque() {
		return estoque;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	public String getEstoque_recuperado_inicio() {
		return estoque_recuperado_inicio;
	}

	public void setEstoque_recuperado_inicio(String estoque_recuperado_inicio) {
		this.estoque_recuperado_inicio = estoque_recuperado_inicio;
	}

	public String getEstoque_recuperado_fim() {
		return estoque_recuperado_fim;
	}

	public void setEstoque_recuperado_fim(String estoque_recuperado_fim) {
		this.estoque_recuperado_fim = estoque_recuperado_fim;
	}

	public String getEstoque_medio() {
		return estoque_medio;
	}

	public void setEstoque_medio(String estoque_medio) {
		this.estoque_medio = estoque_medio;
	}

	public String getDispensados_descontados() {
		return dispensados_descontados;
	}

	public void setDispensados_descontados(String dispensados_descontados) {
		this.dispensados_descontados = dispensados_descontados;
	}

	public String getDispensados() {
		return dispensados;
	}

	public void setDispensados(String dispensados) {
		this.dispensados = dispensados;
	}

	public String getRotatividade_descontada() {
		return rotatividade_descontada;
	}

	public void setRotatividade_descontada(String rotatividade_descontada) {
		this.rotatividade_descontada = rotatividade_descontada;
	}

	public String getRotatividade_nao_descontada() {
		return rotatividade_nao_descontada;
	}

	public void setRotatividade_nao_descontada(String rotatividade_nao_descontada) {
		this.rotatividade_nao_descontada = rotatividade_nao_descontada;
	}

	public String getDesligados_espontaneos() {
		return desligados_espontaneos;
	}

	public void setDesligados_espontaneos(String desligados_espontaneos) {
		this.desligados_espontaneos = desligados_espontaneos;
	}

	public String getDuracao_media_emprego() {
		return duracao_media_emprego;
	}

	public void setDuracao_media_emprego(String duracao_media_emprego) {
		this.duracao_media_emprego = duracao_media_emprego;
	}

	public String getPercentual_dispensa_injusta() {
		return percentual_dispensa_injusta;
	}

	public void setPercentual_dispensa_injusta(String percentual_dispensa_injusta) {
		this.percentual_dispensa_injusta = percentual_dispensa_injusta;
	}

	public int getNum_refeicoes() {
		return num_refeicoes;
	}

	public void setNum_refeicoes(int num_refeicoes) {
		this.num_refeicoes = num_refeicoes;
	}

	public int getNum_conducao() {
		return num_conducao;
	}

	public void setNum_conducao(int num_conducao) {
		this.num_conducao = num_conducao;
	}

	public int getNum_ferramentas_manu() {
		return num_ferramentas_manu;
	}

	public void setNum_ferramentas_manu(int num_ferramentas_manu) {
		this.num_ferramentas_manu = num_ferramentas_manu;
	}

	public String getReincidencia_a2_c3() {
		return reincidencia_a2_c3;
	}

	public void setReincidencia_a2_c3(String reincidencia_a2_c3) {
		this.reincidencia_a2_c3 = reincidencia_a2_c3;
	}

	public String getImprevistos() {
		return imprevistos;
	}

	public void setImprevistos(String imprevistos) {
		this.imprevistos = imprevistos;
	}

	
	
	
	
	
	
	
		public String getVal_a() {
		return val_a;
	}

	public void setVal_a(String val_a) {
		this.val_a = val_a;
	}

	public String getVal_b() {
		return val_b;
	}

	public void setVal_b(String val_b) {
		this.val_b = val_b;
	}

	public String getVal_c() {
		return val_c;
	}

	public void setVal_c(String val_c) {
		this.val_c = val_c;
	}

	public String getVal_d() {
		return val_d;
	}

	public void setVal_d(String val_d) {
		this.val_d = val_d;
	}

	public String getVal_e() {
		return val_e;
	}

	public void setVal_e(String val_e) {
		this.val_e = val_e;
	}

	
	
		public Encargo_Mensalista clona(){
			
		Encargo_Mensalista encargo = new Encargo_Mensalista();
			
		encargo.setCodigo(this.getCodigo());
		encargo.setInss_previdencia(this.getInss_previdencia());
		encargo.setFgts(this.getFgts());
		encargo.setSalario_edu(this.getSalario_edu());
		encargo.setSesi(this.getSesi());
		encargo.setSenai(this.getSenai());
		encargo.setSebrae(this.getSebrae());
		encargo.setIncra(this.getIncra());
		encargo.setInss_seguro(this.getInss_seguro());
		encargo.setSeconci(this.getSeconci());
		
		encargo.setSalario(this.getSalario());
		encargo.setSem_justa_causa(this.getSem_justa_causa());
		encargo.setFerias(this.getFerias());
		encargo.setAviso_previo(this.getAviso_previo());
		encargo.setReincidencia_a_b(this.getReincidencia_a_b());
		encargo.setReincidencia_a2_c3(this.getReincidencia_a2_c3());
		encargo.setVale_transporte(this.getVale_transporte());
		encargo.setCafe_manha(this.getCafe_manha());
		encargo.setRefeicao(this.getRefeicao());
		encargo.setSeguro_vida(this.getSeguro_vida());
		encargo.setEq_protecao_indiv(this.getEq_protecao_indiv());
		encargo.setFerramentas_manu(this.getFerramentas_manu());
		encargo.setValor_total(this.getValor_total());
		encargo.setStatus("ATIVO");
		
		
		encargo.setJornada_mensal(this.getJornada_mensal());
		encargo.setRepouso_semanal_remu(this.getRepouso_semanal_remu());
		encargo.setFeriados(this.getFeriados());
		encargo.setAux_enfermidade_dias(this.getAux_enfermidade_dias());
		encargo.setLicen_paternidade_dias(this.getLicen_paternidade_dias());
		encargo.setLicen_maternidade_dias(this.getLicen_maternidade_dias());
		encargo.setFaltas_justificadas(this.getFaltas_justificadas());
		encargo.setDias_chuva(this.getDias_chuva());
		encargo.setAux_acidente(this.getAux_acidente());
		encargo.setFerias_dias(this.getFerias_dias());
		encargo.setAno_produtivo(this.getAno_produtivo());
		encargo.setAno_produtivo_sem_horas_trab(this.getAno_produtivo_sem_horas_trab());
		encargo.setSalario_13_dias(this.getSalario_13_dias());
		encargo.setAviso_previo_indenizado(this.getAviso_previo_indenizado());
		encargo.setAviso_previo_trabalhado(this.getAviso_previo_trabalhado());
		encargo.setFerias_indenizadas(this.getFerias_indenizadas());
		encargo.setDespedida_injusta(this.getDespedida_injusta());
		encargo.setIndenizacao_adicional(this.getIndenizacao_adicional());
		encargo.setCusto_conducao(this.getCusto_conducao());
		encargo.setCusto_cafe_manha(this.getCusto_cafe_manha());
		encargo.setCusto_refeicao(this.getCusto_refeicao());
		encargo.setCusto_seguro(this.getCusto_seguro());
		encargo.setCusto_epi(this.getCusto_epi());
		encargo.setSalario_minimo(this.getSalario_minimo());
		encargo.setDesligamentos(this.getDesligamentos());
		encargo.setDispensa_injusta(this.getDispensa_injusta());
		encargo.setDispensa_justa(this.getDispensa_justa());
		encargo.setEspontaneos(this.getEspontaneos());
		encargo.setFim_de_contrato(this.getFim_de_contrato());
		encargo.setTermino_de_contrato(this.getTermino_de_contrato());
		encargo.setAposentados(this.getAposentados());
		encargo.setMortos(this.getMortos());
		encargo.setTransferencias(this.getTransferencias());
		encargo.setEstoque(this.getEstoque());
		encargo.setEstoque_recuperado_inicio(this.getEstoque_recuperado_inicio());
		encargo.setEstoque_recuperado_fim(this.getEstoque_recuperado_fim());
		encargo.setEstoque_medio(this.getEstoque_medio());
		encargo.setDispensados_descontados(this.getDispensados_descontados());
		encargo.setDispensados(this.getDispensados());
		encargo.setRotatividade_descontada(this.getRotatividade_descontada());
		encargo.setRotatividade_nao_descontada(this.getRotatividade_nao_descontada());
		encargo.setDesligados_espontaneos(this.getDesligados_espontaneos());
		encargo.setDuracao_media_emprego(this.getDuracao_media_emprego());	
		encargo.setPercentual_dispensa_injusta(this.getPercentual_dispensa_injusta());	
		encargo.setNum_conducao(this.getNum_conducao());
		encargo.setNum_ferramentas_manu(this.getNum_ferramentas_manu());
		encargo.setNum_refeicoes(this.getNum_refeicoes());
		encargo.setImprevistos(this.getImprevistos());
		
		
		encargo.setVal_a(this.getVal_a());
		encargo.setVal_b(this.getVal_b());
		encargo.setVal_c(this.getVal_c());
		encargo.setVal_d(this.getVal_d());
		encargo.setVal_e(this.getVal_e());
		

		
		
		return encargo;	
		}



	}

