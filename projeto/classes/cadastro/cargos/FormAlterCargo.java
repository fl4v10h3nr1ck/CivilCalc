package cadastro.cargos;


import beans.Cargo;
import dao.DAO;




public class FormAlterCargo extends FormCargoBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormAlterCargo(Cargo cargo) {
			
	super("Alterar Cargo", cargo);
	

	this.adicionarComponentes();
	
	
	this.tf_codigo.setText(this.cargo.getCodigo());
	this.tf_nome.setText(this.cargo.getDescricao());
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	this.cargo.setDescricao(this.tf_nome.getText());
			
	return new DAO<Cargo>(Cargo.class).altera(this.cargo);
	}

	
	


	
	
}
