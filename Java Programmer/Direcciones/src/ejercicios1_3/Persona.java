package ejercicios1_3;

import java.util.List;
import java.util.Optional;

public class Persona {
	private String nombre;
	private Direccion direccion;
	private int telefono;
	
	public Persona(String nombre, Direccion direccion, int telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}

	static public Optional<Persona> getNombre(String nombre, 
			List<Persona>Lista) {
		for(Persona p:Lista) {
			if(p.getNombre().equalsIgnoreCase(nombre)) {
				return Optional.of(p);
			}
		}
		
		return Optional.empty();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	
	public static Optional<Persona> getCiudad(String ciudad, 
			List<Persona>Lista){
		for(Persona p: Lista) {
			if(p.getDireccion().getCiudad().equalsIgnoreCase(ciudad)) {
				System.out.println(Optional.of(p));
			}
		}
		return Optional.empty();
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Nombre= " + nombre;// + ", Direccion= " + direccion + 
				//", telefono= " + telefono;
	}
	
	
}
