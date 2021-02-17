package ejercicio5;

public class Adulto extends Persona implements IPersona {

	
	
	public Adulto(String nombre, String apellido, int numeroDeNit) {
		super(nombre, apellido, numeroDeNit);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return nombre + " " + apellido + " -> Nit= " + numeroDeNit;
	}


	@Override
	public String nombrePersonaEnCaja() {
		return null;
	}

	@Override
	public String apellidoPersonaEnCaja() {
		return null;
	}

	@Override
	public int numeroDeNit() {
		return 00000000;
	}

}
