package ejercicio9;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class EjercicioNueveMain {
	private static final long tiempo_inscripcion_por_internet = 5000;
	private static final long maxAInscribirse = 7;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inscribiendo alumnos ------->>>>>>>");
		
		SubmissionPublisher<Alumno> materia1 = new SubmissionPublisher<>();
		
		InscripcionSuscriber subsMat1 = 
				new InscripcionSuscriber(tiempo_inscripcion_por_internet,
						maxAInscribirse);
		
		materia1.subscribe(subsMat1);
		
		List<Alumno> alum = ListaAlumnos.getAlum();
		
		System.out.println("Inscribiendo los alumnos en la Materia 1");
		alum.stream().forEach(i -> materia1.submit(i));
		
		while (alum.size() <= maxAInscribirse) {
			Thread.sleep(2000);
		}
		
		materia1.close();
	}

}
