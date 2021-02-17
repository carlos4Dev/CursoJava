package nivel2;
import nivel1.tipoTraje;
import nivel3.*;


public class HombreDobleBoton implements tipoTraje{

	@Override
	public Botones botones() {
		return new nivel4.Botones.HombreDobleBoton();
	}

	@Override
	public Piezas piezas() {
		return new nivel4.Piezas.HombreDobleBoton();
	}

	@Override
	public Bolsillos bolsillos() {
		return new nivel4.Bolsillos.HombreDobleBoton();
	}

	@Override
	public Hilos hilos() {
		return new nivel4.Hilos.HombreDobleBoton();
	}

	@Override
	public Regalo regalo() {
		
		return  new nivel4.Regalo.HombreDobleBoton();
	}

}
