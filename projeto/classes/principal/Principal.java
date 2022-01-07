package principal;


import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import principal.relatorios.FormDeRelDeBDI;
import principal.relatorios.FormDeRelDeComposicao;
import principal.relatorios.FormDeRelDeCronograma;
import principal.relatorios.FormDeRelDeHoristas;
import principal.relatorios.FormDeRelDeMensalistas;
import principal.relatorios.FormDeRelDeOrcamentoAnalitico;
import principal.relatorios.FormDeRelDeResumo;
import cadastro.cargos.FormGestaoDeCargos;
import cadastro.empresa.FormAcessoRapido;
import cadastro.empresa.FormEmpresa;
import cadastro.fornecedores.GestaoDeFornecedores;
import cadastro.grupos_de_integrantes.FormGestaoDeGrupos;
import cadastro.integrantes.FormGestaoDeIntegrantes;
import cadastro.modelos.dbi.FormGestaoDeBDIModelo;
import cadastro.modelos.encargos_horistas.FormGestaoDeEncargosHoristasModelo;
import cadastro.modelos.encargos_mensalistas.FormGestaoDeEncargosMensalistaModelo;
import cadastro.modelos.equipamentos.FormGestaoDeEquipamentoModelo;
import cadastro.modelos.itens_de_orcamento_modelo.FormGestaoDeItensModelo;
import cadastro.modelos.mao_de_obra.FormGestaoDeMaoDeObraModelo;
import cadastro.modelos.materiais.FormGestaoDeMaterialModelo;
import cadastro.projetos.FormDeClonagemDeProjeto;
import cadastro.projetos.FormProjeto;
import cadastro.projetos.FormUnirEtapasOuSubetapas;
import cadastro.proprietarios.FormGestaoDeProprietarios;
import cadastro.tipos_de_mao_de_obra.FormGestaoDeTipoDeMaoDeObra;
import cadastro.tipos_de_materiais.FormGestaoDeTipo;
import cadastro.unidade.FormGestaoDeUnidade;
import componentes.janelas.Frame;



public class Principal extends Frame{

	

private static final long serialVersionUID = 1L;


private PainelDeAcessoRapido p_acesso_rapido;
private PainelDeProjetos p_projetos;
private PainelDeEtapas p_etapas;
private PainelDeSubetapas p_subetapas;
private PainelDeDetalhes p_detalhes;
private JPanel p_reduzidos;
private JPanel p_fundo;



private int largura_total;
private int altura_total;


private JButton bt_expande_projetos;
private JButton bt_expande_etapas;
private JButton bt_expande_subetapas;







