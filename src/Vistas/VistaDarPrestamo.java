package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VistaDarPrestamo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaDarPrestamo frame = new VistaDarPrestamo();
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
	public VistaDarPrestamo() {
		setTitle("Dar Prestamo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "Buscador", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(85, 11, 414, 138);
		contentPane.add(panel);
		
		JLabel lblBuscarUsuario = new JLabel("Buscar usuario:");
		lblBuscarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBuscarUsuario.setBounds(11, 31, 84, 15);
		panel.add(lblBuscarUsuario);
		
		JButton button = new JButton("Buscar");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(160, 99, 96, 33);
		panel.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nom. y Ap.", "DNI", "N\u00BASocio", "CI", "LC"}));
		comboBox.setBounds(330, 52, 84, 20);
		panel.add(comboBox);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(10, 52, 308, 20);
		panel.add(formattedTextField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 164, 574, 138);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellido", "Estado", "Tipo ID", "N\u00BA ID", "Tel\u00E9fono", "Email", "Ciudad", "Direcci\u00F3n", "Fecha alta", "Fecha baja"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(55);
		table.getColumnModel().getColumn(2).setPreferredWidth(51);
		table.getColumnModel().getColumn(3).setPreferredWidth(48);
		table.getColumnModel().getColumn(4).setPreferredWidth(42);
		table.getColumnModel().getColumn(5).setPreferredWidth(60);
		table.getColumnModel().getColumn(6).setPreferredWidth(44);
		table.getColumnModel().getColumn(7).setPreferredWidth(53);
		table.getColumnModel().getColumn(8).setPreferredWidth(59);
		table.getColumnModel().getColumn(9).setPreferredWidth(68);
		table.getColumnModel().getColumn(10).setPreferredWidth(65);
		scrollPane.setViewportView(table);
		
		JButton btnDarPrestamo = new JButton("Dar Prestamo");
		btnDarPrestamo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDarPrestamo.setBounds(229, 325, 120, 29);
		contentPane.add(btnDarPrestamo);
	}
}
