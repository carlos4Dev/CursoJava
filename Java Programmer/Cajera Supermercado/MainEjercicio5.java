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
		Persona mujerEmbarazada = new MujerEmbarazada("Luc�a","Garc�a",68686868);
		Persona personaMayor = new PersonaMayor("Sim�n","Elvivo",95959595);
		
		Queue <Persona> listaClientes = new LinkedList<>();
		
		listaClientes.add(adulto);
		listaClientes.add(joven);
		listaClientes.add(mujerEmbarazada);
		listaClientes.add(personaMayor);
		
		System.out.println("N�mero clientes en cola: " + listaClientes.size());
		
		Iterator <Persona> clientes = listaClientes.iterator();
		while(clientes.hasNext()) {
			System.out.println(clientes.next());	
		}
		
		System.out.println("----------------------------------------------");
		System.out.print("Pr�ximo cliente: -> ");
		if (listaClientes.peek()==null) {
			System.out.println("No hay personas en la cola");
		} else {
			System.out.println(listaClientes.peek());
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Se eliminar� el cliente joven, Juanito.");
		listaClientes.remove(joven);
		
		System.out.println("N�mero de clientes en cola: " + listaClientes.size());
		Iterator <Persona> clientes2 = listaClientes.iterator();
		while(clientes2.hasNext()) {
			System.out.println(clientes2.next());	
		}
		
		System.out.println("----------------------------------------------");
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto("Patatas",1,20));
		productos.add(new Producto("Huevos",2,10));
		productos.add(new Producto("Jam�n",3,50));
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
