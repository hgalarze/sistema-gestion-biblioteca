package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class VistaNuevoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldNumero;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaNuevoUsuario frame = new VistaNuevoUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaNuevoUsuario() {
		setTitle("Nuevo Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuevoUsuario = new JLabel("Nuevo usuario");
		lblNuevoUsuario.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblNuevoUsuario.setBounds(134, 11, 140, 14);
		contentPane.add(lblNuevoUsuario);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(5, 37, 72, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellido.setBounds(5, 72, 61, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDnilcle = new JLabel("Tipo identificaci\u00F3n:");
		lblDnilcle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDnilcle.setBounds(5, 131, 114, 14);
		contentPane.add(lblDnilcle);
		
		JComboBox comboBoxTipoID = new JComboBox();
		comboBoxTipoID.setModel(new DefaultComboBoxModel(new String[] {"DNI", "CI", "LC"}));
		comboBoxTipoID.setBounds(123, 129, 46, 20);
		contentPane.add(comboBoxTipoID);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNmero.setBounds(179, 131, 61, 14);
		contentPane.add(lblNmero);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(80, 35, 157, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setText("");
		textFieldApellido.setBounds(80, 65, 157, 20);
		contentPane.add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(239, 129, 134, 20);
		contentPane.add(textFieldNumero);
		textFieldNumero.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefono.setBounds(5, 166, 61, 14);
		contentPane.add(lblTelefono);
		
		textField = new JTextField();
		textField.setBounds(83, 159, 157, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(5, 191, 46, 14);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 189, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCiudad.setBounds(5, 221, 46, 14);
		contentPane.add(lblCiudad);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 219, 157, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(69, 261, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(206, 261, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblTipoUsuario = new JLabel("Tipo usuario:");
		lblTipoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipoUsuario.setBounds(5, 97, 72, 14);
		contentPane.add(lblTipoUsuario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Socio", "Bibliotecario", "Administrador"}));
		comboBox.setBounds(80, 96, 103, 20);
		contentPane.add(comboBox);
	}
}
