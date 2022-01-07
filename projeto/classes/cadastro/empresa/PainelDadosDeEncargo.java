package cadastro.empresa;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import beans.Dados_Encargos;
import beans.Empresa;
import classes.CampoLimitadoSoDigito;
import classes.CampoMoeda;
import comuns.Calculo;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;



public class PainelDadosDeEncargo extends JPanel{

	
private static final long serialVersionUID = 1L;

private CampoLimitadoSoDigito tf_jornada_mensal;
private CampoLimitadoSoDigito tf_repouso_semanal;
private CampoMoeda tf_feriados;
private CampoMoeda tf_aux_enfermidade;
private CampoMoeda tf_licen_paternidade;
private CampoMoeda tf_licen_maternidade;
private CampoMoeda tf_faltas_justificadas;
private CampoLimitadoSoDigito tf_dias_chuva;
private CampoMoeda tf_aux_acidente;
private CampoMoeda tf_ferias;
private CampoMoeda tf_ano_produtivo;
private CampoMoeda tf_ano_produtivo_sem_horas_trab;
private CampoLimitadoSoDigito tf_salario_13;
private CampoLimitadoSoDigito tf_aviso_previo_indenizado;
private CampoLimitadoSoDigito tf_aviso_previo_trabalhado;
private CampoMoeda tf_ferias_indenizadas;
private CampoMoeda tf_despedida_injusta;
private CampoMoeda tf_indenizacao_adicional;

private CampoMoeda tf_custo_conducao;
private CampoMoeda tf_custo_cafe_manha;
private CampoMoeda tf_custo_refeicao;
private CampoMoeda tf_custo_seguro;
private CampoMoeda tf_custo_epi;
private CampoMoeda tf_salario_minimo;

protected CampoLimitadoSoDigito tf_num_conducoes;
protected CampoLimitadoSoDigito tf_num_refeicoes;
protected CampoLimitadoSoDigito tf_num_ferramentas_manu;

private JTextField tf_desligamentos;
private CampoLimitadoSoDigito tf_dispensa_injusta;
private CampoLimitadoSoDigito tf_dispensa_justa;
private CampoLimitadoSoDigito tf_espontaneos;
private CampoLimitadoSoDigito tf_fim_de_contrato;
private CampoLimitadoSoDigito tf_termino_de_contrato;
private CampoLimitadoSoDigito tf_aposentados;
private CampoLimitadoSoDigito tf_mortos;
private CampoMoeda tf_transferencias;
private CampoMoeda tf_estoque;
private CampoMoeda tf_estoque_recuperado_inicio;
private CampoMoeda tf_estoque_recuperado_fim;
private JTextField tf_estoque_medio;
private JTextField tf_dispensados_descontados;
private JTextField tf_dispensados;
private JTextField tf_rotatividade_descontada;
private JTextField tf_rotatividade_nao_descontada;
private JTextField tf_desligados_espontaneos;
private JTextField tf_duracao_media_emprego;	
private JTextField tf_percentual_dispensa_injusta;	
	
protected Empresa empresa;

protected Dados_Encargos dados_encargo;





