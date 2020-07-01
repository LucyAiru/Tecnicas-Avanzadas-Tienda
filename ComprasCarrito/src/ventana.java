	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	//@SuppressWarnings("serial")
public class ventana extends JFrame implements ActionListener{
	
		public ventana() {
			ventana();
			componente();
		}
		sql s= new sql();
		public void ventana() {
			this.setTitle("TiendaOnline");
			this.setSize(700, 700);
			this.setLocationRelativeTo(null);
			this.setLayout(null);
			this.setResizable(false);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void componente() {
			JButton boton1 = new JButton();
			JLabel texto = new JLabel();
		
			boton1.setText("Ingresar");
			boton1.setBounds(250, 450, 100, 25);
			boton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for(int i = 0 ; i<s.id.size();i++) {
						texto.setText(" "+s.id +" "+ s.user+" "+s.pass);
					}
					texto.setBounds(111,111, 400, 400);
					
				}
			});
			this.add(boton1);
			this.add(texto);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
