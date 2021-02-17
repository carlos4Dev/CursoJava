package ejercicio5;

public class Joven extends Persona implements IPersona {

	public Joven(String nombre, String apellido, int numeroDeNit) {
		super(nombre, apellido, numeroDeNit);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return nombre + " " + apellido + " -> Nit= " + numeroDeNit;
	}

	@Override
	public String nombrePersonaEnCaja() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apellidoPersonaEnCaja() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int numeroDeNit() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
