package examenmodulo2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio_01 {
	static Map<Persona, Set<Articulo>> publicaciones = 
			new HashMap<Persona, Set<Articulo>>();

	static void mostrarArticulos() {
		for (Map.Entry<Persona, Set<Articulo>> entry : 
				publicaciones.entrySet()) {
			Persona p = entry.getKey();
			Set<Articulo> articulos = entry.getValue();
			for (Articulo articulo : articulos) {
				System.out.println("\nAutor: "+ p.getPseudonimo());
				System.out.println("--------------------------------------------------------");
				System.out.println("Titulo: "+ articulo.getTitulo());
				System.out.println("--------------------------------------------------------");
				articulo.mostrarCuerpoConToken();
				System.out.println("--------------------------------------------------------\n");
			}
		}
	}

	public static void main(String[] args) {

		//El siguiente ejemplo es para una persona y muchos articulos
		Articulo a = new Articulo("Tecnologia 5G",
				"La tecnologia 5G es realmente rapida.La transferencia de datos ahora será realizado en cuestión de segundos.Se prevee que sea desplegado a inicios del 2021.");
		Articulo b = new Articulo("Tecnologia 4G",
				"La tecnologia 5G es realmente rapida.La transferencia de datos ahora será realizado en cuestión de segundos.Se prevee que sea desplegado a inicios del 2011.");
		Articulo c = new Articulo("Tecnologia 3G",
				"La tecnologia 5G es realmente rapida.La transferencia de datos ahora será realizado en cuestión de segundos.Se prevee que sea desplegado a inicios del 2001.");
		Articulo d = new Articulo("Tecnologia 2G",
				"La tecnologia 5G es realmente rapida.La transferencia de datos ahora será realizado en cuestión de segundos.Se prevee que sea desplegado a inicios de 1990.");
		// a.mostrarArticulo();
		Persona p1 = new Persona("Arturo", "Aragon", "Aragon2020");
		Set<Articulo> articulos1 = new LinkedHashSet<Articulo>();
		articulos1.add(a);
		articulos1.add(b);
		articulos1.add(c);
		articulos1.add(d);

		publicaciones.put(p1, articulos1);
		mostrarArticulos();
	}

}
