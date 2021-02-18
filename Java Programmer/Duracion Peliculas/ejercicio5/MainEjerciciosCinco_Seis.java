package ejercicio5;

import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MainEjerciciosCinco_Seis {

	public static void main(String[] args) {
		Pelicula p1 = new Pelicula("Dumbo",Genero.Comedia,1.50,
				"Steven Spielberg");
		Pelicula p2 = new Pelicula("Joker",Genero.Drama,2.50,
				"Pedro Almodovar");
		Pelicula p3 = new Pelicula("Predator",Genero.Terror,2.05,
				"John Smith");
		Pelicula p4 = new Pelicula("Pretty Woman",Genero.Romance,1.45,
				"Bog Geldof");
		Pelicula p5 = new Pelicula("Garfield",Genero.Comedia,1.30,
				"Mickey Mouse");
		Pelicula p6 = new Pelicula("Saw",Genero.Terror,2.10,
				"Little Richard");
		Pelicula p7 = new Pelicula("Psicosis",Genero.Terror,2.30,
				"Alfred Hitckok");
		Pelicula p8 = new Pelicula("Diario de Noah",Genero.Romance,
				1.40,"Jin Carrey");
		Pelicula p9 = new Pelicula("Cenicienta",Genero.Drama,2.20,
				"Tom Hanks");
		Pelicula p10 = new Pelicula("Rambo",Genero.Drama,2.25,
				"Sylvester Stallone");
		
		List<Pelicula> listaDePeliculas = new LinkedList<Pelicula>();
		listaDePeliculas.add(p1);
		listaDePeliculas.add(p2);
		listaDePeliculas.add(p3);
		listaDePeliculas.add(p4);
		listaDePeliculas.add(p5);
		listaDePeliculas.add(p6);
		listaDePeliculas.add(p7);
		listaDePeliculas.add(p8);
		listaDePeliculas.add(p9);
		listaDePeliculas.add(p10);
		
		System.out.println("***************************************");
		System.out.println("Ejercicio 5");
		System.out.println("***************************************");
		
		List<Pelicula> filtro1 = listaDePeliculas.stream()
				.filter(pelicula -> pelicula.getDuracion() > 2.00)
				.limit(5)
				.collect(Collectors.toList());
		
		filtro1.forEach(System.out::println);
		
		System.out.println("***************************************");
		System.out.println("Ejercicio 6");
		System.out.println("***************************************");
		
		System.out.println("Programación imperativa: ----------->>>");
		
		double cantidadPeliculas = 0;
		double duracionTotal = 0;
		
		for(Pelicula p:listaDePeliculas) {
			duracionTotal += p.getDuracion();
			cantidadPeliculas++;
		}
		
		System.out.println("Cantidad de películas: " + 
				cantidadPeliculas + " -> Duración total: " + 
				duracionTotal + " -> Duración media: " +
				(duracionTotal/cantidadPeliculas));
		
		System.out.println("Programación declarativa: ---------->>>");
		
		Long totalPeliculas = listaDePeliculas.stream().count();
		
		Double tiempoTotal = listaDePeliculas.stream()
				.map(p -> p.getDuracion())
				.reduce(0.0, Double::sum);
		
		DoubleSummaryStatistics resultado = listaDePeliculas.stream()
				.mapToDouble(Pelicula::getDuracion)
				.summaryStatistics();
		
		System.out.println("Cantidad de peliculas: " + totalPeliculas + 
				" -> Duración total: " + tiempoTotal + " -> Duracion"
				+ " media: " + resultado.getAverage());
	}

}
