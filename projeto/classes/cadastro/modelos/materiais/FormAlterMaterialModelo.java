package cadastro.modelos.materiais;


import java.util.List;

import comuns.Calculo;
import comuns.Comuns;
import comuns.Mensagens;
import beans.Fornecedor;
import beans.Item;
import beans.MaterialXFornecedor;
import beans.TipoDeMaterial;
import beans.Unidade;
import beans.modelos.ItemDeOrcamentoModelo;
import beans.modelos.Material_Modelo;
import dao.DAO;




public class FormAlterMaterialModelo extends FormMaterialModeloBase {

	
	
private static final long serialVersionUID = 1L;





	
	public FormAlterMaterialModelo(Material_Modelo material) {
			
	super("Alterar Material (Modelo)", material);
	
	this.adicionarComponentes();
	
	this.tf_codigo.setText(this.material.getCodigo());
	this.tf_descricao.setText(this.material.getDescricao());
	this.tf_valor.setText(this.material.getValor_unitario());
	
	
		if(this.material.getFk_tipo()>0){
		
		TipoDeMaterial tipo  = new DAO<TipoDeMaterial>(TipoDeMaterial.class).get(this.material.getFk_tipo());
		
			if(tipo!=null){
		
			this.id_tipo = tipo.getId_tipo_material();
			this.tf_tipo.setText(tipo.getDescricao());
			}
		}
		
			
		if(this.material.getFk_unidade()>0){
		
		Unidade unidade  = new DAO<Unidade>(Unidade.class).get(this.material.getFk_unidade());
		
			if(unidade !=null){
				
			this.id_unidade = unidade.getId_unidade();
			this.tf_unidade.setText(unidade.getDescricao());
			}
		}
			
		
		List<MaterialXFornecedor> lista_mXf = new DAO<MaterialXFornecedor>(MaterialXFornecedor.class).get(null, "mXf.fk_material="+this.material.getId_material(), null);
		
		DAO<Fornecedor> fornecedorDAO = new DAO<Fornecedor>(Fornecedor.class);
		
		for(MaterialXFornecedor aux: lista_mXf){
			
		Fornecedor fornecedor = fornecedorDAO.get(aux.getFk_fornecedor());	
				
			if(fornecedor!=null){
					
			Item item = new Item();	
			item.addParamentro("id_fornecedor", aux.getFk_fornecedor());
			item.addParamentro("nome", fornecedor.getNome_razao());
			item.addParamentro("preco", Calculo.formataValor(aux.getPreco()));
				
			this.lista_de_fornecedores.add(item);
			}	
		}
			
	this.atualizaTabelaDeFornecedores();
	}




	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false; 	
		
	this.material.setCodigo(this.tf_codigo.getText());
	this.material.setDescricao(this.tf_descricao.getText());
	this.material.setFk_tipo(this.id_tipo);
	this.material.setFk_unidade(this.id_unidade);
	
	boolean atualizar_itens =this.tf_valor.getText().compareTo(this.material.getValor_unitario())==0?false:true; 
	
	this.material.setValor_unitario(this.tf_valor.getText());
	
		
		if(!new DAO<Material_Modelo>(Material_Modelo.class).altera(this.material)){
		
		Mensagens.msgDeErroAoAlterar();	
		return false;
		}
	
	DAO<MaterialXFornecedor> dao = new DAO<MaterialXFornecedor>(MaterialXFornecedor.class);	
	
	dao.removeSemConfirmacao("fk_material="+this.material.getId_material());
	
		
		for(Item aux: this.lista_de_fornecedores){
			
		MaterialXFornecedor mXf = new MaterialXFornecedor();
		mXf.setFk_fornecedor(Integer.parseInt(aux.getParamentro("id_fornecedor").toString()));
		mXf.setFk_material(this.material.getId_material());
		mXf.setPreco(aux.getParamentro("preco").toString());
			
		dao.novo(mXf);
		}

				
		if(atualizar_itens){
				
			if(Mensagens.dialogoDeConfirmacao("Deseja atualizar todos os itens de orçamento que utilizam este material?")){	
				
			DAO<ItemDeOrcamentoModelo> item_dao = new DAO<ItemDeOrcamentoModelo>(ItemDeOrcamentoModelo.class);
				
			List<ItemDeOrcamentoModelo>	itens = item_dao.get(
					"INNER JOIN item_modelo_x_material_modelo AS ixm_mod ON ixm_mod.fk_item = itns_mod.id_item_modelo AND ixm_mod.fk_material="+this.material.getId_material(), 
					"itns_mod.status='ATIVO' AND (itns_mod.sem_insumos<>'sim' OR itns_mod.sem_insumos IS NULL)", 
					null);
					
				
				for(ItemDeOrcamentoModelo item: itens){
					
				item.setValor_unitario(Comuns.atualizaValorDeItemModelo(item.getId_item_modelo()));	
				item_dao.altera(item);	
				}
			}
		}	
			
			
	return true;
	}

	
	


	
	
}
