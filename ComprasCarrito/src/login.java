import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passwordField;
	private JPasswordField JpassContraseña;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public login() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 509);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la Tienda Online");
		lblBienvenidoALa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblBienvenidoALa.setBounds(208, 26, 287, 71);
		contentPane.add(lblBienvenidoALa);

		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsuario.setBounds(59, 145, 89, 39);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContrasea.setBounds(59, 200, 126, 39);
		contentPane.add(lblContrasea);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(175, 151, 146, 33);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(319, 206, -128, 48);
		contentPane.add(passwordField);

		JpassContraseña = new JPasswordField();
		JpassContraseña.setBounds(175, 206, 146, 33);
		contentPane.add(JpassContraseña);

		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				char[] clave = JpassContraseña.getPassword();
				// new verification()
			}
		});
		btnIngresar.setBounds(208, 273, 113, 53);
		contentPane.add(btnIngresar);

		JLabel lbltodaviaNoTenes = new JLabel("\u00BFTodavia no tenes cuenta? ");
		lbltodaviaNoTenes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltodaviaNoTenes.setBounds(180, 353, 242, 20);
		contentPane.add(lbltodaviaNoTenes);

		JButton btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				crearUsuario cu= new crearUsuario();
			}
		});
		btnCrearCuenta.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCrearCuenta.setBounds(220, 377, 158, 29);
		contentPane.add(btnCrearCuenta);

		this.setVisible(true);
	}
}