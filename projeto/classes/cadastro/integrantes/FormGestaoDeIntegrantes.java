package cadastro.integrantes;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import beans.Integrante;
import cadastro.Recursos;
import cadastro.cargos.FormGestaoDeCargos;
import cadastro.grupos_de_integrantes.FormGestaoDeGrupos;

import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;

import dao.DAO;




public class FormGestaoDeIntegrantes extends Recursos<Integrante>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeIntegrantes(){
		
	super("Gestão de Integrantes");
	
	this.motorDePesquisa = new MotorDePesquisa<Integrante>("Integrantes Cadastrados", Integrante.class);
	this.motorDePesquisa.tableModel.setWhere("inte.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by inte.id_integrante DESC");
	
	adicionarComponentes();	
	
	GridBagConstraints cons = new GridBagConstraints();  


	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;
	cons.weightx = 0;
	cons.gridwidth = 1;
	cons.insets = new Insets(5, 5, 0, 5);
	JButton bt_grupos = new JButton(new ImageIcon(getClass().getResource("/icons/grupos.png")));
	bt_grupos.setToolTipText("Gestão de Grupos.");
	painelNovosItens.add(bt_grupos, cons);
	
	cons.gridwidth = GridBagConstraints.REMAINDER;
	JButton bt_cargos = new JButton(new ImageIcon(getClass().getResource("/icons/cargos.png")));
	bt_cargos.setToolTipText("Gestão de Cargos.");
	painelNovosItens.add(bt_cargos, cons);
	
	
	cons.insets = new Insets(0, 5, 0, 5);
	cons.gridwidth = 1;
	painelNovosItens.add(new JLabel("Grupos") , cons);
	cons.gridwidth = GridBagConstraints.REMAINDER;
	painelNovosItens.add(new JLabel("Cargos") , cons);
	
	
	
	
		bt_grupos.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			    	
		FormGestaoDeGrupos form = new FormGestaoDeGrupos();
		form.mostrar();
		
		}});

	
		
		bt_cargos.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		FormGestaoDeCargos form = new FormGestaoDeCargos();
		form.mostrar();
			
		}});
		
	
		
		
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoIntegrante form = new FormNovoIntegrante();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Integrante selectedItem= (Integrante) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterIntegrante alterForm = new FormAlterIntegrante( (Integrante) new DAO<Integrante>(Integrante.class).get(selectedItem.getId_integrante()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de integrantes para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Integrante selectedItem= (Integrante) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
			
		if(selectedItem != null){
		
		if(new DAO<Integrante>(Integrante.class).desativar(selectedItem.getId_integrante()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de integrantes para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

