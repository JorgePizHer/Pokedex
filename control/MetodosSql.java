package control;

public class MetodosSql {

	public static String insertarPokemon(Pokemon miPokemon) {

		// INSERT INTO favoritas (titulo, genero, puntos) VALUES ('" + + "', '" + + "',
		// " + + ");

		return "INSERT INTO pokedex (nombre, numero, tipo, habilidad) VALUES ('" + miPokemon.getNombre() + "', "
				+ miPokemon.getNumero() + ", '" + miPokemon.getTipo() + "', '" + miPokemon.getHabilidad() + "');";
	}

	public static String modificarPokemon(Pokemon miPokemon) {

		return "UPDATE pokedex SET nombre = '" + miPokemon.getNombre() + "', numero = '" + miPokemon.getNumero()
				+ "', tipo = '" + miPokemon.getTipo() + "', habilidad = '" + miPokemon.getHabilidad() + "' WHERE nombre = '"
				+ miPokemon.getNombre() + "';";

	}

	public static String eliminarPokemon(Pokemon miPokemon) {

		return "DELETE FROM pokedex WHERE nombre = '" + miPokemon.getNombre() + "';";

	}

}
