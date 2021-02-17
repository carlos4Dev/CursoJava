package nivel2;
import nivel1.tipoTraje;
import nivel3.*;


public class HombreSencillo implements tipoTraje{

	@Override
	public Botones botones() {
		return new nivel4.Botones.HombreSencillo();
	}

	@Override
	public Piezas piezas() {
		return new nivel4.Piezas.HombreSencillo();
	}

	@Override
	public Bolsillos bolsillos() {
		return new nivel4.Bolsillos.HombreSencillo();
	}

	@Override
	public Hilos hilos() {
		return new nivel4.Hilos.HombreSencillo();
	}

	@Override
	public Regalo regalo() {
		
		return  new nivel4.Regalo.HombreSencillo();
	}

}
