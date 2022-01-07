package cadastro;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import comuns.Calculo;
import comuns.Preferencias;
import classes.CampoLimitadoSoDigito;
import classes.CampoMoeda;




public class PainelDeEncargoHorista extends JPanel{

	
private static final long serialVersionUID = 1L;


public JTextField tf_valor_total;
public CampoMoeda tf_inss_previdencia;
public CampoMoeda tf_fgts;
public CampoMoeda tf_salario_edu;
public CampoMoeda tf_sesi;
public CampoMoeda tf_senai;
public CampoMoeda tf_sebrae;
public CampoMoeda tf_incra;
public CampoMoeda tf_inss_seguro;
public CampoMoeda tf_seconci;
public JTextField tf_repouso_semanal;
public JTextField tf_aux_enfermidade;
public JTextField tf_licen_paternidade;
public JTextField tf_salario_13;
public JTextField tf_imprevistos;
public JTextField tf_sem_justa_causa;
public JTextField tf_ferias;
public JTextField tf_aviso_previo;
public JTextField tf_reincidencia_a_b;
public JTextField tf_vale_transporte;
public JTextField tf_cafe_manha;
public JTextField tf_refeicao;
public JTextField tf_seguro_vida;
public JTextField tf_eq_protecao_indiv;
public JTextField tf_ferramentas_manu;


public CampoLimitadoSoDigito tf_jornada_mensal;
public CampoLimitadoSoDigito tf_repouso_semanal_remu;	
public CampoMoeda tf_feriados;
public CampoMoeda tf_aux_enfermidade_dias;
public CampoMoeda tf_licen_paternidade_dias;
public CampoMoeda tf_licen_maternidade_dias;
public CampoMoeda tf_faltas_justificadas;
public CampoLimitadoSoDigito tf_dias_chuva;
public CampoMoeda tf_aux_acidente;
public CampoMoeda tf_ferias_dias;
public CampoMoeda tf_ano_produtivo;
public CampoMoeda tf_ano_produtivo_sem_horas_trab;
public CampoLimitadoSoDigito tf_salario_13_dias;
public CampoLimitadoSoDigito tf_aviso_previo_indenizado;
public CampoLimitadoSoDigito tf_aviso_previo_trabalhado;
public CampoMoeda tf_ferias_indenizadas;
public CampoMoeda tf_despedida_injusta;
public CampoMoeda tf_indenizacao_adicional;

public CampoMoeda tf_custo_conducao;
public CampoMoeda tf_custo_cafe_manha;
public CampoMoeda tf_custo_refeicao;
public CampoMoeda tf_custo_seguro;
public CampoMoeda tf_custo_epi;
public CampoMoeda tf_salario_minimo;

public CampoLimitadoSoDigito tf_num_conducoes;
public CampoLimitadoSoDigito tf_num_refeicoes;
public CampoLimitadoSoDigito tf_num_ferramentas_manu;


public JTextField tf_desligamentos;
public CampoLimitadoSoDigito tf_dispensa_injusta;
public CampoLimitadoSoDigito tf_dispensa_justa;
public CampoLimitadoSoDigito tf_espontaneos;
public CampoLimitadoSoDigito tf_fim_de_contrato;	
public CampoLimitadoSoDigito tf_termino_de_contrato;
public CampoLimitadoSoDigito tf_aposentados;
public CampoLimitadoSoDigito tf_mortos;
public CampoMoeda tf_transferencias;
public CampoMoeda tf_estoque;
public CampoMoeda tf_estoque_recuperado_inicio;
public CampoMoeda tf_estoque_recuperado_fim;
public JTextField tf_estoque_medio;
public JTextField tf_dispensados_descontados;
public JTextField tf_dispensados;
public JTextField tf_rotatividade_descontada;
public JTextField tf_rotatividade_nao_descontada;
public JTextField tf_desligados_espontaneos;
public JTextField tf_duracao_media_emprego;	
public JTextField tf_percentual_dispensa_injusta;	
	
	

public String a;	
public String b;	
public String c;	
public String d;	
public String e;	
	
	
	


