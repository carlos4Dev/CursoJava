package ejercicio9;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class InscripcionSuscriber implements Subscriber<Alumno>{
	private Subscription subscription;
	private int counter = 0;
	private long tiempo_inscripcion_por_internet;
	private long maxAInscribirse;
	
	public long getTiempo_inscripcion_por_internet() {
		return tiempo_inscripcion_por_internet;
	}
	
	public void setTiempo_inscripcion_por_internet(long tiempo_inscripcion_por_internet) {
		this.tiempo_inscripcion_por_internet = tiempo_inscripcion_por_internet;
	}
	
	public long getMaxAInscribirse() {
		return maxAInscribirse;
	}
	
	public void setMaxAInscribirse (long maxAInscribirse) {
		this.maxAInscribirse = maxAInscribirse;
	}
	
	public InscripcionSuscriber(long tiempo_inscripcion_por_internet, long maxAInscribirse) {
		this.tiempo_inscripcion_por_internet = tiempo_inscripcion_por_internet;
		this.maxAInscribirse = maxAInscribirse;
	}
	
	public InscripcionSuscriber() {
		
	}
	
	@Override
	public void onSubscribe(Subscription subscription) {
		System.out.println("Suscrito a alumnos");
		this.subscription = subscription;
		this.subscription.request(1);
		System.out.println("Requiriendo un alumno");
	}
	@Override
	public void onNext(Alumno item) {
		System.out.println("Alumno inscrito " + item);
		if(counter < maxAInscribirse-1) {
		counter++;
		this.subscription.request(1);
		try {
				Thread.sleep(tiempo_inscripcion_por_internet);
		} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}else {
			System.out.println("Máximo de alumnos inscritos.\n"
					+ "No es posible inscribir más alumnos.");
		}
	}
	@Override
	public void onError(Throwable e) {
		System.out.println("Ocurrió un Error");
		e.printStackTrace();
	}
	@Override
	public void onComplete() {
		System.out.println("Proceso finalizado");
	}
	
	public int getCounter() {
		return counter;
	}

}
