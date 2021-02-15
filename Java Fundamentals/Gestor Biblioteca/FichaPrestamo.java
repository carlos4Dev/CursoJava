package ejercicios;

public class FichaPrestamo {
	// Atributos
	int idFicha;
	int idSocio;
	int idLibro;
	String fechaPrestamo;
	String fechaDevolucion;
	// Constructor
	public FichaPrestamo() {
		
	}
	
	public FichaPrestamo(int idFicha, int idSocio, int idLibro, 
			String fechaPrestamo, String fechaDevolucion) {
		this.idFicha = idFicha;
		this.idSocio = idSocio;
		this.idLibro = idLibro;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	@Override
	public String toString() {
		return "Código de ficha: " + idFicha + " // Código de socio: " 
				+ idSocio + " // Código del libro: "+ idLibro + 
				"\nFecha de préstamo: " + fechaPrestamo +
				" // Fecha de devolución: " + fechaDevolucion + "\n";
	}
	
	public int getFicha() {
		return idFicha;
	}
	
	public void setFicha(int idFicha) {
		this.idFicha = idFicha;
	}
	
	public int getSocio() {
		return idSocio;
	}
	
	public void setSocio(int idSocio) {
		this.idSocio = idSocio;
	}
	
	public int getLibro() {
		return idLibro;
	}
	
	public void setLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	
	public String getFechaPrestamo() {
		return fechaPrestamo;
	}
	
	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}
	
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
}
