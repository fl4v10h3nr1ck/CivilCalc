package cadastro.projetos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import beans.BDI;
import beans.Cronograma;
import beans.Encargo_Horista;
import beans.Encargo_Mensalista;
import beans.Endereco;
import beans.Etapa;
import beans.Integrante;
import beans.Projeto;
import beans.Subetapa;
import beans.modelos.BDI_Modelo;
import beans.modelos.Encargo_Horista_Modelo;
import beans.modelos.Encargo_Mensalista_Modelo;
import cadastro.PainelDeEndereco;
import cadastro.modelos.dbi.FormNovoBDIModelo;
import cadastro.modelos.encargos_horistas.FormNovoEncargoHoristaModelo;
import cadastro.modelos.encargos_mensalistas.FormNovoEncargoMensalistaModelo;
import classes.CampoLimitado;
import componentes.FormDeSelecao;
import comuns.Comuns;
import comuns.Data;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;




public class PainelDeDadosGeraisDeProjeto extends JPanel{

	
	
private static final long serialVersionUID = 1L;



private CampoLimitado tf_codigo;
private CampoLimitado tf_tomada_preco;
private CampoLimitado tf_objetivo;
private CampoLimitado tf_obs;

private CampoLimitado tf_encargo_horista;
private int id_encargo_horista;

private CampoLimitado tf_encargo_mensalistas;
private int id_encargo_mensalistas;

private CampoLimitado tf_responsavel;
private int id_responsavel;

private CampoLimitado tf_bdi;
private int id_bdi;

private Projeto projeto;	

private PainelDeEndereco endereco;


private FormProjeto referencia_projeto;






	public PainelDeDadosGeraisDeProjeto(Projeto projeto, FormProjeto referencia_projeto){
		
	this.projeto = projeto;	
		
	this.referencia_projeto  =referencia_projeto;
		
	this.setLayout(new GridBagLayout());
		
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
		
		
	this.adicionarComponentes();
		
		
		if(this.projeto != null ){
			
		tf_tomada_preco.setText(projeto.getTomada_preco());
		this.tf_codigo.setText(projeto.getCodigo());
		tf_objetivo.setText(projeto.getObjetivo());
		this.tf_obs.setText(projeto.getObs());
		
		Endereco endereco  = new DAO<Endereco>(Endereco.class).get(this.projeto.getFk_endereco());
			
		if(endereco!=null)
		this.endereco.setValores(endereco);
		
		Encargo_Horista encargo_h  = new DAO<Encargo_Horista>(Encargo_Horista.class).get(this.projeto.getFk_encargo_horista());
		
			if(encargo_h!=null){
			
			this.id_encargo_horista = encargo_h.getId_encargo_horista();
			this.tf_encargo_horista.setText(encargo_h.getCodigo());
			
			this.tf_encargo_horista.setEnabled(false);
			}
			
			
		Encargo_Mensalista encargo__m  = new DAO<Encargo_Mensalista>(Encargo_Mensalista.class).get(this.projeto.getFk_encargo_mensalista());
			
			if(encargo__m!=null){
			
			this.id_encargo_mensalistas = encargo__m.getId_encargo_mensalistas();
			this.tf_encargo_mensalistas.setText(encargo__m.getCodigo());
			
			this.tf_encargo_mensalistas.setEnabled(false);
			}
			
			
		BDI bdi  = new DAO<BDI>(BDI.class).get(this.projeto.getFk_bdi());
			
			if(bdi!=null){
			
			this.id_bdi = bdi.getId_bdi();
			this.tf_bdi.setText(bdi.getCodigo());
			
			this.tf_bdi.setEnabled(false);
			}
				
		
		Integrante integrante  = new DAO<Integrante>(Integrante.class).get(this.projeto.getFk_responsavel());
			
			if(integrante!=null){
			
			this.id_responsavel = integrante.getId_integrante();
			this.tf_responsavel.setText(integrante.getNome());
			}
				
				
			
		}
	}



		
		
	public void adicionarComponentes() {
		
	
	GridBagConstraints cons = new GridBagConstraints();  

		
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 2, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_1, cons);	
		
	this.add(this.endereco =new PainelDeEndereco("Endereço/Local da Obra"), cons);
		
