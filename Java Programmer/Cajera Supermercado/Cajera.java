package ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cajera {
	String nombre;
	String apellido;
	int idCajera;
	
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
	public int getIdCajera() {
		return idCajera;
	}
	public void setIdCajera(int idCajera) {
		this.idCajera = idCajera;
	}
	public Cajera(String nombre, String apellido, int idCajera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idCajera = idCajera;
	}
	@Override
	public String toString() {
		return "Cajera:" + nombre + " " + apellido + " // Código Personal= " +
				idCajera;
	}
	/* Me da error tanto en Producto.add como en productos.add
	 * 
	public void AddProducto(String nombre) {
		Producto.add(nombre);
	}
	*/
	/* Aquí también me da error
	public void addCliente(String nombre) {
		listaAdultos.add(nombre);
	}
	*/
	
	public void imprimirFactura() {
		DatosCajera();
		PersonaAtendida();
		MostrarProducto();
	}
	private void DatosCajera() {
		System.out.println("Cajera: " + Cajera.this.getNombre() + " " +
				Cajera.this.getApellido() + " Código personal: " +
				Cajera.this.getIdCajera());		
	}
	
	Queue <Persona> listaClientes = new LinkedList<>();
	
	private void PersonaAtendida() {
		
		System.out.println("Cliente: " + listaClientes.peek());		
	}
	
	
	private void MostrarProducto() {
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto("Patatas",1,20));
		productos.add(new Producto("Huevos",2,10));
		productos.add(new Producto("Jamón",3,50));
		productos.add(new Producto("Tomates",4,30));
		Iterator<Producto> itProducto = productos.iterator();
		while(itProducto.hasNext()) {
			System.out.println(itProducto.next());
		}
		
	}
	
}
