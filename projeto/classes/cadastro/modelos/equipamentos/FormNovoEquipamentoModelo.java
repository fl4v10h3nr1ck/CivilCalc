package cadastro.modelos.equipamentos;

import dao.DAO;
import beans.modelos.Equipamento_Modelo;



public class FormNovoEquipamentoModelo extends FormEquipamentoModeloBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormNovoEquipamentoModelo() {
			
	this(null);
	}





	public FormNovoEquipamentoModelo(Equipamento_Modelo equipamento) {
			
	super("Novo Equipamento (Modelo)", 650, 190, equipamento);
	
	this.adicionarComponentes();
	}





	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	if(this.equipamento==null)
	this.equipamento = new Equipamento_Modelo();			
		
	this.equipamento.setDescricao(this.tf_descricao.getText());
	this.equipamento.setValor_unitario(this.tf_valor.getText());
	this.equipamento.setTipo(this.tipo.getSelectedItem().toString());
	this.equipamento.setStatus("ATIVO");
	this.equipamento.setFk_unidade(this.id_unidade);
	
	DAO<Equipamento_Modelo> dao = new DAO<Equipamento_Modelo>(Equipamento_Modelo.class);

	int id = dao.novo(this.equipamento);
	
	if(id==0)
	return false;
	
	this.equipamento.setId_equipamento(id);
	
	this.equipamento.setCodigo(String.format("EQP%06d", this.equipamento.getId_equipamento()));
	
	return dao.altera(this.equipamento);
	}

	
	


	
	
}
