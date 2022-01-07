package cadastro.modelos.materiais;

import dao.DAO;
import beans.Item;
import beans.MaterialXFornecedor;
import beans.modelos.Material_Modelo;



public class FormNovoMaterialModelo extends FormMaterialModeloBase {

	
	
private static final long serialVersionUID = 1L;



	
	public FormNovoMaterialModelo() {
			
	this(null);
	}




	
	
	

	public FormNovoMaterialModelo(Material_Modelo material) {
			
	super("Novo Material", material);
	
	this.adicionarComponentes();
	}




	
	
	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
	
	if(this.material==null)
	this.material = new Material_Modelo();			
		
	this.material.setDescricao(this.tf_descricao.getText());
	this.material.setFk_tipo(this.id_tipo);
	this.material.setStatus("ATIVO");
	this.material.setFk_unidade(this.id_unidade);
	this.material.setValor_unitario(this.tf_valor.getText());
	this.material.setTipo("NORMAL");
	this.material.setValor_por_fornecedor("NAO");
	this.material.setValor_padrao_fornecedor("SELECIONAR");
	

	DAO<Material_Modelo> dao = new DAO<Material_Modelo>(Material_Modelo.class);
	
	int id = dao.novo(this.material);
	
	if(id==0)
	return false;
	
	this.material.setId_material(id);
	
	
	this.material.setCodigo(String.format("MAT%06d", this.material.getId_material()));
	
	dao.altera(this.material);
	

	DAO<MaterialXFornecedor> dao_x = new DAO<MaterialXFornecedor>(MaterialXFornecedor.class);	
		
		for(Item aux: this.lista_de_fornecedores){
			
		MaterialXFornecedor mXf = new MaterialXFornecedor();
		mXf.setFk_fornecedor(Integer.parseInt(aux.getParamentro("id_fornecedor").toString()));
		mXf.setFk_material(this.material.getId_material());
		mXf.setPreco(aux.getParamentro("preco").toString());
			
		dao_x.novo(mXf);
		}

	return true;
	}

	
	


	
	
}
