package examenTema11;

import javax.script.*;

/* Implemente el cálculo del área de un cuadrado, rectángulo y 
 * triangulo utilizando javascript interno(texto solo en cadenas)*/

public class Ejercicio8 {

	public static void main(String[] args) throws Exception {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		System.out.println();
		
		engine.eval("print('Iniciando la interfaz ScriptEngine')");
		
		System.out.println("El área de un cuadrado de 20 centimetros"
				+ " de lado es: " +	engine.eval("20*20"));
		
		System.out.println("El área de un rectángulo de 20 centimetros"
				+ " de base y 10 centimetros de altura es: " 
				+	engine.eval("20*10"));
		
		System.out.println("El área de un triángulo de 10 centimetros"
				+ " de base y 15 centimetros de altura es: " 
				+ engine.eval("10*15/2"));

	}

}
