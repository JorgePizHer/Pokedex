package usuarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Salida {

	
	public static void presentacion(String texto) {

		System.out.println(texto);
		System.out.println("");

	}
	
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
	
	
}
