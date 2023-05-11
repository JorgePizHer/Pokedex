package usuarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Salida {

	/**
	 * El metodo presentacion muestra un mensaje de bienvenida al usuario cuando
	 * inicia el programa. Pregunta al usuario que accion quiere realizar.
	 * 
	 * @author Jorge Pizarro
	 * @param texto El mensaje de bienvenida al usuario.
	 * @version 1.2
	 */

	public static void presentacion(String texto) {

		System.out.println(texto);
		System.out.println("");

	}

	/**
	 * El metodo mostrarMenu muestra el menu principal del programa, donde el
	 * usuario puede seleccionar la accion que quiere realizar.
	 * 
	 * @author Jorge Pizarro
	 * @return La opcion del menu seleccionada por el usuario
	 * @version 1.2
	 */

	public static int mostrarMenu() {
		int seleccion = 0;

		try {

			System.out.println("1-Añadir Pokemon a la Pokedex");
			System.out.println("2-Modificar una entrada de la Pokedex");
			System.out.println("3-Buscar un Pokemon");
			System.out.println("4-Eliminar una entrada de la Pokedex");
			System.out.println("5-Salir");
			System.out.println("");

			Scanner lector = new Scanner(System.in);
			seleccion = lector.nextInt();
			lector.nextLine();

		} catch (InputMismatchException e) {

			System.out.println("Comando no válido. Debe introducir un número para seleccionar la acción a realizar ");
		}

		return seleccion;
	}

	/**
	 * El metodo menuBuscar muestra las diferentes opciones que hay a la hora de
	 * buscar una entrada de la base de datos.
	 * 
	 * @author Jorge Pizarro
	 * @return La opcion del menu seleccionada por el usuario
	 * @version 1.2
	 */

	public static int menuBuscar() {

		int seleccion = 0;

		try {

			System.out.println("Seleccione el elemento por el que desea buscar");
			System.out.println("");

			System.out.println("1-Buscar por nombre");
			System.out.println("2-Buscar por número");
			System.out.println("3-Buscar por tipo");
			System.out.println("4-Buscar por habilidad");
			System.out.println("5-Buscar por ID");
			System.out.println("");

			Scanner lector = new Scanner(System.in);
			seleccion = lector.nextInt();
			lector.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("Comando no válido. Debe introducir un número para seleccionar la acción a realizar ");
		}

		return seleccion;
	}

}
