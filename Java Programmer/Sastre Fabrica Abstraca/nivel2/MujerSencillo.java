package nivel2;
import nivel1.tipoTraje;
import nivel3.*;


public class MujerSencillo implements tipoTraje{

	@Override
	public  Botones botones() {
		return new nivel4.Botones.MujerSencillo();
	}

	@Override
	public Piezas piezas() {
		return new nivel4.Piezas.MujerSencillo();
	}

	@Override
	public Bolsillos bolsillos() {
		return new nivel4.Bolsillos.MujerSencillo();
	}

	@Override
	public Hilos hilos() {
		return new nivel4.Hilos.MujerSencillo();
	}

	@Override
	public Regalo regalo() {
		
		return  new nivel4.Regalo.MujerSencillo();
	}

}
