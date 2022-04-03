package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Toolkit;

public class VistaAgregarCopia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAgregarCopia frame = new VistaAgregarCopia();
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
	public VistaAgregarCopia() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaAgregarCopia.class.getResource("/Resources/Imagenes/add_one_book_32x32.png")));
		setTitle("Agregar nuevo libro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIsbn.setBounds(250, 90, 46, 14);
		contentPane.add(lblIsbn);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAutor.setBounds(10, 90, 46, 14);
		contentPane.add(lblAutor);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(10, 50, 46, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblSubtitulo = new JLabel("Subtitulo:");
		lblSubtitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSubtitulo.setBounds(250, 50, 63, 14);
		contentPane.add(lblSubtitulo);
		
		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEditorial.setBounds(10, 130, 46, 14);
		contentPane.add(lblEditorial);
		
		JLabel lblAoEdicin = new JLabel("A\u00F1o edici\u00F3n:");
		lblAoEdicin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAoEdicin.setBounds(10, 250, 84, 14);
		contentPane.add(lblAoEdicin);
		
		JLabel lblValorMonetario = new JLabel("Valor monetario:");
		lblValorMonetario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorMonetario.setBounds(10, 290, 101, 14);
		contentPane.add(lblValorMonetario);
		
		JLabel lblVolumen = new JLabel("Volumen:");
		lblVolumen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVolumen.setBounds(250, 250, 63, 14);
		contentPane.add(lblVolumen);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdioma.setBounds(250, 290, 53, 14);
		contentPane.add(lblIdioma);
		
		JLabel lblPaginas = new JLabel("P\u00E1ginas:");
		lblPaginas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPaginas.setBounds(250, 210, 46, 14);
		contentPane.add(lblPaginas);
		
		JLabel lblNroEjemplares = new JLabel("Nro Ejemplares:");
		lblNroEjemplares.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNroEjemplares.setBounds(250, 130, 101, 14);
		contentPane.add(lblNroEjemplares);
		
		JLabel lblTipoAdquisicin = new JLabel("Tipo adquisici\u00F3n:");
		lblTipoAdquisicin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipoAdquisicin.setBounds(10, 330, 101, 14);
		contentPane.add(lblTipoAdquisicin);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObservaciones.setBounds(250, 330, 84, 14);
		contentPane.add(lblObservaciones);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstado.setBounds(10, 210, 46, 14);
		contentPane.add(lblEstado);
		
		JLabel lblDisponibilidadSala = new JLabel("Disponibilidad sala:");
		lblDisponibilidadSala.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDisponibilidadSala.setBounds(10, 170, 107, 14);
		contentPane.add(lblDisponibilidadSala);
		
		JLabel lblDisponibilidadPrestamo = new JLabel("Disponibilidad Prestamo:");
		lblDisponibilidadPrestamo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDisponibilidadPrestamo.setBounds(250, 170, 130, 14);
		contentPane.add(lblDisponibilidadPrestamo);
		
		textField = new JTextField();
		textField.setBounds(78, 48, 162, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 88, 162, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 128, 162, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 168, 120, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(323, 48, 162, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(323, 88, 162, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(349, 130, 136, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(399, 168, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(323, 208, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(323, 248, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(323, 288, 120, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(344, 326, 216, 107);
		contentPane.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(66, 208, 101, 20);
		contentPane.add(comboBox);
		
		textField_11 = new JTextField();
		textField_11.setBounds(96, 248, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(116, 288, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(121, 328, 81, 20);
		contentPane.add(comboBox_1);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(142, 444, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(291, 444, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblAgregarNuevoLibro = new JLabel("Agregar nuevo libro");
		lblAgregarNuevoLibro.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblAgregarNuevoLibro.setBounds(174, 11, 203, 28);
		contentPane.add(lblAgregarNuevoLibro);
	}
}
