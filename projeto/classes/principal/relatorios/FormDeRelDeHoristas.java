package principal.relatorios;

import comuns.FabricaDeRelatorios;

public class FormDeRelDeHoristas extends FormDeRelBase{


	
private static final long serialVersionUID = 1L;




	public FormDeRelDeHoristas() {
	
	super("Relatório de Encargos Horistas");
	}



	@Override
	public boolean setRelatorio() {
		
	FabricaDeRelatorios fabrica = new FabricaDeRelatorios(this.assinatura.isSelected(), this.id_projeto);
		
	return fabrica.relatorioDeHoristas();
	}
	
	
	
}