	public PainelDadosDeEncargo(Empresa empresa){
	
	this.empresa = empresa;	
		
	this.setLayout(new GridBagLayout());
	
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	
	this.adicionarComponentes();
	
	
		if(this.empresa != null ){
		
		this.dados_encargo = new DAO<Dados_Encargos>(Dados_Encargos.class).get(this.empresa.getFk_dados_encargo());
		
			if(this.dados_encargo==null){
			
			this.dados_encargo = new Dados_Encargos();
			return;	
			}
		
		tf_jornada_mensal.setText(this.dados_encargo.getJornada_mensal());
		tf_repouso_semanal.setText(this.dados_encargo.getRepouso_semanal());
		tf_feriados.setText(this.dados_encargo.getFeriados());
		tf_aux_enfermidade.setText(this.dados_encargo.getAux_enfermidade());
		tf_licen_paternidade.setText(this.dados_encargo.getLicen_paternidade());
		tf_licen_maternidade.setText(this.dados_encargo.getLicen_maternidade());
		tf_faltas_justificadas.setText(this.dados_encargo.getFaltas_justificadas());
		tf_dias_chuva.setText(this.dados_encargo.getDias_chuva());
		tf_aux_acidente.setText(this.dados_encargo.getAux_acidente());
		tf_ferias.setText(this.dados_encargo.getFerias());
		tf_ano_produtivo.setText(this.dados_encargo.getAno_produtivo());
		tf_ano_produtivo_sem_horas_trab.setText(this.dados_encargo.getAno_produtivo_sem_horas_trab());
		tf_salario_13.setText(this.dados_encargo.getSalario_13());
		tf_aviso_previo_indenizado.setText(this.dados_encargo.getAviso_previo_indenizado());
		tf_aviso_previo_trabalhado.setText(this.dados_encargo.getAviso_previo_trabalhado());
		tf_ferias_indenizadas.setText(this.dados_encargo.getFerias_indenizadas());
		tf_despedida_injusta.setText(this.dados_encargo.getDespedida_injusta());
		tf_indenizacao_adicional.setText(this.dados_encargo.getIndenizacao_adicional());
		
		tf_custo_conducao.setText(this.dados_encargo.getCusto_conducao());
		tf_custo_cafe_manha.setText(this.dados_encargo.getCusto_cafe_manha());
		tf_custo_refeicao.setText(this.dados_encargo.getCusto_refeicao());
		tf_custo_seguro.setText(this.dados_encargo.getCusto_seguro());
		tf_custo_epi.setText(this.dados_encargo.getCusto_epi());
		tf_salario_minimo.setText(this.dados_encargo.getSalario_minimo());
		
		tf_desligamentos.setText(this.dados_encargo.getDesligamentos());
		tf_dispensa_injusta.setText(this.dados_encargo.getDispensa_injusta());
		tf_dispensa_justa.setText(this.dados_encargo.getDispensa_justa());
		tf_espontaneos.setText(this.dados_encargo.getEspontaneos());
		tf_fim_de_contrato.setText(this.dados_encargo.getFim_de_contrato());
		tf_termino_de_contrato.setText(this.dados_encargo.getTermino_de_contrato());
		tf_aposentados.setText(this.dados_encargo.getAposentados());
		tf_mortos.setText(this.dados_encargo.getMortos());
		tf_transferencias.setText(this.dados_encargo.getTransferencias());
		tf_estoque.setText(this.dados_encargo.getEstoque());
		tf_estoque_recuperado_inicio.setText(this.dados_encargo.getEstoque_recuperado_inicio());
		tf_estoque_recuperado_fim.setText(this.dados_encargo.getEstoque_recuperado_fim());
		tf_estoque_medio.setText(this.dados_encargo.getEstoque_medio());
		tf_dispensados_descontados.setText(this.dados_encargo.getDispensados_descontados());
		tf_dispensados.setText(this.dados_encargo.getDispensados());
		tf_rotatividade_descontada.setText(this.dados_encargo.getRotatividade_descontada());
		tf_rotatividade_nao_descontada.setText(this.dados_encargo.getRotatividade_nao_descontada());
		tf_desligados_espontaneos.setText(this.dados_encargo.getDesligados_espontaneos());
		tf_duracao_media_emprego.setText(this.dados_encargo.getDuracao_media_emprego());
		this.tf_percentual_dispensa_injusta.setText(this.dados_encargo.getPercentual_dispensa_injusta());
		
		this.tf_num_conducoes.setText(this.dados_encargo.getNum_conducao());
		this.tf_num_ferramentas_manu.setText(this.dados_encargo.getNum_ferramentas_manu());
		this.tf_num_refeicoes.setText(this.dados_encargo.getNum_refeicoes());
		}
		
	}
	
	
	
	
	
