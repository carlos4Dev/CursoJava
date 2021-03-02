package examenTema11;

public class Producto {
	private int codigo;
	private String nombre;
	private int precio;
	private int cantidad;
	
	public Producto(int codigo, String nombre, int precio, int cantidad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return codigo + " -> " + nombre + " -> precio = " + precio + 
				" -> cantidad = " + cantidad;
	}
	
	
}
