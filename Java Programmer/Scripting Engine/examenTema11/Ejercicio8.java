package examenTema11;

import javax.script.*;

/* Implemente el c�lculo del �rea de un cuadrado, rect�ngulo y 
 * triangulo utilizando javascript interno(texto solo en cadenas)*/

public class Ejercicio8 {

	public static void main(String[] args) throws Exception {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		System.out.println();
		
		engine.eval("print('Iniciando la interfaz ScriptEngine')");
		
		System.out.println("El �rea de un cuadrado de 20 centimetros"
				+ " de lado es: " +	engine.eval("20*20"));
		
		System.out.println("El �rea de un rect�ngulo de 20 centimetros"
				+ " de base y 10 centimetros de altura es: " 
				+	engine.eval("20*10"));
		
		System.out.println("El �rea de un tri�ngulo de 10 centimetros"
				+ " de base y 15 centimetros de altura es: " 
				+ engine.eval("10*15/2"));

	}

}
