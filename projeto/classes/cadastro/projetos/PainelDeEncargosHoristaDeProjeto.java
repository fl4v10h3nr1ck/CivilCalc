package cadastro.projetos;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import beans.Encargo_Horista;
import cadastro.PainelDeEncargoHorista;
import comuns.Mensagens;
import dao.DAO;



public class PainelDeEncargosHoristaDeProjeto extends PainelDeEncargoHorista{

	
private static final long serialVersionUID = 1L;




private Encargo_Horista encargo;




	public PainelDeEncargosHoristaDeProjeto(Encargo_Horista encargo){
	
	super();
		
		
	GridBagConstraints cons = new GridBagConstraints();  
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.gridwidth  = 1;		
	cons.weightx  = 1;
	cons.insets = new Insets( 0, 0, 0, 0);
	this.add(new JLabel(""), cons);
	this.add(new JLabel(""), cons);
	this.add(new JLabel(""), cons);
	this.add(new JLabel(""), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.WEST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	cons.insets = new Insets(0, 2, 2, 2);
	JButton bt_salvar  = new JButton("Salvar Projeto", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar projeto.");
	this.add(bt_salvar, cons);
		
		
		
		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		if(acaoPrincipal())
		Mensagens.msgDeSucessoAoSalvar();
				
		}});
		
