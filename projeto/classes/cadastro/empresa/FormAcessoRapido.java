package cadastro.empresa;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import beans.Empresa;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;



public class FormAcessoRapido extends Dialogo{

	

private static final long serialVersionUID = 1L;



private JCheckBox ck_novo_projeto;
private JCheckBox ck_integrantes;
private JCheckBox ck_proprietarios;
private JCheckBox ck_clonar_projeto;
private JCheckBox ck_unir_itens;
private JCheckBox ck_cargos;
private JCheckBox ck_bdi;
private JCheckBox ck_materiais;
private JCheckBox ck_equipamentos;
private JCheckBox ck_maos;
private JCheckBox ck_itens_orca;
private JCheckBox ck_enc_hor;
private JCheckBox ck_enc_men;
private JCheckBox ck_unidades;
private JCheckBox ck_fornecedores;
private JCheckBox ck_rel_resumo;
private JCheckBox ck_rel_anal;
private JCheckBox ck_rel_crono;
private JCheckBox ck_rel_comp;
private JCheckBox ck_rel_bdi;
private JCheckBox ck_rel_enc_hor;
private JCheckBox ck_rel_enc_men;
private JCheckBox ck_rel_empresa;




	public FormAcessoRapido() {
		
	super("Configuração de Acesso Rápido", 650, 600);
	
	this.adicionarComponentes();
	
	this.setDados();
	}
	

	
	
	
	
