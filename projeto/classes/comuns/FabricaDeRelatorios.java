
package comuns;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JFrame;

import beans.Cargo;
import beans.Empresa;
import beans.Endereco;
import beans.Integrante;
import beans.ItemDeRelDeComposicao;
import beans.ItemDeRelDeResumo;
import beans.ItemDeRelatorioAnalitico;
import beans.ParteParaRelatorioDeCronograma;
import beans.Projeto;
import beans.Proprietario;
import componentes.Barra_De_Progresso;
import dao.DAO;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;



public class FabricaDeRelatorios {

	
private Barra_De_Progresso progressBar;
	
	
private int id_projeto;

private boolean assinatura;




	public FabricaDeRelatorios(boolean assinatura){

	this(assinatura, 0);
	}


	
	
	public FabricaDeRelatorios(boolean assinatura, int id_projeto){

	this.id_projeto  =id_projeto;	
	
	this.assinatura  =assinatura;
	
	this.progressBar = new Barra_De_Progresso();
	}
	
	
	
	

	private boolean criaRelatorios(String titulo, JasperReport jr, Map<String, Object> parametros){
 
	return criaRelatorios(titulo, jr, parametros, null);
    }	
	
	

	

	private boolean criaRelatorios(String titulo, JasperReport jr, Map<String, Object> parametros, JRDataSource ds ){
	
	if(this.progressBar != null)
	progressBar.atualizar(4);	
		
		try{

		DAO<Endereco>	dao_endereco = new DAO<Endereco>(Endereco.class);
		
			
		Empresa empresa= Comuns.getEmpresa();	
		
			if(empresa!=null){
		
			parametros.put("nome_empresa", empresa.getNome_razao()!=null && empresa.getNome_razao().length()>0?empresa.getNome_razao():"");
				
			if(empresa.getFk_endereco()>0)
			parametros.put("endereco_empresa", Comuns.getDescricaoEndereco(dao_endereco.get(empresa.getFk_endereco())));
			else
			parametros.put("endereco_empresa", "");
			
			
			parametros.put("dados_empresa", 
						"CNPJ: "+(empresa.getCpf_cnpj()!=null && empresa.getCpf_cnpj().length()>0?empresa.getCpf_cnpj():"")
						+", INSC. MUNICIPAL: "+(empresa.getInsc_municipal()!=null && empresa.getInsc_municipal().length()>0?empresa.getInsc_municipal():"")
						+", INSC. ESTADUAL: "+(empresa.getInsc_estadual()!=null && empresa.getInsc_estadual().length()>0?empresa.getInsc_estadual():""));
			
			
			parametros.put("contato_empresa", 
					"FONE: "+
					(empresa.getTel_1()!=null && empresa.getTel_1().length()>0?empresa.getTel_1():"")+
					(empresa.getTel_1()!=null && empresa.getTel_1().length()>0 && empresa.getTel_2()!=null && empresa.getTel_2().length()>0?" | ":"")+
					(empresa.getTel_2()!=null && empresa.getTel_2().length()>0?empresa.getTel_2():"")+
					(empresa.getEmail()!=null && empresa.getEmail().length()>0?" | "+empresa.getEmail():"")+
					(empresa.getSite()!=null && empresa.getSite().length()>0?" | "+empresa.getSite():""));
			}
		
		
			if(this.id_projeto >0){
			
			Projeto projeto = new DAO<Projeto>(Projeto.class).get(this.id_projeto);
					
				
			List<Proprietario> lista_props = new DAO<Proprietario>(Proprietario.class).get(
						"INNER JOIN projetos_x_proprietarios AS prjXprop ON prjXprop.fk_proprietario = prop.id_proprietario AND prjXprop.fk_projeto="+this.id_projeto, 
						"prop.status='ATIVO'", 
						null);
				
			String proprietarios = "";
				
			for(Proprietario aux : lista_props)
			proprietarios += aux.getNome_razao()+"/";
				
			if(proprietarios.length()>0 && proprietarios.charAt(proprietarios.length()-1)=='/')
			proprietarios = proprietarios.substring(0, proprietarios.length()-2);
					
				
			String endereco = Comuns.getDescricaoEndereco(dao_endereco.get(projeto.getFk_endereco()));
			
			parametros.put("proprietarios", proprietarios);
			parametros.put("endereco_obra", endereco);
			parametros.put("objetivo", projeto.getObjetivo()!=null && projeto.getObjetivo().length()>0?projeto.getObjetivo():"");
			parametros.put("tomada_preco", projeto.getTomada_preco()==null?"":projeto.getTomada_preco());
			
				if(projeto.getPath_logo()!=null && projeto.getPath_logo().length()>0){
				
				File logo  = new File(projeto.getPath_logo());
				
				if(logo.exists() && logo.isFile())
				parametros.put("path_logo", projeto.getPath_logo());
				else
				parametros.put("path_logo", getClass().getResource("/icons/civilcalc.png").toString());
				
				}
				else
				parametros.put("path_logo", getClass().getResource("/icons/civilcalc.png").toString());
				
				
				if(projeto.getFk_responsavel()>0){
				
					
				Integrante integrante = new DAO<Integrante>(Integrante.class).get(projeto.getFk_responsavel());
				
					if(integrante!=null){
					
					parametros.put("nome_responsavel", integrante.getNome());	
					
	
					Cargo cargo = new DAO<Cargo>(Cargo.class).get(integrante.getFk_cargo());
					
					parametros.put("cargo_responsavel", cargo!=null?cargo.getDescricao():"");	
					
					
					if(integrante.getPath_assinatura()!=null && integrante.getPath_assinatura().length()>0){
						
						File logo  = new File(integrante.getPath_assinatura());
						
						if(logo.exists() && logo.isFile())
						parametros.put("path_assinatura", integrante.getPath_assinatura());	
						else
						parametros.put("path_assinatura", getClass().getResource("/icons/assinatura_nula.png").toString());
						
						}
						else
						parametros.put("path_assinatura", getClass().getResource("/icons/assinatura_nula.png").toString());
					}
				}
			}
			
		
		parametros.put("assinatura", this.assinatura);
				
			
		
		JasperPrint jp  =null;
		if(ds==null)
		jp = JasperFillManager.fillReport(jr, parametros, Configuracao.connector);
		else
		jp = JasperFillManager.fillReport(jr, parametros, ds);
		
		this.viewReportFrame( titulo, jp);
		}
		catch (JRException e) {progressBar.dispose();e.printStackTrace();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório."); return false;}
		
	return true;
    }
	


	
	
	private void viewReportFrame( String titulo, JasperPrint print ) {
		
	if(this.progressBar != null)
	progressBar.atualizar(2);	
		
	JRViewer viewer = new JRViewer( print );
	
	JDialog frameRelatorio = new JDialog();
		
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();  
	Rectangle screenRect = ge.getMaximumWindowBounds();  

	frameRelatorio.setSize(screenRect.width, screenRect.height);   	
	frameRelatorio.add( viewer, BorderLayout.CENTER );
	frameRelatorio.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	frameRelatorio.setModal(true);
	
	if(this.progressBar != null)
	progressBar.atualizar(2);	
	
	progressBar.dispose();
	frameRelatorio.setVisible( true );
    }
	
	
	
	
	
	
	
	
	public boolean relatorioDeOrcamento(List<ItemDeRelatorioAnalitico> lista){
	
		
	JasperReport jr	= null;
	Map<String, Object> parametros = null;
						
	progressBar.mostrar();		
	progressBar.atualizar(2);	
						
		try{
		InputStream inputStream = getClass().getResourceAsStream("/relatorios/rel_orcamento.jrxml");     
											
		JasperDesign jd = JRXmlLoader.load(inputStream);
		jr = JasperCompileManager.compileReport(jd);
							    
		parametros = new HashMap<String, Object>();
		parametros.put("id_projeto", this.id_projeto);
		parametros.put("titulo", "RELAÇÃO ORÇAMENTÁRIA");
		parametros.put("valor_total", Calculo.formataValor(Comuns.getValorTotalProjeto(this.id_projeto)));
		
		}
		catch (JRException e) {progressBar.dispose();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório.");return false;}
	
	progressBar.atualizar(2);		
	
	JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
	
	return this.criaRelatorios("Relatório de Orçamento", jr, parametros, ds);
	}
	
	
	
	

	

	public boolean relatorioDeCronograma(List<ParteParaRelatorioDeCronograma> lista, String duracao){
	
		
	JasperReport jr	= null;
	Map<String, Object> parametros = null;
						
	progressBar.mostrar();		
	progressBar.atualizar(2);	
						
		try{
		InputStream inputStream = getClass().getResourceAsStream("/relatorios/rel_cronograma.jrxml");     
											
		JasperDesign jd = JRXmlLoader.load(inputStream);
		jr = JasperCompileManager.compileReport(jd);
							    
		parametros = new HashMap<String, Object>();
		parametros.put("titulo", "CRONOGRAMA DE PROJETO");
		parametros.put("duracao", duracao);
		parametros.put("cont_partes", lista.size());
		}
		catch (JRException e) {progressBar.dispose();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório.");return false;}
								
	progressBar.atualizar(2);		
		
	JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
		
	return this.criaRelatorios("Relatório de Orçamento", jr, parametros, ds);
	}
	
	
	
	
	

	public boolean relatorioDeResumo(List<ItemDeRelDeResumo> lista, 
														String bdi, 
														String valor_total,
														String duracao){
		
		
	JasperReport jr	= null;
	Map<String, Object> parametros = null;
						
	progressBar.mostrar();		
	progressBar.atualizar(2);	
						
		try{
		InputStream inputStream = getClass().getResourceAsStream("/relatorios/rel_resumo.jrxml");     
											
		JasperDesign jd = JRXmlLoader.load(inputStream);
		jr = JasperCompileManager.compileReport(jd);
							    
		parametros = new HashMap<String, Object>();
		parametros.put("titulo", "RESUMO DE ORÇAMENTO");
		parametros.put("bdi", bdi);
		parametros.put("valor_total", valor_total);
		parametros.put("duracao", duracao);
		}
		catch (JRException e) {progressBar.dispose();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório.");return false;}
								
	progressBar.atualizar(2);		
		
	JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
		
	return this.criaRelatorios("Resumo de Orçamento", jr, parametros, ds);
	}
	
	
	

	
	

	public boolean relatorioDeBDI(){
			
	JasperReport jr	= null;
	Map<String, Object> parametros = null;
						
	progressBar.mostrar();		
	progressBar.atualizar(2);	
						
		try{
		InputStream inputStream = getClass().getResourceAsStream("/relatorios/rel_bdi.jrxml");     
											
		JasperDesign jd = JRXmlLoader.load(inputStream);
		jr = JasperCompileManager.compileReport(jd);
							    
		parametros = new HashMap<String, Object>();
		parametros.put("id_projeto", this.id_projeto);
		parametros.put("titulo", "COMPOSIÇÃO ANALÍTICA DA TAXA DE B.D.I.");
		}
		catch (JRException e) {progressBar.dispose();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório.");return false;}
								
	progressBar.atualizar(2);		
			
	return this.criaRelatorios("camposição de BDI", jr, parametros);
	}
	
	
	
	
	
	

	public boolean relatorioDeHoristas(){
			
	JasperReport jr	= null;
	Map<String, Object> parametros = null;
						
	progressBar.mostrar();		
	progressBar.atualizar(2);	
						
		try{
		InputStream inputStream = getClass().getResourceAsStream("/relatorios/rel_horistas.jrxml");     
											
		JasperDesign jd = JRXmlLoader.load(inputStream);
		jr = JasperCompileManager.compileReport(jd);
							    
		parametros = new HashMap<String, Object>();
		parametros.put("id_projeto", this.id_projeto);
		parametros.put("titulo", "TAXAS DE LEIS SOCIAIS E RISCOS DE TRABALHO HORISTAS");
		}
		catch (JRException ex) {progressBar.dispose();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório.");return false;}
								
	progressBar.atualizar(2);		
			
	return this.criaRelatorios("Encargos Sociais de trabalhadores Horistas", jr, parametros);
	}
	
	
	
	
	
	
	public boolean relatorioDeMensalistas(){
		
		JasperReport jr	= null;
		Map<String, Object> parametros = null;
							
		progressBar.mostrar();		
		progressBar.atualizar(2);	
							
			try{
			InputStream inputStream = getClass().getResourceAsStream("/relatorios/rel_mensalistas.jrxml");     
												
			JasperDesign jd = JRXmlLoader.load(inputStream);
			jr = JasperCompileManager.compileReport(jd);
								    
			parametros = new HashMap<String, Object>();
			parametros.put("id_projeto", this.id_projeto);
			parametros.put("titulo", "TAXAS DE LEIS SOCIAIS E RISCOS DE TRABALHO MENSALISTA");
			}
			catch (JRException ex) {progressBar.dispose();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório.");return false;}
									
		progressBar.atualizar(2);		
				
		return this.criaRelatorios("Encargos Sociais de trabalhadores Mensalistas", jr, parametros);
		}
		
	
	
	
	

	
	
	
	public boolean relatorioDeComposicao(List<ItemDeRelDeComposicao> lista){
	
		
	JasperReport jr	= null;
	Map<String, Object> parametros = null;
						
	progressBar.mostrar();		
	progressBar.atualizar(2);	
						
		try{
		InputStream inputStream = getClass().getResourceAsStream("/relatorios/rel_composicao.jrxml");     
											
		JasperDesign jd = JRXmlLoader.load(inputStream);
		jr = JasperCompileManager.compileReport(jd);
							    
		parametros = new HashMap<String, Object>();
		parametros.put("id_projeto", this.id_projeto);
		parametros.put("titulo", "COMPOSIÇÃO DE PREÇO UNITÁRIO");
		}
		catch (JRException e) {progressBar.dispose();Mensagens.msgDeErro("Um erro ocorreu ao gerar o relatório.");return false;}
	
	progressBar.atualizar(2);		
	
	JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
	
	return this.criaRelatorios("Relatório de Composição de Preço Unitário", jr, parametros, ds);
	}
	
	
	
	
}
