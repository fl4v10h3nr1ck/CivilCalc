package principal;

import beans.Etapa;
import cadastro.etapas.FormAlterEtapa;
import cadastro.etapas.FormNovaEtapa;




public class PainelDeEtapas extends PainelBase<Etapa>{

	
private static final long serialVersionUID = 1L;



private PainelDeProjetos referencia_p_projetos;
private PainelDeSubetapas referencia_p_subetapas;
private PainelDeDetalhes referencia_p_detalhes;

private Principal principal;




	public PainelDeEtapas(Principal principal){
	
	super("Etapas", Etapa.class);	
		
	this.referencia_p_projetos = null;
	
	this.referencia_p_subetapas = null;
	
	this.referencia_p_detalhes=  null;
	
	this.principal =  principal;
	
	this.adicionarComponentes();
	}


	
	
	
	
	
	public void atualizaInfo(){
	
	this.setDados();
		
	super.atualizaInfo();
	
		if(this.lista!=null && this.lista.size()==1){
		
		this.indice_selecionado = 0;
		
		this.setItemSelecionado(0);
		
		this.selecionaItem();
		}
	}
	
	
	
	
	
	@Override
	public void novoItem() {
	
	FormNovaEtapa	form = new FormNovaEtapa(referencia_p_projetos.getIdItemSelecionado());
	form.mostrar();		
	}
	
	
	



	@Override
	public void AlteraItem(Etapa item) {
	
	FormAlterEtapa form = new FormAlterEtapa(referencia_p_projetos.getIdItemSelecionado(), item);
	form.mostrar();		
	}
	
	



	@Override
	public void selecionaItem() {
		
	referencia_p_subetapas.atualizaInfo();	
	referencia_p_detalhes.setDescritor();	
	}
	
	
	
	




	@Override
	public String getNome(Etapa item) {
	
	return item.getTitulo();
	}
	
	

	



	@Override
	protected int getIdItemSelecionado() {
		
	return this.lista.get(this.indice_selecionado).getId_etapa();
	}
	
	
	
	





	@Override
	protected void setOrdem(Etapa item, int ordem) {
	
	item.setOrdem(ordem);
	}



	
	




	@Override
	protected void minimiza() {
	
	principal.minimizaEtapas();
	}
	
	
	
	
	
	protected void setReferenciaProjetos(PainelDeProjetos referencia){
		
	this.referencia_p_projetos = referencia;
	}
		
		
		
		
		
		
	protected void setReferenciaSubetapas(PainelDeSubetapas referencia){
		
	this.referencia_p_subetapas = referencia;
	}
		
		

		

		
	protected void setReferenciaDetalhes(PainelDeDetalhes referencia){
		
	this.referencia_p_detalhes = referencia;
	}



	
	
	@Override
	protected void setDados() {
	
	if(this.referencia_p_projetos==null)
	return;
		
	this.lista = dao.get(null, "etap.status='ATIVO' and etap.fk_projeto="+this.referencia_p_projetos.getIdItemSelecionado(), "etap.ordem ASC");	
	}
		
		
	
	
	
	
	
	



}
