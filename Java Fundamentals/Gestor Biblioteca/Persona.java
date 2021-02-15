package ejercicios;

public class Persona {
	// Atributos
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	private int numeroId;	
	// Constructor
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String direccion, 
			int telefono, int numeroId) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.numeroId = numeroId;
	}
	
	@Override
	public String toString() {
		return "Socio: "+ nombre + " "+ apellido + " // Dirección: "
				+ direccion + "\nTeléfono: " + telefono + 
				" // Número Id: " + numeroId + "\n";
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
		
	public String getDireccion() {
		return direccion;
	}
		
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		
	public int getTelefono() {
		return telefono;
	}
		
	public void setTelefono (int telefono) {
		this.telefono = telefono;
	}
		
	public int getNumeroId() {
		return numeroId;		
	}
		
	public void setNumeroId (int numeroId) {
		this.numeroId = numeroId;
	}

}
