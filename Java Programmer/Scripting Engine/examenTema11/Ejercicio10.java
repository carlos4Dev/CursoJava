package examenTema11;

import java.io.FileReader;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


/* Implemente un inventario de productos lácteos utilizando archivos
 * externos javascript.
 * 
 * Listar todos los productos que hay en el inventario.
 * Obtener el costo total del inventario de lácteos.
 * Obtener la cantidad total de productos del inventario.*/

public class Ejercicio10 {
	private ScriptEngineManager m;
	private ScriptEngine e;
	private Invocable invocador;
	
	public Ejercicio10() {
		m = new ScriptEngineManager();
		e = m.getEngineByName("nashorn");
		invocador = (Invocable)e;
	}

	public void Ejer10() throws Exception{
		e.eval(new FileReader("C:\\Users\\Carlos\\eclipse-workspace\\"
				+ "javaProgrammer2\\src\\examenTema11\\claseProducto.js"));
		e.eval("var producto1 = new producto(1,'Leche',25,6);");
		e.eval("var producto2 = new producto(2,'Queso',60,3);");
		e.eval("var producto3 = new producto(3,'Yogur',20,12);");
		e.eval("var producto4 = new producto(4,'Flan',40,20);");
		
		Object lacteos1 = e.get("producto1");
		Object lacteos2 = e.get("producto2");
		Object lacteos3 = e.get("producto3");
		Object lacteos4 = e.get("producto4");
		
		String s1 = (String) invocador.invokeMethod(lacteos1, 
				"fullName","");
		System.out.println(s1);
		String s2 = (String) invocador.invokeMethod(lacteos2, 
				"fullName","");
		System.out.println(s2);
		String s3 = (String) invocador.invokeMethod(lacteos3, 
				"fullName","");
		System.out.println(s3);
		String s4 = (String) invocador.invokeMethod(lacteos4, 
				"fullName","");
		System.out.println(s4);
		
		Integer precio1 = (Integer) invocador.invokeMethod(lacteos1, 
				"getPrecio","");
		Integer cantidad1 = (Integer) invocador.invokeMethod(lacteos1, 
				"getCantidad","");
		Integer precio2 = (Integer) invocador.invokeMethod(lacteos2, 
				"getPrecio","");
		Integer cantidad2 = (Integer) invocador.invokeMethod(lacteos2, 
				"getCantidad","");
		Integer precio3 = (Integer) invocador.invokeMethod(lacteos3, 
				"getPrecio","");
		Integer cantidad3 = (Integer) invocador.invokeMethod(lacteos3, 
				"getCantidad","");
		Integer precio4 = (Integer) invocador.invokeMethod(lacteos4, 
				"getPrecio","");
		Integer cantidad4 = (Integer) invocador.invokeMethod(lacteos4, 
				"getCantidad","");
		
		System.out.println("Valor total del inventario = " + 
		((precio1*cantidad1)+(precio2*cantidad2)+(precio3*cantidad3)
				+(precio4*cantidad4)));
		
		System.out.println("Cantidad total de productos = " +
		(cantidad1+cantidad2+cantidad3+cantidad4));
	}
	
	public static void main(String[] args) throws Exception {
		Ejercicio10 app = new Ejercicio10();
		app.Ejer10();

	}

}
