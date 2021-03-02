package examenTema11;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/* Implemente un inventario de productos lácteos utilizando javascript 
 * interno( texto solo en cadena)
 * 
 * Listar todos los productos que hay en el inventario.
 * Obtener la cantidad total de productos del inventario.*/

public class Ejercicio9 {

	public static void main(String[] args) {
		Producto lacteos[] = {
			new Producto(1,"Leche",25,6),
			new Producto(2,"Queso",60,3),
			new Producto(3,"Yogur",20,12),
			new Producto(4,"Flan",40,20)
		};
		 String script1 = "var index; " + "var producto = invLacteos;"
				 + ""+ "for (index in producto) "
				 + "{"+ "print(producto[index]);" + "}";
		 
		 
		 
		 ScriptEngineManager engineManager = new ScriptEngineManager();
		 ScriptEngine engine = engineManager.getEngineByExtension("js");
		 
		 engine.put("invLacteos", lacteos);
		 
		 int cantidad = 0;
		 for(Producto objeto : lacteos) {
			 cantidad += objeto.getCantidad();
		 }
		 
		 try {
			 engine.eval(script1);
			 System.out.println("\nEl total de productos en el "
			 		+ "inventario es " + cantidad);
		 
		 } catch(ScriptException exception) {
			 exception.printStackTrace();
		 }
		

	}

}
