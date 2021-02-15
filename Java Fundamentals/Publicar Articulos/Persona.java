package examenmodulo2;

public class Persona {
	private String nombre;
	private String apellido;
	private String pseudonimo;

	public Persona(String nombre, String apellido, String pseudonimo) 
		{
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.pseudonimo = pseudonimo;
	}

	public Persona() {
		super();
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

	public String getPseudonimo() {
		return pseudonimo;
	}

	public void setPseudonimo(String pseudonimo) {
		this.pseudonimo = pseudonimo;
	}
	
	@Override
	public String toString() {
	   return this.getNombre() + " - " + this.getPseudonimo();
	}

}
