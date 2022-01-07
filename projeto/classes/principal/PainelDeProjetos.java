package principal;

import beans.Projeto;
import cadastro.projetos.FormProjeto;





public class PainelDeProjetos extends PainelBase<Projeto>{


private static final long serialVersionUID = 1L;



private PainelDeEtapas referencia_p_etapas;
private PainelDeDetalhes referencia_p_detalhes;

private Principal principal;







	public PainelDeProjetos(Principal principal){
	
	super("Projetos", Projeto.class);	
		
	this.referencia_p_etapas = null;
	
	this.referencia_p_detalhes=  null;
	
	this.principal = principal;
	
	this.adicionarComponentes();
	
	this.setDados();
	}
	
	
	

	

	protected void setReferenciaEtapas(PainelDeEtapas referencia){
	
	this.referencia_p_etapas = referencia;
	}
	
	
	
	
	

	protected void setReferenciaDetalhes(PainelDeDetalhes referencia){
	
	this.referencia_p_detalhes = referencia;
	}




	
	
	
	@Override
	public void novoItem() {
	
	//FormNovoProjeto form = new FormNovoProjeto();
	//form.mostrar();
	
	FormProjeto form = new FormProjeto(null);
	form.mostrar();
	
	this.atualizaInfo();
	}
	
	

	
	

	
	public void atualizaInfo(){
	
	this.setDados();
		
	super.atualizaInfo();
	}
	
	
	
	
	


	@Override
	public void AlteraItem(Projeto item) {
	
	//FormAlterProjeto form = new FormAlterProjeto(item);
	//form.mostrar();
	
	FormProjeto form = new FormProjeto(item);
	form.mostrar();
	}
	
	



	@Override
	public void selecionaItem() {
		
	referencia_p_etapas.atualizaInfo();
	referencia_p_detalhes.setDescritor();
	this.referencia_p_detalhes.atualizaInfoDeCronograma();
	}
	





	@Override
	public String getNome(Projeto item) {
	
	return item.getCodigo();
	}
	
	

	
	
	
	@Override
	protected int getIdItemSelecionado() {
	
	return this.lista.get(this.indice_selecionado).getId_projeto();
	}
	
	
	
	


	@Override
	protected void setOrdem(Projeto item, int ordem) {
	
	item.setOrdem(ordem);
	}




	
	
	@Override
	protected void minimiza() {

	principal.minimizaProjetos();
	}



	
	
	
	@Override
	protected void setDados() {
	
	this.lista = dao.get(null, "proj.status='ATIVO'", "proj.ordem ASC");		
	}



	
}

