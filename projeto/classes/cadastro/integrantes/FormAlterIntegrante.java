package cadastro.integrantes;


import beans.Cargo;
import beans.Endereco;
import beans.GrupoDeIntegrantes;
import beans.Integrante;
import dao.DAO;




public class FormAlterIntegrante extends FormIntegranteBase {

	
	
private static final long serialVersionUID = 1L;




	public FormAlterIntegrante(Integrante integrante) {
			
	super("Alterar Integrante", 750, 300);
	
	this.integrante = integrante;
	
	this.adicionarComponentes();
	
	this.setDados();
	}



	
	
	private void setDados(){
		
	tf_nome.setText(this.integrante.getNome());
	tipo.setSelectedItem(this.integrante.getTipo());
	
	this.tf_assinatura.setText(this.integrante.getPath_assinatura());
	
	if(tipo.getSelectedIndex()==0)
	tf_cpf.setText(this.integrante.getCpf_cnpj());
	else
	tf_cnpj.setText(this.integrante.getCpf_cnpj());


	this.tf_tel.setText(this.integrante.getTel());
	sexo.setSelectedItem(this.integrante.getSexo());
	
	
		if(this.integrante.getFk_cargo()>0){
			
		id_cargo = this.integrante.getFk_cargo();
		Cargo cargo  = new DAO<Cargo>(Cargo.class).get(id_cargo);
		
		if(cargo!=null)
		this.tf_cargo.setText(cargo.getDescricao());
		}
	

		
		if(this.integrante.getFk_grupo()>0){
			
		this.id_grupo = this.integrante.getFk_grupo();
		GrupoDeIntegrantes grupo  = new DAO<GrupoDeIntegrantes>(GrupoDeIntegrantes.class).get(id_grupo);
			
		if(grupo!=null)
		this.tf_grupo.setText(grupo.getDescricao());
		}
		
		if(this.integrante.getFk_endereco()>0){
			
		Endereco endereco  = new DAO<Endereco>(Endereco.class).get(this.integrante.getFk_endereco());
		
		if(endereco!=null)
		this.endereco.setValores(endereco);			
		}
	}
	
	
	



	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())	
	return false;		
		
		
	Endereco endereco = this.endereco.getEndereco();
	endereco.setId_endereco(this.integrante.getFk_endereco());
	
	new DAO<Endereco>(Endereco.class).altera(endereco);
		
	this.integrante.setNome(this.tf_nome.getText());
	this.integrante.setCpf_cnpj(this.tipo.getSelectedIndex()==0?this.tf_cpf.getText():this.tf_cnpj.getText());
	this.integrante.setTel(this.tf_tel.getText());
	this.integrante.setSexo(this.sexo.getSelectedItem().toString());
	this.integrante.setTipo(this.tipo.getSelectedItem().toString());
	this.integrante.setFk_cargo(this.id_cargo);
	this.integrante.setFk_grupo(this.id_grupo);
	this.integrante.setPath_assinatura(this.tf_assinatura.getText());		
	
	
	return new DAO<Integrante>(Integrante.class).altera(this.integrante);		
	}	
	
}
