package principal;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import comuns.Configuracao;






public class Main {

	
	
	
	public static void main(String[] args){
		
	
	try {
	//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 	
	}
	
    catch (ClassNotFoundException e) {e.printStackTrace();}
    catch (InstantiationException e) {e.printStackTrace();}
    catch (IllegalAccessException e) {e.printStackTrace();}
    catch (UnsupportedLookAndFeelException e) {e.printStackTrace();}	
	
	
	Configuracao.connector = new ConfigDAO("civilcalc").getConexao();
	
	if(Configuracao.connector==null)
	return;
	
	/*
	Common.num_compilacao = "0409201500006";

	PagueOAluguel registro = new PagueOAluguel();
	
	PagueOAluguel.insertRegisterKeyEnabled = true;
	
	PagueOAluguel.SYSTEM_NAME = "sisDiaLab";
	PagueOAluguel.SYSTEM_VERSION = "1.0.0";
	
	PagueOAluguel.serverURL = "http://www.mscsolucoes.com.br/util/licenseServer/";
	PagueOAluguel.accessKey2Server = "61fFndxo4s1Z0x00ad2c7gC9sAw5rmNH";

	Configuration.currentRecord= registro.getCurrentRecord();

		if(registro.licenseIsValid(Configuration.currentRecord)){
		
		YouShallNotPass youShallNotPass = new YouShallNotPass(Configuration.connector);
			
			if(!youShallNotPass.BDValidate()){
		
			List<Resource> resourceList = new ArrayList<Resource>();	
		
			resourceList.add(new Resource("Movimento de clientes", Resource.VER_ED_REM, "GEREMOV"));	
			resourceList.add(new Resource("Incluir resultados de exames", Resource.SIM_NAO, "INRESULT"));	
			resourceList.add(new Resource("Cadastros", Resource.VER_ED_REM, "GERECAD"));	
			resourceList.add(new Resource("Tabelas", Resource.VER_ED_REM, "GERETAB"));	
			resourceList.add(new Resource("Gerar relatórios", Resource.SIM_NAO, "GEREREL"));	
			resourceList.add(new Resource("Faturamento", Resource.SIM_NAO, "FATURA"));	
			resourceList.add(new Resource("Registro e licenciamento", Resource.SIM_NAO, "REGLICEN"));	
			resourceList.add(new Resource("Informações empresariais", Resource.SIM_NAO, "INFOEMP"));	
			
			
			
			LoginConfiguration.resourceList = resourceList;
			
			youShallNotPass.BDCreateTables();
			}

		//Configuration.usuarioAtual = youShallNotPass.Login();
			

			Configuration.usuarioAtual = new 	UserLogged();
			Configuration.usuarioAtual.setID(1);
			Configuration.usuarioAtual.setUserName("admin");
		
		
			if(Configuration.usuarioAtual.getID() > 0){
				
			Common.setInfosPadroes();
				
			Configuration.monitor= new Monitor(new DiaLabMensageiro());
			*/
		
			Principal principal = new Principal();	
			principal.mostrar();	
			
			/*Configuration.monitor.run();
			}
		}*/	
	}	










}
