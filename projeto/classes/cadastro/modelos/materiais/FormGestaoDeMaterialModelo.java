package cadastro.modelos.materiais;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import beans.modelos.Material_Modelo;
import cadastro.Recursos;
import cadastro.tipos_de_materiais.FormGestaoDeTipo;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeMaterialModelo extends Recursos<Material_Modelo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeMaterialModelo(){
		
	super("Gestão de Materiais (Modelo)");
	
	this.motorDePesquisa = new MotorDePesquisa<Material_Modelo>("Materiais Cadastrados (Modelo)", Material_Modelo.class);
	this.motorDePesquisa.tableModel.setWhere("mat_m.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by mat_m.id_material_modelo DESC");
	
	adicionarComponentes();	
	
	
	GridBagConstraints cons = new GridBagConstraints();  


	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;
	cons.weightx = 0;
	cons.gridwidth = GridBagConstraints.REMAINDER;
	cons.insets = new Insets(5, 5, 0, 5);
	JButton bt_tipos = new JButton(new ImageIcon(getClass().getResource("/icons/tipo.png")));
	bt_tipos.setToolTipText("Gestão de tipos de materiais.");
	painelNovosItens.add(bt_tipos, cons);

	cons.insets = new Insets(0, 5, 0, 5);
	painelNovosItens.add(new JLabel("Tipos") , cons);
	
	
	
	
	
		bt_tipos.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			    	
		FormGestaoDeTipo form = new FormGestaoDeTipo();
		form.mostrar();
		
		}});

	
	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoMaterialModelo form = new FormNovoMaterialModelo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Material_Modelo selectedItem= (Material_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterMaterialModelo alterForm = new FormAlterMaterialModelo( (Material_Modelo) new DAO<Material_Modelo>(Material_Modelo.class).get(selectedItem.getId_material()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de materiais para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Material_Modelo selectedItem= (Material_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
							
		if(selectedItem != null){
		
		if(new DAO<Material_Modelo>(Material_Modelo.class).desativar(selectedItem.getId_material()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de materiais para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