	@Override
	public void adicionarComponentes(){
	
	GridBagConstraints cons = new GridBagConstraints();  
		
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 1;
	cons.weightx = 1;
					
	JPanel p1 = new JPanel(new GridBagLayout());
	p1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(new JScrollPane(p1), cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.insets = new Insets(10, 2, 10, 2);
	p1.add(new JLabel("Recursos que aparecerão na área \"Acesso ´Rápido\":"), cons);
	
	cons.insets = new Insets(2, 2, 2, 2);
	p1.add(this.ck_novo_projeto = new JCheckBox("Cadastrar novo projeto."), cons);
	this.ck_novo_projeto.setOpaque(false);
	
	p1.add(this.ck_integrantes = new JCheckBox("Cadastrar novo integrante."), cons);
	this.ck_integrantes.setOpaque(false);
	
	p1.add(this.ck_proprietarios = new JCheckBox("Cadastrar novo proprietário."), cons);
	this.ck_proprietarios.setOpaque(false);
	
	p1.add(this.ck_clonar_projeto = new JCheckBox("CLonar projeto."), cons);
	this.ck_clonar_projeto.setOpaque(false);
	
	p1.add(this.ck_unir_itens = new JCheckBox("Unir itens de projeto."), cons);
	this.ck_unir_itens.setOpaque(false);
	
	p1.add(this.ck_cargos = new JCheckBox("Gestão cargos."), cons);
	this.ck_cargos.setOpaque(false);
	
	p1.add(this.ck_bdi = new JCheckBox("Gestão de BDI."), cons);
	this.ck_bdi.setOpaque(false);
	
	p1.add(this.ck_materiais = new JCheckBox("Gestão de materiais."), cons);
	this.ck_materiais.setOpaque(false);
	
	p1.add(this.ck_equipamentos = new JCheckBox("Gestão de equipamentos"), cons);
	this.ck_equipamentos.setOpaque(false);
	
	p1.add(this.ck_maos = new JCheckBox("Gestão de mão de obra."), cons);
	this.ck_maos.setOpaque(false);
	
	p1.add(this.ck_itens_orca = new JCheckBox("Gestão de itens de orçamento modelo."), cons);
	this.ck_itens_orca.setOpaque(false);
	
	p1.add(this.ck_enc_hor = new JCheckBox("Gestão de encargos sociais para horistas."), cons);
	this.ck_enc_hor.setOpaque(false);
	
	p1.add(this.ck_enc_men = new JCheckBox("Gestão de encargos sociais para mensalistas."), cons);
	this.ck_enc_men.setOpaque(false);
	
	p1.add(this.ck_unidades = new JCheckBox("Gestão de unidades de medida."), cons);
	this.ck_unidades.setOpaque(false);
	
	p1.add(this.ck_fornecedores = new JCheckBox("Gestão de fornecedores."), cons);
	this.ck_fornecedores.setOpaque(false);
	
	p1.add(this.ck_rel_resumo = new JCheckBox("Relatório de resumo de orçamento."), cons);
	this.ck_rel_resumo.setOpaque(false);
	
	p1.add(this.ck_rel_anal = new JCheckBox("Relatório de orçamento analítico."), cons);
	this.ck_rel_anal.setOpaque(false);
	
	p1.add(this.ck_rel_crono = new JCheckBox("Relatório de cronograma de projeto."), cons);
	this.ck_rel_crono.setOpaque(false);
	
	p1.add(this.ck_rel_comp = new JCheckBox("Relatório de composição orçamentária."), cons);
	this.ck_rel_comp.setOpaque(false);
	
	p1.add(this.ck_rel_bdi = new JCheckBox("Relatório de BDI."), cons);
	this.ck_rel_bdi.setOpaque(false);
	
	p1.add(this.ck_rel_enc_hor = new JCheckBox("Relatório de encargos sociais para horistas."), cons);
	this.ck_rel_enc_hor.setOpaque(false);
	
	p1.add(this.ck_rel_enc_men = new JCheckBox("Relatório de encargos sociais para mensalistas."), cons);
	this.ck_rel_enc_men.setOpaque(false);
	
	p1.add(this.ck_rel_empresa = new JCheckBox("Informações empresariais."), cons);
	this.ck_rel_empresa.setOpaque(false);
	
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx = 0;
	cons.weighty = 0;
	cons.anchor = GridBagConstraints.CENTER;
	cons.ipadx = 25;
	cons.insets = new Insets(10, 2, 2, 2);
	JButton bt_save  = new JButton("Salvar", new ImageIcon(getClass().getResource("/icons/icon_save.png")));
	bt_save.setToolTipText("Salvar Opções.");
	this.add(bt_save, cons);
	
	
		bt_save.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			    	
			if(acaoPrincipal()){	
					
			Mensagens.msgDeSucessoAoSalvar();
			dispose();
			}
			else
			Mensagens.msgDeErro("Um erro ocorreu ao salvar as informações.");
			
		}});
		
	}




	
	
	
	private void setDados(){
	
	Empresa empresa = Comuns.getEmpresa();
		
	if(empresa==null)
	return;
	
	if(empresa.getAcesso_rapido()==null)
	return;
	
	String[] aux = empresa.getAcesso_rapido().split("@");
	
	if(aux==null || aux.length ==0)
	return;
	
		for(String valor: aux){
	
		if(valor!=null && valor.compareTo("1")==0)	
		ck_novo_projeto.setSelected(true);	
			
		if(valor!=null && valor.compareTo("2")==0)	
		ck_integrantes.setSelected(true);
		
		if(valor!=null && valor.compareTo("3")==0)	
		ck_proprietarios.setSelected(true);
			
		if(valor!=null && valor.compareTo("4")==0)	
		ck_clonar_projeto.setSelected(true);
			
		if(valor!=null && valor.compareTo("5")==0)	
		ck_unir_itens.setSelected(true);
		
		
		
		if(valor!=null && valor.compareTo("6")==0)	
		ck_cargos.setSelected(true);
			
		if(valor!=null && valor.compareTo("7")==0)	
		ck_bdi.setSelected(true);
			
		if(valor!=null && valor.compareTo("8")==0)	
		ck_materiais.setSelected(true);
			
		if(valor!=null && valor.compareTo("9")==0)	
		ck_equipamentos.setSelected(true);
			
		if(valor!=null && valor.compareTo("10")==0)	
		ck_maos.setSelected(true);
		
		
		
		if(valor!=null && valor.compareTo("11")==0)	
		ck_itens_orca.setSelected(true);

		if(valor!=null && valor.compareTo("12")==0)	
		ck_enc_hor.setSelected(true);
			
		if(valor!=null && valor.compareTo("13")==0)	
		ck_enc_men.setSelected(true);
			
		if(valor!=null && valor.compareTo("14")==0)	
		ck_unidades.setSelected(true);
			
		if(valor!=null && valor.compareTo("15")==0)	
		ck_fornecedores.setSelected(true);
		
		
		if(valor!=null && valor.compareTo("16")==0)	
		ck_rel_resumo.setSelected(true);

		if(valor!=null && valor.compareTo("17")==0)	
		ck_rel_anal.setSelected(true);
			
		if(valor!=null && valor.compareTo("18")==0)	
		ck_rel_crono.setSelected(true);
			
		if(valor!=null && valor.compareTo("19")==0)	
		ck_rel_comp.setSelected(true);
			
		if(valor!=null && valor.compareTo("20")==0)	
		ck_rel_bdi.setSelected(true);
			
		
		if(valor!=null && valor.compareTo("21")==0)	
		ck_rel_enc_hor.setSelected(true);
			
		if(valor!=null && valor.compareTo("22")==0)	
		ck_rel_enc_men.setSelected(true);
			
		if(valor!=null && valor.compareTo("23")==0)	
		ck_rel_empresa.setSelected(true);
		}	
	}
	
	
	

	

	@Override
	public boolean acaoPrincipal() {
	
	Empresa empresa = Comuns.getEmpresa();
	
	DAO<Empresa> dao = new DAO<Empresa>(Empresa.class);
	
	
		if(empresa==null || empresa.getId_empresa()<=0){
				
		empresa = new Empresa();
		empresa.setCodigo(PainelDadosGerais.geraCodigo());
		
		int id = dao.novo(empresa);
		
		if(id<=0)
		return false;
			
		empresa.setId_empresa(id);
		}
	
	
	String aux = "";
		
	if(this.ck_novo_projeto.isSelected())
	aux += "1@"; 
	
	if(this.ck_integrantes.isSelected())
	aux += "2@"; 
		
	if(this.ck_proprietarios.isSelected())
	aux += "3@"; 
		
	if(this.ck_clonar_projeto.isSelected())
	aux += "4@"; 
		
	if(this.ck_unir_itens.isSelected())
	aux += "5@"; 
	
	
	
	
	if(this.ck_cargos.isSelected())
	aux += "6@"; 
		
	if(this.ck_bdi.isSelected())
	aux += "7@"; 
		
	if(this.ck_materiais.isSelected())
	aux += "8@"; 
		
	if(this.ck_equipamentos.isSelected())
	aux += "9@"; 
	
	if(this.ck_maos.isSelected())
	aux += "10@"; 
	
	
	if(this.ck_itens_orca.isSelected())
	aux += "11@"; 
		
	if(this.ck_enc_hor.isSelected())
	aux += "12@"; 
		
	if(this.ck_enc_men.isSelected())
	aux += "13@"; 
		
	if(this.ck_unidades.isSelected())
	aux += "14@"; 
		
	if(this.ck_fornecedores.isSelected())
	aux += "15@"; 
		
	
	if(this.ck_rel_resumo.isSelected())
	aux += "16@"; 
		
	if(this.ck_rel_anal.isSelected())
	aux += "17@"; 
		
	if(this.ck_rel_crono.isSelected())
	aux += "18@"; 
		
	if(this.ck_rel_comp.isSelected())
	aux += "19@"; 
		
	if(this.ck_rel_bdi.isSelected())
	aux += "20@"; 
		
	
	if(this.ck_rel_enc_hor.isSelected())
	aux += "21@"; 
			
	if(this.ck_rel_enc_men.isSelected())
	aux += "22@"; 
			
	if(this.ck_rel_empresa.isSelected())
	aux += "23@"; 
		

		if(aux.length()>0){
		
		if(aux.charAt(aux.length()-1)=='@')
		aux = aux.substring(0, aux.length()-1);	
		}
	

	empresa.setAcesso_rapido(aux);
	
	return dao.altera(empresa);
	}
	
	



	
	
	
	
	
	




}

