import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class agregaraSql {
	public agregaraSql(int id, String nombre, String usuario, String contrase�a) {
		conectar(id, nombre, usuario, contrase�a);
		}

		public void conectar(int id, String nombre, String usuario, String contrase�a) {
		conexion c = new conexion();
		Connection cn = null;
		PreparedStatement stm = null;
		String insert = "INSERT INTO Usuario" + "(IdUsuario,Nombre,Usuario,Contrase�a,AltaUsuario ) VALUES"
		+ "(?,?,?,?,?)";
		try {
		cn = c.conectar();
		stm = cn.prepareStatement(insert);
		stm.setInt(1, id);
		stm.setString(2, nombre);
		stm.setString(3, usuario);
		stm.setString(4, contrase�a);
		stm.setString(5, null);
		stm.executeUpdate();
		JOptionPane.showMessageDialog(null, "agregado a la basae de datos");
		} catch (SQLException e) {
		// TODO: handle exception
		JOptionPane.showMessageDialog(null, "no se pudo agregar");
		}
		}
		}
