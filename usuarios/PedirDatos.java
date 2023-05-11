package usuarios;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.Pokedex;
import control.Pokemon;

public class PedirDatos {

	/**
	 * El metodo addPokemon interactua con el usuario para que este introduzca los
	 * datos del pokemon que quiere agregar a la base de datos
	 * 
	 * @author Jorge Pizarro
	 * @param nombre    Nombre del pokemon que se almacena en la base de datos
	 * @param numero    Numero en la pokedex del pokemon que se almacena en la base
	 *                  de datos
	 * @param tipo      Tipo del pokemon que se almacena en la base de datos
	 * @param habilidad Habilidad del pokemon que se almacena en la base de datos
	 * @return Un nuevo objeto de la clase pokemon
	 * @version 1.2
	 */

	public static Pokemon addPokemon(String nombre, int numero, String tipo, String habilidad) {

		try {

			Scanner lector = new Scanner(System.in);
			System.out.println("Nombre del Pokemon: ");
			nombre = lector.nextLine();

			try {

				System.out.println("Número: ");
				numero = lector.nextInt();
				lector.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("Error. Debe introducir un número para el apartado NÚMERO");
			}

			System.out.println("Tipo: ");
			tipo = lector.nextLine();

			System.out.println("Habilidad: ");
			habilidad = lector.nextLine();

		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
		}

		return new Pokemon(nombre, numero, tipo, habilidad);
	}

	/**
	 * El metodo modificarDatosPokemon interactua con el usuario para que este
	 * introduzca los datos que servirán para actualizar la entrada de la
	 * base de datos que seleccione el usuario
	 * 
	 * @author Jorge Pizarro
	 * @param nombre    Nombre del pokemon que se almacena en la base de datos
	 * @param numero    Numero en la pokedex del pokemon que se almacena en la base
	 *                  de datos
	 * @param tipo      Tipo del pokemon que se almacena en la base de datos
	 * @param habilidad Habilidad del pokemon que se almacena en la base de datos
	 * @return Un nuevo objeto de la clase pokemon
	 * @version 1.2
	 */

	public static Pokemon modificarDatosPokemon(String nombre, int numero, String tipo, String habilidad) {

		try {

			Scanner lector = new Scanner(System.in);
			System.out.println("Nombre del nuevo Pokemon: ");
			nombre = lector.nextLine();

			try {

				System.out.println("Número del nuevo Pokemon: ");
				numero = lector.nextInt();
				lector.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("Error. Debe introducir un número para el apartado NÚMERO");
			}

			System.out.println("Tipo del nuevo Pokemon: ");
			tipo = lector.nextLine();

			System.out.println("Habilidad del nuevo Pokemon: ");
			habilidad = lector.nextLine();

		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
		}

		return new Pokemon(nombre, numero, tipo, habilidad);
	}

}
