	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;

	public class sql //extends GetInfo
	{
		public sql() {
			conectar();
		}
		ArrayList<Integer>id = new ArrayList<Integer>();
		ArrayList<String> user= new ArrayList<String>();
		ArrayList<String> pass= new ArrayList<String>();
		
		public void conectar() {
			conexion c = new conexion();
			Connection cn = null;
			Statement stm = null;
			ResultSet rs = null;

			try {
				cn = c.conectar();
				stm = cn.createStatement();
				rs = stm.executeQuery("SELECT * FROM Usuario");

				while (rs.next()) {
					int idUsuario = rs.getInt(1);
					String usuario = rs.getString(2);
					String contrasenia = rs.getString(3);
					id.add(idUsuario);
					user.add(usuario);
					pass.add(contrasenia);
					// recibir(idUsuario,usuario,contraseña);
				}
			} catch (SQLException e) {
				// TODO: handle exception
			}
		}
	}