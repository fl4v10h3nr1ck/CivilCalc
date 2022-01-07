package cadastro.subetapas;

import java.util.List;

import comuns.Mensagens;
import dao.DAO;
import beans.Cronograma;
import beans.Etapa;
import beans.Subetapa;




public class FormNovaSubetapa extends FormSubetapaBase{

	
private static final long serialVersionUID = 1L;






	public FormNovaSubetapa( int id_etapa) {
		
	super(id_etapa, "Nova Subetapa", 700, 350);

	this.adicionarComponentes();
	}

	
	
	
	
	
	@Override
	public boolean acaoPrincipal() {
	
	if(!this.validacao())
	return false;
		
		
	this.subetapa = new Subetapa();
		
	this.subetapa.setTitulo(this.tf_titulo.getText());
	this.subetapa.setObjetivo(this.ta_objetivo.getText());
	this.subetapa.setObs(this.tf_obs.getText());
	this.subetapa.setStatus("ATIVO");
	this.subetapa.setFk_etapa(this.id_etapa);
	
	DAO<Subetapa> dao_subetapa = new DAO<Subetapa>(Subetapa.class);
	
	List<Subetapa> subetapas = dao_subetapa.get(
			null, "subetap.fk_etapa="+this.id_etapa, "subetap.ordem ASC");
	
	if(subetapas.size()>0)
	this.subetapa.setOrdem(subetapas.get(subetapas.size()-1).getOrdem()+1);
	else
	this.subetapa.setOrdem(1);
	

	int id =  dao_subetapa.novo(this.subetapa);
	
		if(id<=0){
		
		Mensagens.msgDeErro("Um erro ocorreu ao salvar os dados.");
		return false;
		}
	
	Etapa etapa = new DAO<Etapa>(Etapa.class) .get(this.id_etapa);
		
		
	Cronograma cronograma = new Cronograma();
	cronograma.setDuracao_meses(0);
	cronograma.setFk_subetapa(id);
	cronograma.setTipo("SUBETAPA");
	cronograma.setFk_projeto(etapa.getFk_projeto());
	
	
	return new DAO<Cronograma>(Cronograma.class).novo(cronograma)>0? true:false;
	}

	
	
	
	
	
	
	
	
	public static int getMaiorOrdemDeSubetapa(int id_etapa){
		
	List<Subetapa> subetapas = new DAO<Subetapa>(Subetapa.class).get(
				null, "subetap.fk_etapa="+id_etapa, "subetap.ordem DESC limit 1");
		
	if(subetapas.size()>0)
	return subetapas.get(0).getOrdem();
	
	return 0;
	}
	
	
	
}
