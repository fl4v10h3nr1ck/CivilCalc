package cadastro;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import comuns.Calculo;
import comuns.Preferencias;
import classes.CampoMoeda;



public class PainelDeBDI extends JPanel{

	
private static final long serialVersionUID = 1L;

public CampoMoeda tf_despesa_admin;
public CampoMoeda tf_iss;
public CampoMoeda tf_cofins;
public CampoMoeda tf_pis;
public CampoMoeda tf_cprb;
public CampoMoeda tf_custo_finan;
public CampoMoeda tf_risco_imprevisto;
public CampoMoeda tf_seguros;
public CampoMoeda tf_garantias;
public CampoMoeda tf_bonificacao;
public JTextField tf_valor_final;	
	
	


	public PainelDeBDI(){
	
	
	this.setLayout(new GridBagLayout());
		
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	this.adicionarComponentes();
	}
	
	
	
	
	
	public void adicionarComponentes() {
		
	GridBagConstraints cons = new GridBagConstraints();  
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx  = 1;
	cons.weighty  = 0;
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.gridwidth  = 1;
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_1, cons);
	
	cons.insets = new Insets( 0, 0, 0, 2);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_2, cons);
	
	cons.insets = new Insets( 0, 2, 0, 2);
	JPanel p_3 = new JPanel(new GridBagLayout());
	p_3.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_3, cons);
	
	JPanel p_4 = new JPanel(new GridBagLayout());
	p_4.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_4, cons);
	
	JPanel p_5 = new JPanel(new GridBagLayout());
	p_5.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_5, cons);
	

	
	cons.insets = new Insets( 5, 2, 5, 2);
	p_1.add(new JLabel("<html><b>ADMINISTRAÇÃO CENTRAL</b></html>"), cons);
	
	cons.insets = new Insets( 2, 2, 0, 2);
	p_1.add(new JLabel("Despesas Administrativas:"), cons);
		
	cons.insets = new Insets( 2, 2, 2, 2);
	p_1.add(this.tf_despesa_admin = new CampoMoeda(4), cons);
	
	
	
	cons.insets = new Insets( 5, 2, 5, 2);
	p_2.add(new JLabel("<html><b>DESPESAS FINANCEIRAS</b></html>"), cons);
	
	cons.insets = new Insets( 2, 2, 0, 2);
	p_2.add(new JLabel("Custos Financeiros:"), cons);
		
	cons.insets = new Insets( 2, 2, 2, 2);
	p_2.add(this.tf_custo_finan = new CampoMoeda(4), cons);
	
	
	
	cons.insets = new Insets( 5, 2, 5, 2);
	p_3.add(new JLabel("<html><b>IMPOSTOS INCIDENTES SOBRE O FATURAMENTO</b></html>"), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_3.add(new JLabel("ISS:"), cons);
	p_3.add(new JLabel("COFINS:"), cons);
	p_3.add(new JLabel("PIS:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_3.add(new JLabel("CPRB:"), cons);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_3.add(this.tf_iss = new CampoMoeda(4), cons);
	p_3.add(this.tf_cofins = new CampoMoeda(4), cons);
	p_3.add(this.tf_pis = new CampoMoeda(4), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_3.add(this.tf_cprb = new CampoMoeda(4), cons);
	
	
	
	cons.insets = new Insets( 5, 2, 5, 2);
	p_4.add(new JLabel("<html><b>RISCOS, GARANTIAS E SEGUROS</b></html>"), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	p_4.add(new JLabel("Riscos e Imprevistos:"), cons);
	p_4.add(new JLabel("Seguros:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_4.add(new JLabel("Garantias:"), cons);
	
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_4.add(this.tf_risco_imprevisto = new CampoMoeda(4), cons);
	p_4.add(this.tf_seguros = new CampoMoeda(4), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	p_4.add(this.tf_garantias = new CampoMoeda(4), cons);
	
	
	cons.insets = new Insets( 2, 2, 5, 2);
	p_5.add(new JLabel("<html><b>LUCRO PREVISTO</b></html>"), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets( 2, 2, 0, 2);
	cons.weightx  = 0.2;
	p_5.add(new JLabel("Bonificação da Empresa:"), cons);
	p_5.add(new JLabel("BDI Total:"), cons);
	cons.weightx  = 0.1;
	p_5.add(new JLabel(""), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.5;
	p_5.add(new JLabel(""), cons);
	
	
	cons.gridwidth  = 1;
	cons.weightx  = 0.2;
	cons.insets = new Insets( 2, 2, 2, 2);
	p_5.add(this.tf_bonificacao = new CampoMoeda(4), cons);
	p_5.add(this.tf_valor_final = new JTextField(""), cons);
	this.tf_valor_final.setEditable(false);
	
	cons.weightx  = 0.1;
	JButton bt_calc  = new JButton("Calcular BDI");
	bt_calc.setToolTipText("Calcular valro de BDI.");
	p_5.add(bt_calc, cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 0.5;
	p_5.add(new JLabel(""), cons);
	
	
	
		bt_calc.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		calculaBDI();		
		}});
	
	}




	
	public void calculaBDI(){
	
	String ac = 	Calculo.dividi(this.tf_despesa_admin.getText(), "100", 4);
	String s = 		Calculo.dividi(this.tf_seguros.getText(), "100", 4);
	String r = 		Calculo.dividi(this.tf_risco_imprevisto.getText(), "100", 4);
	String g = 		Calculo.dividi(this.tf_garantias.getText(), "100", 4);
	String df = 	Calculo.dividi(this.tf_custo_finan.getText(), "100", 4);
	
	
	String l = 		Calculo.dividi(this.tf_bonificacao.getText(), "100", 4);
	
	
	String i = 		Calculo.dividi(
						Calculo.soma(this.tf_iss.getText(),
						Calculo.soma(this.tf_cofins.getText(),
						Calculo.soma(this.tf_pis.getText(),this.tf_cprb.getText())))
							,"100", 4);
	
	/*
	System.out.println(ac+" "+s+" "+r+" "+g+" "+df+" "+l+" "+i);
	
	
	String total = Calculo.multiplica(
						Calculo.subtrai(
							Calculo.dividi(
					
								Calculo.soma("1.00",
								Calculo.soma(ac,
								Calculo.soma(df,
								Calculo.soma(r,
								Calculo.soma(g, s))))),
													   
								Calculo.subtrai("1.00", Calculo.soma(i, l)), 4),
						"1.00"),
					"100.00");
	*/
	
	
	String total = Calculo.multiplica(
						Calculo.subtrai(
							Calculo.dividi(
								Calculo.multiplica(
								Calculo.soma("1", Calculo.soma(ac, Calculo.soma(s, Calculo.soma(r, g)))),
								Calculo.multiplica(Calculo.soma("1", df),Calculo.soma("1", l))),
								Calculo.subtrai("1", i), 4),
								"1"), "100");
	
	this.tf_valor_final.setText(Calculo.formataValor(total));		
	}

	
	
	
}
