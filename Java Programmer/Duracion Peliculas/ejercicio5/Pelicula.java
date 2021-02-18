package ejercicio5;

public class Pelicula {
	String titulo;
	Genero genero;
	Double duracion;
	String director;
	public Pelicula(String titulo, Genero genero, Double duracion, 
			String director) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.director = director;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return  titulo + " -> " + genero + " -> Duración = " + duracion +
				" -> Director = " + director;
	}
	
	
	
}
