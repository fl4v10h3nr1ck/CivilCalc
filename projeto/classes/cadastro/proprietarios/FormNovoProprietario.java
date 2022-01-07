package cadastro.proprietarios;

import dao.DAO;
import beans.Endereco;
import beans.Proprietario;



public class FormNovoProprietario extends FormProprietarioBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormNovoProprietario() {
			
	this(null);
	}


	
	public FormNovoProprietario(Proprietario proprietario) {
		
	super("Novo Proprietario", 750, 280);
		
	this.proprietario = proprietario;
	
	this.adicionarComponentes();
	}

	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())	
	return false;	
	
	if(this.proprietario==null)
	this.proprietario = new Proprietario();			
		
	this.proprietario.setFk_endereco(
			new DAO<Endereco>(Endereco.class).novo(this.endereco.getEndereco()));
	
	
	this.proprietario.setNome_razao(this.tf_nome.getText());
	this.proprietario.setCpf_cnpj(this.tipo.getSelectedIndex()==0?this.tf_cpf.getText():this.tf_cnpj.getText());
	this.proprietario.setTel_1(this.tf_tel_1.getText());
	this.proprietario.setTipo(this.tipo.getSelectedItem().toString());
	this.proprietario.setTel_2(this.tf_tel_2.getText());
	this.proprietario.setEmail(this.tf_email.getText());
	this.proprietario.setStatus("ATIVO");
	
	this.proprietario.setId_proprietario(new DAO<Proprietario>(Proprietario.class).novo(this.proprietario));
	
	return this.proprietario.getId_proprietario()>0?true:false;
	}

	
	


	
	
}
