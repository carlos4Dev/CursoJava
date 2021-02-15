package ejercicios;

public class Libro {
	// Atributos
	private String nombre;
	private int codigo;
	private String autor;
	private String genero;
	private int paginas;
	private String estado;
	// Constructor
	public Libro() {
		
	}
	
	public Libro(String nombre, int codigo, String autor, 
			String genero, int paginas, String estado) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+ nombre + " // Código: "+ codigo + 
				"\nAutor: " + autor + " // Genero: " + genero + 
				"\nPáginas: " + paginas + " // Estado: " + estado +
				"\n";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
