package nivel2;
import nivel1.tipoTraje;
import nivel3.*;


public class MujerBlazer implements tipoTraje{

	@Override
	public Botones botones() {
		return new nivel4.Botones.MujerBlazer();
	}

	@Override
	public Piezas piezas() {
		return new nivel4.Piezas.MujerBlazer();
	}

	@Override
	public Bolsillos bolsillos() {
		return new nivel4.Bolsillos.MujerBlazer();
	}

	@Override
	public Hilos hilos() {
		return new nivel4.Hilos.MujerBlazer();
	}

	@Override
	public Regalo regalo() {
		
		return  new nivel4.Regalo.MujerBlazer();
	}

}
