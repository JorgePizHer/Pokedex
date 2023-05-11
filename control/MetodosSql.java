package control;

import java.util.Scanner;

public class MetodosSql {

	public static String insertarPokemon(Pokemon miPokemon) {

		return "INSERT INTO pokedex (nombre, numero, tipo, habilidad) VALUES ('" + miPokemon.getNombre() + "', "
				+ miPokemon.getNumero() + ", '" + miPokemon.getTipo() + "', '" + miPokemon.getHabilidad() + "');";  //String en forma de sentencia SQL INSERT para agregar datos a la BD
	}

	public static String modificarPokemon(Pokemon miPokemon) {

		String nombreModificar = "";

		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre del Pokemon que va a ser modificado: ");
		nombreModificar = lector.nextLine();

		return "UPDATE pokedex SET nombre = '" + miPokemon.getNombre() + "', numero = '" + miPokemon.getNumero()
				+ "', tipo = '" + miPokemon.getTipo() + "', habilidad = '" + miPokemon.getHabilidad()
				+ "' WHERE nombre = '" + nombreModificar + "';";  //String en forma de sentencia SQL UPDATE para modificar datos que ya están en la BD

	}

	public static String buscarNombre(String nombreBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre del Pokemon que quieres buscar: ");
		nombreBuscar = lector.nextLine();

		return "SELECT * FROM pokedex WHERE nombre = '" + nombreBuscar + "';";  //String en forma de sentencia SQL SELECT para buscar y mostrar datos que ya están en la BD

	}

	public static String buscarNumero(int numeroBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Número del Pokemon que quieres buscar: ");
		numeroBuscar = lector.nextInt();
		lector.nextLine();

		return "SELECT * FROM pokedex WHERE numero = " + numeroBuscar + ";";

	}

	public static String buscarTipo(String tipoBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Tipo del Pokemon que quieres buscar: ");
		tipoBuscar = lector.nextLine();

		return "SELECT * FROM pokedex WHERE tipo = '" + tipoBuscar + "';";

	}

	public static String buscarHabilidad(String habilidadBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Habilidad del Pokemon que quieres buscar: ");
		habilidadBuscar = lector.nextLine();

		return "SELECT * FROM pokedex WHERE habilidad = '" + habilidadBuscar + "';";

	}

	public static String buscarID(int idBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("ID del Pokemon que quieres buscar: ");
		idBuscar = lector.nextInt();
		lector.nextLine();

		return "SELECT * FROM pokedex WHERE id = " + idBuscar + ";";

	}

	public static String eliminarPokemon(String nombreEliminar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre del Pokemon que va a ser eliminado: ");
		nombreEliminar = lector.nextLine();

		return "DELETE FROM pokedex WHERE nombre = '" + nombreEliminar + "';";  //String en forma de sentencia SQL DELETE para eliminar datos que ya están en la BD

	}

}
