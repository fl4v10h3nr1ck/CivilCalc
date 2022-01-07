package cadastro;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import beans.Endereco;
import classes.CampoCEP;
import classes.CampoLimitado;
import comuns.Comuns;
import comuns.Mensagens;
import comuns.Preferencias;




public class PainelDeEndereco  extends JPanel{


private static final long serialVersionUID = 1L;


public CampoLimitado tf_logradouro;

public CampoLimitado tf_num;

public CampoLimitado tf_bairro;


public CampoLimitado tf_cidade;

public CampoCEP tf_cep;

public JComboBox<Object> combo_uf;
	

public CampoLimitado tf_complemento;



	public PainelDeEndereco(){

	this(null);
	}


	
	public PainelDeEndereco(String titulo){
		
	this.setLayout(new GridBagLayout());	
	this.setBackground(Preferencias.COR_DE_FUNDO_PANE);
	
	
	if(titulo!=null && titulo.length()>0)
	this.setBorder(BorderFactory.createTitledBorder(titulo));  
		
	
	GridBagConstraints cons = new GridBagConstraints();  
	
	cons.fill = GridBagConstraints.HORIZONTAL;
	cons.weightx = 1;

	
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 2;	
	add(new JLabel("Logradouro:"), cons);
	cons.gridwidth  = 1;	
	add(new JLabel("Número:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	add(new JLabel("Bairro:"), cons);
	

	cons.gridwidth  = 2;
	cons.insets = new Insets(2, 2, 2, 2);
	add(this.tf_logradouro = new CampoLimitado(200), cons);
	
	cons.gridwidth  = 1;
	add(this.tf_num = new CampoLimitado(18), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	add(this.tf_bairro = new CampoLimitado(45), cons);
	
	
	cons.insets = new Insets(2, 2, 0, 2);
	cons.gridwidth  = 1;
	add(new JLabel("Complemento:"), cons);
	add(new JLabel("Cidade:"), cons);
	add(new JLabel("UF:"), cons);
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	add(new JLabel("CEP:"), cons);
	
	cons.gridwidth  = 1;
	cons.insets = new Insets(2, 2, 2, 2);
	add(this.tf_complemento = new CampoLimitado(200), cons);	
	
	add(this.tf_cidade = new CampoLimitado(45), cons);
	
	add(this.combo_uf = new JComboBox<Object>(Comuns.ufs), cons);
	
	cons.gridwidth  = GridBagConstraints.REMAINDER;	
	add(this.tf_cep = new CampoCEP(), cons);
	
	
	List<JTextField> textFieldList = new ArrayList<JTextField>();
	
	textFieldList.add(this.tf_cep);
	
	Comuns.addEventoDeFoco(textFieldList);
	}
	
	
	
	
	
	public boolean validacao(){
	
		if(this.tf_cep.getText().length()>0 && !this.tf_cep.validacao()){
			
		Mensagens.msgDeErro("Informe um CEP válido.");
		Comuns.textFieldErroMode(this.tf_cep);
		return false;	
		}
		
	
	return true;
	}
	
	
	
	

	public void setValores(Endereco endereco){
	
	if(endereco == null)
	return;
	
	this.tf_logradouro.setText(endereco.getLogradouro());
	this.tf_num.setText(endereco.getNum());
	this.tf_cep.setText(endereco.getCep());
	this.tf_cidade.setText(endereco.getCidade());
	this.tf_bairro.setText(endereco.getBairro());
	this.tf_complemento.setText(endereco.getComplemento());
	this.combo_uf.setSelectedItem(endereco.getUf());
	}
	
	
	
	
	
	public Endereco getEndereco(){
		
	Endereco endereco = new Endereco();	
	
	endereco.setLogradouro(this.tf_logradouro.getText());
	endereco.setNum(this.tf_num.getText());
	endereco.setCep(this.tf_cep.getText());
	endereco.setCidade(this.tf_cidade.getText());
	endereco.setPais("Brasil");
	endereco.setBairro(this.tf_bairro.getText());
	endereco.setComplemento(this.tf_complemento.getText());
	endereco.setUf(this.combo_uf.getSelectedItem().toString());
		
	return endereco;
	}
	
	
	
	
	
}



