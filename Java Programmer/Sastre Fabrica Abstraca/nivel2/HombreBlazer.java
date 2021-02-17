package nivel2;
import nivel1.tipoTraje;
import nivel3.*;


public class HombreBlazer implements tipoTraje{

	@Override
	public Botones botones() {
		return new nivel4.Botones.HombreBlazer();
	}

	@Override
	public Piezas piezas() {
		return new nivel4.Piezas.HombreBlazer();
	}

	@Override
	public Bolsillos bolsillos() {
		return new nivel4.Bolsillos.HombreBlazer();
	}

	@Override
	public Hilos hilos() {
		return new nivel4.Hilos.HombreBlazer();
	}

	@Override
	public Regalo regalo() {
		
		return  new nivel4.Regalo.HombreBlazer();
	}

}