	JPanel p_2 = new JPanel(new GridBagLayout());
	p_2.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_2, cons);	
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx = 0.6;
	cons.insets = new Insets(2, 2, 0, 2);	
	cons.gridwidth  = 1;	
	p_1.add(new JLabel("<html>Código/Nome:<font color=red>*</font></html>"),cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx = 0.4;
	p_1.add(new JLabel("Tomada de Preço:"),cons);
		
	cons.gridwidth  = 1;
	cons.weightx = 0.6;
	cons.insets = new Insets(2, 2, 2, 2);		
	p_1.add(tf_codigo =new CampoLimitado(40), cons);
		
	cons.weightx = 0.4;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_1.add(this.tf_tomada_preco =new CampoLimitado(40), cons);
		
		
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	cons.weightx = 0.6;
	p_1.add(new JLabel("<html>Objetivo:<font color=red>*</font></html>"),cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weightx = 0.4;
	p_1.add(new JLabel("Obs:"),cons);
		
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);
	cons.weightx = 0.6;
	p_1.add(this.tf_objetivo =new CampoLimitado(40), cons);
		
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weightx = 0.4;
	p_1.add(this.tf_obs =new CampoLimitado(250), cons);
		
	
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	cons.weightx = 1;
	p_2.add(new JLabel("<html>BDI:<font color=red>*</font></html>"),cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	p_2.add(new JLabel(""),cons);
	
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);
	p_2.add(this.tf_bdi =new CampoLimitado(40), cons);
	this.tf_bdi.setEditable(false);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.WEST;	
	cons.weightx= 0;
	JButton bt_novo_bdi  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_novo_bdi.setToolTipText("cadastrar um novo BDI.");
	p_2.add(bt_novo_bdi, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	p_2.add(new JLabel("<html>Encargos Sociais (Horistas):<font color=red>*</font></html>"),cons);
	
	cons.fill = GridBagConstraints.NONE;
	cons.weightx= 0;
	p_2.add(new JLabel(""),cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx= 1;
	p_2.add(new JLabel("<html>Encargos Sociais (Mensalistas):<font color=red>*</font></html>"),cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.fill = GridBagConstraints.NONE;
	cons.weightx= 0;
	p_2.add(new JLabel(""),cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx= 1;
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);
	p_2.add(this.tf_encargo_horista =new CampoLimitado(40), cons);
	this.tf_encargo_horista.setEditable(false);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.WEST;	
	cons.weightx= 0;
	JButton bt_encargo_horista  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_encargo_horista.setToolTipText("cadastrar um novo encargo social (horista).");
	p_2.add(bt_encargo_horista, cons);
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx= 1;
	p_2.add(this.tf_encargo_mensalistas =new CampoLimitado(40), cons);
	this.tf_encargo_mensalistas.setEditable(false);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.WEST;	
	cons.weightx= 0;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	JButton bt_encargo_mensalista  = new JButton(new ImageIcon(getClass().getResource("/icons/add_2.png")));
	bt_encargo_mensalista.setToolTipText("cadastrar um novo encargo social (mensalista).");
	p_2.add(bt_encargo_mensalista, cons);
	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx= 1;
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	p_2.add(new JLabel("Responsável pelo Projeto:"),cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	p_2.add(new JLabel(""),cons);
		
	cons.gridwidth  = 1;	
	cons.insets = new Insets(2, 2, 2, 2);
	p_2.add(this.tf_responsavel =new CampoLimitado(250), cons);
	this.tf_responsavel.setEditable(false);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	p_2.add(new JLabel(""),cons);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	JButton bt_salvar  = new JButton("Salvar Projeto", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Salvar projeto.");
	this.add(bt_salvar, cons);
		
		

		
		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		if(acaoPrincipal())
		Mensagens.msgDeSucessoAoSalvar();
				
		}});
		
		
		
		this.tf_bdi.addMouseListener( new MouseAdapter(){		
			
		@Override
		public void mouseClicked(MouseEvent e) {
					
		Comuns.removeIndicadoresDeErro(tf_bdi);
					
		bt_salvar.requestFocus();
										
		addBDI();	
		}});
		
		
		
		this.tf_encargo_horista.addMouseListener( new MouseAdapter(){		
			
		@Override
		public void mouseClicked(MouseEvent e) {
				
		Comuns.removeIndicadoresDeErro(tf_encargo_horista);
				
		bt_salvar.requestFocus();
									
		addEncargoHorista();	
		}});
			
	
		this.tf_encargo_mensalistas.addMouseListener( new MouseAdapter(){			
		@Override
		public void mouseClicked(MouseEvent e) {
					
		Comuns.removeIndicadoresDeErro(tf_encargo_mensalistas);
					
		bt_salvar.requestFocus();
										
		addEncargoMensalista();	
		}});
		
		
		
		this.tf_responsavel.addMouseListener( new MouseAdapter(){			
		@Override
		public void mouseClicked(MouseEvent e) {
						
		Comuns.removeIndicadoresDeErro(tf_responsavel);
						
		bt_salvar.requestFocus();
											
		addResponsavel();	
		}});
		
		
		
		bt_novo_bdi.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		
		BDI_Modelo bdi = new BDI_Modelo();	
				
		FormNovoBDIModelo form = new FormNovoBDIModelo(bdi);	
		form.mostrar();
		
			if(bdi.getId_bdi_modelo()>0){
				
			tf_bdi.setText(bdi.getCodigo());
			id_bdi  =bdi.getId_bdi_modelo();
			}
		}});
		
		

		

		bt_encargo_horista.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
				    	
		
		Encargo_Horista_Modelo enc_horista = new Encargo_Horista_Modelo();	
				
		FormNovoEncargoHoristaModelo form = new FormNovoEncargoHoristaModelo(enc_horista);	
		form.mostrar();
		
			if(enc_horista.getId_encargo_horista_modelo()>0){
				
			tf_encargo_horista.setText(enc_horista.getCodigo());
			id_encargo_horista  =enc_horista.getId_encargo_horista_modelo();
			}
		}});
		
		
		
		
		bt_encargo_mensalista.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
					    	
		Encargo_Mensalista_Modelo enc_mensalista = new Encargo_Mensalista_Modelo();	
					
		FormNovoEncargoMensalistaModelo form = new FormNovoEncargoMensalistaModelo(enc_mensalista);	
		form.mostrar();
			
			if(enc_mensalista.getId_encargo_mensalistas_modelo()>0){
					
			tf_encargo_mensalistas.setText(enc_mensalista.getCodigo());
			id_encargo_mensalistas  =enc_mensalista.getId_encargo_mensalistas_modelo();
			}
		}});
		
		
			
	List<JTextField> textFieldList = new ArrayList<JTextField>();
			
	textFieldList.add(tf_codigo);
	textFieldList.add(tf_encargo_horista);
	textFieldList.add(tf_encargo_mensalistas);
	textFieldList.add(this.tf_bdi);
	
		
	Comuns.addEventoDeFoco(textFieldList);
	}
		
		
		
		
	

	
	private boolean validacao(){
		
		
		if(this.tf_codigo.getText().length()==0){
		
		Mensagens.msgDeErro("Informe o código/nome do projeto.");
		Comuns.textFieldErroMode(this.tf_codigo);	
		return false;
		}
		
		

		if(!Comuns.codigoPermitido(new DAO<Projeto>(Projeto.class), 
				this.tf_codigo.getText(), this.projeto!=null?this.projeto.getId_projeto():0, "proj.status='ATIVO'")){
			
		Mensagens.msgDeErro("O código informado já está sendo usado por outro projeto.");
		Comuns.textFieldErroMode(this.tf_codigo);
		return false;	
		}
		
		
		if(this.tf_objetivo.getText().length()==0){
			
		Mensagens.msgDeErro("Informe o objectivo do projeto.");
		return false;
		}
		
		
		if(this.id_bdi==0){
			
		Mensagens.msgDeErro("Selecione o BDI para o projeto.");
		Comuns.textFieldErroMode(this.tf_bdi);
		return false;
		}
		
	
		if(this.id_encargo_horista==0){
			
		Mensagens.msgDeErro("Selecione os encargos sociais para horistas do projeto.");
		Comuns.textFieldErroMode(this.tf_encargo_horista);
		return false;
		}
		
		
		if(this.id_encargo_mensalistas==0){
			
		Mensagens.msgDeErro("Selecione os encargos sociais para mensalistas do projeto.");
		Comuns.textFieldErroMode(this.tf_encargo_mensalistas);
		return false;
		}
		
	
	return this.endereco.validacao();
	}
	
	
	

	
	
	
		
	public  boolean acaoPrincipal(){
			
	if(!this.validacao())	
	return false;
		
		
	if(this.projeto == null)	
	this.projeto = new Projeto();
	
	this.projeto.setCodigo(this.tf_codigo.getText());
	this.projeto.setObjetivo(this.tf_objetivo.getText());
	this.projeto.setData_cadastro(new Date());
	this.projeto.setObs(this.tf_obs.getText());
	this.projeto.setStatus("ATIVO");
	this.projeto.setTomada_preco(this.tf_tomada_preco.getText());
	this.projeto.setFk_responsavel(this.id_responsavel);
	
	
	
		if(this.projeto.getFk_endereco()==0){
		
		int id_endereco = new DAO<Endereco>(Endereco.class).novo(this.endereco.getEndereco());
		
		if(id_endereco==0)
		return false;
		
		this.projeto.setFk_endereco(id_endereco);
		}
		else{
		
		Endereco aux =  this.endereco.getEndereco();
		aux.setId_endereco(projeto.getFk_endereco());
		
		if(!new DAO<Endereco>(Endereco.class).altera(aux))	
		return false;	
		}
	
	
	DAO<Projeto> dao = new DAO<Projeto>(Projeto.class);
	
	
		if(this.projeto.getId_projeto() == 0){
			
		this.projeto.setOrdem(dao.getCont(null, "proj.status='ATIVO'", null)+1);
		
		String ano = Data.getAnoAtual();
		
		this.projeto.setId_referencia(String.format("%05d", dao.getCont(null, "Year(proj.data_cadastro)="+ano, null)+1)+"/"+ano);
		
		
		
		Encargo_Horista_Modelo	encargo_modelo_horista = new DAO<Encargo_Horista_Modelo>(Encargo_Horista_Modelo.class).get(this.id_encargo_horista);
		
		int id_encargo = 0;
			if(encargo_modelo_horista!=null){
				
			Encargo_Horista aux= 	encargo_modelo_horista.clona();
			aux.setCodigo("ENCARGOS HORISTAS "+this.projeto.getId_referencia());
			id_encargo = new DAO<Encargo_Horista>(Encargo_Horista.class).novo(aux);
			}
		
		this.projeto.setFk_encargo_horista(id_encargo);
		
		
		Encargo_Mensalista_Modelo	encargo_modelo_mensalista = new DAO<Encargo_Mensalista_Modelo>(Encargo_Mensalista_Modelo.class).get(this.id_encargo_mensalistas);
		
		id_encargo = 0;
			if(encargo_modelo_mensalista!=null){
				
			Encargo_Mensalista aux= 	encargo_modelo_mensalista.clona();
			aux.setCodigo("ENCARGOS MENSALISTAS "+this.projeto.getId_referencia());
			id_encargo = new DAO<Encargo_Mensalista>(Encargo_Mensalista.class).novo(aux);
			}
		
		this.projeto.setFk_encargo_mensalista(id_encargo);
		

		
		BDI_Modelo	bdi = new DAO<BDI_Modelo>(BDI_Modelo.class).get(this.id_bdi);
		
		int id_bdi = 0;
			if(bdi!=null){
				
			BDI aux= 	bdi.clona();
			aux.setCodigo("BDI "+this.projeto.getId_referencia());
			id_bdi = new DAO<BDI>(BDI.class).novo(aux);
			}
		
		this.projeto.setFk_bdi(id_bdi);
		

		int id_projeto = new DAO<Projeto>(Projeto.class).novo(this.projeto);
		
		if(id_projeto<=0)
		return false;
		
		this.projeto.setId_projeto(id_projeto);
		
		DAO<Etapa> dao3 = new DAO<Etapa>(Etapa.class);
		DAO<Subetapa> dao4 = new DAO<Subetapa>(Subetapa.class);
		DAO<Cronograma> dao6 = new DAO<Cronograma>(Cronograma.class);
		
		int ordem = 1;
			for(Etapa etapa: this.getEtapas()){
			
			etapa.setFk_projeto(id_projeto);
			etapa.setStatus("ATIVO");
			etapa.setOrdem(ordem++);
			int id =  dao3.novo(etapa);
			
			Subetapa subetapa  = new Subetapa();
			subetapa.setFk_etapa(id);
			subetapa.setTitulo("ÚNICA");
			subetapa.setStatus("ATIVO");
			subetapa.setOrdem(1);
			id = dao4.novo(subetapa);
			
			Cronograma cronograma = new Cronograma();
			cronograma.setDuracao_meses(0);
			cronograma.setFk_subetapa(id);
			cronograma.setTipo("SUBETAPA");
			cronograma.setFk_projeto(id_projeto);
			dao6.novo(cronograma);
			}	
		}
		else
		return new DAO<Projeto>(Projeto.class).altera(this.projeto);
		
		
	this.referencia_projeto.setProjeto(projeto);
	this.referencia_projeto.ativarOpcoesAvancadas();
			
	return true;
	}
		
		
		
		
	

	private List<Etapa> getEtapas(){
		
	List<Etapa> etapas = new ArrayList<Etapa>();
		
		
	Etapa etapa = new Etapa();
	etapa.setTitulo("Serviços Preliminares");
	etapa.setObjetivo("Inclui despesas com locação, fechamento e regularização do terreno, instalação de barracão, tapumes, demolição, locação de obra, etc.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Terraplenagem");
	etapa.setObjetivo("Considera-se escavações, cortes, aterros, retiradas de terra, compactação de solo, etc.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Fundações (infraestrutura)");
	etapa.setObjetivo("Inclui-se serviços de muros de contenção ou arrimo, fundações diretas, cortinas, estacas e blocos, sapatas, etc.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Estrutura (superestrutura)");
	etapa.setObjetivo("Abrange todos os serviços necessários à execusão de estrutura de concreto, estrutura metálica, estruturas de madeira: lajes, vigas e pilares.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Elementos de Vedação");
	etapa.setObjetivo("Compreende paredes de divisórias, elementos de composição de proteção, etc.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Cobertura");
	etapa.setObjetivo("Abrange telhados, tratamentos especiais externos, impermeabilização de terraços e outros.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Revestimentos");
	etapa.setObjetivo("Inclui-se todos os revertimentos internos e externos de paredes, de forros, de pisos, etc. tais como rebocos, emboços, azuleijos.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Instalações");
	etapa.setObjetivo("Compreende os serviços para realizar as instalações hidro-sanitárias, instalações elétricas, telefônicas, digitais, etc.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Esquadrias");
	etapa.setObjetivo("Todas as esquadrias metálicas e/ou madeira como janelas, portas, portões, produtos de serralharia, etc.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Vidros e Pinturas");
	etapa.setObjetivo("Inclui-se a colocação de qualquer tipo de vidro, boxes de vidro para banheiro, todos os serviços de preparo e pintura de superfícies, etc.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Serviços Complementares");
	etapa.setObjetivo("São considerados serviços de complemento artístico e paisagístico, ligação final de água, esgoto, luz, telefone e outros.");
	etapas.add(etapa);
		
	etapa = new Etapa();
	etapa.setTitulo("Instalações Especiais");
	etapa.setObjetivo("Qualquer serviço que por suas particularidades nao se enquadram em nenhuma das etapas anteriores.");
	etapas.add(etapa);	
	
	return etapas;
	}

		
	
	

	
	
	private void addBDI(){
		

	BDI_Modelo retorno= new BDI_Modelo();
			
	FormDeSelecao<BDI_Modelo> selectionItemForm = 
							new FormDeSelecao<BDI_Modelo>("Adicionar BDI", retorno, BDI_Modelo.class, "bd_i_m.status='ATIVO'");
	selectionItemForm.mostrar();
				
		if(retorno != null && retorno.getId_bdi_modelo() > 0){
		
		this.id_bdi = retorno.getId_bdi_modelo();	
		this.tf_bdi.setText(retorno.getCodigo());
		}
	}
	
	
	
	
	
	
	
	private void addEncargoHorista(){
		

	Encargo_Horista_Modelo retorno= new Encargo_Horista_Modelo();
			
	FormDeSelecao<Encargo_Horista_Modelo> selectionItemForm = 
							new FormDeSelecao<Encargo_Horista_Modelo>("Adicionar Encargos Sociais (Horista)", retorno, Encargo_Horista_Modelo.class, "encg_ho_m.status='ATIVO'");
	selectionItemForm.mostrar();
				
		if(retorno != null && retorno.getId_encargo_horista_modelo() > 0){
		
		this.id_encargo_horista = retorno.getId_encargo_horista_modelo();	
		this.tf_encargo_horista.setText(retorno.getCodigo());
		}
	}
	
	
	
	
	
	

	
	private void addEncargoMensalista(){
		

	Encargo_Mensalista_Modelo retorno= new Encargo_Mensalista_Modelo();
			
	FormDeSelecao<Encargo_Mensalista_Modelo> selectionItemForm = 
							new FormDeSelecao<Encargo_Mensalista_Modelo>("Adicionar Encargos Sociais (Mensalista)", retorno, Encargo_Mensalista_Modelo.class, "encg_me_m.status='ATIVO'");
	selectionItemForm.mostrar();
				
		if(retorno != null && retorno.getId_encargo_mensalistas_modelo() > 0){
		
		this.id_encargo_mensalistas = retorno.getId_encargo_mensalistas_modelo();	
		this.tf_encargo_mensalistas.setText(retorno.getCodigo());
		}
	}
	
	
	
	

	
	private void addResponsavel(){
		
	Integrante retorno = new Integrante();
			
	FormDeSelecao<Integrante> selectionItemForm = 
					new FormDeSelecao<Integrante>("Adicionar Responsável", retorno, Integrante.class, "inte.status='ATIVO'");
	selectionItemForm.mostrar();
		
		
		if(retorno != null && retorno.getId_integrante() > 0){
		
		this.id_responsavel = retorno.getId_integrante();
		this.tf_responsavel.setText(retorno.getNome());
		}
	}
	

	
}
