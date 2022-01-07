package cadastro.fornecedores;


import beans.Endereco;
import beans.Fornecedor;
import dao.DAO;




public class FormAlterFornecedor extends FormFornecedorBase{



private static final long serialVersionUID = 1L;




	public FormAlterFornecedor(Fornecedor fornecedor) {
	
	super("Dados de Fornecedor", fornecedor);
	
	this.adicionarComponentes();
	
	this.setValores();
	}


	
	
	
	

	public void setValores(){
	
	this.tf_nome_razao.setText(this.retorno.getNome_razao());
	this.tipo.setSelectedItem(this.retorno.getTipo());
	
	if(this.tipo.getSelectedIndex()==0)
	this.tf_cpf.setText(this.retorno.getCpf_cnpj());	
	else
	this.tf_cnpj.setText(this.retorno.getCpf_cnpj());	
	
	this.tf_nome_fantasia.setText(this.retorno.getNome_fantasia());	
	this.tf_resp.setText(this.retorno.getNome_responsavel());	
	this.tf_rg_ie.setText(this.retorno.getRg_ie());	
	
	this.tf_fax.setText(this.retorno.getFax());	
	this.tf_tel_1.setText(this.retorno.getTel_1());
	this.tf_tel_2.setText(this.retorno.getTel_2());
	this.tf_email.setText(this.retorno.getEmail());
	
		
	Endereco endereco = new DAO<Endereco>(Endereco.class).get(this.retorno.getFk_endereco());	
	
	if(endereco!=null)
	this.p_endereco.setValores(endereco);
	}
	
	
	
	
	
	@Override
	public boolean acaoPrincipal() {
		
	if(!validation())
	return false;

	this.retorno.setNome_razao(tf_nome_razao.getText());
	this.retorno.setNome_fantasia(this.tf_nome_fantasia.getText());
	this.retorno.setNome_responsavel(this.tf_resp.getText());
	this.retorno.setTipo(String.valueOf(tipo.getSelectedItem()));
	this.retorno.setCpf_cnpj(this.tipo.getSelectedIndex()==0?this.tf_cpf.getText():this.tf_cnpj.getText());
	this.retorno.setRg_ie(this.tf_rg_ie.getText());
	this.retorno.setFax(tf_fax.getText());
	this.retorno.setTel_1(tf_tel_1.getText());
	this.retorno.setTel_2(tf_tel_2.getText());
	this.retorno.setEmail(tf_email.getText());
	
	Endereco endereco = this.p_endereco.getEndereco();
	endereco.setId_endereco(this.retorno.getFk_endereco());
	
	if(!new DAO<Endereco>(Endereco.class).altera(endereco))
	return false;
	
	if(!new DAO<Fornecedor>(Fornecedor.class).altera(this.retorno))
	return false;

	return true;
	}





	
	
}
