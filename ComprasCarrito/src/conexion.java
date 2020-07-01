import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/TiendaOnline";
	private static final String USUARIO = "root";
	private static final String CLAVE = "19931997";

	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("error al cargar el controlador ");
			e.printStackTrace();
		}
	}

	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("conexion ok");
		} catch (SQLException e) {
			System.out.print("error en la conexion ");
			e.printStackTrace();
		}
		return conexion;
	}
}