	public PainelDeEncargoHorista(){
		
		
	this.setLayout(new GridBagLayout());
		
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	this.adicionarComponentes();
	}
	
	
	
	
	
	
	
	public void adicionarComponentes(){
		
		GridBagConstraints cons = new GridBagConstraints();  
		
		cons.fill = GridBagConstraints.BOTH;
		cons.gridwidth  = GridBagConstraints.REMAINDER;
		cons.weightx  = 1;
		cons.weighty  = 1;
		cons.insets = new Insets( 2, 2, 0, 2);
		JPanel p_1 = new JPanel(new GridBagLayout());
		p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
		this.add(new JScrollPane(p_1), cons);	
			
			
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.weighty  = 0;
		
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 1;
		cons.insets = new Insets( 20, 2, 0, 2);
		p_1.add(new JLabel("<html><b>ENCARGOS SOCIAIS BÁSICOS (A)</b></html>"), cons);
		cons.insets = new Insets( 2, 1, 10, 1);
		p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);

		

		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Previdência Social (INSS):"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_inss_previdencia = new CampoMoeda(4), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Fundo de Garantia por Tempo de Serviço (FGTS):"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_fgts = new CampoMoeda(4), cons);
		
		
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Salário Educação:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_salario_edu = new CampoMoeda(4), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("SESI:"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_sesi = new CampoMoeda(4), cons);
		
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("SENAI:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_senai = new CampoMoeda(4), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("SEBRAE:"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_sebrae = new CampoMoeda(4), cons);
		
		
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("INCRA:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_incra = new CampoMoeda(4), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Seguro Contra os Acidentes de Trabalho (INSS):"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_inss_seguro = new CampoMoeda(4), cons);
		
		
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("SECONCI:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_seconci = new CampoMoeda(4), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel(""), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(new JLabel(""), cons);
		
		
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 1;
		cons.insets = new Insets( 20, 2, 0, 2);
		p_1.add(new JLabel("<html><b>ENCARGOS SOCIAIS QUE RECEBEM AS INCIDÊNCIAS DE A (B)</b></html>"), cons);
		cons.insets = new Insets( 2, 1, 10, 1);
		p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);

		

		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Repouso Semanal e Feriados:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_repouso_semanal = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Auxílio Enfermidade:"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_aux_enfermidade = new JTextField(), cons);
		this.tf_repouso_semanal.setEditable(false);
		this.tf_aux_enfermidade.setEditable(false);
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Licença Paternidade:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_licen_paternidade = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("13º Salário:"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_salario_13 = new JTextField(), cons);
		this.tf_licen_paternidade.setEditable(false);
		this.tf_salario_13.setEditable(false);
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Imprevistos:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_imprevistos = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel(""), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(new JLabel(""), cons);
		this.tf_imprevistos.setToolTipText("Dias de chuva/falta justificadas/acidentes de trabalho/greves/alta ou atraso na entrega de materiais ou serviços de obra/outras dificuldades.");
		this.tf_imprevistos.setEditable(false);
		
		
		
		
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 1;
		cons.insets = new Insets( 20, 2, 0, 2);
		p_1.add(new JLabel("<html><b>ENCARGOS SOCIAIS QUE NÃO RECEBEM AS INCIDÊNCIAS GLOBAIS DE A (C)</b></html>"), cons);
		cons.insets = new Insets( 2, 1, 10, 1);
		p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);

				
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Depósito por Despedida Injusta:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_sem_justa_causa = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Férias (indenização):"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_ferias = new JTextField(), cons);
		this.tf_sem_justa_causa.setToolTipText("50% sobre [A.2+(A.2xB)] (supondo apenas rescisões por despedida injusta).");
		this.tf_sem_justa_causa.setEditable(false);
		this.tf_ferias.setEditable(false);
		
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Aviso Prévio Indenizado:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_aviso_previo = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Reincidência de A sobre B"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_reincidencia_a_b = new JTextField(), cons);
		this.tf_aviso_previo.setEditable(false);
		this.tf_reincidencia_a_b.setEditable(false);
		
		
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 1;
		cons.insets = new Insets( 20, 2, 0, 2);
		p_1.add(new JLabel("<html><b>COMPLEMENTOS</b></html>"), cons);
		cons.insets = new Insets( 2, 1, 10, 1);
		p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);	
			
			
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Vale Transporte:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_vale_transporte = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Vale Café da Manhã:"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_cafe_manha = new JTextField(), cons);
		this.tf_vale_transporte.setEditable(false);
		this.tf_cafe_manha.setEditable(false);
		
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Refeição:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_refeicao = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Seguro de vida e Acidente em Grupo:"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_seguro_vida = new JTextField(), cons);
		this.tf_refeicao.setEditable(false);
		this.tf_seguro_vida.setEditable(false);
		
		
		cons.gridwidth  = 1;
		cons.insets = new Insets( 2, 2, 0, 20);
		cons.weightx  = 0.4;
		p_1.add(new JLabel("Equipamento de Proteção Individual:"), cons);
		cons.weightx  = 0.2;
		p_1.add(this.tf_eq_protecao_indiv = new JTextField(), cons);
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 0, 2);
		p_1.add(new JLabel("Ferramentas manuais:"), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 0.2;
		p_1.add(this.tf_ferramentas_manu = new JTextField(), cons);
		this.tf_eq_protecao_indiv.setEditable(false);
		this.tf_ferramentas_manu.setEditable(false);

		
		cons.gridwidth  = GridBagConstraints.REMAINDER;		
		cons.weightx  = 1;
		cons.insets = new Insets( 20, 2, 0, 2);
		p_1.add(new JLabel("<html><b>DADOS AUXILIARES AO CÁLCULO DE ENCARGOS</b></html>"), cons);
		cons.insets = new Insets( 2, 1, 10, 1);
		p_1.add(new JSeparator(SwingConstants.HORIZONTAL), cons);
		
		
		
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
			p_1.add(this.tf_repouso_semanal_remu = new CampoLimitadoSoDigito(4), cons);
			
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
			p_1.add(this.tf_aux_enfermidade_dias = new CampoMoeda(5), cons);
			this.tf_aux_enfermidade_dias.setToolTipText("15 dias, ocorrência de 3,40%.");
			
			
			cons.gridwidth  = 1;
			cons.insets = new Insets( 2, 2, 0, 20);
			cons.weightx  = 0.4;
			p_1.add(new JLabel("Licença Paternidade:"), cons);
			cons.weightx  = 0.2;
			p_1.add(this.tf_licen_paternidade_dias = new CampoMoeda(5), cons);
			cons.weightx  = 0.4;
			cons.insets = new Insets( 2, 2, 0, 2);
			p_1.add(new JLabel("Licença Maternidade:"), cons);
			cons.gridwidth  = GridBagConstraints.REMAINDER;		
			cons.weightx  = 0.2;
			p_1.add(this.tf_licen_maternidade_dias = new CampoMoeda(5), cons);
			this.tf_licen_paternidade_dias.setToolTipText("5 dias, incidência (92,36%), proporção (85,64%) e recorre (5,93%).");
			this.tf_licen_maternidade_dias.setToolTipText("120 dias, natalidade (4,33%), incidência (7,64%), proporção (82,40%).");
			
			
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
			p_1.add(this.tf_ferias_dias = new CampoMoeda(5), cons);
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
			p_1.add(this.tf_salario_13_dias = new CampoLimitadoSoDigito(4), cons);
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
		
		
		
			
		cons.insets = new Insets( 2, 2, 0, 2);
		this.add(new JLabel("Total Geral:"), cons);
		
		cons.gridwidth  = 1;
		cons.weightx  = 0.4;
		cons.insets = new Insets( 2, 2, 2, 2);
		this.add(this.tf_valor_total = new JTextField("0,00"), cons);
		this.tf_valor_total.setEditable(false);
		
		
		cons.fill = GridBagConstraints.NONE;
		cons.ipadx = 25;
		cons.weightx = 0;
		JButton bt_calc  = new JButton("Calcular Encargo");
		bt_calc.setToolTipText("Calcular valor de encargo horista.");
		this.add(bt_calc, cons);
		
		
		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.weightx = 1;
		this.add(new JLabel(""), cons);
		cons.gridwidth  = GridBagConstraints.REMAINDER;	
		this.add(new JLabel(""), cons);
		
		
				
				
			bt_calc.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed( ActionEvent event ){
							    	
			calculaEncargo();		
			}});
				
	}
	
	
	
	
	

	public void calculaEncargo(){
			
	
	String g11 = Calculo.dividi(this.tf_jornada_mensal.getText(), "30", 4);

	String g14 = Calculo.multiplica(
					Calculo.dividi(
					Calculo.subtrai(
					Calculo.multiplica(
					Calculo.dividi(this.tf_duracao_media_emprego.getText(), this.tf_ano_produtivo_sem_horas_trab.getText(), 4),
					this.tf_ano_produtivo.getText()),
					"30"),
					"7", 4),
					Calculo.multiplica(
							Calculo.dividi(this.tf_ano_produtivo_sem_horas_trab.getText(),this.tf_duracao_media_emprego.getText(), 4),
							g11));
					
	
	String g15 = 
			Calculo.multiplica(
			
					Calculo.multiplica(
					Calculo.dividi(this.tf_duracao_media_emprego.getText(), this.tf_ano_produtivo_sem_horas_trab.getText(), 4),
					this.tf_feriados.getText()),
					
					Calculo.multiplica(
							Calculo.dividi(Calculo.subtrai(this.tf_duracao_media_emprego.getText(),"1"), this.tf_duracao_media_emprego.getText(), 4),
								Calculo.multiplica(
								Calculo.dividi(this.tf_ano_produtivo_sem_horas_trab.getText(),this.tf_duracao_media_emprego.getText(), 4),
								g11)));
	
	
	String g16 = 
			Calculo.multiplica(
					Calculo.soma(
						Calculo.multiplica(this.tf_aux_enfermidade_dias.getText(),"0.034"),
						"2"),
						g11);
	
	
	String g17 = 
			Calculo.multiplica(this.tf_licen_paternidade_dias.getText(),
					Calculo.multiplica(
							Calculo.multiplica("0.9236", 
									Calculo.multiplica("0.8564", "0.0593")), g11));
			
			
	String g18 = Calculo.multiplica(
					Calculo.multiplica("0.0433", 
						Calculo.multiplica("0.0764", 
							Calculo.multiplica("0.824",
									Calculo.multiplica(
											Calculo.dividi(this.tf_licen_maternidade_dias.getText(), this.tf_ano_produtivo.getText(), 4),
											Calculo.soma("30", this.tf_ferias_dias.getText()))))),
													g11);
	
	
	String g19 = Calculo.multiplica(this.tf_faltas_justificadas.getText(),g11);
	
			

	String g20 = Calculo.multiplica(this.tf_dias_chuva.getText(),
					Calculo.multiplica(
							Calculo.dividi( Calculo.subtrai(this.tf_ano_produtivo.getText(), "107.4200"),this.tf_ano_produtivo.getText(), 4), 
								Calculo.multiplica("0.2000",
										Calculo.multiplica("0.2000", g11))));
	
	
	
	String g21 = Calculo.multiplica(this.tf_aux_acidente.getText(), Calculo.multiplica("0.035", g11));
	
	
	
	String g22 = Calculo.multiplica(this.tf_ferias_dias.getText(), 
					Calculo.multiplica(
							Calculo.dividi( this.tf_ano_produtivo_sem_horas_trab.getText(), this.tf_duracao_media_emprego.getText()),
							g11));
	
	
	
	String g23 = Calculo.multiplica(this.tf_ano_produtivo.getText(), g11);

	
	String g24 = Calculo.subtrai(g23,Calculo.soma(g14, Calculo.soma(g15,
									 Calculo.soma(g16, Calculo.soma(g17,
									 Calculo.soma(g18, Calculo.soma(g20,
									 Calculo.soma(g21, g22))))))));

	
	String g25 = Calculo.multiplica(this.tf_salario_13_dias.getText(), g11);

	String g26 = Calculo.multiplica(Calculo.dividi(this.tf_aviso_previo_indenizado.getText(), "100", 4),
				 Calculo.multiplica(Calculo.dividi(this.tf_rotatividade_descontada.getText(), "100", 4),
				 Calculo.multiplica(Calculo.dividi(this.tf_percentual_dispensa_injusta.getText(), "100", 4),
				 Calculo.multiplica("90",	g11))));

	
	/*
	String g27 = Calculo.multiplica(
					Calculo.soma(
							Calculo.multiplica(this.tf_aviso_previo_trabalhado.getText(),
							Calculo.multiplica(Calculo.dividi(this.tf_rotatividade_descontada.getText(), "100", 4),
							Calculo.multiplica(Calculo.dividi(this.tf_percentual_dispensa_injusta.getText(), "100", 4),
							"0.10"))),
						
						Calculo.multiplica(this.tf_aviso_previo_trabalhado.getText(),
						Calculo.multiplica(Calculo.dividi(this.tf_rotatividade_nao_descontada.getText(), "100", 4),
						Calculo.multiplica("0.20", "0.50")))),	
						g11);
*/
	
	
	String g28 =Calculo.multiplica(this.tf_ferias_dias.getText(),
				Calculo.multiplica(
						Calculo.dividi(this.tf_ferias_indenizadas.getText(),this.tf_duracao_media_emprego.getText(), 4),
						Calculo.multiplica(Calculo.dividi(this.tf_percentual_dispensa_injusta.getText(), "100", 4), g11)));
	
	
/*	
	String g29 =Calculo.multiplica(
					Calculo.soma(this.tf_ano_produtivo.getText(),this.tf_ferias_dias.getText()),
					Calculo.multiplica(
							Calculo.dividi(this.tf_duracao_media_emprego.getText(), this.tf_ano_produtivo_sem_horas_trab.getText(), 4),
								Calculo.multiplica(Calculo.dividi(this.tf_rotatividade_descontada.getText(), "100", 4),
										Calculo.multiplica(Calculo.dividi(this.tf_fgts.getText(),"100", 4),
												Calculo.multiplica("0.50", 
														Calculo.multiplica(Calculo.dividi(this.tf_percentual_dispensa_injusta.getText(), "100", 4),g11))))));

	
	String g30 =Calculo.multiplica(
					Calculo.dividi(this.tf_indenizacao_adicional.getText(),"100", 4),
					Calculo.multiplica( "30",
							Calculo.multiplica(Calculo.dividi(this.tf_rotatividade_descontada.getText(),"100", 4),
								Calculo.multiplica(Calculo.dividi(this.tf_percentual_dispensa_injusta.getText(),"100", 4),g11))));

*/	
	
	
	
	this.a = 	Calculo.soma(tf_inss_previdencia.getText(),
				Calculo.soma(tf_fgts.getText(),
				Calculo.soma(tf_salario_edu.getText(),
				Calculo.soma(tf_sesi.getText(),
				Calculo.soma(tf_senai.getText(),
				Calculo.soma(tf_sebrae.getText(),
				Calculo.soma(tf_incra.getText(),
				Calculo.soma(tf_inss_seguro.getText(),tf_seconci.getText()))))))));
	
	
	this.tf_repouso_semanal.setText(Calculo.formataValor(Calculo.multiplica( Calculo.dividi(Calculo.soma(g14, g15), g24, 4), "100")));
	this.tf_aux_enfermidade.setText(Calculo.formataValor(Calculo.multiplica( Calculo.dividi(g16, g24, 4), "100")));
	this.tf_licen_paternidade.setText(Calculo.formataValor(Calculo.multiplica( Calculo.dividi(g18, g24, 4), "100")));
	this.tf_salario_13.setText(Calculo.formataValor(Calculo.multiplica( Calculo.dividi(g25, g24, 4), "100")));
	this.tf_imprevistos.setText(Calculo.formataValor(Calculo.dividi( 
															Calculo.soma(g19, 
															Calculo.soma(g20,g21)), g24, 4)));
	
	this.b = 	Calculo.soma(tf_repouso_semanal.getText(),
				Calculo.soma(tf_aux_enfermidade.getText(),
				Calculo.soma(tf_licen_paternidade.getText(),
				Calculo.soma(tf_salario_13.getText(),tf_imprevistos.getText()))));
	
	
	
	this.tf_sem_justa_causa.setText(Calculo.formataValor(
			Calculo.multiplica( "0.50",
					Calculo.soma(this.tf_fgts.getText(),
							Calculo.multiplica( this.tf_fgts.getText(), Calculo.dividi(b, "100", 4))))));
	
	
	this.tf_ferias.setText(Calculo.formataValor(
			Calculo.multiplica(Calculo.dividi( g28,g24, 4), "100")));
	
	
	this.tf_aviso_previo.setText(Calculo.formataValor(
			Calculo.multiplica(Calculo.dividi( g26,g24, 4), "100")));
	
	
	this.c = 	Calculo.soma(tf_sem_justa_causa.getText(),
				Calculo.soma(tf_ferias.getText(),tf_aviso_previo.getText()));

	
	this.tf_reincidencia_a_b.setText(Calculo.formataValor(Calculo.multiplica(a, Calculo.dividi( b, "100", 4))));
	
	
	this.d = 	Calculo.soma(a,
				Calculo.soma(c,
				Calculo.soma(b, this.tf_reincidencia_a_b.getText())));

	
	//System.out.println(a+" "+b+" "+c+" "+ d);
	
	
	this.tf_vale_transporte.setText(Calculo.formataValor(
			Calculo.multiplica(
					Calculo.dividi(
						Calculo.multiplica(this.tf_custo_conducao.getText(),
						Calculo.multiplica(this.tf_num_conducoes.getText(), "0.06")),
						this.tf_salario_minimo.getText()), "100")));
	
	
	this.tf_cafe_manha.setText(Calculo.formataValor(
			Calculo.multiplica(
					Calculo.dividi(
						Calculo.subtrai(
						Calculo.multiplica(this.tf_custo_cafe_manha.getText(),this.tf_num_refeicoes.getText()),
						Calculo.multiplica(
								Calculo.dividi(this.tf_salario_minimo.getText(), "30", 4),
								Calculo.multiplica(this.tf_num_refeicoes.getText(), "0.01"))),
						this.tf_salario_minimo.getText(), 4),
					"100")));
	
	
	this.tf_refeicao.setText(Calculo.formataValor(
			Calculo.multiplica(
					Calculo.dividi(
						Calculo.multiplica(this.tf_custo_refeicao.getText(),
						Calculo.multiplica(this.tf_num_refeicoes.getText(), "0.95")),
						this.tf_salario_minimo.getText(), 4),
						"100")));
	
	
	this.tf_seguro_vida.setText(Calculo.formataValor(
			Calculo.multiplica(
					Calculo.dividi(this.tf_custo_seguro.getText(),this.tf_salario_minimo.getText(), 4),
					"100")));
	
	
	this.tf_eq_protecao_indiv.setText(Calculo.formataValor(
			Calculo.multiplica(
					Calculo.dividi(this.tf_custo_epi.getText(),this.tf_salario_minimo.getText(), 4),
					"100")));
	
	
	this.tf_ferramentas_manu.setText(Calculo.formataValor(
			Calculo.multiplica(
					Calculo.dividi(this.tf_num_ferramentas_manu.getText(),this.tf_salario_minimo.getText(), 4),
					"100")));
	
	
	this.e = Calculo.soma(tf_vale_transporte.getText(),
			   Calculo.soma(tf_cafe_manha.getText(),
			   Calculo.soma(tf_refeicao.getText(),
			   Calculo.soma(tf_seguro_vida.getText(), this.tf_eq_protecao_indiv.getText()))));
	
	//System.out.println(e);

	
	this.tf_valor_total.setText(Calculo.formataValor(Calculo.soma(e, d )));
	}
	
		
	
}
