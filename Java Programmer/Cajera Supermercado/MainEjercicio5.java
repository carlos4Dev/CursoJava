package ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainEjercicio5 {

	public static void main(String[] args) {
		Persona adulto = new Adulto("Pepito","Grillo",12121212);
		Persona joven = new Joven("Juanito","Pulgarcito",34455454);
		Persona mujerEmbarazada = new MujerEmbarazada("Lucía","García",68686868);
		Persona personaMayor = new PersonaMayor("Simón","Elvivo",95959595);
		
		Queue <Persona> listaClientes = new LinkedList<>();
		
		listaClientes.add(adulto);
		listaClientes.add(joven);
		listaClientes.add(mujerEmbarazada);
		listaClientes.add(personaMayor);
		
		System.out.println("Número clientes en cola: " + listaClientes.size());
		
		Iterator <Persona> clientes = listaClientes.iterator();
		while(clientes.hasNext()) {
			System.out.println(clientes.next());	
		}
		
		System.out.println("----------------------------------------------");
		System.out.print("Próximo cliente: -> ");
		if (listaClientes.peek()==null) {
			System.out.println("No hay personas en la cola");
		} else {
			System.out.println(listaClientes.peek());
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Se eliminará el cliente joven, Juanito.");
		listaClientes.remove(joven);
		
		System.out.println("Número de clientes en cola: " + listaClientes.size());
		Iterator <Persona> clientes2 = listaClientes.iterator();
		while(clientes2.hasNext()) {
			System.out.println(clientes2.next());	
		}
		
		System.out.println("----------------------------------------------");
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto("Patatas",1,20));
		productos.add(new Producto("Huevos",2,10));
		productos.add(new Producto("Jamón",3,50));
		productos.add(new Producto("Tomates",4,30));
		Iterator<Producto> itProducto = productos.iterator();
		while(itProducto.hasNext()) {
			System.out.println(itProducto.next());
		}
		
		System.out.println("Nueva factura: ");
		System.out.println("///****************************************///");
		Cajera caja1 = new Cajera("Maria","Valverde",121244);
		
		caja1.imprimirFactura();
	}

}
