package principal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class PainelDeAcessoRapido extends JPanel{


	
private static final long serialVersionUID = 1L;



	

	
	public PainelDeAcessoRapido(){
		
	this.setLayout(new GridBagLayout());
	this.setBorder(BorderFactory.createTitledBorder("Acesso Rápido"));  	
	
	this.adicionarComponentes();
	}






	private void adicionarComponentes(){
		
	GridBagConstraints cons = new GridBagConstraints();  

	
		
	cons.fill = GridBagConstraints.NONE;
	cons.weighty  = 0;
	cons.gridwidth  = 1;	
	cons.weightx= 0;
	cons.insets = new Insets( 0, 8, 0, 8);		
	

	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx= 1;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	this.add(new JLabel(""), cons);

			
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weighty  = 0;
	cons.weightx= 1;
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	this.add(new JLabel(""), cons);	
	}
	
	

	
	
}
