package ejercicios7y8;

public class Curso {
	int codigo;
	String nombre;
	
	public Curso(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + " --->>> " + nombre;
	}
	
	
	
	

}
