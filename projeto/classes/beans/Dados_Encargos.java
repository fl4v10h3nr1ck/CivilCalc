package beans;

import componentes.anotacoes.Anot_BD_Campo;
import componentes.anotacoes.Anot_BD_Tabela;

@Anot_BD_Tabela(nome="dados_encargos", prefixo="dd_enc")
public class Dados_Encargos {

	
	
@Anot_BD_Campo(nome = "id_dados_encargo", tipo=int.class, set = "setId_dados_encargo", get = "getId_dados_encargo", ehId=true)		
private int id_dados_encargo;

@Anot_BD_Campo(nome = "jornada_mensal", set = "setJornada_mensal", get = "getJornada_mensal")		
private String jornada_mensal;

@Anot_BD_Campo(nome = "repouso_semanal_remu", set = "setRepouso_semanal", get = "getRepouso_semanal")
private String repouso_semanal;

@Anot_BD_Campo(nome = "feriados", set = "setFeriados", get = "getFeriados")
private String feriados;

@Anot_BD_Campo(nome = "aux_enfermidade", set = "setAux_enfermidade", get = "getAux_enfermidade")
private String aux_enfermidade;

@Anot_BD_Campo(nome = "licen_paternidade", set = "setLicen_paternidade", get = "getLicen_paternidade")
private String licen_paternidade;

@Anot_BD_Campo(nome = "licen_maternidade", set = "setLicen_maternidade", get = "getLicen_maternidade")
private String licen_maternidade;

@Anot_BD_Campo(nome = "faltas_justificadas", set = "setFaltas_justificadas", get = "getFaltas_justificadas")
private String faltas_justificadas;

@Anot_BD_Campo(nome = "dias_chuva", set = "setDias_chuva", get = "getDias_chuva")
private String dias_chuva;

@Anot_BD_Campo(nome = "aux_acidente", set = "setAux_acidente", get = "getAux_acidente")
private String aux_acidente;

@Anot_BD_Campo(nome = "ferias", set = "setFerias", get = "getFerias")
private String ferias;

@Anot_BD_Campo(nome = "ano_produtivo", set = "setAno_produtivo", get = "getAno_produtivo")
private String ano_produtivo;

@Anot_BD_Campo(nome = "ano_produtivo_sem_horas_trab", set = "setAno_produtivo_sem_horas_trab", get = "getAno_produtivo_sem_horas_trab")
private String ano_produtivo_sem_horas_trab;

@Anot_BD_Campo(nome = "salario_13", set = "setSalario_13", get = "getSalario_13")
private String salario_13;

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



public int getId_dados_encargo() {	return id_dados_encargo;}
public void setId_dados_encargo(int id_dados_encargo) {	this.id_dados_encargo = id_dados_encargo;}

public String getJornada_mensal() {	return jornada_mensal;}
public void setJornada_mensal(String jornada_mensal) {	this.jornada_mensal = jornada_mensal;}

public String getRepouso_semanal() {	return repouso_semanal;}
public void setRepouso_semanal(String repouso_semanal) {	this.repouso_semanal = repouso_semanal;}

public String getFeriados() {	return feriados;}
public void setFeriados(String feriados) {	this.feriados = feriados;}

public String getAux_enfermidade() {	return aux_enfermidade;}
public void setAux_enfermidade(String aux_enfermidade) {	this.aux_enfermidade = aux_enfermidade;}

public String getLicen_paternidade() {	return licen_paternidade;}
public void setLicen_paternidade(String licen_paternidade) {	this.licen_paternidade = licen_paternidade;}

public String getLicen_maternidade() {	return licen_maternidade;}
public void setLicen_maternidade(String licen_maternidade) {	this.licen_maternidade = licen_maternidade;}

public String getFaltas_justificadas() {	return faltas_justificadas;}
public void setFaltas_justificadas(String faltas_justificadas) {	this.faltas_justificadas = faltas_justificadas;}

public String getDias_chuva() {	return dias_chuva;}
public void setDias_chuva(String dias_chuva) {	this.dias_chuva = dias_chuva;}

public String getAux_acidente() {	return aux_acidente;}
public void setAux_acidente(String aux_acidente) {	this.aux_acidente = aux_acidente;}

public String getFerias() {	return ferias;}
public void setFerias(String ferias) {	this.ferias = ferias;}

public String getAno_produtivo() {	return ano_produtivo;}
public void setAno_produtivo(String ano_produtivo) {	this.ano_produtivo = ano_produtivo;}

public String getAno_produtivo_sem_horas_trab() {	return ano_produtivo_sem_horas_trab;}
public void setAno_produtivo_sem_horas_trab(String ano_produtivo_sem_horas_trab) {	this.ano_produtivo_sem_horas_trab = ano_produtivo_sem_horas_trab;}

public String getSalario_13() {	return salario_13;}
public void setSalario_13(String salario_13) {	this.salario_13 = salario_13;}

public String getAviso_previo_indenizado() {	return aviso_previo_indenizado;}
public void setAviso_previo_indenizado(String aviso_previo_indenizado) {	this.aviso_previo_indenizado = aviso_previo_indenizado;}

public String getAviso_previo_trabalhado() {	return aviso_previo_trabalhado;}
public void setAviso_previo_trabalhado(String aviso_previo_trabalhado) {	this.aviso_previo_trabalhado = aviso_previo_trabalhado;}

public String getFerias_indenizadas() {	return ferias_indenizadas;}
public void setFerias_indenizadas(String ferias_indenizadas) {	this.ferias_indenizadas = ferias_indenizadas;}

public String getDespedida_injusta() {	return despedida_injusta;}
public void setDespedida_injusta(String despedida_injusta) {	this.despedida_injusta = despedida_injusta;}

public String getIndenizacao_adicional() {	return indenizacao_adicional;}
public void setIndenizacao_adicional(String indenizacao_adicional) {	this.indenizacao_adicional = indenizacao_adicional;}

public String getCusto_conducao() {	return custo_conducao;}
public void setCusto_conducao(String custo_conducao) {	this.custo_conducao = custo_conducao;}

public String getCusto_cafe_manha() {	return custo_cafe_manha;}
public void setCusto_cafe_manha(String custo_cafe_manha) {	this.custo_cafe_manha = custo_cafe_manha;}

public String getCusto_refeicao() {	return custo_refeicao;}
public void setCusto_refeicao(String custo_refeicao) {	this.custo_refeicao = custo_refeicao;}

public String getCusto_seguro() {	return custo_seguro;}
public void setCusto_seguro(String custo_seguro) {	this.custo_seguro = custo_seguro;}

public String getCusto_epi() {	return custo_epi;}
public void setCusto_epi(String custo_epi) {	this.custo_epi = custo_epi;}

public String getSalario_minimo() {	return salario_minimo;}
public void setSalario_minimo(String salario_minimo) {	this.salario_minimo = salario_minimo;}

public String getDesligamentos() {	return desligamentos;}
public void setDesligamentos(String desligamentos) {	this.desligamentos = desligamentos;}

public String getDispensa_injusta() {	return dispensa_injusta;}
public void setDispensa_injusta(String dispensa_injusta) {	this.dispensa_injusta = dispensa_injusta;}

public String getDispensa_justa() {	return dispensa_justa;}
public void setDispensa_justa(String dispensa_justa) {	this.dispensa_justa = dispensa_justa;}

public String getEspontaneos() {	return espontaneos;}
public void setEspontaneos(String espontaneos) {	this.espontaneos = espontaneos;}

public String getFim_de_contrato() {	return fim_de_contrato;}
public void setFim_de_contrato(String fim_de_contrato) {	this.fim_de_contrato = fim_de_contrato;}

public String getAposentados() {	return aposentados;}
public void setAposentados(String aposentados) {	this.aposentados = aposentados;}

public String getMortos() {	return mortos;}
public void setMortos(String mortos) {	this.mortos = mortos;}

public String getTransferencias() {	return transferencias;}
public void setTransferencias(String transferencias) {	this.transferencias = transferencias;}

public String getEstoque() {	return estoque;}
public void setEstoque(String estoque) {	this.estoque = estoque;}

public String getEstoque_recuperado_inicio() {	return estoque_recuperado_inicio;}
public void setEstoque_recuperado_inicio(String estoque_recuperado_inicio) {	this.estoque_recuperado_inicio = estoque_recuperado_inicio;}

public String getEstoque_recuperado_fim() {	return estoque_recuperado_fim;}
public void setEstoque_recuperado_fim(String estoque_recuperado_fim) {	this.estoque_recuperado_fim = estoque_recuperado_fim;}

public String getEstoque_medio() {	return estoque_medio;}
public void setEstoque_medio(String estoque_medio) {	this.estoque_medio = estoque_medio;}

public String getDispensados_descontados() {	return dispensados_descontados;}
public void setDispensados_descontados(String dispensados_descontados) {	this.dispensados_descontados = dispensados_descontados;}

public String getDispensados() {	return dispensados;}
public void setDispensados(String dispensados) {	this.dispensados = dispensados;}

public String getRotatividade_descontada() {	return rotatividade_descontada;}
public void setRotatividade_descontada(String rotatividade_descontada) {	this.rotatividade_descontada = rotatividade_descontada;}

public String getDesligados_espontaneos() {	return desligados_espontaneos;}
public void setDesligados_espontaneos(String desligados_espontaneos) {	this.desligados_espontaneos = desligados_espontaneos;}

public String getDuracao_media_emprego() {	return duracao_media_emprego;}
public void setDuracao_media_emprego(String duracao_media_emprego) {	this.duracao_media_emprego = duracao_media_emprego;}

public String getTermino_de_contrato() {	return termino_de_contrato;}
public void setTermino_de_contrato(String termino_de_contrato) {	this.termino_de_contrato = termino_de_contrato;}

public String getRotatividade_nao_descontada() {	return rotatividade_nao_descontada;}
public void setRotatividade_nao_descontada(String rotatividade_nao_descontada) {	this.rotatividade_nao_descontada = rotatividade_nao_descontada;}

public String getPercentual_dispensa_injusta() {	return percentual_dispensa_injusta;}
public void setPercentual_dispensa_injusta(String percentual_dispensa_injusta) {	this.percentual_dispensa_injusta = percentual_dispensa_injusta;}
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


	
	
	
}
