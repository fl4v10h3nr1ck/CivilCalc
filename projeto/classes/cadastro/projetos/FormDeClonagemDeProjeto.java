package cadastro.projetos;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import beans.Equipamento;
import beans.Etapa;
import beans.ItemDeOrcamento;
import beans.ItemXEquipamento;
import beans.ItemXMaoDeObra;
import beans.ItemXMaterial;
import beans.Mao_De_Obra;
import beans.Material;
import beans.Projeto;
import beans.Subetapa;
import classes.CampoLimitado;
import componentes.FormDeSelecao;
import componentes.janelas.Dialogo;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;
import dao.DAO;





public class FormDeClonagemDeProjeto extends Dialogo{


private static final long serialVersionUID = 1L;
	

protected CampoLimitado tf_projeto_origem;
private int id_projeto_origem;

protected CampoLimitado tf_projeto_destino;
private int id_projeto_destino;

protected JRadioButton rb_nao_copiar;
protected JRadioButton rb_substituir;

private ButtonGroup  rbs;





	public FormDeClonagemDeProjeto() {
	
	super("Clonagem de Projeto", 600, 350);
	
	adicionarComponentes();
	}

	
	
	
	
	@Override
	public void adicionarComponentes() {
	
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	cons.weighty  = 1;
	cons.weightx = 1;
	cons.insets = new Insets(2, 2, 2, 2);
	JPanel p_0 = new JPanel(new GridBagLayout());
	p_0.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	this.add(p_0, cons);	
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.insets = new Insets(2, 2, 0, 2);
	p_0.add(new JLabel("Projeto Origem (a ser clonado):"), cons);
	
	cons.insets = new Insets(2, 2, 2, 2);
	p_0.add(this.tf_projeto_origem =new CampoLimitado(250), cons);
	this.tf_projeto_origem.setEditable(false);
	
	cons.insets = new Insets(2, 2, 0, 2);
	p_0.add(new JLabel("Projeto Destino:"), cons);
	
	cons.insets = new Insets(2, 2, 2, 2);
	p_0.add(this.tf_projeto_destino =new CampoLimitado(250), cons);
	this.tf_projeto_destino.setEditable(false);
	
	cons.insets = new Insets(20, 2, 20, 2);
	p_0.add(new JSeparator(SwingConstants.HORIZONTAL), cons);
	
	cons.insets = new Insets(2, 2, 2, 2);
	p_0.add(this.rb_nao_copiar =new JRadioButton("Não copiar itens de orçamento ja existentes.", true), cons);
	p_0.add(this.rb_substituir =new JRadioButton("Substituir itens de orçamento ja existentes no destino."), cons);

	this.rbs = new ButtonGroup();
	
	this.rbs.add(rb_nao_copiar);
	this.rbs.add(rb_substituir);
	
	
	cons.fill = GridBagConstraints.NONE;
	cons.anchor = GridBagConstraints.EAST;	
	cons.weighty  = 0;
	cons.weightx= 0;
	JButton bt_salvar  = new JButton("Clonar", new ImageIcon(getClass().getResource("/icons/salvar.png")));
	bt_salvar.setToolTipText("Clona projeto origem para o projeto destino.");
	this.add(bt_salvar, cons);
	
	

	
		bt_salvar.addActionListener( new ActionListener(){
		@Override
		public void actionPerformed( ActionEvent event ){
			    	
			if(acaoPrincipal()){
			
			Mensagens.msgDeSucessoAoSalvar();
			dispose();
			}
		}});
	
	

		
		this.tf_projeto_destino.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
					
		Comuns.removeIndicadoresDeErro(tf_projeto_destino);
			
		bt_salvar.requestFocus();
		
		addProjetoDestino();		
		}});
			
			
			
		this.tf_projeto_origem.addFocusListener( new FocusAdapter(){	
		@Override 
		public void focusGained(FocusEvent e) {
							
		Comuns.removeIndicadoresDeErro(tf_projeto_origem);
			
		bt_salvar.requestFocus();
			
		addProjetoOrigem();			
		}});
		
		
		
	List<JTextField> textFieldList = new ArrayList<JTextField>();
		
	textFieldList.add(this.tf_projeto_origem);
	textFieldList.add(this.tf_projeto_destino);
	
	Comuns.addEventoDeFoco(textFieldList);
	}

	
	
	
	
	
	public boolean validacao(){
		
		
		if(this.id_projeto_origem==0){
		
		Mensagens.msgDeErro("Selecione o projeto origem.");
		Comuns.textFieldErroMode(this.tf_projeto_origem);	
		return false;
		}
		
		
		
		if(this.id_projeto_destino==0){
			
		Mensagens.msgDeErro("Selecione o projeto destino.");
		Comuns.textFieldErroMode(this.tf_projeto_destino);	
		return false;
		}
	
		
		
		if(this.id_projeto_origem==this.id_projeto_destino){
			
		Mensagens.msgDeErro("O projeto origem e destino são iguais.");
		Comuns.textFieldErroMode(this.tf_projeto_destino);	
		return false;
		}
		
	
		
	return true;
	}
	
	
	
	
	
	
	
	
	private void addProjetoOrigem(){
		
	
	Projeto retorno = new Projeto();
			
	FormDeSelecao<Projeto> selectionItemForm = 
					new FormDeSelecao<Projeto>("Adicionar Projeto Origem", retorno, Projeto.class, "proj.status='ATIVO'");
	selectionItemForm.mostrar();
		
		if(retorno != null && retorno.getId_projeto() > 0){
		
		this.tf_projeto_origem.setText(retorno.getCodigo());
		this.id_projeto_origem  = retorno.getId_projeto();
		}
	}
	

	
	
	
	
	
	
	
	private void addProjetoDestino(){
		
	Projeto retorno = new Projeto();
				
	FormDeSelecao<Projeto> selectionItemForm = 
						new FormDeSelecao<Projeto>("Adicionar Projeto Destino", retorno, Projeto.class, "proj.status='ATIVO'");
	selectionItemForm.mostrar();
			
		if(retorno != null && retorno.getId_projeto() > 0){
			
		this.tf_projeto_destino.setText(retorno.getCodigo());
		this.id_projeto_destino  = retorno.getId_projeto();
		}
	}
	
	
	
	
	
	
	

	@Override
	public boolean acaoPrincipal() {
	
		
	if(!this.validacao())
	return false;	
		
	DAO<Projeto> projeto_dao = new DAO<Projeto>(Projeto.class);
	
	Projeto origem = projeto_dao.get(this.id_projeto_origem);
	
		if(origem!=null){
			
			
		Projeto destino = projeto_dao.get(this.id_projeto_destino);
			
			if(destino!=null){
			
			DAO<Etapa> dao_etapa = new DAO<Etapa>(Etapa.class);
			DAO<Subetapa> dao_subetapa = new DAO<Subetapa>(Subetapa.class);
			DAO<ItemDeOrcamento> dao_item = new DAO<ItemDeOrcamento>(ItemDeOrcamento.class);
			
			DAO<Material> dao_material = new DAO<Material>(Material.class);
			DAO<ItemXMaterial> dao_IteXMat = new DAO<ItemXMaterial>(ItemXMaterial.class);
					
			
			DAO<Mao_De_Obra> dao_mao_de_obra = new DAO<Mao_De_Obra>(Mao_De_Obra.class);
			DAO<ItemXMaoDeObra> dao_IteXMaodOb = new DAO<ItemXMaoDeObra>(ItemXMaoDeObra.class);
			
			
			DAO<Equipamento> dao_equipamento = new DAO<Equipamento>(Equipamento.class);
			DAO<ItemXEquipamento> dao_IteXequi = new DAO<ItemXEquipamento>(ItemXEquipamento.class);
			
			
			
			
			List<Etapa> etapas_origem = dao_etapa.get(
					null, "etap.fk_projeto="+origem.getId_projeto(), "etap.ordem ASC");
			
			List<Etapa> etapas_destino = dao_etapa.get(
					null, "etap.fk_projeto="+destino.getId_projeto(), "etap.ordem ASC");
		
			
			
				for(Etapa etapa_origem:etapas_origem){
				
				
				Etapa nova_etapa 	 = null;
					
					for(Etapa etapa_destino:etapas_destino){
					
						if(etapa_origem.getTitulo().compareTo(etapa_destino.getTitulo())==0){
							
						nova_etapa	= etapa_destino;
						break;
						}
					}
				
					if(nova_etapa==null){
						
					nova_etapa = new Etapa();
						
					nova_etapa.setFk_projeto(destino.getId_projeto());		
					nova_etapa.setObjetivo(etapa_origem.getObjetivo());	
					nova_etapa.setObs(etapa_origem.getObs());	
					nova_etapa.setTitulo(etapa_origem.getTitulo());	
					nova_etapa.setStatus(etapa_origem.getTitulo());	
					nova_etapa.setOrdem(etapas_origem.get(etapas_origem.size()-1).getOrdem()+1);
					
					nova_etapa.setId_etapa(dao_etapa.novo(nova_etapa));
						
						if(nova_etapa.getId_etapa()<=0){
						
						Mensagens.msgDeErro("Falha ao gravar novos dados.");
						return false;	
						}
					}
						
					
				List<Subetapa> subetapas_origem = new DAO<Subetapa>(Subetapa.class).get(
						null, "subetap.fk_etapa="+etapa_origem.getId_etapa(), "subetap.ordem ASC");
				
				List<Subetapa> subetapas_destino = new DAO<Subetapa>(Subetapa.class).get(
						null, "subetap.fk_etapa="+nova_etapa.getId_etapa(), "subetap.ordem ASC");
				
				
					for(Subetapa subetapa_origem:subetapas_origem){
					
					Subetapa nova_subetapa 	 = null;
						
						for(Subetapa subetapa_destino:subetapas_destino){
						
							if(subetapa_origem.getTitulo().compareTo(subetapa_destino.getTitulo())==0){
								
							nova_subetapa	= subetapa_destino;
							break;
							}
						}
				
						if(nova_subetapa==null){
							
						nova_subetapa = new Subetapa();
							
						nova_subetapa.setFk_etapa(nova_etapa.getId_etapa());		
						nova_subetapa.setObjetivo(etapa_origem.getObjetivo());	
						nova_subetapa.setObs(etapa_origem.getObs());	
						nova_subetapa.setTitulo(etapa_origem.getTitulo());	
						nova_subetapa.setStatus(etapa_origem.getStatus());	
						nova_subetapa.setOrdem(etapas_origem.get(etapas_origem.size()-1).getOrdem()+1);
						
						nova_subetapa.setId_subetapa(dao_subetapa.novo(nova_subetapa));
							
							if(nova_subetapa.getId_subetapa()<=0){
							
							Mensagens.msgDeErro("Falha ao gravar novos dados.");
							return false;	
							}
						}	
						
							
					List<ItemDeOrcamento> itens_origem = new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).get(
							null, "itns.fk_subetapa="+subetapa_origem.getId_subetapa(), null);
						
					List<ItemDeOrcamento> itens_destino = new DAO<ItemDeOrcamento>(ItemDeOrcamento.class).get(
							null, "itns.fk_subetapa="+nova_subetapa.getId_subetapa(), null);
						
						
						for(ItemDeOrcamento item_origem:itens_origem){
						
						boolean existe = false;
						int id_remocao = 0;
						
							for(ItemDeOrcamento item_destino:itens_destino){
							
								if(item_origem.getCodigo().compareTo(item_destino.getCodigo())==0){
								
								if(this.rb_substituir.isSelected())
								id_remocao = item_destino.getId_item();
								
								existe = true;	
								
								break;
								}
							}
					
							
							if(!existe ||
							   (existe && this.rb_substituir.isSelected()))	{
							
								
							if(id_remocao>0)	
							dao_item.removeSemConfirmacao(id_remocao);
								
							ItemDeOrcamento	novo_item = new ItemDeOrcamento();
							novo_item.setCodigo(item_origem.getCodigo());
							novo_item.setDescricao(item_origem.getDescricao());
							novo_item.setFk_modelo(item_origem.getFk_modelo());
							novo_item.setFk_subetapa(nova_subetapa.getId_subetapa());
							novo_item.setFk_unidade(item_origem.getFk_unidade());
							novo_item.setQuantidade(item_origem.getQuantidade());
							novo_item.setSem_insumos(item_origem.getSem_insumos());
							novo_item.setStatus(item_origem.getStatus());
							novo_item.setValor_total(item_origem.getValor_total());
							novo_item.setValor_unitario(item_origem.getValor_unitario());
								
							novo_item.setId_item(dao_item.novo(novo_item));
									
								if(novo_item.getId_item()<=0){
								
								Mensagens.msgDeErro("Falha ao gravar novos dados.");
								return false;	
								}
							
							
							List<ItemXMaterial> itens_x_materiais = dao_IteXMat.get(null, "ixm.fk_item="+item_origem.getId_item(), null);
								
								for(ItemXMaterial aux: itens_x_materiais){
									
								Material material_novo = dao_material.get(aux.getFk_material()); 	
									
									if(material_novo!=null){
									
									material_novo.setId_material(0);
										
									int id = dao_material.novo(material_novo);
								
									ItemXMaterial	item = new ItemXMaterial();
										
									item.setFk_item(novo_item.getId_item());
									item.setFk_material(id);
									item.setQuantidade(novo_item.getQuantidade());
										
									dao_IteXMat.novo(item);	
									}
								}
							
							
							List<ItemXMaoDeObra> item_x_mao_obra = dao_IteXMaodOb.get(null, "ixmo.fk_item="+item_origem.getId_item(), null);
								
								
								for(ItemXMaoDeObra aux: item_x_mao_obra){
									
								Mao_De_Obra mao_de_obra = dao_mao_de_obra.get(aux.getFk_mao_obra()); 	
									
									if(mao_de_obra!=null){
										
									mao_de_obra.setId_mao_de_obra(0);	
											
									int id = dao_mao_de_obra.novo(mao_de_obra);
								
									ItemXMaoDeObra	item = new ItemXMaoDeObra();
										
									item.setFk_item(novo_item.getId_item());
									item.setFk_mao_obra(id);
									item.setQuantidade(novo_item.getQuantidade());
										
									dao_IteXMaodOb.novo(item);	
									}
								}	
										
								
							List<ItemXEquipamento> item_x_equipamentos = dao_IteXequi.get(null, "ixeq.fk_item="+item_origem.getId_item(), null);
								
								for(ItemXEquipamento aux: item_x_equipamentos){
									
								Equipamento equipamento = dao_equipamento.get(aux.getFk_equipamento()); 	
									
									if(equipamento!=null){
											
									equipamento.setId_equipamento(0);	
										
									int id = dao_equipamento.novo(equipamento);
								
									ItemXEquipamento item = new ItemXEquipamento();
										
									item.setFk_item(novo_item.getId_item());
									item.setFk_equipamento(id);
									item.setQuantidade(novo_item.getQuantidade());
										
									dao_IteXequi.novo(item);	
									}
								}	
							}
						}
	
					}
				}
			}
			else{
			
			Mensagens.msgDeErro("Projeto destino não acessível.");
			return false;	
			}	
		}
		else{
		
		Mensagens.msgDeErro("Projeto origem não acessível.");
		return false;	
		}
	
	return true;
	}
	
	
	
	
	
	
	
	
}

