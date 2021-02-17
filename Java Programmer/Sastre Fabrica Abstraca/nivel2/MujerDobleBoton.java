package nivel2;
import nivel1.tipoTraje;
import nivel3.*;

public class MujerDobleBoton implements tipoTraje{

	@Override
	public Botones botones() {
		return new nivel4.Botones.MujerDobleBoton();
	}

	@Override
	public Piezas piezas() {
		return new nivel4.Piezas.MujerDobleBoton();
	}

	@Override
	public Bolsillos bolsillos() {
		return new nivel4.Bolsillos.MujerDobleBoton();
	}

	@Override
	public Hilos hilos() {
		return new nivel4.Hilos.MujerDobleBoton();
	}

	@Override
	public Regalo regalo() {
		
		return  new nivel4.Regalo.MujerDobleBoton();
	}

}