	this.atualiza(encargo);
	}


		
	
	
	public void atualiza(Encargo_Horista encargo){
	
	this.encargo = encargo;	
		
		if(this.encargo!=null){
			
			this.tf_valor_total.setText(this.encargo.getValor_total());
			this.tf_inss_previdencia.setText(this.encargo.getInss_previdencia());
			this.tf_fgts.setText(this.encargo.getFgts());
			this.tf_salario_edu.setText(this.encargo.getSalario_edu());
			this.tf_sesi.setText(this.encargo.getSesi());
			this.tf_senai.setText(this.encargo.getSenai());
			this.tf_sebrae.setText(this.encargo.getSebrae());
			this.tf_incra.setText(this.encargo.getIncra());
			this.tf_inss_seguro.setText(this.encargo.getInss_seguro());
			this.tf_seconci.setText(this.encargo.getSeconci());
			this.tf_repouso_semanal.setText(this.encargo.getRepouso_semanal());
			this.tf_aux_enfermidade.setText(this.encargo.getAux_enfermidade());
			this.tf_licen_paternidade.setText(this.encargo.getLicen_paternidade());
			this.tf_salario_13.setText(this.encargo.getSalario_13());
			this.tf_imprevistos.setText(this.encargo.getImprevistos());
			this.tf_sem_justa_causa.setText(this.encargo.getSem_justa_causa());
			this.tf_ferias.setText(this.encargo.getFerias());
			this.tf_aviso_previo.setText(this.encargo.getAviso_previo());
			this.tf_reincidencia_a_b.setText(this.encargo.getReincidencia_a_b());
			this.tf_vale_transporte.setText(this.encargo.getVale_transporte());
			this.tf_cafe_manha.setText(this.encargo.getCafe_manha());
			this.tf_refeicao.setText(this.encargo.getRefeicao());
			this.tf_seguro_vida.setText(this.encargo.getSeguro_vida());
			this.tf_eq_protecao_indiv.setText(this.encargo.getEq_protecao_indiv());
			this.tf_ferramentas_manu.setText(this.encargo.getFerramentas_manu());


			tf_jornada_mensal.setText(this.encargo.getJornada_mensal());
			tf_repouso_semanal_remu.setText(this.encargo.getRepouso_semanal_remu());
			tf_feriados.setText(this.encargo.getFeriados());
			tf_aux_enfermidade_dias.setText(this.encargo.getAux_enfermidade_dias());
			tf_licen_paternidade_dias.setText(this.encargo.getLicen_paternidade_dias());
			tf_licen_maternidade_dias.setText(this.encargo.getLicen_maternidade_dias());
			tf_faltas_justificadas.setText(this.encargo.getFaltas_justificadas());
			tf_dias_chuva.setText(this.encargo.getDias_chuva());
			tf_aux_acidente.setText(this.encargo.getAux_acidente());
			tf_ferias_dias.setText(this.encargo.getFerias_dias());
			tf_ano_produtivo.setText(this.encargo.getAno_produtivo());
			tf_ano_produtivo_sem_horas_trab.setText(this.encargo.getAno_produtivo_sem_horas_trab());
			tf_salario_13_dias.setText(this.encargo.getSalario_13_dias());
			tf_aviso_previo_indenizado.setText(this.encargo.getAviso_previo_indenizado());
			tf_aviso_previo_trabalhado.setText(this.encargo.getAviso_previo_trabalhado());
			tf_ferias_indenizadas.setText(this.encargo.getFerias_indenizadas());
			tf_despedida_injusta.setText(this.encargo.getDespedida_injusta());
			tf_indenizacao_adicional.setText(this.encargo.getIndenizacao_adicional());
			
			tf_custo_conducao.setText(this.encargo.getCusto_conducao());
			tf_custo_cafe_manha.setText(this.encargo.getCusto_cafe_manha());
			tf_custo_refeicao.setText(this.encargo.getCusto_refeicao());
			tf_custo_seguro.setText(this.encargo.getCusto_seguro());
			tf_custo_epi.setText(this.encargo.getCusto_epi());
			tf_salario_minimo.setText(this.encargo.getSalario_minimo());
			
			tf_desligamentos.setText(this.encargo.getDesligamentos());
			tf_dispensa_injusta.setText(this.encargo.getDispensa_injusta());
			tf_dispensa_justa.setText(this.encargo.getDispensa_justa());
			tf_espontaneos.setText(this.encargo.getEspontaneos());
			tf_fim_de_contrato.setText(this.encargo.getFim_de_contrato());
			tf_termino_de_contrato.setText(this.encargo.getTermino_de_contrato());
			tf_aposentados.setText(this.encargo.getAposentados());
			tf_mortos.setText(this.encargo.getMortos());
			tf_transferencias.setText(this.encargo.getTransferencias());
			tf_estoque.setText(this.encargo.getEstoque());
			tf_estoque_recuperado_inicio.setText(this.encargo.getEstoque_recuperado_inicio());
			tf_estoque_recuperado_fim.setText(this.encargo.getEstoque_recuperado_fim());
			tf_estoque_medio.setText(this.encargo.getEstoque_medio());
			tf_dispensados_descontados.setText(this.encargo.getDispensados_descontados());
			tf_dispensados.setText(this.encargo.getDispensados());
			tf_rotatividade_descontada.setText(this.encargo.getRotatividade_descontada());
			tf_rotatividade_nao_descontada.setText(this.encargo.getRotatividade_nao_descontada());
			tf_desligados_espontaneos.setText(this.encargo.getDesligados_espontaneos());
			tf_duracao_media_emprego.setText(this.encargo.getDuracao_media_emprego());
			this.tf_percentual_dispensa_injusta.setText(this.encargo.getPercentual_dispensa_injusta());
			
			this.tf_num_conducoes.setText(this.encargo.getNum_conducao());
			this.tf_num_ferramentas_manu.setText(this.encargo.getNum_ferramentas_manu());
			this.tf_num_refeicoes.setText(this.encargo.getNum_refeicoes());			
			
		}
	}

	

	
	
	
	
		
	public  boolean acaoPrincipal(){
	
	if(this.encargo==null)
	this.encargo = new Encargo_Horista();
			
	this.encargo.setInss_previdencia(this.tf_inss_previdencia.getText());
	this.encargo.setFgts(this.tf_fgts.getText());
	this.encargo.setSalario_edu(this.tf_salario_edu.getText());
	this.encargo.setSesi(this.tf_sesi.getText());
	this.encargo.setSenai(this.tf_senai.getText());
	this.encargo.setSebrae(this.tf_sebrae.getText());
	this.encargo.setIncra(this.tf_incra.getText());
	this.encargo.setInss_seguro(this.tf_inss_seguro.getText());
	this.encargo.setSeconci(this.tf_seconci.getText());
	
	this.encargo.setRepouso_semanal(this.tf_repouso_semanal.getText());
	this.encargo.setAux_enfermidade(this.tf_aux_enfermidade.getText());
	this.encargo.setLicen_paternidade(this.tf_licen_paternidade.getText());
	this.encargo.setSalario_13(this.tf_salario_13.getText());
	this.encargo.setImprevistos(this.tf_imprevistos.getText());
	this.encargo.setSem_justa_causa(this.tf_sem_justa_causa.getText());
	this.encargo.setFerias(this.tf_ferias.getText());
	this.encargo.setAviso_previo(this.tf_aviso_previo.getText());
	this.encargo.setReincidencia_a_b(this.tf_reincidencia_a_b.getText());
	this.encargo.setVale_transporte(this.tf_vale_transporte.getText());
	this.encargo.setCafe_manha(this.tf_cafe_manha.getText());
	this.encargo.setRefeicao(this.tf_refeicao.getText());
	this.encargo.setSeguro_vida(this.tf_seguro_vida.getText());
	this.encargo.setEq_protecao_indiv(this.tf_eq_protecao_indiv.getText());
	this.encargo.setFerramentas_manu(this.tf_ferramentas_manu.getText());
	this.encargo.setValor_total(this.tf_valor_total.getText());
	this.encargo.setStatus("ATIVO");
	
	
	this.encargo.setJornada_mensal(tf_jornada_mensal.getText());
	this.encargo.setRepouso_semanal_remu(tf_repouso_semanal_remu.getText());
	this.encargo.setFeriados(tf_feriados.getText());
	this.encargo.setAux_enfermidade_dias(tf_aux_enfermidade_dias.getText());
	this.encargo.setLicen_paternidade_dias(tf_licen_paternidade_dias.getText());
	this.encargo.setLicen_maternidade_dias(tf_licen_maternidade_dias.getText());
	this.encargo.setFaltas_justificadas(tf_faltas_justificadas.getText());
	this.encargo.setDias_chuva(tf_dias_chuva.getText());
	this.encargo.setAux_acidente(tf_aux_acidente.getText());
	this.encargo.setFerias_dias(tf_ferias_dias.getText());
	this.encargo.setAno_produtivo(this.tf_ano_produtivo.getText());
	this.encargo.setAno_produtivo_sem_horas_trab(this.tf_ano_produtivo_sem_horas_trab.getText());
	this.encargo.setSalario_13_dias(tf_salario_13_dias.getText());
	this.encargo.setAviso_previo_indenizado(tf_aviso_previo_indenizado.getText());
	this.encargo.setAviso_previo_trabalhado(tf_aviso_previo_trabalhado.getText());
	this.encargo.setFerias_indenizadas(tf_ferias_indenizadas.getText());
	this.encargo.setDespedida_injusta(tf_despedida_injusta.getText());
	this.encargo.setIndenizacao_adicional(tf_indenizacao_adicional.getText());
	this.encargo.setCusto_conducao(tf_custo_conducao.getText());
	this.encargo.setCusto_cafe_manha(tf_custo_cafe_manha.getText());
	this.encargo.setCusto_refeicao(tf_custo_refeicao.getText());
	this.encargo.setCusto_seguro(tf_custo_seguro.getText());
	this.encargo.setCusto_epi(tf_custo_epi.getText());
	this.encargo.setSalario_minimo(tf_salario_minimo.getText());
	this.encargo.setDesligamentos(tf_desligamentos.getText());
	this.encargo.setDispensa_injusta(tf_dispensa_injusta.getText());
	this.encargo.setDispensa_justa(tf_dispensa_justa.getText());
	this.encargo.setEspontaneos(tf_espontaneos.getText());
	this.encargo.setFim_de_contrato(tf_fim_de_contrato.getText());
	this.encargo.setTermino_de_contrato(this.tf_termino_de_contrato.getText());
	this.encargo.setAposentados(tf_aposentados.getText());
	this.encargo.setMortos(tf_mortos.getText());
	this.encargo.setTransferencias(tf_transferencias.getText());
	this.encargo.setEstoque(tf_estoque.getText());
	this.encargo.setEstoque_recuperado_inicio(tf_estoque_recuperado_inicio.getText());
	this.encargo.setEstoque_recuperado_fim(tf_estoque_recuperado_fim.getText());
	this.encargo.setEstoque_medio(tf_estoque_medio.getText());
	this.encargo.setDispensados_descontados(tf_dispensados_descontados.getText());
	this.encargo.setDispensados(tf_dispensados.getText());
	this.encargo.setRotatividade_descontada(tf_rotatividade_descontada.getText());
	this.encargo.setRotatividade_nao_descontada(tf_rotatividade_nao_descontada.getText());
	this.encargo.setDesligados_espontaneos(tf_desligados_espontaneos.getText());
	this.encargo.setDuracao_media_emprego(tf_duracao_media_emprego.getText());	
	this.encargo.setPercentual_dispensa_injusta(this.tf_percentual_dispensa_injusta.getText());	
	this.encargo.setNum_conducao(this.tf_num_conducoes.getText().length()==0?0:Integer.parseInt(this.tf_num_conducoes.getText()));
	this.encargo.setNum_ferramentas_manu(this.tf_num_ferramentas_manu.getText().length()==0?0:Integer.parseInt(this.tf_num_ferramentas_manu.getText()));
	this.encargo.setNum_refeicoes(this.tf_num_refeicoes.getText().length()==0?0:Integer.parseInt(this.tf_num_refeicoes.getText()));
	
	this.encargo.setVal_a(this.a);
	this.encargo.setVal_b(this.b);
	this.encargo.setVal_c(this.c);
	this.encargo.setVal_d(this.d);
	this.encargo.setVal_e(this.e);
	
	
	if(this.encargo.getId_encargo_horista()>0)
	return new DAO<Encargo_Horista>(Encargo_Horista.class).altera(this.encargo);
		else{
		
		int id =  new DAO<Encargo_Horista>(Encargo_Horista.class).novo(this.encargo);
		
		if(id>0)
		this.encargo.setId_encargo_horista(id);
		else
		return false;
		}
	
	return true;
	}
		
		
			
}
