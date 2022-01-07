package cadastro.modelos.mao_de_obra;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import beans.modelos.Mao_De_Obra_Modelo;
import cadastro.Recursos;
import cadastro.tipos_de_mao_de_obra.FormGestaoDeTipoDeMaoDeObra;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeMaoDeObraModelo extends Recursos<Mao_De_Obra_Modelo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeMaoDeObraModelo(){
		
	super("Gestão de Mão de Obra (Modelo)");
	
	this.motorDePesquisa = new MotorDePesquisa<Mao_De_Obra_Modelo>("Mãos de Obra (Modelo)", Mao_De_Obra_Modelo.class);
	this.motorDePesquisa.tableModel.setWhere("m_obra_m.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by m_obra_m.id_mao_de_obra DESC");
	
	adicionarComponentes();	
	
	
	GridBagConstraints cons = new GridBagConstraints();  


	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;
	cons.weightx = 0;
	cons.gridwidth = GridBagConstraints.REMAINDER;
	cons.insets = new Insets(5, 5, 0, 5);
	JButton bt_tipos = new JButton(new ImageIcon(getClass().getResource("/icons/tipo.png")));
	bt_tipos.setToolTipText("Gestão de tipos de mão de obra.");
	painelNovosItens.add(bt_tipos, cons);

	cons.insets = new Insets(0, 5, 0, 5);
	painelNovosItens.add(new JLabel("Tipos") , cons);
	
	
	

		bt_tipos.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			    	
		FormGestaoDeTipoDeMaoDeObra form = new FormGestaoDeTipoDeMaoDeObra();
		form.mostrar();
		
		}});


	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovaMaoDeObraModelo form = new FormNovaMaoDeObraModelo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Mao_De_Obra_Modelo selectedItem= (Mao_De_Obra_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterMaoDeObraModelo alterForm = new FormAlterMaoDeObraModelo( (Mao_De_Obra_Modelo) new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class).get(selectedItem.getId_mao_de_obra()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de mão de obras para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Mao_De_Obra_Modelo selectedItem= (Mao_De_Obra_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
								
		if(selectedItem != null){
		
		if(new DAO<Mao_De_Obra_Modelo>(Mao_De_Obra_Modelo.class).desativar(selectedItem.getId_mao_de_obra()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de mãos de obra para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

