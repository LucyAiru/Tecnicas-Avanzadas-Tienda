import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class crearUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public crearUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 486);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsuario.setBounds(25, 82, 91, 46);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblContrasea.setBounds(25, 136, 128, 30);
		contentPane.add(lblContrasea);

		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a:");
		lblRepetirContrasea.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRepetirContrasea.setBounds(25, 198, 182, 38);
		contentPane.add(lblRepetirContrasea);

		textField = new JTextField();
		textField.setBounds(204, 90, 128, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(204, 136, 128, 30);
		contentPane.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(204, 204, 128, 26);
		contentPane.add(passwordField_1);

		JButton btnCrearUsuario = new JButton("Crear Usuario");
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
              // agregaraSql asql = new agregaraSql();
			}
		});
		btnCrearUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCrearUsuario.setBounds(143, 280, 151, 38);
		contentPane.add(btnCrearUsuario);

		JLabel lblUsuarioNuevo = new JLabel("Usuario Nuevo");
		lblUsuarioNuevo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsuarioNuevo.setBounds(161, 16, 171, 52);
		contentPane.add(lblUsuarioNuevo);
		this.setVisible(true);
	}
}
