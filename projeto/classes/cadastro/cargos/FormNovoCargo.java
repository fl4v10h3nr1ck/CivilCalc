package cadastro.cargos;

import dao.DAO;
import beans.Cargo;



public class FormNovoCargo extends FormCargoBase {

	
	
private static final long serialVersionUID = 1L;



	public FormNovoCargo() {
	
	this(null);
	}




	
	public FormNovoCargo(Cargo cargo) {
			
	super("Novo Cargo", cargo);
	
	this.adicionarComponentes();
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	if(this.cargo==null)
	this.cargo = new Cargo();			
		

	this.cargo.setDescricao(this.tf_nome.getText());
	this.cargo.setStatus("ATIVO");
	
	DAO<Cargo> dao = new DAO<Cargo>(Cargo.class);
	
	int id  =dao.novo(this.cargo);
	
	if(id==0)
	return false;
	
	
	this.cargo.setId_cargo(id);
	
	this.cargo.setCodigo(String.format("CRG%06d", this.cargo.getId_cargo()));
	
	return dao.altera(this.cargo);
	}

	
	


	
	
}
