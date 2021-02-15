package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_10 {
	// Declaraci�n de variables globales
	static ArrayList<Persona> listaDePersonas = 
			new ArrayList<Persona>();
	static ArrayList<Libro>listaDeLibros = new ArrayList<Libro>();
	static ArrayList<FichaPrestamo>prestamoDeLibros = 
			new ArrayList <FichaPrestamo>();
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variables locales
		boolean salir = false;  // Controla la salida del men�.
		int opcion;
		// Mientras salir no sea true se mostrar� el men�.	
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
					+ "pr�stamos");
			System.out.println("8.-Mostrar libros prestados a una "
					+ "persona: insertar c�digo de persona");
			System.out.println("9.-Mostrar datos de fichas de "
					+ "pr�stamo: insertar c�digo de ficha");
			System.out.println("10.-Salir");
			
			System.out.println("Elija una opci�n: ");
			opcion = entrada.nextInt();
			// Recogemos el valor introducido por el usuario
			entrada.nextLine(); 
			
			switch (opcion) {
			// Llamamos al m�todo que elija el usuario
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
				// y se sale del men�.
				System.out.println("Tareas finalizadas.");
				break;
			default:
				System.out.println("S�lo n�meros del 1 al 10.");
			}
			
		}		

	}

	// M�todo para a�adir un nuevo socio
	public static void insertarPersona() { 
		
		System.out.println("Escriba el nombre del socio: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Escriba el apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.println("Escriba la direcci�n: ");
		String direccion = entrada.nextLine();
		
		System.out.println("Escriba el n�mero de tel�fono: ");
		int telefono = entrada.nextInt();
		
		System.out.println("Escriba el n�mero de Identificaci�n: ");
		int numeroId = entrada.nextInt();
		
		System.out.println("\n");
		// Los datos introducidos son a�adidos a un nuevo socio
		Persona socio = new Persona(nombre, apellido, direccion, 
				telefono, numeroId);
		// El socio se a�ade al ArrayList listaDePersonas
		listaDePersonas.add(socio); 
		
	}
	
	// M�todo para a�adir un nuevo libro.
	public static void insertarLibro() { 
		
		System.out.println("Introduzca el nombre del libro: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Introduzca el c�digo del libro: ");
		int codigo = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca el nombre del autor: ");
		String autor = entrada.nextLine();
				
		System.out.println("Introduzca el genero: ");
		String genero = entrada.nextLine();
		
		System.out.println("Introduzca el n�mero de p�ginas: ");
		int paginas = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca el estado "
				+ "(prestado/disponible: )");
		String estado = entrada.nextLine();
		
		if (estado.equals("prestado")) {
			System.out.println("Introduzca un c�digo de libro "
					+ "diferente.");	
		}
		// Los datos introducidos son a�adidos a un nuevo ejemplar
		Libro ejemplar = new Libro(nombre, codigo, autor, genero, 
				paginas, estado);
		// El nuevo ejemplar se a�ada al ArrayList listaDeLibros
		listaDeLibros.add(ejemplar);
		
		System.out.println("\n");
	}
	
	// M�todo para a�adir un nuevo pr�stamo de libro
	public static void prestarLibro() { 
		
		System.out.println("Introduzca el c�digo de ficha: ");
		int idFicha = entrada.nextInt();
		
		System.out.println("Introduzca el c�digo de usuario: ");
		int idSocio = entrada.nextInt();
		
		System.out.println("Introduzca el c�digo del libro: ");
		int idLibro = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Introduzca la fecha de pr�stamo: ");
		String fechaPrestamo = entrada.nextLine();
		
		System.out.println("Introduzca la fecha de devoluci�n: ");
		String fechaDevolucion = entrada.nextLine();
		
		// Los datos introducidos son a�adidos a un nuevo prestamo
		FichaPrestamo prestamo = new FichaPrestamo(idFicha, idSocio, 
				idLibro, fechaPrestamo, fechaDevolucion);
		// El nuevo prestamo se a�ade a la lista prestamoDeLibros
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
		System.out.println("Introduzca el c�digo de usuario: ");
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
		System.out.println("Introduzca el c�digo de ficha: ");
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
