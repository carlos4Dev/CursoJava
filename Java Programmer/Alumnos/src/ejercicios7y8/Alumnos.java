package ejercicios7y8;

public class Alumnos implements Comparable<Alumnos>{
	int registro;
	String nombre;
	String apellidos;
	String sexo;
	
	public Alumnos(int registro, String nombre, String apellidos, 
			String sexo) {
		super();
		this.registro = registro;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	public int compareTo(Alumnos ob) {
		return nombre.compareTo(ob.getNombre());
	}
	
	public boolean equals(final Object obj) {
		if(obj == null) {
			return false;
		}
		final Alumnos alum = (Alumnos) obj;
		if (this == alum) {
			return true;
		} else {
			return(this.nombre.equals(alum.nombre) && 
					(this.apellidos == alum.apellidos));
		}
	}
	
	@Override
	public String toString() {
		return nombre +" " + apellidos;
	}
	
	
}