	public Principal(){
	
    super("CivilCalc - Construção Civil", 
    			GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width,
    				GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height);
	
   
    largura_total = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
    altura_total = 	GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
    				
	
    	addWindowListener(new WindowAdapter(){  
        public void windowClosing (WindowEvent e){  
        
    	
        System.exit(0);  	           
        }});  
   	

   	adicionarComponentes();
	}
	
	
	
	
	
	
	public void adicionarComponentes(){
		
	GridBagConstraints cons = new GridBagConstraints();  

	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weighty  = 0;
	cons.weightx = 1;
	cons.insets = new Insets(0, 1, 0, 1);
	
	
	/***************************** MENU PRINCIPAL ***********************************/
	
	JMenuBar barra_de_menu = new JMenuBar();	
	setJMenuBar(barra_de_menu);

	JMenu menu_projetos = new JMenu("<html>&nbsp;&nbsp;Projetos&nbsp;&nbsp;</html>");
	JMenu menu_bdi = new JMenu("<html>&nbsp;&nbsp;BDI&nbsp;&nbsp;</html>");
	JMenu menu_insumos = new JMenu("<html>&nbsp;&nbsp;Insumos&nbsp;&nbsp;</html>");
	JMenu menu_encargos = new JMenu("<html>&nbsp;&nbsp;Encargos&nbsp;&nbsp;</html>");
	JMenu menu_itens = new JMenu("<html>&nbsp;&nbsp;Tabelas&nbsp;&nbsp;</html>");
	JMenu menu_relatorios = new JMenu("<html>&nbsp;&nbsp;Relatórios&nbsp;&nbsp;</html>");
	JMenu menu_config = new JMenu("<html>&nbsp;&nbsp;Configurações&nbsp;&nbsp;</html>");
	
   
    barra_de_menu.add(menu_projetos);
    barra_de_menu.add(menu_bdi);
    barra_de_menu.add(menu_insumos);
    barra_de_menu.add(menu_encargos);
    barra_de_menu.add(menu_itens);
    barra_de_menu.add(menu_relatorios);
    barra_de_menu.add(menu_config);
    
    
    
    JMenuItem item_menu_projeto_novo = new JMenuItem("<html>&nbsp;&nbsp;Novo Projeto&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/novo_mini.png")));
    menu_projetos.add(item_menu_projeto_novo);

    menu_projetos.add(new JSeparator());
    
    JMenuItem item_menu_projeto_clonar = new JMenuItem("<html>&nbsp;&nbsp;Clonar Projeto", new ImageIcon(getClass().getResource("/icons/clonar.png")));
    menu_projetos.add(item_menu_projeto_clonar);
    
    JMenuItem item_menu_projeto_unir = new JMenuItem("<html>&nbsp;&nbsp;Unir Itens de Projeto", new ImageIcon(getClass().getResource("/icons/unir.png")));
    menu_projetos.add(item_menu_projeto_unir);

    menu_projetos.add(new JSeparator());
    
    JMenuItem item_menu_projeto_integrantes = new JMenuItem("<html>&nbsp;&nbsp;Integrantes&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/integrante.png")));
    menu_projetos.add(item_menu_projeto_integrantes);

    JMenuItem item_menu_projeto_cargos = new JMenuItem("<html>&nbsp;&nbsp;Cargos de Integrantes&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/cargos.png")));
    menu_projetos.add(item_menu_projeto_cargos);
    
    JMenuItem item_menu_projeto_grupos = new JMenuItem("<html>&nbsp;&nbsp;Grupos de Integrantes&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/grupos.png")));
    menu_projetos.add(item_menu_projeto_grupos);
    
    
    menu_projetos.add(new JSeparator());
    
    JMenuItem item_menu_projeto_proprietarios = new JMenuItem("<html>&nbsp;&nbsp;Proprietários&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/proprietario.png")));
    menu_projetos.add(item_menu_projeto_proprietarios);

    
    
    
    
    JMenuItem item_menu_bdi_modelo = new JMenuItem("<html>&nbsp;&nbsp;BDI Modelo&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/bdi.png")));
    menu_bdi.add(item_menu_bdi_modelo);

    
   
    
    JMenuItem item_menu_materiais_modelo = new JMenuItem("<html>&nbsp;&nbsp;Materiais Modelo&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/material.png")));
    menu_insumos.add(item_menu_materiais_modelo);
    
    JMenuItem item_menu_tipos_material = new JMenuItem("<html>&nbsp;&nbsp;Tipos de Materiais&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/tipo.png")));
    menu_insumos.add(item_menu_tipos_material);
    
    menu_insumos.add(new JSeparator());
    
    JMenuItem item_menu_mao_obra_modelo = new JMenuItem("<html>&nbsp;&nbsp;Mão de Obra Modelo&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/mao_de_obra.png")));
    menu_insumos.add(item_menu_mao_obra_modelo);
    
    JMenuItem item_menu_tipos_mao_de_obra = new JMenuItem("<html>&nbsp;&nbsp;Tipos de Mão de Obra&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/tipo.png")));
    menu_insumos.add(item_menu_tipos_mao_de_obra);
    
    menu_insumos.add(new JSeparator());
    
    
    JMenuItem item_menu_equipamentos_modelo = new JMenuItem("<html>&nbsp;&nbsp;Equipamentos Modelo&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/equipamentos.png")));
    menu_insumos.add(item_menu_equipamentos_modelo);
    
    menu_insumos.add(new JSeparator());
    
    JMenuItem item_menu_itens_modelo = new JMenuItem("<html>&nbsp;&nbsp;Itens Modelo&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/item.png")));
    menu_insumos.add(item_menu_itens_modelo);
    

    
    
    

    JMenuItem item_menu_encargos_horistas = new JMenuItem("<html>&nbsp;&nbsp;Encargos (Horista)&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/horista.png")));
    menu_encargos.add(item_menu_encargos_horistas);

    menu_encargos.add(new JSeparator());
    
    JMenuItem item_menu_encargos_mensalistas = new JMenuItem("<html>&nbsp;&nbsp;Encargos (Mensalistas)&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/mensalista.png")));
    menu_encargos.add(item_menu_encargos_mensalistas);
    
    
    
    
    JMenuItem item_menu_itens_unidade = new JMenuItem("<html>&nbsp;&nbsp;Unidades&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/unidade.png")));
    menu_itens.add(item_menu_itens_unidade);

    menu_itens.add(new JSeparator());
    
    JMenuItem item_menu_itens_fornecedores = new JMenuItem("<html>&nbsp;&nbsp;Fornecedores&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/fornecedores.png")));
    menu_itens.add(item_menu_itens_fornecedores);
    
    
    
    
    
    

    JMenuItem item_menu_rel_resumo = new JMenuItem("<html>&nbsp;&nbsp;Resumo&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
    menu_relatorios.add(item_menu_rel_resumo);
   
    menu_relatorios.add(new JSeparator());
    
    JMenuItem item_menu_rel_analitico = new JMenuItem("<html>&nbsp;&nbsp;Analítico&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
    menu_relatorios.add(item_menu_rel_analitico);
   
    menu_relatorios.add(new JSeparator());
    
    JMenuItem item_menu_rel_cronograma = new JMenuItem("<html>&nbsp;&nbsp;Cronograma&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
    menu_relatorios.add(item_menu_rel_cronograma);
   
    menu_relatorios.add(new JSeparator());
    
    JMenuItem item_menu_rel_composicao = new JMenuItem("<html>&nbsp;&nbsp;Composição&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
    menu_relatorios.add(item_menu_rel_composicao);
   
    menu_relatorios.add(new JSeparator());
    
    JMenuItem item_menu_rel_bdi = new JMenuItem("<html>&nbsp;&nbsp;BDI&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
    menu_relatorios.add(item_menu_rel_bdi);
   
    menu_relatorios.add(new JSeparator());
    
    JMenuItem item_menu_rel_horistas = new JMenuItem("<html>&nbsp;&nbsp;Horistas&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
    menu_relatorios.add(item_menu_rel_horistas);
    
    menu_relatorios.add(new JSeparator());
    
    JMenuItem item_menu_rel_mensalistas = new JMenuItem("<html>&nbsp;&nbsp;Mensalistas&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/icon_pdf_mini.png")));
    menu_relatorios.add(item_menu_rel_mensalistas);
   
    
    

    
    JMenuItem item_menu_config_empresa = new JMenuItem("<html>&nbsp;&nbsp;Empresa&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/empresa.png")));
    menu_config.add(item_menu_config_empresa);
   
    JMenuItem item_menu_config_acesso_rapido = new JMenuItem("<html>&nbsp;&nbsp;Acesso Rápido&nbsp;&nbsp;&nbsp;</html>", new ImageIcon(getClass().getResource("/icons/acesso_rapido.png")));
    menu_config.add(item_menu_config_acesso_rapido);
   
    
    
    
    
 /************** projetos **********************************/    
    
    
    	item_menu_projeto_novo.addActionListener( new ActionListener(){
    	@Override
		public void actionPerformed( ActionEvent event ){
						    	
    	FormProjeto  form = new FormProjeto(null);
    	form.mostrar();
    	
    	p_projetos.atualizaInfo();
		}});
    
  
    	item_menu_projeto_clonar.addActionListener( new ActionListener(){
        @Override
    	public void actionPerformed( ActionEvent event ){
    						    	
        FormDeClonagemDeProjeto	form = new FormDeClonagemDeProjeto();
    	form.mostrar();	
        	
        p_projetos.atualizaInfo();
    	}});
    	
    	
    	
    	
    	item_menu_projeto_unir.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
        						    	
        FormUnirEtapasOuSubetapas	form = new FormUnirEtapasOuSubetapas();
        form.mostrar();	
            	
        p_projetos.atualizaInfo();
        }});
        	
    	
    	
    	
    	
    	
    	item_menu_projeto_integrantes.addActionListener( new ActionListener(){
    	@Override
    	public void actionPerformed( ActionEvent event ){
    								    	
		FormGestaoDeIntegrantes	form = new FormGestaoDeIntegrantes();
    	form.mostrar();	
    	}});
    	
    	
    	item_menu_projeto_cargos.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
        									    	
        FormGestaoDeCargos form = new FormGestaoDeCargos();
    	form.mostrar();	
        }});
        	
    	
    	item_menu_projeto_grupos.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
            									    	
        FormGestaoDeGrupos form = new FormGestaoDeGrupos();
        form.mostrar();	
        }});
    	
    		
    	item_menu_projeto_proprietarios.addActionListener( new ActionListener(){
    	@Override
    	public void actionPerformed( ActionEvent event ){
    									    	
    	FormGestaoDeProprietarios form = new FormGestaoDeProprietarios();
    	form.mostrar();	
    	}});
    	
    	
    	
 /************** bdi **********************************/    
        
        
    	item_menu_bdi_modelo.addActionListener( new ActionListener(){
    	@Override
		public void actionPerformed( ActionEvent event ){
						    	
    	FormGestaoDeBDIModelo  form = new FormGestaoDeBDIModelo();
    	form.mostrar();
		}});
      	
    	
    	
 /************** insumos modelo **********************************/    	
    	
    	
    	item_menu_materiais_modelo.addActionListener( new ActionListener(){
        @Override
    	public void actionPerformed( ActionEvent event ){
    						    	
        FormGestaoDeMaterialModelo  form = new FormGestaoDeMaterialModelo();
        form.mostrar();
    	}});
    	
    	
    	
    	item_menu_tipos_material.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
        						    	
        FormGestaoDeTipo form = new FormGestaoDeTipo();
    	form.mostrar();
        }});
    	
    	
    	item_menu_mao_obra_modelo.addActionListener( new ActionListener(){
        @Override
    	public void actionPerformed( ActionEvent event ){
    						    	
        FormGestaoDeMaoDeObraModelo  form = new FormGestaoDeMaoDeObraModelo();
        form.mostrar();
    	}});
    	
    	
    	item_menu_tipos_mao_de_obra.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
            						    	
        FormGestaoDeTipoDeMaoDeObra form = new FormGestaoDeTipoDeMaoDeObra();
    	form.mostrar();	
        }});
        	
    	

    	item_menu_equipamentos_modelo.addActionListener( new ActionListener(){
        @Override
    	public void actionPerformed( ActionEvent event ){
    						    	
        FormGestaoDeEquipamentoModelo  form = new FormGestaoDeEquipamentoModelo();
        form.mostrar();
    	}});
    	
    	
    	
    	item_menu_itens_modelo.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
        						    	
        FormGestaoDeItensModelo  form = new FormGestaoDeItensModelo();
        form.mostrar();
        }});
    	
    	
    	
    	
    	
  
    	
 /************** encargos **********************************/      	
    	
    	
    	item_menu_encargos_horistas.addActionListener( new ActionListener(){
    	@Override
		public void actionPerformed( ActionEvent event ){
						    	
    	FormGestaoDeEncargosHoristasModelo  form = new FormGestaoDeEncargosHoristasModelo();
    	form.mostrar();
		}});
		
    	
    	item_menu_encargos_mensalistas.addActionListener( new ActionListener(){
        @Override
    	public void actionPerformed( ActionEvent event ){
    						    	
        FormGestaoDeEncargosMensalistaModelo  form = new FormGestaoDeEncargosMensalistaModelo();
        form.mostrar();
    	}});
    
    
	
    	
