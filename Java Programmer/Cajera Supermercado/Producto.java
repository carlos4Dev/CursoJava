package ejercicio5;

public class Producto {
	String nombreProducto;
	int codigoProducto;
	int precio;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public Producto(String nombreProducto, int codigoProducto, 
			int precio) {
		super();
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.precio = precio;
	}
	

	@Override
	public String toString() {
		return nombreProducto + " -> Código=" + codigoProducto + 
				" -> " + precio;
	}
	
	
}
