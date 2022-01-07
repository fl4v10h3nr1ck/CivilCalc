package componentes.janelas;


import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;

import comuns.Preferencias;




public abstract class Dialogo extends JDialog implements Windows{

	
private static final long serialVersionUID = 1L;




	public Dialogo( String title, int width, int height){
	
	super();
	
	this.setTitle(title);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setSize(width , height);
	this.setLocationRelativeTo(null);
	this.setLayout(new GridBagLayout());
	this.setModal(true);
	this.getContentPane().setBackground(Preferencias.COR_DE_FUNDO_FRAME);  

	try {setIconImage(ImageIO.read(getClass().getResource("/icons/favicon.png")));} catch (IOException e) {e.printStackTrace();} 
	
	}

	
	
	
	
	public abstract void adicionarComponentes();
	
	
	
	


	@Override
	public void mostrar() {
	
	this.addOuvinte(this);			
	
	this.setVisible(true);
	}



	
	@Override
	public void esconder() {
		
	this.setVisible(false);
	}
	
	
	
	
	private void addOuvinte(Container container) {  
		
	for (Component c : container.getComponents())       
	addOuvinte((Container)c); 
		
	container.addKeyListener(new OuvinteTecladoDialogos(this));
	} 

	
	
	
	
	public abstract boolean acaoPrincipal();
	
	
	
	
	
	
	
	
}
