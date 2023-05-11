package control;

import java.util.Scanner;

public class MetodosSql {

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de la sentencia INSERT
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param miPokemon Objeto de la clase Pokemon mediante el cual se puede acceder
	 *                  a los datos que contiene mediante los getters
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la sentencia
	 *         INSERT
	 * 
	 * @version 1.2
	 */

	public static String insertarPokemon(Pokemon miPokemon) {

		return "INSERT INTO pokedex (nombre, numero, tipo, habilidad) VALUES ('" + miPokemon.getNombre() + "', "
				+ miPokemon.getNumero() + ", '" + miPokemon.getTipo() + "', '" + miPokemon.getHabilidad() + "');";

		// String en forma de sentencia SQL INSERT para agregar datos a la BD

	}

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de la sentencia UPDATE
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param miPokemon Objeto de la clase Pokemon mediante el cual se puede acceder
	 *                  a los datos que contiene mediante los getters
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la sentencia
	 *         UPDATE
	 * 
	 * @version 1.2
	 */

	public static String modificarPokemon(Pokemon miPokemon) {

		String nombreModificar = "";

		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre del Pokemon que va a ser modificado: ");
		nombreModificar = lector.nextLine();

		return "UPDATE pokedex SET nombre = '" + miPokemon.getNombre() + "', numero = '" + miPokemon.getNumero()
				+ "', tipo = '" + miPokemon.getTipo() + "', habilidad = '" + miPokemon.getHabilidad()
				+ "' WHERE nombre = '" + nombreModificar + "';"; // String en forma de sentencia SQL UPDATE para
																	// modificar datos que ya están en la BD

	}

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de una consulta SELECT para buscar por nombre
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param nombreBuscar Nombre que introuducira el usuario y por el que se
	 *                     buscara en la base de datos
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la consulta
	 *         SELECT
	 * 
	 * @version 1.2
	 */

	public static String buscarNombre(String nombreBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre del Pokemon que quieres buscar: ");
		nombreBuscar = lector.nextLine();

		return "SELECT * FROM pokedex WHERE nombre = '" + nombreBuscar + "';"; // String en forma de sentencia SQL
																				// SELECT para buscar y mostrar datos
																				// que ya están en la BD

	}

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de una consulta SELECT para buscar por numero
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param numeroBuscar Numero que introuducira el usuario y por el que se
	 *                     buscara en la base de datos
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la consulta
	 *         SELECT
	 * 
	 * @version 1.2
	 */

	public static String buscarNumero(int numeroBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Número del Pokemon que quieres buscar: ");
		numeroBuscar = lector.nextInt();
		lector.nextLine();

		return "SELECT * FROM pokedex WHERE numero = " + numeroBuscar + ";";

	}

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de una consulta SELECT para buscar por tipo
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param tipoBuscar Tipo que introuducira el usuario y por el que se buscara en
	 *                   la base de datos
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la consulta
	 *         SELECT
	 * 
	 * @version 1.2
	 */

	public static String buscarTipo(String tipoBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Tipo del Pokemon que quieres buscar: ");
		tipoBuscar = lector.nextLine();

		return "SELECT * FROM pokedex WHERE tipo = '" + tipoBuscar + "';";

	}

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de una consulta SELECT para buscar por habilidad
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param habilidadBuscar Habilidad que introuducira el usuario y por la que se
	 *                        buscara en la base de datos
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la consulta
	 *         SELECT
	 * 
	 * @version 1.2
	 */

	public static String buscarHabilidad(String habilidadBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Habilidad del Pokemon que quieres buscar: ");
		habilidadBuscar = lector.nextLine();

		return "SELECT * FROM pokedex WHERE habilidad = '" + habilidadBuscar + "';";

	}

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de una consulta SELECT para buscar por ID
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param idBuscar ID que introuducira el usuario y por el que se buscara en la
	 *                 base de datos
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la consulta
	 *         SELECT
	 * 
	 * @version 1.2
	 */

	public static String buscarID(int idBuscar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("ID del Pokemon que quieres buscar: ");
		idBuscar = lector.nextInt();
		lector.nextLine();

		return "SELECT * FROM pokedex WHERE id = " + idBuscar + ";";

	}

	/**
	 * Metodo que transforma los datos introducidos por el usuario para que
	 * adquieran la sintaxis de una consulta DELETE para eliminar un elemento de la
	 * base de datos
	 * 
	 * @author Jorge Pizarro
	 * 
	 * @param nombreEliminar Nombre del elemento el usuario quiere eliminar de la
	 *                       base de datos
	 * 
	 * @return Los datos traducidos a lenguaje SQL para poder ejecutar la consulta
	 *         DELETE
	 * 
	 * @version 1.2
	 */

	public static String eliminarPokemon(String nombreEliminar) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre del Pokemon que va a ser eliminado: ");
		nombreEliminar = lector.nextLine();

		return "DELETE FROM pokedex WHERE nombre = '" + nombreEliminar + "';"; // String en forma de sentencia SQL
																				// DELETE para eliminar datos que ya
																				// están en la BD

	}

}
