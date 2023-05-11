package usuarios;

import java.util.InputMismatchException;
import java.util.Scanner;

import control.Pokedex;
import control.Pokemon;

public class PedirDatos {

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
