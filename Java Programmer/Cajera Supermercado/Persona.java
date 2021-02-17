package ejercicio5;

public class Persona {
	String nombre;
	String apellido;
	int numeroDeNit;
	
	public Persona(String nombre, String apellido, int numeroDeNit) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDeNit = numeroDeNit;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNumeroDeNit() {
		return numeroDeNit;
	}


	public void setNumeroDeNit(int numeroDeNit) {
		this.numeroDeNit = numeroDeNit;
	}
	
}
