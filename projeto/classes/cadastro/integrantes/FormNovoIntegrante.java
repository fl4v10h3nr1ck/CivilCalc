package cadastro.integrantes;

import dao.DAO;
import beans.Endereco;
import beans.Integrante;



public class FormNovoIntegrante extends FormIntegranteBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormNovoIntegrante() {
			
	this(null);
	}


	
	
	public FormNovoIntegrante(Integrante integrante) {
		
	super("Novo Integrante", 750, 300);
	
	this.integrante = integrante;
	
	this.adicionarComponentes();
	}

	
	
	
	
	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())	
	return false;	
	
	if(this.integrante==null)
	this.integrante = new Integrante();			
		
	this.integrante.setFk_endereco(
			new DAO<Endereco>(Endereco.class).novo(this.endereco.getEndereco()));
	
	
	this.integrante.setNome(this.tf_nome.getText());
	this.integrante.setCpf_cnpj(this.tipo.getSelectedIndex()==0?this.tf_cpf.getText():this.tf_cnpj.getText());
	this.integrante.setTel(this.tf_tel.getText());
	this.integrante.setSexo(this.sexo.getSelectedItem().toString());
	this.integrante.setTipo(this.tipo.getSelectedItem().toString());
	this.integrante.setFk_cargo(this.id_cargo);
	this.integrante.setFk_grupo(this.id_grupo);
	this.integrante.setStatus("ATIVO");
	this.integrante.setPath_assinatura(this.tf_assinatura.getText());		
	
	
	this.integrante.setId_integrante(new DAO<Integrante>(Integrante.class).novo(this.integrante));
	
	return this.integrante.getId_integrante()>0?true:false;
	}

	
	


	
	
}
