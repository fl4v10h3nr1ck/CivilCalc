package cadastro.proprietarios;


import beans.Endereco;
import beans.Proprietario;
import dao.DAO;




public class FormAlterProprietario extends FormProprietarioBase {

	
	
private static final long serialVersionUID = 1L;




	public FormAlterProprietario(Proprietario proprietario) {
			
	super("Alterar Proprietário", 750, 280);
	
	this.proprietario = proprietario;
	
	this.adicionarComponentes();
	
	this.setDados();
	}



	
	
	private void setDados(){
		
	tf_nome.setText(this.proprietario.getNome_razao());
	tipo.setSelectedItem(this.proprietario.getTipo());
	
	if(tipo.getSelectedIndex()==0)
	tf_cpf.setText(this.proprietario.getCpf_cnpj());
	else
	tf_cnpj.setText(this.proprietario.getCpf_cnpj());


	this.tf_tel_1.setText(this.proprietario.getTel_1());
	this.tf_tel_2.setText(this.proprietario.getTel_2());
	this.tf_email.setText(this.proprietario.getEmail());
	
	
		if(this.proprietario.getFk_endereco()>0){
			
		Endereco endereco  = new DAO<Endereco>(Endereco.class).get(this.proprietario.getFk_endereco());
		
		if(endereco!=null)
		this.endereco.setValores(endereco);			
		}
	}
	
	
	



	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())	
	return false;		
		

	Endereco endereco = this.endereco.getEndereco();
	endereco.setId_endereco(this.proprietario.getFk_endereco());
	
	new DAO<Endereco>(Endereco.class).altera(endereco);
		
	this.proprietario.setNome_razao(this.tf_nome.getText());
	this.proprietario.setCpf_cnpj(this.tipo.getSelectedIndex()==0?this.tf_cpf.getText():this.tf_cnpj.getText());
	this.proprietario.setTel_1(this.tf_tel_1.getText());
	this.proprietario.setTipo(this.tipo.getSelectedItem().toString());
	this.proprietario.setTel_2(this.tf_tel_2.getText());
	this.proprietario.setEmail(this.tf_email.getText());
				
	return new DAO<Proprietario>(Proprietario.class).altera(this.proprietario);		
	}	
	
}
