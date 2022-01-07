package principal.relatorios;

import comuns.FabricaDeRelatorios;



public class FormDeRelDeMensalistas extends FormDeRelBase{


	
private static final long serialVersionUID = 1L;



	public FormDeRelDeMensalistas() {
	
	super("Relatório de Encargos Mensalistas");
	}



	@Override
	public boolean setRelatorio() {
		
	FabricaDeRelatorios fabrica = new FabricaDeRelatorios(this.assinatura.isSelected(), this.id_projeto);
		
	return fabrica.relatorioDeMensalistas();
	}


}