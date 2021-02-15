package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_10 {
	// Declaración de variables globales
	static ArrayList<Persona> listaDePersonas = 
			new ArrayList<Persona>();
	static ArrayList<Libro>listaDeLibros = new ArrayList<Libro>();
	static ArrayList<FichaPrestamo>prestamoDeLibros = 
			new ArrayList <FichaPrestamo>();
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variables locales
		boolean salir = false;  // Controla la salida del menú.
		int opcion;
		// Mientras salir no sea true se mostrará el menú.	
		while (!salir) {
			System.out.println("1.-Insertar persona");
			System.out.println("2.-Insertar Libro");
			System.out.println("3.-Prestar Libro");
			System.out.println("4.-Mostrar lista de personas "
					+ "registradas");
			System.out.println("5.-Mostrar lista de libros "
					+ "registrados");
			System.out.println("6.-Mostrar lista de personas que "
					+ "tiene al menos un libro de la biblioteca");
			System.out.println("7.-Mostrar lista de ficha de "
					+ "préstamos");
			System.out.println("8.-Mostrar libros prestados a una "
					+ "persona: insertar código de persona");
			System.out.println("9.-Mostrar datos de fichas de "
					+ "préstamo: insertar código de ficha");
			System.out.println("10.-Salir");
			
			System.out.println("Elija una opción: ");
			opcion = entrada.nextInt();
			// Recogemos el valor introducido por el usuario
			entrada.nextLine(); 
			
			switch (opcion) {
			// Llamamos al método que elija el usuario
			case 1:					
				insertarPersona();
				break;
			case 2:
				insertarLibro();
				break;
			case 3:
				prestarLibro();
				break;
			case 4:	
				listarSocios();
				break;
			case 5:
				listarLibros();
				break;
			case 6:
				mostrarListaPersonas();
				break;
			case 7:
				listarPrestamos();
				break;
			case 8:
				mostrarLibrosPrestadosPorPersona();
				break;
			case 9:
				mostrarFichaPrestamo();
				break;
			case 10:
				salir = true;
				// Cambia el estado de la variable boleana 
				// y se sale del menú.
				System.out.println("Tareas finalizadas.");
				break;
			default:
				System.out.println("Sólo números del 1 al 10.");
			}
			
		}		

	}

	// Método para añadir un nuevo socio
	public static void insertarPersona() { 
		
		System.out.println("Escriba el nombre del socio: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Escriba el apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.println("Escriba la dirección: ");
		String direccion = entrada.nextLine();
		
		System.out.println("Escriba el número de teléfono: ");
		int telefono = entrada.nextInt();
		
		System.out.println("Escriba el número de Identificación: ");
		int numeroId = entrada.nextInt();
		
		System.out.println("\n");
		// Los datos introducidos son añadidos a un nuevo socio
		Persona socio = new Persona(nombre, apellido, direccion, 
				telefono, numeroId);
		// El socio se añade al ArrayList listaDePersonas
		listaDePersonas.add(socio); 
		
	}
	
	// Método para añadir un nuevo libro.
	public static void insertarLibro() { 
		
		System.out.println("Introduzca el nombre del libro: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Introduzca el código del libro: ");
		int codigo = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca el nombre del autor: ");
		String autor = entrada.nextLine();
				
		System.out.println("Introduzca el genero: ");
		String genero = entrada.nextLine();
		
		System.out.println("Introduzca el número de páginas: ");
		int paginas = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca el estado "
				+ "(prestado/disponible: )");
		String estado = entrada.nextLine();
		
		if (estado.equals("prestado")) {
			System.out.println("Introduzca un código de libro "
					+ "diferente.");	
		}
		// Los datos introducidos son añadidos a un nuevo ejemplar
		Libro ejemplar = new Libro(nombre, codigo, autor, genero, 
				paginas, estado);
		// El nuevo ejemplar se añada al ArrayList listaDeLibros
		listaDeLibros.add(ejemplar);
		
		System.out.println("\n");
	}
	
	// Método para añadir un nuevo préstamo de libro
	public static void prestarLibro() { 
		
		System.out.println("Introduzca el código de ficha: ");
		int idFicha = entrada.nextInt();
		
		System.out.println("Introduzca el código de usuario: ");
		int idSocio = entrada.nextInt();
		
		System.out.println("Introduzca el código del libro: ");
		int idLibro = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca la fecha de préstamo: ");
		String fechaPrestamo = entrada.nextLine();
		
		System.out.println("Introduzca la fecha de devolución: ");
		String fechaDevolucion = entrada.nextLine();
		
		// Los datos introducidos son añadidos a un nuevo prestamo
		FichaPrestamo prestamo = new FichaPrestamo(idFicha, idSocio, 
				idLibro, fechaPrestamo, fechaDevolucion);
		// El nuevo prestamo se añade a la lista prestamoDeLibros
		prestamoDeLibros.add(prestamo);
		
		System.out.println("\n");
		
		System.out.println("");
	}
	
	public static void listarSocios() {
		System.out.println("Listado de socios : " );
		System.out.println("*******************");
		
		for (int i=0; i < listaDePersonas.size();i++) { 
			System.out.println(listaDePersonas.get(i).toString()); 
		}
		System.out.println("*******************");
	}
	
	public static void listarLibros() {
		System.out.println("Listado de libros registrados: ");
		System.out.println("******************************");
		for (int i=0; i <listaDeLibros.size();i++) { 
			System.out.println(listaDeLibros.get(i).toString()); 
		}
		System.out.println("******************************");
	}
	
	public static void mostrarListaPersonas() {
		for (int i =0; i <prestamoDeLibros.size();i++) { 
			FichaPrestamo copia = prestamoDeLibros.get(i); 
			int socio = copia.getSocio(); 
			
		for (int j = 0; j <listaDePersonas.size();j++) { 
			Persona copia2 = listaDePersonas.get(j); 
			int numeroSocio = copia2.getNumeroId(); 
			if (socio == numeroSocio) { 
				System.out.println(listaDePersonas.get(j).toString());
				
			}
		}
			
		}
	}
	
	public static void listarPrestamos() {
		System.out.println("Listado de libros prestados: ");
		System.out.println("****************************");
		for (int i =0; i <prestamoDeLibros.size();i++) { 
			System.out.println(prestamoDeLibros.get(i).toString()); 
		}
		
		System.out.println("****************************");
	}
	
	public static void mostrarLibrosPrestadosPorPersona() {
		System.out.println("Introduzca el código de usuario: ");
		int usuarioSolicitado = entrada.nextInt();
		
		for (int i = 0; i <prestamoDeLibros.size(); i++) { 
			FichaPrestamo copia = prestamoDeLibros.get(i); 
			int socio = copia.getSocio(); 
			if (socio == usuarioSolicitado) { 
				int numLibro = copia.getLibro(); 
			
				for (int j = 0; j < listaDeLibros.size(); j++) { 
					Libro copia2 = listaDeLibros.get(j); 
				
					int idLibro = copia2.getCodigo(); 
					if (idLibro == numLibro) {  
						System.out.println(listaDeLibros.get(j)
								.toString());  
				}
			}
			
			}
		}
	}
	
	public static void mostrarFichaPrestamo() {
		System.out.println("Introduzca el código de ficha: ");
		int fichaSolicitada = entrada.nextInt();
		
		for (int i = 0; i < prestamoDeLibros.size(); i++) { 
			FichaPrestamo copia = prestamoDeLibros.get(i); 
			int ficha = copia.getFicha(); 
			if (ficha == fichaSolicitada) {   
				System.out.println(prestamoDeLibros.get(i)); 
			}
		}
	}
	
}
