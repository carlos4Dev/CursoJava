package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnos {
	public static List<Alumno> getAlum() {
		Alumno a1 = new Alumno (1, "Pepe");
		Alumno a2 = new Alumno (2, "Paco");
		Alumno a3 = new Alumno (3, "Luis");
		Alumno a4 = new Alumno (4, "Toni");
		Alumno a5 = new Alumno (5, "Lola");
		Alumno a6 = new Alumno (6, "Juan");
		Alumno a7 = new Alumno (7, "Ana");
		Alumno a8 = new Alumno (8, "José");
		Alumno a9 = new Alumno (9, "Lulú");
		
		List<Alumno> alum = new ArrayList<>();
		alum.add(a1);
		alum.add(a2);
		alum.add(a3);
		alum.add(a4);
		alum.add(a5);
		alum.add(a6);
		alum.add(a7);
		alum.add(a8);
		alum.add(a9);
		
		return alum;
	}
}
