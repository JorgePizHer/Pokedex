package control;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import datos.BaseDatos;
import usuarios.PedirDatos;

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
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
			e.printStackTrace();
		}
		
		return seleccion;
	}
	
	
	public void nuevaEntradaPokedex(String nombre, int numero, String tipo, String habilidad) {
		
		Pokemon miPokemon=PedirDatos.addPokemon(nombre, numero, tipo, habilidad);
		
	pokedex.add(miPokemon);
	System.out.println(pokedex.toString());
	String sql=MetodosSql.insertarPokemon(miPokemon);
	BaseDatos.ejecutarSql(sql);
	
	
	}

	public void insertarBD(String sql) {
		
		
		
	}
	

	
	
	
}
