package ejercicio9;

public class Alumno {
	private int idRegistro;
	private String nombre;
	
	public int getIdRegistro() {
		return idRegistro;
	}
	
	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Alumno(int idRegistro, String nombre) {
		this.idRegistro = idRegistro;
		this.nombre = nombre;
	}
	
	public Alumno() {
		
	}
	
	public String toString() {
		return "[Número registro= " + idRegistro + " -> Nombre: " 
				+ nombre + "]";
	}
}