	public void adicionarComponentes() {
		
	GridBagConstraints cons = new GridBagConstraints();  
	
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(new JScrollPane(p_1), cons);	
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Jornada Mensal:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_jornada_mensal = new CampoLimitadoSoDigito(4), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Repouso Semanal Remunerado:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_repouso_semanal = new CampoLimitadoSoDigito(4), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Feriados:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_feriados = new CampoMoeda(4), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Auxílio Enfermidade - Doença:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_aux_enfermidade = new CampoMoeda(5), cons);
	this.tf_aux_enfermidade.setToolTipText("15 dias, ocorrência de 3,40%.");
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Licença Paternidade:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_licen_paternidade = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Licença Maternidade:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_licen_maternidade = new CampoMoeda(5), cons);
	this.tf_licen_paternidade.setToolTipText("5 dias, incidência (92,36%), proporção (85,64%) e recorre (5,93%).");
	this.tf_licen_maternidade.setToolTipText("120 dias, natalidade (4,33%), incidência (7,64%), proporção (82,40%).");
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Faltas Justificadas:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_faltas_justificadas = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Dias de Chuva:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_dias_chuva = new CampoLimitadoSoDigito(4), cons);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Auxílio Acidente de Trabalho:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_aux_acidente = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Férias Gozadas + 1/3 Adicional:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_ferias = new CampoMoeda(5), cons);
	this.tf_aux_acidente.setToolTipText("incremento 3,50%.");
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Ano Produtivo:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_ano_produtivo = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Ano Produtivo Menos Horas não Trabalhadas:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_ano_produtivo_sem_horas_trab = new CampoMoeda(5), cons);
	this.tf_ano_produtivo.setToolTipText("1 ano => 365 dias + 1/4 dia ano bissexto.");
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("13º Salário (30 Dias):"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_salario_13 = new CampoLimitadoSoDigito(4), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Aviso Prévio Indenizado:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_aviso_previo_indenizado = new CampoLimitadoSoDigito(5), cons);
	this.tf_aviso_previo_indenizado.setToolTipText("30 dias + 3 dias p/ano, incidência (90,00%).");
	
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Aviso Prévio Trabalhado (7 Dias):"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_aviso_previo_trabalhado = new CampoLimitadoSoDigito(4), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Férias Indenizadas + 1/3 Adicional:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_ferias_indenizadas = new CampoMoeda(5), cons);
	this.tf_ferias_indenizadas.setToolTipText("6,26 meses.");
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Depósito por Despedida Injusta:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_despedida_injusta = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Indenização Adicional:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_indenizacao_adicional = new CampoMoeda(5), cons);
	this.tf_indenizacao_adicional.setToolTipText("1/12 - adotado.");
	
	
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 1;
	cons.insets = new Insets( 20, 2, 0, 2);
	p_1.add(new JLabel("<html><b>CUSTOS MÉDIOS ESTIMADOS</b></html>"), cons);
	cons.insets = new Insets( 2, 1, 10, 1);
	p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);

	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Custo Médio (un.) da Condução:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_custo_conducao = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Custo Médio (un.) de um Café da Manhã:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_custo_cafe_manha = new CampoMoeda(5), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Custo Médio (un.) da Refeição:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_custo_refeicao = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Custo Médio (un.) do seguro:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_custo_seguro = new CampoMoeda(5), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Número de Conduções:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_num_conducoes = new CampoLimitadoSoDigito(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Número de Refeições:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_num_refeicoes = new CampoLimitadoSoDigito(5), cons);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Ferramentas manuais:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_num_ferramentas_manu = new CampoLimitadoSoDigito(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Custo Médio do EPI (mês):"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_custo_epi = new CampoMoeda(5), cons);
	this.tf_custo_epi.setToolTipText("1/3 de calçado + 1/10 de capacete + 1/10 cinturão - K.");
	
	

	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Salário Médio Nominal (mês):"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_salario_minimo = new CampoMoeda(5), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel(""), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(new JLabel(""), cons);
	
	
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 1;
	cons.insets = new Insets( 20, 2, 10, 2);
	p_1.add(new JLabel("<html><b>OUTROS DADOS (PROVENIENTES DO CAGED)</b></html>"), cons);
	cons.insets = new Insets( 2, 1, 10, 1);
	p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Total de Desligamentos:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_desligamentos = new JTextField(), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Dispensas com Justa Causa:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_dispensa_justa = new CampoLimitadoSoDigito(8), cons);
	this.tf_desligamentos.setEditable(false);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Dispensas sem Justa Causa:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_dispensa_injusta = new CampoLimitadoSoDigito(8), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Espontâneos:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_espontaneos = new CampoLimitadoSoDigito(8), cons);

	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Fim de Contrato por Prazo Determinado:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_fim_de_contrato = new CampoLimitadoSoDigito(8), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Término de Contrato:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_termino_de_contrato = new CampoLimitadoSoDigito(8), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Aposentados:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_aposentados = new CampoLimitadoSoDigito(8), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Mortos:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_mortos = new CampoLimitadoSoDigito(8), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Transferência Saída:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_transferencias = new CampoMoeda(8), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Estoque:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_estoque = new CampoMoeda(8), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Estoque Recuperado Início do Período:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_estoque_recuperado_inicio = new CampoMoeda(8), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Estoque Recuperado Final do Período:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_estoque_recuperado_fim = new CampoMoeda(8), cons);
	
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Estoque Médio:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_estoque_medio = new JTextField(), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Dispensados Descontados:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.2;
	p_1.add(this.tf_dispensados_descontados = new JTextField(), cons);
	this.tf_dispensados_descontados.setToolTipText("não considera os desligamentos espontâneos, aposentados, mortos e transferência de saída.");
	this.tf_estoque_medio.setEditable(false);
	this.tf_dispensados_descontados.setEditable(false);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Dispensados:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_dispensados = new JTextField(), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Taxa de Rotatividade Descontada:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_rotatividade_descontada = new JTextField(), cons);
	this.tf_dispensados.setToolTipText("não considera os aposentados, mortos e transferência de saída.");
	this.tf_rotatividade_descontada.setToolTipText("apenas dispensados sem justa causa.");
	this.tf_dispensados.setEditable(false);
	this.tf_rotatividade_descontada.setEditable(false);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Taxa de Rotatividade Não Descontada:"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_rotatividade_nao_descontada = new JTextField(), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Desligados Espontâneos:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_desligados_espontaneos = new JTextField(), cons);
	this.tf_rotatividade_nao_descontada.setEditable(false);
	this.tf_desligados_espontaneos.setEditable(false);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 20);
	cons.weightx  = 0.4;
	p_1.add(new JLabel("Duração Média de Emprego (em Meses):"), cons);
	cons.weightx  = 0.2;
	p_1.add(this.tf_duracao_media_emprego = new JTextField(), cons);
	cons.weightx  = 0.4;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Percentual de Dispensados sem Justa Causa:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx  = 0.2;
	p_1.add(this.tf_percentual_dispensa_injusta = new JTextField(), cons);
	this.tf_duracao_media_emprego.setEditable(false);
	this.tf_percentual_dispensa_injusta.setEditable(false);

	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;
	cons.weighty  = 0;
	cons.weightx = 0;
	cons.ipadx = 15;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	JButton bt_salvar  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar dados da empresa");
	this.add(bt_salvar, cons);
	
		
		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		if(acaoPrincipal())	
		Mensagens.msgDeSucessoAoSalvar();
		
		}});
			

	
	}
	
	


	
	

	public  boolean acaoPrincipal(){
	
	if(this.dados_encargo == null)	
	this.dados_encargo = new Dados_Encargos();	
	
	this.dados_encargo.setJornada_mensal(tf_jornada_mensal.getText());
	this.dados_encargo.setRepouso_semanal(tf_repouso_semanal.getText());
	this.dados_encargo.setFeriados(tf_feriados.getText());
	this.dados_encargo.setAux_enfermidade(tf_aux_enfermidade.getText());
	this.dados_encargo.setLicen_paternidade(tf_licen_paternidade.getText());
	this.dados_encargo.setLicen_maternidade(tf_licen_maternidade.getText());
	this.dados_encargo.setFaltas_justificadas(tf_faltas_justificadas.getText());
	this.dados_encargo.setDias_chuva(tf_dias_chuva.getText());
	this.dados_encargo.setAux_acidente(tf_aux_acidente.getText());
	this.dados_encargo.setFerias(tf_ferias.getText());
	this.dados_encargo.setAno_produtivo("365.25");
	this.dados_encargo.setAno_produtivo_sem_horas_trab(this.tf_ano_produtivo_sem_horas_trab.getText());
	
	this.dados_encargo.setSalario_13(tf_salario_13.getText());
	this.dados_encargo.setAviso_previo_indenizado(tf_aviso_previo_indenizado.getText());
	this.dados_encargo.setAviso_previo_trabalhado(tf_aviso_previo_trabalhado.getText());
	this.dados_encargo.setFerias_indenizadas(tf_ferias_indenizadas.getText());
	this.dados_encargo.setDespedida_injusta(tf_despedida_injusta.getText());
	this.dados_encargo.setIndenizacao_adicional(tf_indenizacao_adicional.getText());
	
	this.dados_encargo.setCusto_conducao(tf_custo_conducao.getText());
	this.dados_encargo.setCusto_cafe_manha(tf_custo_cafe_manha.getText());
	this.dados_encargo.setCusto_refeicao(tf_custo_refeicao.getText());
	this.dados_encargo.setCusto_seguro(tf_custo_seguro.getText());
	this.dados_encargo.setCusto_epi(tf_custo_epi.getText());
	this.dados_encargo.setSalario_minimo(tf_salario_minimo.getText());
	

	this.tf_desligamentos.setText(Calculo.formataValor(
			Calculo.soma(tf_dispensa_injusta.getText(),
								Calculo.soma(tf_dispensa_justa.getText(),
										Calculo.soma(tf_espontaneos.getText(),
												Calculo.soma(tf_fim_de_contrato.getText(),
														Calculo.soma(tf_termino_de_contrato.getText(),
																Calculo.soma(tf_aposentados.getText(),
																		Calculo.soma(tf_mortos.getText(),tf_transferencias.getText())))))))));
	
	
	this.dados_encargo.setDesligamentos(tf_desligamentos.getText());
	this.dados_encargo.setDispensa_injusta(tf_dispensa_injusta.getText());
	this.dados_encargo.setDispensa_justa(tf_dispensa_justa.getText());
	this.dados_encargo.setEspontaneos(tf_espontaneos.getText());
	this.dados_encargo.setFim_de_contrato(tf_fim_de_contrato.getText());
	this.dados_encargo.setTermino_de_contrato(this.tf_termino_de_contrato.getText());
	this.dados_encargo.setAposentados(tf_aposentados.getText());
	this.dados_encargo.setMortos(tf_mortos.getText());
	this.dados_encargo.setTransferencias(tf_transferencias.getText());
	this.dados_encargo.setEstoque(tf_estoque.getText());
	this.dados_encargo.setEstoque_recuperado_inicio(tf_estoque_recuperado_inicio.getText());
	this.dados_encargo.setEstoque_recuperado_fim(tf_estoque_recuperado_fim.getText());
	
	this.tf_estoque_medio.setText(Calculo.formataValor(Calculo.media(tf_estoque_recuperado_inicio.getText(),tf_estoque_recuperado_fim.getText(), 4)));

	this.dados_encargo.setEstoque_medio(tf_estoque_medio.getText());
	
	this.tf_dispensados_descontados.setText(Calculo.formataValor(
			Calculo.subtrai(tf_desligamentos.getText(),
					Calculo.soma(tf_espontaneos.getText(),
						Calculo.soma(tf_aposentados.getText(),
							Calculo.soma(tf_mortos.getText(),tf_transferencias.getText()))))));


	
	this.dados_encargo.setDispensados_descontados(tf_dispensados_descontados.getText());
	
	
	this.tf_dispensados.setText(Calculo.formataValor(
			Calculo.subtrai(tf_desligamentos.getText(),
					Calculo.soma(tf_aposentados.getText(), Calculo.soma(tf_mortos.getText(),tf_transferencias.getText())))));

	
	this.dados_encargo.setDispensados(tf_dispensados.getText());
	
	this.tf_rotatividade_descontada.setText(Calculo.formataValor(
			Calculo.multiplica(Calculo.dividi(tf_dispensados_descontados.getText(),tf_estoque_medio.getText(), 4),"100.00")));


	
	this.dados_encargo.setRotatividade_descontada(tf_rotatividade_descontada.getText());
	
	this.tf_rotatividade_nao_descontada.setText(Calculo.formataValor(
			Calculo.multiplica(Calculo.dividi(tf_dispensados.getText(),tf_estoque_medio.getText(), 4), "100.00")));


	this.dados_encargo.setRotatividade_nao_descontada(tf_rotatividade_nao_descontada.getText());
	
	this.tf_desligados_espontaneos.setText(Calculo.formataValor(
			Calculo.multiplica(Calculo.dividi(tf_espontaneos.getText(),tf_desligamentos.getText(), 4),"100.00")));

	
	this.dados_encargo.setDesligados_espontaneos(tf_desligados_espontaneos.getText());
	
	
	this.tf_duracao_media_emprego.setText(Calculo.formataValor(Calculo.multiplica(Calculo.dividi("12,00",tf_rotatividade_descontada.getText(), 4), "100.00")));


	this.dados_encargo.setDuracao_media_emprego(tf_duracao_media_emprego.getText());	
	
	
	this.tf_percentual_dispensa_injusta.setText(Calculo.formataValor(
			Calculo.multiplica(Calculo.dividi(tf_dispensa_injusta.getText(),tf_dispensados_descontados.getText(), 4),"100.00")));

	
	this.dados_encargo.setPercentual_dispensa_injusta(this.tf_percentual_dispensa_injusta.getText());	
	
	this.dados_encargo.setNum_conducao(this.tf_num_conducoes.getText().length()==0?0:Integer.parseInt(this.tf_num_conducoes.getText()));
	this.dados_encargo.setNum_ferramentas_manu(this.tf_num_ferramentas_manu.getText().length()==0?0:Integer.parseInt(this.tf_num_ferramentas_manu.getText()));
	this.dados_encargo.setNum_refeicoes(this.tf_num_refeicoes.getText().length()==0?0:Integer.parseInt(this.tf_num_refeicoes.getText()));
	
	
	
	
		if(this.dados_encargo.getId_dados_encargo() == 0){
		
		int id =  new DAO<Dados_Encargos>(Dados_Encargos.class).novo(this.dados_encargo);
		
		this.empresa.setFk_dados_encargo(id);
		
		return new DAO<Empresa>(Empresa.class).altera(this.empresa);
		}
		else
		return new DAO<Dados_Encargos>(Dados_Encargos.class).altera(this.dados_encargo);

	}
	
	
	
	
	
	
}
