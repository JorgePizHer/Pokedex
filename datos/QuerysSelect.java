package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuerysSelect {

	public static void ejecutarQuerys(String sql) {

		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet rs;

		try {
			// conectar con la base de datos
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/pokemon", "root", "");// proporcionamos la
																									// dirección, el
																									// administrador y
																									// la clave

			// creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// System.out.println(sql);

			rs = sentenciaSQL.executeQuery(sql);

			// chequeo que el result set no sea vacío, moviendo el cursor a la
			// primer fila. (El cursor inicia antes de la primer fila)
			while (rs.next()) {
				// Si hay resultados obtengo el valor.

				System.out.println("ID: " + rs.getInt("id") + " - Nombre: " + rs.getString("nombre") + " - Número: "
						+ rs.getInt("numero") + " - Tipo: " + rs.getString("tipo") + " - habilidad: "
						+ rs.getString("habilidad"));
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
			// System.out.println("Error");
		} finally {
			try {
				sentenciaSQL.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Conectado/desconectado");

	}

}
