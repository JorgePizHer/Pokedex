package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import datos.BaseDatos;
import datos.QuerysSelect;
import usuarios.PedirDatos;
import usuarios.Salida;
import control.MetodosSql;

public class Pokedex {

	private ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();

	public Pokedex() {
		super();
	}

	public ArrayList<Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(ArrayList<Pokemon> pokedex) {
		this.pokedex = pokedex;
	}

	@Override
	public String toString() {
		return "Pokedex [pokedex=" + pokedex + "]";
	}

	public int gestionarAccion(int seleccion, String nombre, int numero, String tipo, String habilidad) {

		try {

			switch (seleccion) { // Switch para ejecutar las acciones que especifique el usuario
			case 1:
				nuevaEntradaPokedex(nombre, numero, tipo, habilidad);
				break;
			case 2:
				modificarEntradaPokedex(nombre, numero, tipo, habilidad);
				break;
			case 3:
				buscarEntradaPokedex(nombre, numero, tipo, habilidad);
				break;
			case 4:
				eliminarEntradaPokedex(nombre, numero, tipo, habilidad);
				break;
			case 5:
				System.exit(0);
				break;
			}
		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
			e.printStackTrace();
		}

		return seleccion;
	}

	public void nuevaEntradaPokedex(String nombre, int numero, String tipo, String habilidad) {

		Pokemon miPokemon = PedirDatos.addPokemon(nombre, numero, tipo, habilidad); // Creación de un nuevo objeto de la
																					// clase Pokemon para así poder
																					// almacenar los datos que introduce
																					// el usuario y volcarlos
																					// posteiormente a la BD

		pokedex.add(miPokemon);
		System.out.println(pokedex.toString());
		String sql = MetodosSql.insertarPokemon(miPokemon);
		BaseDatos.ejecutarSql(sql);

	}

	public void modificarEntradaPokedex(String nombre, int numero, String tipo, String habilidad) {

		Pokemon miPokemon = PedirDatos.modificarDatosPokemon(nombre, numero, tipo, habilidad);
		String sql = MetodosSql.modificarPokemon(miPokemon);
		BaseDatos.ejecutarSql(sql);

	}

	public void buscarEntradaPokedex(String nombre, int numero, String tipo,
			String habilidad) { /*
								 * Para buscar y eliminar, a diferencia de para insertar y modificar, no es
								 * necesario almacenar datos en un objeto, puesto que estos son datos que ya
								 * están previamente en la base de datos y bien se muestran o se eliminan, pero no se introducen
								 * nuevos datos ni se modifican
								 */

		int seleccion;
		String sql = "";

		try {

			do {

				seleccion = Salida.menuBuscar();

				switch (seleccion) {

				case 1:

					sql = MetodosSql.buscarNombre(null);
					QuerysSelect.ejecutarQuerys(sql);
					System.out.println(sql);

					break;

				case 2:

					sql = MetodosSql.buscarNumero(0);
					QuerysSelect.ejecutarQuerys(sql);
					System.out.println(sql);

					break;

				case 3:

					sql = MetodosSql.buscarTipo(null);
					QuerysSelect.ejecutarQuerys(sql);
					System.out.println(sql);

					break;

				case 4:

					sql = MetodosSql.buscarHabilidad(null);
					QuerysSelect.ejecutarQuerys(sql);
					System.out.println(sql);

					break;

				case 5:

					sql = MetodosSql.buscarID(0);
					QuerysSelect.ejecutarQuerys(sql);
					System.out.println(sql);

					break;

				}

			} while (seleccion < 1 || seleccion > 5);

		}

		catch (Exception e) {
			System.out.println("Error desconocido, pruebe otra vez");
		}
	}

	public void eliminarEntradaPokedex(String nombre, int numero, String tipo, String habilidad) {

		String sql = MetodosSql.eliminarPokemon(null);
		BaseDatos.ejecutarSql(sql);

	}

}
