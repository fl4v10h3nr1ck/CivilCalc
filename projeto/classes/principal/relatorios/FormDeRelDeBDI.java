package principal.relatorios;

import comuns.FabricaDeRelatorios;

public class FormDeRelDeBDI extends FormDeRelBase{


	
private static final long serialVersionUID = 1L;



	public FormDeRelDeBDI() {
	
	super("Relatório de BDI");
	}





	@Override
	public boolean setRelatorio() {
		
	FabricaDeRelatorios fabrica = new FabricaDeRelatorios(this.assinatura.isSelected(), this.id_projeto);
		
	return fabrica.relatorioDeBDI();
	}
	
	
	
}
