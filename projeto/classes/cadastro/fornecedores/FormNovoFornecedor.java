package cadastro.fornecedores;

import java.util.Date;
import dao.DAO;
import beans.Endereco;
import beans.Fornecedor;






public class FormNovoFornecedor extends FormFornecedorBase{


	
private static final long serialVersionUID = 1L;


	
	public FormNovoFornecedor(){
		
	this(null);
	}
	
	

	
	public FormNovoFornecedor(Fornecedor retorno){
		
	super("Novo Fornecedor", retorno);	
		
	adicionarComponentes();
	}
	

	
	
	@Override
	public boolean acaoPrincipal() {
		
	if(!validation())
	return false;

	if(this.retorno==null)
	this.retorno = new Fornecedor();
	
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
	this.retorno.setData_cadastro(new Date());
	this.retorno.setStatus("ATIVO");
	
	Endereco  endereco = this.p_endereco.getEndereco();
	
	int id = new DAO<Endereco>(Endereco.class).novo(endereco);
	if(id == 0)
	return false;
	
	this.retorno.setFk_endereco(id);
	
	id = new DAO<Fornecedor>(Fornecedor.class).novo(this.retorno);
	if(id == 0)
	return false;
	
	this.retorno.setId_fornecedor(id);

	

	return true;
	}





	
	
}
