package control;

import usuarios.Salida;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id = 0;
		String nombre = "";
		int numero = 0;
		String tipo = "";
		String habilidad = "";
		int seleccion = 0;

		try {

			Pokedex miPokedex = new Pokedex(); // Creación de la lista de objetos

			Salida.presentacion("Bienevido a la pokedex. ¿Qué acción desea realizar?");

			do {
				seleccion = Salida.mostrarMenu();

				miPokedex.gestionarAccion(seleccion, nombre, numero, tipo, habilidad);
				System.out.println("");

			} while (seleccion > 0 || seleccion < 5); // Bucle do/while para que el menú inicial se muestre después de
														// cada acción automáticamente y que el programa no se cierra
														// salvo que así lo especifique el usuario

		} catch (Exception e) {
			System.out.println("Error desconocido. Pruebe otra vez.");
		}
		
		
	}

}