/************** itens **********************************/      	
    	
    	
    	item_menu_itens_unidade.addActionListener( new ActionListener(){
    	@Override
		public void actionPerformed( ActionEvent event ){
						    	
    	FormGestaoDeUnidade	form = new FormGestaoDeUnidade();
    	form.mostrar();	
		}});
		
    	
    	item_menu_itens_fornecedores.addActionListener( new ActionListener(){
        @Override
    	public void actionPerformed( ActionEvent event ){
    						    	
        GestaoDeFornecedores	form = new GestaoDeFornecedores();
    	form.mostrar();	
    	}});
       
    	
   	
    	
    	
    	
    	
    	
 /************** relatorios **********************************/   	
    	
    	
    	item_menu_rel_resumo.addActionListener( new ActionListener(){
    	@Override
    	public void actionPerformed( ActionEvent event ){											    	
    											
    	FormDeRelDeResumo	form = new FormDeRelDeResumo();
    	form.mostrar();	
    	}});		
    		
    	  				
    	item_menu_rel_analitico.addActionListener( new ActionListener(){
    	@Override
    	public void actionPerformed( ActionEvent event ){
    												    											
    	FormDeRelDeOrcamentoAnalitico	form = new FormDeRelDeOrcamentoAnalitico();
    	form.mostrar();	
    	}});  		
    		
    				
    	item_menu_rel_cronograma.addActionListener( new ActionListener(){
    	@Override
    	public void actionPerformed( ActionEvent event ){
    													    												
    	FormDeRelDeCronograma	form = new FormDeRelDeCronograma();
    	form.mostrar();	
    	}});
    	
    	
    	item_menu_rel_composicao.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
        													    												
        FormDeRelDeComposicao	form = new FormDeRelDeComposicao();
        form.mostrar();	
        }});
    	
    	
    	
    	
    	item_menu_rel_bdi.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
        													    												
        FormDeRelDeBDI	form = new FormDeRelDeBDI();
        form.mostrar();	
        }});
    	
    
    	item_menu_rel_horistas.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
            													    												
        FormDeRelDeHoristas	form = new FormDeRelDeHoristas();
        form.mostrar();	
        }});
    	
    	
    	
    	item_menu_rel_mensalistas.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){
                													    												
        FormDeRelDeMensalistas	form = new FormDeRelDeMensalistas();
        form.mostrar();	
        }});
    	
    	
