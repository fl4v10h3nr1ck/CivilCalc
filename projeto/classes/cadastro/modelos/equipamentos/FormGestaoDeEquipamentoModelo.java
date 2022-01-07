package cadastro.modelos.equipamentos;

import beans.modelos.Equipamento_Modelo;
import cadastro.Recursos;
import componentes.tabelas.MotorDePesquisa;
import comuns.Mensagens;
import dao.DAO;




public class FormGestaoDeEquipamentoModelo extends Recursos<Equipamento_Modelo>{

	

private static final long serialVersionUID = 1L;





	public FormGestaoDeEquipamentoModelo(){
		
	super("Gestão de Equipamentos (Modelo)");
	
	this.motorDePesquisa = new MotorDePesquisa<Equipamento_Modelo>("Equipamentos Cadastrados (Modelo)", Equipamento_Modelo.class);
	this.motorDePesquisa.tableModel.setWhere("eqp_m.status='ATIVO'");
	this.motorDePesquisa.tableModel.setOrderBy("order by eqp_m.id_equipamento DESC");
	
	adicionarComponentes();	
	
	this.motorDePesquisa.update();
	}
	
	



	@Override
	public void novoForm() {
	
	FormNovoEquipamentoModelo form = new FormNovoEquipamentoModelo();
	form.mostrar();
	
	motorDePesquisa.update();	
	}




	

	@Override
	public void alterarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EDITAR"))
	//return;
	
	Equipamento_Modelo selectedItem= (Equipamento_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
		
		if(selectedItem != null){
		
		FormAlterEquipamentoModelo alterForm = new FormAlterEquipamentoModelo( (Equipamento_Modelo) new DAO<Equipamento_Modelo>(Equipamento_Modelo.class).get(selectedItem.getId_equipamento()));
		alterForm.mostrar();
		
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de equipamentos para alteração.");	
	
	}




	

	@Override
	public void deletarForm() {
	
	//if(!Configuracao.usuarioAtual.isAllowed(Configuracao.connector, "CADIMOV", "EXCLUIR"))
	//return;	
	
	Equipamento_Modelo selectedItem= (Equipamento_Modelo) this.motorDePesquisa.tableModel.getLinha(motorDePesquisa.table.getSelectedRow());
								
		if(selectedItem != null){
		
		if(new DAO<Equipamento_Modelo>(Equipamento_Modelo.class).desativar(selectedItem.getId_equipamento()))
		motorDePesquisa.update();
		}
		else
		Mensagens.msgDeErro("Selecione uma linha da tabela de equipamentos para exclusão.");	
	
	}






	@Override
	public boolean acaoPrincipal() {return true;}
	
	
	
}

