package cadastro.etapas;

import java.util.List;

import comuns.Mensagens;

import dao.DAO;
import beans.Cronograma;
import beans.Etapa;
import beans.Subetapa;




public class FormNovaEtapa extends FormEtapaBase{

	
private static final long serialVersionUID = 1L;






	public FormNovaEtapa( int id_projeto) {
		
	super(id_projeto, "Nova Etapa", 700, 350);

	this.adicionarComponentes();
	}

	
	
	
	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false;
		
		
	this.etapa = new Etapa();
		
	this.etapa.setTitulo(this.tf_titulo.getText());
	this.etapa.setObjetivo(this.ta_objetivo.getText());
	this.etapa.setObs(this.tf_obs.getText());
	this.etapa.setStatus("ATIVO");
	this.etapa.setFk_projeto(this.id_projeto);
	
	DAO<Etapa> dao_etapa = new DAO<Etapa>(Etapa.class);
	
	List<Etapa> etapas_origem = dao_etapa.get(
			null, "etap.fk_projeto="+this.id_projeto, "etap.ordem ASC");
	
	if(etapas_origem.size()>0)
	this.etapa.setOrdem(etapas_origem.get(etapas_origem.size()-1).getOrdem()+1);
	else
	this.etapa.setOrdem(1);
	

	int id  = dao_etapa.novo(this.etapa);
	
	Subetapa subetapa  = new Subetapa();
	subetapa.setFk_etapa(id);
	subetapa.setTitulo("ÚNICA");
	subetapa.setStatus("ATIVO");
	subetapa.setOrdem(1);
	
	id = new DAO<Subetapa>(Subetapa.class).novo(subetapa);
	

		if(id<=0){
		
		Mensagens.msgDeErro("Um erro ocorreu ao salvar os dados.");
		return false;
		}

	Cronograma cronograma = new Cronograma();
	cronograma.setDuracao_meses(0);
	cronograma.setFk_subetapa(id);
	cronograma.setTipo("SUBETAPA");
	cronograma.setFk_projeto(this.id_projeto);
	
	return new DAO<Cronograma>(Cronograma.class).novo(cronograma)>0? true:false;
	}

	
	
	
	
	
	
	
	
	
}
