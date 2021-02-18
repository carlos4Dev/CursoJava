package ejercicios1_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		List <Persona>listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(new Persona("Pepe", new Direccion("España",
				"Granada", "18300"),111222333));
		listaPersonas.add(new Persona("Luis", new Direccion("España",
				"Granada", "18300"),22233344));
		listaPersonas.add(new Persona("Juan", new Direccion("España",
				"Granada", "18300"),333444555));
		listaPersonas.add(new Persona("Fransua", new Direccion(
				"Francia","Paris", "01234"),444555666));
		listaPersonas.add(new Persona("John", new Direccion("Irlanda",
				"Belfast", "23234"),555666777));
		listaPersonas.add(new Persona("Tonino", new Direccion("Italia",
				"Roma", "02323"),666777888));
	
	System.out.println("Ejercicio 1");
	Optional<Persona> nomBuscado;
	nomBuscado = Persona.getNombre("Fransua",listaPersonas);
	nomBuscado.ifPresentOrElse(System.out::println,
			() -> {
				System.out.println("No se ha encontrado la persona "
						+ "indicada.");
			});	
	
	System.out.println("-------------------------------------------");
	System.out.println("Ejercicio 2");
	Optional<Persona> ciudadBuscada;
	ciudadBuscada = Persona.getCiudad("Granada",listaPersonas);
	ciudadBuscada.map(n -> n.getNombre())
	.ifPresent(System.out::println);
	
	System.out.println("-------------------------------------------");
	System.out.println("Ejercicio 3");
	Optional<Persona> nomBuscado2;
	nomBuscado2 = Persona.getNombre("John", listaPersonas);
	nomBuscado2.map(n -> n.getDireccion())
	.ifPresentOrElse(System.out::println,
			() -> {
				System.out.println("La persona no está en la lista.");
			});	
		
	}

}
