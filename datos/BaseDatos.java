package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {

	/**
	 * El metodo ejecutarSql actua como enlace con la base de datos para conectarse
	 * a ella y poder ejecutar sentencias del tipo INSERT, UPDATE y DELETE
	 * 
	 * @author Jorge Pizarro
	 * @param sql Texto correspondiente a la sentencia en cuestion
	 * @version 1.2
	 */

	public static void ejecutarSql(String sql) {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		int resultado = 0;

		try {
			// conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "");// proporcionamos
																									// la
																									// dirección, el
																									// administrador
																									// y
																									// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) {
				System.out.println("Se ha ejecutado correctamente.");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sentenciaSQL.close();
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

}