/************** configuracao **********************************/   	
    	
    	
    	item_menu_config_empresa.addActionListener( new ActionListener(){
    	@Override
    	public void actionPerformed( ActionEvent event ){											    	
    											
    	FormEmpresa	form = new FormEmpresa();
    	form.mostrar();		
    	}});  
    	
    	
    	item_menu_config_acesso_rapido.addActionListener( new ActionListener(){
        @Override
        public void actionPerformed( ActionEvent event ){											    	
        											
        FormAcessoRapido	form = new FormAcessoRapido();
        form.mostrar();		
        }});  
        	
    	
    	
	
	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(0, 0, 0, 0);
	this.p_fundo = new JPanel(null);
	p_fundo.setBackground(new Color(38, 46, 57));
	this.add(p_fundo, cons);	

	
	p_fundo.add(this.p_acesso_rapido = new PainelDeAcessoRapido());
	p_fundo.add(this.p_projetos = new PainelDeProjetos(this));
	p_fundo.add(this.p_etapas = new PainelDeEtapas(this));
	p_fundo.add(this.p_subetapas = new PainelDeSubetapas(this));
	p_fundo.add(this.p_detalhes = new PainelDeDetalhes());
	
	this.p_acesso_rapido.setLocation(1, 1);
	this.p_acesso_rapido.setSize(this.largura_total - 18, 50);
	
	
	this.p_projetos.setReferenciaEtapas(this.p_etapas);
	this.p_projetos.setReferenciaDetalhes(this.p_detalhes);
	
	this.p_etapas.setReferenciaProjetos(this.p_projetos);
	this.p_etapas.setReferenciaSubetapas(this.p_subetapas);
	this.p_etapas.setReferenciaDetalhes(this.p_detalhes);
	
	this.p_subetapas.setReferenciaEtapas(this.p_etapas);
	this.p_subetapas.setReferenciaDetalhes(this.p_detalhes);
	
	this.p_detalhes.setReferenciaProjetos(this.p_projetos);
	this.p_detalhes.setReferenciaEtapas(this.p_etapas);
	this.p_detalhes.setReferenciaSubetapas(this.p_subetapas);
	
	
	
	p_fundo.add(this.p_reduzidos = new JPanel(new GridBagLayout()));	
	p_reduzidos.setBackground(new Color(38, 46, 57));
	
	cons.fill = GridBagConstraints.NONE;
	cons.gridwidth  = GridBagConstraints.REMAINDER;		
	cons.weighty  = 0;
	cons.weightx = 0;
	cons.insets = new Insets(0, 0, 0, 0);
	
	bt_expande_projetos  = new JButton(new ImageIcon(getClass().getResource("/icons/maximiza.png")));
	bt_expande_projetos.setToolTipText("Expandir projetos");
	p_reduzidos.add(bt_expande_projetos, cons);
			
	bt_expande_etapas  = new JButton(new ImageIcon(getClass().getResource("/icons/maximiza.png")));
	bt_expande_etapas.setToolTipText("Expandir etapas");
	p_reduzidos.add(bt_expande_etapas, cons);
	
	bt_expande_subetapas  = new JButton(new ImageIcon(getClass().getResource("/icons/maximiza.png")));
	bt_expande_subetapas.setToolTipText("Expandir subetapas");
	p_reduzidos.add(bt_expande_subetapas, cons);
	
	
	cons.fill = GridBagConstraints.BOTH;
	cons.weighty  = 1;
	p_reduzidos.add(new JLabel(""), cons);
	
	
	
		bt_expande_projetos.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		maximizaProjetos();
		}});
			
		
		
	

		bt_expande_etapas.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		maximizaEtapas();
		}});
			
		
		
		

		bt_expande_subetapas.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
						    	
		maximizaSubetapas();
		}});
			
			
	
	this.posicionaComponentes();
	
	this.p_projetos.atualizaInfo();
	}




	

	public void minimizaProjetos(){
	
	p_projetos.setVisible(false);
	
	this.posicionaComponentes();
	}
	
	
	
	
	
	

	public void minimizaEtapas(){
	
	p_etapas.setVisible(false);
	
	this.posicionaComponentes();
	}
	
	
	
	
	

	public void minimizaSubetapas(){
	
	p_subetapas.setVisible(false);
	
	this.posicionaComponentes();
	}
	
	
	
		
	
	
	public void maximizaProjetos(){
	
	p_projetos.setVisible(true);	
	
	this.posicionaComponentes();
	}
		
	
	
	

	
	
	public void maximizaEtapas(){
	
	p_etapas.setVisible(true);	
		
	this.posicionaComponentes();
	}
		
	
	
	

	
	public void maximizaSubetapas(){
	
	p_subetapas.setVisible(true);	
		
	this.posicionaComponentes();
	}
		
	
	
	
	
	
	
	private void posicionaComponentes(){
	
	this.p_reduzidos.setLocation(1, p_acesso_rapido.getY()+p_acesso_rapido.getHeight()+1);
	this.p_reduzidos.setSize(50, this.altura_total - this.p_reduzidos.getY()-62);	
		
	int posicao = 0;	
		
		if(this.p_projetos.isVisible() && 
				this.p_etapas.isVisible() &&
					this.p_subetapas.isVisible()){
			
		this.p_reduzidos.setVisible(false);		
		
		posicao= 1;
		}
		else{
		
		this.p_reduzidos.setVisible(true);	
			
		posicao = this.p_reduzidos.getX()+this.p_reduzidos.getWidth()+2;
		}
	
		
		if(this.p_projetos.isVisible()){
			
		this.p_projetos.setLocation(posicao, this.p_reduzidos.getY());
		this.p_projetos.setSize(250, this.p_reduzidos.getHeight());
					
		posicao = this.p_projetos.getX()+this.p_projetos.getWidth()+1;
					
		this.bt_expande_projetos.setVisible(false);
		}
		else
		this.bt_expande_projetos.setVisible(true);
		
		
		
		if(this.p_etapas.isVisible()){
			
		this.p_etapas.setLocation(posicao, this.p_reduzidos.getY());
		this.p_etapas.setSize(250, this.p_reduzidos.getHeight());
			
		posicao = this.p_etapas.getX()+this.p_etapas.getWidth()+1;
			
		this.bt_expande_etapas.setVisible(false);
		}
		else
		this.bt_expande_etapas.setVisible(true);	
		
		
		if(this.p_subetapas.isVisible()){
				
		this.p_subetapas.setLocation(posicao, this.p_reduzidos.getY());
		this.p_subetapas.setSize(250, this.p_reduzidos.getHeight());
			
		posicao = this.p_subetapas.getX()+this.p_subetapas.getWidth()+1;
			
		this.bt_expande_subetapas.setVisible(false);
		}
		else
		this.bt_expande_subetapas.setVisible(true);	
	
	
	this.p_detalhes.setLocation(posicao, p_acesso_rapido.getY()+p_acesso_rapido.getHeight()+1);
	this.p_detalhes.setSize(this.largura_total - this.p_detalhes.getX()-17, this.p_reduzidos.getHeight());		
	
	
	this.p_fundo.revalidate();
	this.p_fundo.repaint();
	}

	
	
	
	
	
	
}
