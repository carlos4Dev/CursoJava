package ejercicios7y8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		Alumnos juan = new Alumnos(11,"Juan","Palomo","Hombre");
		Alumnos pepe = new Alumnos(12,"Pepe","Pipa","Hombre");
		Alumnos ana = new Alumnos(13,"Ana","Katerina","Mujer");
		Alumnos silvia = new Alumnos(14,"Silvia","Silva","Mujer");
		Alumnos luis = new Alumnos(15,"Luis","Listillo","Hombre");
		
		List<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
		listaAlumnos.add(juan);
		listaAlumnos.add(pepe);
		listaAlumnos.add(ana);
		listaAlumnos.add(silvia);
		listaAlumnos.add(luis);
		
		
		Curso java = new Curso(01,"Java");
		Curso oracle = new Curso(02,"Oracle");
		Curso python = new Curso(03,"Python");
		List<Curso> listaCursos = new ArrayList<Curso>();
		listaCursos.add(java);
		listaCursos.add(oracle);
		listaCursos.add(python);
		
		List<Notas> listaNotas = new ArrayList<Notas>();
		listaNotas.add(new Notas(juan, java, 9.80));
		listaNotas.add(new Notas(juan, oracle, 8.10));
		listaNotas.add(new Notas(juan, python, 6.10));
		listaNotas.add(new Notas(pepe, java, 4.50));
		listaNotas.add(new Notas(pepe, oracle, 8.25));
		listaNotas.add(new Notas(pepe, python, 8.25));
		listaNotas.add(new Notas(ana, java, 10.00));
		listaNotas.add(new Notas(ana, oracle, 8.75));
		listaNotas.add(new Notas(ana, python, 8.25));
		listaNotas.add(new Notas(silvia, java, 8.50));
		listaNotas.add(new Notas(silvia, oracle, 6.75));
		listaNotas.add(new Notas(silvia, python, 4.25));
		listaNotas.add(new Notas(luis, java, 5.90));
		listaNotas.add(new Notas(luis, oracle, 5.40));
		listaNotas.add(new Notas(luis, python, 5.20));
		
		System.out.println("Ejercicio 6 --- Ordenar por nombre "
				+ "ascendente ---");
		List<Alumnos> lista1 = listaAlumnos.stream()
				.sorted().collect(Collectors.toList());
		lista1.forEach(a -> System.out.println("Nº Registro: " 
				+ a.registro + " -->> " + a.getNombre() 
				+ " " + a.getApellidos()));
		
		System.out.println("\nEjercicio 7 --- Ordenar por nombre "
				+ "descendente ---");
		lista1 = listaAlumnos.stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.
						toList());
		lista1.forEach(a -> System.out.println("Nº Registro: " 
						+ a.registro + " -->> " + a.getNombre() 
						+ " " + a.getApellidos()));
		
		System.out.println("\nEjercicio 8 --- Promedio notas alumnos"
				+ " ---");
		Map<Alumnos, Double> promedio = listaNotas.stream()
				.collect(Collectors.groupingBy(Notas::getAlumno, 
						Collectors.averagingDouble(Notas::getNota)));
		
		
		System.out.println("Promedio notas " + promedio );
	}

}
