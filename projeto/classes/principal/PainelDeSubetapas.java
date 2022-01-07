package principal;

import cadastro.subetapas.FormAlterSubetapa;
import cadastro.subetapas.FormNovaSubetapa;
import beans.Subetapa;





public class PainelDeSubetapas extends PainelBase<Subetapa>{

	
private static final long serialVersionUID = 1L;



private PainelDeEtapas referencia_p_etapas;
private PainelDeDetalhes referencia_p_detalhes;

private Principal principal;




	public PainelDeSubetapas(Principal principal){
		
	super("Subetapas", Subetapa.class);	
		
	this.referencia_p_etapas = null;
	
	this.referencia_p_detalhes = null;
	
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
	
	
	
	
	
	
	
	protected void setReferenciaEtapas(PainelDeEtapas referencia){
	
	this.referencia_p_etapas = referencia;
	}
	
	
	
	
	
	
	protected void setReferenciaDetalhes(PainelDeDetalhes referencia){
		
	this.referencia_p_detalhes = referencia;
	}
	
	
	
	
	


	@Override
	public void novoItem() {
	
	FormNovaSubetapa form = new FormNovaSubetapa(this.referencia_p_etapas.getIdItemSelecionado());
	form.mostrar();
	}







	@Override
	public void AlteraItem(Subetapa item) {
	
	FormAlterSubetapa form = new FormAlterSubetapa(this.referencia_p_etapas.getIdItemSelecionado(), item);	
	form.mostrar();
	}









	@Override
	public void selecionaItem() {
		
	referencia_p_detalhes.atualizaInfoDetalhes();	
	referencia_p_detalhes.setDescritor();	
	}









	@Override
	public String getNome(Subetapa item) {
	
	return item.getTitulo();
	}








	@Override
	protected int getIdItemSelecionado() {
		
	return this.lista.get(this.indice_selecionado).getId_subetapa();	
	}





	@Override
	protected void setOrdem(Subetapa item, int ordem) {
	
	item.setOrdem(ordem);
	}




	@Override
	protected void minimiza() {
	
	this.principal.minimizaSubetapas();
	}




	
	
	@Override
	protected void setDados() {
	
	if(this.referencia_p_etapas==null)
	return;	
		
	this.lista = dao.get(null, "subetap.status='ATIVO' and subetap.fk_etapa="+this.referencia_p_etapas.getIdItemSelecionado(), "subetap.ordem ASC");		
	}


	
	
	
}
