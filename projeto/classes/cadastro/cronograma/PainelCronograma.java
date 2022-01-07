package cadastro.cronograma;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import comuns.Calculo;
import comuns.Comuns;
import beans.Cronograma;
import beans.Etapa;
import beans.Item_De_Cronograma;
import beans.Subetapa;
import dao.DAO;





public class PainelCronograma extends JPanel{


private static final long serialVersionUID = 1L;

	
private int id_projeto;




	public PainelCronograma(){
	
	this.setLayout(new GridBagLayout());	
		
	this.adicionarComponentes();	
	}
	
	
	
	
	
	
	
	public void adicionarComponentes(){
	
	GridBagConstraints cons = new GridBagConstraints();  

	cons.fill = GridBagConstraints.BOTH;
	cons.gridwidth  = GridBagConstraints.REMAINDER;
	cons.weightx  = 1;
	cons.weighty  = 1;
	cons.insets = new Insets( 2, 2, 2, 2);
	JPanel p_1 = new JPanel(new GridBagLayout());
	p_1.setBackground(Color.white);
	this.add(new JScrollPane(p_1), cons);
			
	
		
		if(this.id_projeto<=0){
		
		p_1.add(new JLabel("<< Nenhum Projeto Selecionado >>", SwingConstants.CENTER), cons);
		}	
		else{
		
		int maior_mes = Comuns.getQuantMesesDeDuracaoDeProjeto(this.id_projeto, 6);
			

		cons.fill = GridBagConstraints.HORIZONTAL;
		cons.weightx  = 1;
		cons.weighty  = 0;
		cons.insets = new Insets( 0, 0, 0, 0);
		JLabel rot_titulo = new JLabel("*meses de 30 dias");
		cons.gridwidth  = 2;
		cons.ipady = 5;
		p_1.add(rot_titulo, cons);
		rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		rot_titulo.setBackground(new Color(215, 215,215));
		rot_titulo.setOpaque(true);
		
		
			for(int i = 1; i <= maior_mes; i++){
				
			cons.gridwidth  = 1;
			rot_titulo = new JLabel("<html><b> MÊS "+i+"</b></html>", SwingConstants.CENTER);
			p_1.add(rot_titulo, cons);
			rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
			rot_titulo.setBackground(new Color(215, 215,215));
			rot_titulo.setOpaque(true);
			}
			
			
		cons.gridwidth  = GridBagConstraints.REMAINDER;
		rot_titulo = new JLabel("<html><b>TOTAL</b></html>", SwingConstants.CENTER);
		p_1.add(rot_titulo, cons);
		rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		rot_titulo.setBackground(new Color(215, 215,215));
		rot_titulo.setOpaque(true);	
			
	
		List<Etapa> lista_etapas  = new DAO<Etapa>(Etapa.class).get(
				null, "etap.status='ATIVO' and etap.fk_projeto="+this.id_projeto, null);


		
			for(Etapa etapa: lista_etapas){
	
			
			List<Subetapa> lista_subetapas  = new DAO<Subetapa>(Subetapa.class).get(
					null, "subetap.status='ATIVO' and subetap.fk_etapa="+etapa.getId_etapa(), null);
	
			String valor_etapa = Comuns.getValorTotalEtapa(this.id_projeto, etapa.getId_etapa());
			
			

				if(lista_subetapas.size()>1){
			
				cons.gridwidth  = 2;	
				rot_titulo = new JLabel("<html>&nbsp;&nbsp;"+etapa.getTitulo()+"</html>");
				rot_titulo.setBackground(new Color(44, 46, 67));
				rot_titulo.setForeground(Color.white);
				p_1.add(rot_titulo, cons);
				rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
				rot_titulo.setOpaque(true);	
				
				cons.gridwidth  = 1;	
					for(int i = 1; i <= maior_mes; i++){
						
					rot_titulo = new JLabel(" ");
					p_1.add(rot_titulo, cons);
					rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
					rot_titulo.setBackground(Color.WHITE);
					rot_titulo.setOpaque(true);
					}	
				
				
				cons.gridwidth  = GridBagConstraints.REMAINDER;
				rot_titulo = new JLabel(Calculo.formataValor(valor_etapa), SwingConstants.CENTER);
				p_1.add(rot_titulo, cons);
				rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
				rot_titulo.setBackground(new Color(44, 46, 67));
				rot_titulo.setForeground(Color.white);
				rot_titulo.setOpaque(true);	
				}	
			
			
				for(Subetapa subetapa: lista_subetapas){
						
						
				cons.gridwidth  = 1;		
				cons.fill = GridBagConstraints.NONE;
				cons.weightx  = 0;
				cons.ipady = 8;
				cons.ipadx= 8;
				JButton	bt_altera  = new JButton(new ImageIcon(getClass().getResource("/icons/atualiza.png")));
				bt_altera.setToolTipText("alterar o cronograma desta subetapa.");
				p_1.add(bt_altera, cons);
				bt_altera.setBorder(null);
						
					
					bt_altera.addActionListener( new ActionListener(){
					@Override
					public void actionPerformed( ActionEvent event ){
										    	
					FormDeCronogramaDeSubetapa form = new FormDeCronogramaDeSubetapa(etapa.getTitulo(), subetapa.getId_subetapa());
					form.mostrar();	
							
					atualiza(id_projeto);
					}});
						
							
				cons.fill = GridBagConstraints.HORIZONTAL;
				cons.weightx  = 1;
				cons.ipady = 5;	
				cons.ipadx= 0;
				
					if(lista_subetapas.size()>1){
							
					rot_titulo = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+subetapa.getTitulo()+"</html>");
					rot_titulo.setBackground(new Color(215, 215,215));
					p_1.add(rot_titulo, cons);
					rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
					rot_titulo.setOpaque(true);
					}
					else{
					
					rot_titulo = new JLabel("<html>&nbsp;&nbsp;"+etapa.getTitulo()+"</html>");
					rot_titulo.setBackground(new Color(44, 46, 67));
					rot_titulo.setForeground(Color.white);
					p_1.add(rot_titulo, cons);
					rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
					rot_titulo.setOpaque(true);
					}

				
				
				String valor_subetapa = Comuns.getValorTotalSubEtapa(this.id_projeto, subetapa.getId_subetapa());
				String porcento_subetapa = "0.00";
				
				List<Cronograma> cronogramas  = new DAO<Cronograma>(Cronograma.class).get(
								null, "cron.tipo='SUBETAPA' and cron.fk_subetapa="+subetapa.getId_subetapa(), null);
						
						
					if(cronogramas==null || cronogramas.size()==0){
					
						for(int i = 1; i <= maior_mes; i++){
								
						rot_titulo = new JLabel(" ");
						p_1.add(rot_titulo, cons);
						rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
						rot_titulo.setBackground(Color.WHITE);
						rot_titulo.setOpaque(true);
						}	
					}	
					else{
				

					List<Item_De_Cronograma> itens  = new DAO<Item_De_Cronograma>(Item_De_Cronograma.class).get(
								null, "i_cron.fk_cronograma="+cronogramas.get(0).getId_cronograma(), null);
								
								
						for(int i = 1; i <= maior_mes; i++){
							
						boolean vazio = true;	
							
							if(itens!=null && itens.size()>0){
								
								for(Item_De_Cronograma item: itens){
										
									if(item.getMes() == i){
												
									porcento_subetapa = Calculo.soma(porcento_subetapa, item.getValor());
												
									rot_titulo = new JLabel("<html>"+Calculo.formataValor(Calculo.calcPorcentagem(valor_subetapa, item.getValor()))+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.getValor()+"%</html>", SwingConstants.CENTER);
									p_1.add(rot_titulo, cons);
									rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));	
									rot_titulo.setBackground(Color.green);	
									rot_titulo.setOpaque(true);	
												
									vazio = false;
									break;
									}
								}			
							}
							
							
							if(vazio){
										
							rot_titulo = new JLabel(" ");
							p_1.add(rot_titulo, cons);
							rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
							rot_titulo.setBackground(Color.WHITE);
							rot_titulo.setOpaque(true);
							}	
						}
					}
				
				
	
					if(lista_subetapas.size()>1){	
					
					rot_titulo = new JLabel("<html>"+Calculo.formataValor(valor_subetapa)+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+porcento_subetapa+"%</html>", SwingConstants.CENTER);
					rot_titulo.setBackground(new Color(215, 215,215));
					}
					else{
						
					rot_titulo = new JLabel(Calculo.formataValor(valor_etapa), SwingConstants.CENTER);
					rot_titulo.setBackground(new Color(44, 46, 67));		
					rot_titulo.setForeground(Color.white);
					}
					
				rot_titulo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
				rot_titulo.setOpaque(true);	
				cons.gridwidth  = GridBagConstraints.REMAINDER;	
				
				p_1.add(rot_titulo, cons);
				}		
			}	
		}
	}
	
	
	
	
	
	
	
	public void atualiza(int id_projeto){
		
	this.id_projeto  =id_projeto;
	
	this.removeAll();
	
	this.adicionarComponentes();
	
	this.revalidate();
	
	this.repaint();
	}
	

	
	
}
