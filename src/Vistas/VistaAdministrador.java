package Vistas;

import java.awt.*;
import javax.swing.*;

import Controladores.ControladorAdministrador;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class VistaAdministrador extends JFrame {
	
	// Attributes //
	
	private ControladorAdministrador controlador;
	private JMenuBar barraMenu;
	private JMenu menuArchivo;
	private JMenu menuEdicion;
	private JMenuItem menuItemCortar;
	private JMenuItem menuItemCopiar;
	private JMenuItem menuItemPegar;
	private JMenuItem menuItemEliminar;
	private JSeparator separator1;
	private JMenuItem menuItemSeleccionarTodo;
	private JMenu menuAyuda;
	private JMenuItem menuItemVerAyuda;
	private JSeparator separator2;
	private JMenuItem menuItemAcercaDe;
	private JTabbedPane tabbedPaneGeneral;
	private JPanel panelInicio;
	private JTextPane txtBienvenida;
	private JLabel lblLogoSistema;
	private JSeparator separator3;
	private JTextField txtBuscar;
	private JLabel lblBuscar;
	private JButton btnBuscarInicio;
	private JCheckBox chckbxOpcionesAvanzadasInicio;
	private JPanel panelUsuarios;
	private JPanel panelLibros;
	private JPanel panelPrestamos;
	private JPanel panelReservas;
	private JPanel panelInformes;
	private JPanel panelSolicitudes;
	private JPanel panelConfiguraciones;
	private JPanel panelLogin;
	private JSeparator separator;
	private JMenuItem menuItemSalir;
	private JPanel panelFiltroInicio;
	private JTextField txtFiltroTitulo;
	private JCheckBox chckbxFiltroTitulo;
	private JTextField txtFiltroAutor;
	private JCheckBox chckbxFiltroAutor;
	private JCheckBox chckbxFiltroMateria;
	private JComboBox cmbBoxFiltroMateria;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox checkBoxOpAvLibros;
	private JPanel panel_OpAvLibro;
	private JButton button_BuscarLibro;
	private JPanel panel_BuscardorLibro;
	private JTable table_3;
	private JScrollPane scrollPane_Libros;
	private JPanel panelBuscadorInicio;
	private JScrollPane scrollPane_Inicio;
	private JTable table_4;
	private JButton btnQuitarCopia;
	private JSeparator separator_2;
	private JTable table_5;
	private JPanel panel_4;
	private JLabel lblBuscar_1;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JSeparator separator_5;
	private JButton btnNewButton_1;
	private JButton btnImprimir;
	private JPanel panel_6;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPanel panel_7;
	private JLabel lblBuscar_2;
	private JTextField textField_5;
	private JComboBox comboBox_3;
	private JButton btnBuscar_1;
	private JSeparator separator_6;
	private JPanel panel_8;
	private JButton btnNuevaReserva;
	private JButton btnEliminar;
	private JScrollPane scrollPane_4;
	private JTable table_6;
	private JButton btnModificar;
	private JButton btnDarPrestamo_1;
	private JMenu mnUsuarios;
	private JMenu mnLibros;
	private JMenu mnNuevo;
	private JMenuItem mntmSocio;
	private JMenuItem mntmBibliotecario;
	private JMenuItem mntmAdministrador;
	private JMenu mnEliminar;
	private JMenuItem mntmSocio_1;
	private JMenuItem mntmBibliotecario_1;
	private JMenuItem mntmAdministrador_1;
	private JMenu mnModificar;
	private JMenuItem mntmSocio_2;
	private JMenuItem mntmBibliotecario_2;
	private JMenuItem mntmAdministrador_2;
	private JMenuItem mntmDarPrestamo;
	private JMenuItem mntmVerSanciones;

	/**
	 * Constructor de la ventana principal del sistema.
	 * @param controlador Controlador del tipo {@link ActionListener} para capturar los eventos de la ventana
	 */
	public VistaAdministrador(ControladorAdministrador controlador) {
		try{
			this.setIconImage(Toolkit.getDefaultToolkit().getImage(VistaAdministrador.class.getResource("/Resources/Imagenes/Logo.png")));
			this.controlador = controlador;
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setBounds(100, 100, 840, 667);
			this.setTitle("Sistema de Gesti\u00F3n de Biblioteca (SGB) - [Administrador]");
			this.getContentPane().setLayout(null);
			
			this.barraMenu = new JMenuBar();
			this.barraMenu.setBounds(0, 0, 824, 26);
			this.getContentPane().add(this.barraMenu);
			
			this.menuArchivo = new JMenu("Archivo");
			this.barraMenu.add(this.menuArchivo);
			
			JMenuItem mntmIniciarSesion = new JMenuItem("Iniciar sesion");
			menuArchivo.add(mntmIniciarSesion);
			
			this.separator = new JSeparator();
			this.separator.setForeground(SystemColor.controlHighlight);
			this.menuArchivo.add(this.separator);
			
			this.menuItemSalir = new JMenuItem("Salir");
			this.menuItemSalir.addActionListener(this.controlador);
			this.menuArchivo.add(menuItemSalir);
			
			this.menuEdicion = new JMenu("Edición");
			this.barraMenu.add(this.menuEdicion);
			
			this.menuItemCortar = new JMenuItem("Cortar");
			this.menuItemCortar.setEnabled(false);
			this.menuItemCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
			this.menuEdicion.add(this.menuItemCortar);
			
			this.menuItemCopiar = new JMenuItem("Copiar");
			this.menuItemCopiar.setEnabled(false);
			this.menuItemCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
			this.menuEdicion.add(this.menuItemCopiar);
			
			this.menuItemPegar = new JMenuItem("Pegar");
			this.menuItemPegar.setEnabled(false);
			this.menuItemPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
			this.menuEdicion.add(menuItemPegar);
			
			this.menuItemEliminar = new JMenuItem("Eliminar");
			this.menuItemEliminar.setEnabled(false);
			this.menuItemEliminar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
			this.menuEdicion.add(this.menuItemEliminar);
			
			this.separator1 = new JSeparator();
			this.separator1.setForeground(SystemColor.controlHighlight);
			this.menuEdicion.add(this.separator1);
			
			this.menuItemSeleccionarTodo = new JMenuItem("Seleccionar todo");
			this.menuItemSeleccionarTodo.setEnabled(false);
			this.menuItemSeleccionarTodo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
			this.menuEdicion.add(this.menuItemSeleccionarTodo);
			
			mnUsuarios = new JMenu("Usuarios");
			barraMenu.add(mnUsuarios);
			
			mnNuevo = new JMenu("Nuevo");
			mnNuevo.setMargin(new Insets(0, 0, 0, 10));
			mnUsuarios.add(mnNuevo);
			
			mntmSocio = new JMenuItem("Socio");
			mnNuevo.add(mntmSocio);
			
			mntmBibliotecario = new JMenuItem("Bibliotecario");
			mnNuevo.add(mntmBibliotecario);
			
			mntmAdministrador = new JMenuItem("Administrador");
			mnNuevo.add(mntmAdministrador);
			
			mnEliminar = new JMenu("Eliminar");
			mnEliminar.setMargin(new Insets(0, 0, 0, 10));
			mnUsuarios.add(mnEliminar);
			
			mntmSocio_1 = new JMenuItem("Socio");
			mnEliminar.add(mntmSocio_1);
			
			mntmBibliotecario_1 = new JMenuItem("Bibliotecario");
			mnEliminar.add(mntmBibliotecario_1);
			
			mntmAdministrador_1 = new JMenuItem("Administrador");
			mnEliminar.add(mntmAdministrador_1);
			
			mnModificar = new JMenu("Modificar");
			mnModificar.setMargin(new Insets(0, 0, 0, 10));
			mnUsuarios.add(mnModificar);
			
			mntmSocio_2 = new JMenuItem("Socio");
			mnModificar.add(mntmSocio_2);
			
			mntmBibliotecario_2 = new JMenuItem("Bibliotecario");
			mnModificar.add(mntmBibliotecario_2);
			
			mntmAdministrador_2 = new JMenuItem("Administrador");
			mnModificar.add(mntmAdministrador_2);
			
			mntmDarPrestamo = new JMenuItem("Dar prestamo");
			mnUsuarios.add(mntmDarPrestamo);
			
			mntmVerSanciones = new JMenuItem("Ver sanciones");
			mntmVerSanciones.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/ver_sanciones_16x16.png")));
			mnUsuarios.add(mntmVerSanciones);
			
			mnLibros = new JMenu("Libros");
			barraMenu.add(mnLibros);
			
			JMenu mnPrestamos = new JMenu("Prestamos");
			barraMenu.add(mnPrestamos);
			
			JMenu mnReservas = new JMenu("Reservas");
			barraMenu.add(mnReservas);
			
			JMenu mnInformes = new JMenu("Informes");
			barraMenu.add(mnInformes);
			
			JMenu mnSolicitudes = new JMenu("Solicitudes");
			barraMenu.add(mnSolicitudes);
			
			JMenu mnConfiguraciones = new JMenu("Configuraciones");
			barraMenu.add(mnConfiguraciones);
			
			this.menuAyuda = new JMenu("Ayuda");
			this.barraMenu.add(this.menuAyuda);
			
			this.menuItemVerAyuda = new JMenuItem("Ver la Ayuda");
			menuItemVerAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
			this.menuAyuda.add(this.menuItemVerAyuda);
			
			this.separator2 = new JSeparator();
			this.separator2.setForeground(SystemColor.controlHighlight);
			this.menuAyuda.add(this.separator2);
			
			this.menuItemAcercaDe = new JMenuItem("Acerca de SGB");
			this.menuAyuda.add(this.menuItemAcercaDe);
			this.menuItemAcercaDe.addActionListener(this.controlador);
			
			this.tabbedPaneGeneral = new JTabbedPane(JTabbedPane.LEFT);
			tabbedPaneGeneral.setOpaque(true);
			this.tabbedPaneGeneral.setBackground(SystemColor.control);
			this.tabbedPaneGeneral.setBorder(null);
			this.tabbedPaneGeneral.setForeground(SystemColor.inactiveCaptionText);
			this.tabbedPaneGeneral.setFont(new Font("Calibri", tabbedPaneGeneral.getFont().getStyle() & ~Font.BOLD & ~Font.ITALIC, tabbedPaneGeneral.getFont().getSize() + 10));
			this.tabbedPaneGeneral.setBounds(0, 25, 824, 707);
			this.getContentPane().add(this.tabbedPaneGeneral);
			
			this.panelInicio = new JPanel();
			this.tabbedPaneGeneral.addTab("Inicio", null, this.panelInicio, "Aquí puede realizar busquedas de diferentes libros");
			this.panelInicio.setLayout(null);
			
			this.txtBienvenida = new JTextPane();
			this.txtBienvenida.setEnabled(false);
			this.txtBienvenida.setBackground(SystemColor.control);
			this.txtBienvenida.setEditable(false);
			this.txtBienvenida.setText("Le damos la bienvenida a nuestro sistema de gestión de la biblioteca, el cual le facilitará y ayudara en diferentes aspectos que usted necesite. Gracias por usarlo!");
			this.txtBienvenida.setBounds(114, 48, 543, 34);
			this.panelInicio.add(this.txtBienvenida);
			
			this.lblLogoSistema = new JLabel();
			this.lblLogoSistema.setIcon(new ImageIcon(getClass().getResource("/Resources/Imagenes/Logo_mediano.png")));
			this.lblLogoSistema.setBounds(23, 11, 81, 99);
			this.panelInicio.add(this.lblLogoSistema);
			
			this.separator3 = new JSeparator();
			this.separator3.setBounds(10, 121, 647, 2);
			this.panelInicio.add(this.separator3);
			
			panelBuscadorInicio = new JPanel();
			panelBuscadorInicio.setBorder(new TitledBorder(null, "Buscador", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panelBuscadorInicio.setBounds(10, 134, 647, 158);
			this.panelInicio.add(panelBuscadorInicio);
			panelBuscadorInicio.setLayout(null);
			
			this.txtBuscar = new JTextField();
			this.txtBuscar.setColumns(10);
			this.txtBuscar.setBounds(10, 41, 626, 28);
			panelBuscadorInicio.add(this.txtBuscar);
			
			this.lblBuscar = new JLabel("Buscar:");
			this.lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			this.lblBuscar.setBounds(10, 22, 39, 15);
			panelBuscadorInicio.add(this.lblBuscar);
			
			this.chckbxOpcionesAvanzadasInicio = new JCheckBox("Opciones avanzadas");
			chckbxOpcionesAvanzadasInicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				if (getChckbxOpcionesAvanzadasInicio().isSelected()){
					getPanelBuscadorInicio().setBounds(10, 134, 647, 276);
					getPanelFiltroInicio().setVisible(true);
					getBtnBuscarInicio().setBounds(264, 216, 124, 51);
					getScrollPane_Inicio().setBounds(13, 421, 643, 171);
				}
				else{
					getPanelBuscadorInicio().setBounds(10, 134, 647, 158);
					getPanelFiltroInicio().setVisible(false);
					getBtnBuscarInicio().setBounds(264, 97, 124, 51);
					getScrollPane_Inicio().setBounds(13, 303, 643, 289);
				}
				}
			});
			this.chckbxOpcionesAvanzadasInicio.setFont(new Font("Tahoma", Font.PLAIN, 10));
			this.chckbxOpcionesAvanzadasInicio.setBounds(10, 81, 117, 21);
			panelBuscadorInicio.add(this.chckbxOpcionesAvanzadasInicio);
			
			this.panelFiltroInicio = new JPanel();
			this.panelFiltroInicio.setBounds(10, 109, 629, 106);
			this.panelFiltroInicio.setBorder(new TitledBorder("Filtro"));
			this.panelFiltroInicio.setVisible(false);
			this.panelFiltroInicio.setEnabled(true);
			panelBuscadorInicio.add(this.panelFiltroInicio);
			this.panelFiltroInicio.setLayout(null);
			
			this.chckbxFiltroTitulo = new JCheckBox("T\u00EDtulo:");
			this.chckbxFiltroTitulo.setEnabled(true);
			this.chckbxFiltroTitulo.setBounds(6, 21, 55, 23);
			this.panelFiltroInicio.add(this.chckbxFiltroTitulo);
			
			this.txtFiltroTitulo = new JTextField();
			this.txtFiltroTitulo.setEnabled(true);
			this.txtFiltroTitulo.setBounds(77, 22, 540, 20);
			this.panelFiltroInicio.add(this.txtFiltroTitulo);
			this.txtFiltroTitulo.setColumns(10);
			
			this.chckbxFiltroAutor = new JCheckBox("Autor:");
			this.chckbxFiltroAutor.setEnabled(true);
			this.chckbxFiltroAutor.setBounds(6, 47, 57, 23);
			this.panelFiltroInicio.add(this.chckbxFiltroAutor);
			
			this.txtFiltroAutor = new JTextField();
			this.txtFiltroAutor.setEnabled(true);
			this.txtFiltroAutor.setBounds(77, 48, 540, 20);
			this.panelFiltroInicio.add(this.txtFiltroAutor);
			this.txtFiltroAutor.setColumns(10);
			
			this.chckbxFiltroMateria = new JCheckBox("Materia:");
			this.chckbxFiltroMateria.setEnabled(true);
			this.chckbxFiltroMateria.setBounds(6, 73, 65, 23);
			this.panelFiltroInicio.add(this.chckbxFiltroMateria);
			
			this.cmbBoxFiltroMateria = new JComboBox();
			cmbBoxFiltroMateria.setModel(new DefaultComboBoxModel(new String[] {"alimentaci\u00F3n", "anarquismo", "animales dom\u00E9sticos", "animales salvajes", "antiguedades", "antropolog\u00EDa", "apicultura", "arabiga", "armas", "arqueolog\u00EDa", "arquitectura", "arte", "artesan\u00EDa", "astronom\u00EDa", "automovilismo", "aviaci\u00F3n", "autor", "baile", "beneficencia", "bibliofilia", "bibliograf\u00EDa", "biograf\u00EDas", "biolog\u00EDa", "bot\u00E1nica", "caballos / equitaci\u00F3n", "caligraf\u00EDa", "caza", "cer\u00E1mica", "cervantina", "ciencia", "ciencia ficci\u00F3n", "cine", "circo", "cl\u00E1sicos griegos", "cl\u00E1sicos latinos", "cocina", "coleccionismo", "comunismo", "construcci\u00F3n", "criminolog\u00EDa", "ciencia social", "danza", "demograf\u00EDa", "deporte", "derecho", "diccionarios", "diplom\u00E1tica", "ecolog\u00EDa", "econom\u00EDa", "enciclopedias", "enolog\u00EDa", "ensayo", "epistolarios", "er\u00F3tica", "escolares / textos", "escultura", "etnograf\u00EDa", "esot\u00E9rica", "estad\u00EDstica", "farmacia", "fascismo", "ferrocarril", "filatelia", "filolog\u00EDa", "filosof\u00EDa", "f\u00EDsica", "folklore", "fotograf\u00EDa", "gastronom\u00EDa", "genealog\u00EDa", "geograf\u00EDa", "geolog\u00EDa", "grabado", "gram\u00E1tica", "guerras mundiales", "her\u00E1ldica", "higiene", "historia", "historia de la iglesia", "historia natural", "homosexualidad", "humor", "idiomas", "imprenta", "indumentaria", "industria", "infantiles", "inform\u00E1tica", "Islam", "judaica", "juegos", "juveniles", "laboral", "ling\u00FC\u00EDstica", "literatura", "magia / ilusionismo", "manuscritos", "mapas / cartograf\u00EDa", "mar\u00EDtima", "marxismo", "masoner\u00EDa", "matem\u00E1ticas", "medicina", "memorias", "micolog\u00EDa", "militaria", "mineralog\u00EDa", "miner\u00EDa", "mitolog\u00EDa", "mobiliario", "monta\u00F1ismo / alpinis", "motociclismo", "mujer", "m\u00FAsica", "nazismo", "novela", "novela rosa", "novelas y cuentos", "numism\u00E1tica", "oficios", "optica", "ordenes religiosas", "paleograf\u00EDa", "pedagog\u00EDa", "peri\u00F3dicos y revista", "periodismo", "pesca", "pintura", "poes\u00EDa", "policiaca", "pol\u00EDtica", "prehistoria", "psicolog\u00EDa", "psiquiatr\u00EDa", "qu\u00EDmica", "radio", "refranes", "religi\u00F3n", "relojes", "sexualidad", "sindicalismo", "socialismo", "sociolog\u00EDa", "teatro", "teatro", "t\u00E9cnica", "t\u00E9cnicos", "televisi\u00F3n", "teolog\u00EDa", "toros", "turismo", "universidad", "urbanismo", "veterinaria", "viajes", "viticultura"}));
			this.cmbBoxFiltroMateria.setEnabled(true);
			this.cmbBoxFiltroMateria.setBounds(77, 74, 170, 20);
			this.panelFiltroInicio.add(this.cmbBoxFiltroMateria);
			
			this.btnBuscarInicio = new JButton("Buscar");
			btnBuscarInicio.setBounds(264, 97, 124, 51);
			panelBuscadorInicio.add(btnBuscarInicio);
			this.btnBuscarInicio.setFont(new Font("Tahoma", Font.BOLD, 12));
			this.btnBuscarInicio.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/lupa.png")));
			
			scrollPane_Inicio = new JScrollPane();
			scrollPane_Inicio.setBounds(13, 303, 643, 289);
			panelInicio.add(scrollPane_Inicio);
			
			table_4 = new JTable();
			table_4.setFillsViewportHeight(true);
			table_4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table_4.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"Titulo", "Autor", "ISBN", "Editorial", "Ejemplares", "Disp.Sala", "Disp.Prestamo"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table_4.getColumnModel().getColumn(0).setPreferredWidth(125);
			table_4.getColumnModel().getColumn(1).setPreferredWidth(125);
			table_4.getColumnModel().getColumn(2).setPreferredWidth(85);
			table_4.getColumnModel().getColumn(3).setPreferredWidth(105);
			table_4.getColumnModel().getColumn(4).setPreferredWidth(65);
			table_4.getColumnModel().getColumn(5).setPreferredWidth(54);
			table_4.getColumnModel().getColumn(6).setPreferredWidth(81);
			scrollPane_Inicio.setViewportView(table_4);
			
			this.panelUsuarios = new JPanel();
			this.tabbedPaneGeneral.addTab("Usuarios", null, this.panelUsuarios, null);
			panelUsuarios.setLayout(null);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setOrientation(SwingConstants.VERTICAL);
			separator_1.setBounds(527, 0, 2, 605);
			panelUsuarios.add(separator_1);
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Buscador", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 508, 138);
			panelUsuarios.add(panel);
			
			JLabel label = new JLabel("Buscar:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label.setBounds(10, 21, 39, 15);
			panel.add(label);
			
			JButton button = new JButton("Buscar");
			button.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/lupa.png")));
			button.setFont(new Font("Tahoma", Font.BOLD, 12));
			button.setBounds(186, 70, 124, 51);
			panel.add(button);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nom. y Ap.", "DNI", "N\u00BA Socio", "CI", "LC"}));
			comboBox.setBounds(396, 39, 90, 20);
			panel.add(comboBox);
			
			JFormattedTextField formattedTextField = new JFormattedTextField();
			formattedTextField.setBounds(10, 39, 382, 20);
			panel.add(formattedTextField);
			
			JLabel lblPor = new JLabel("Por:");
			lblPor.setBounds(396, 22, 20, 14);
			panel.add(lblPor);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 160, 508, 433);
			panelUsuarios.add(scrollPane);
			
			table = new JTable();
			table.setFillsViewportHeight(true);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null},
				},
				new String[] {
					"Nombre", "Apellido", "Estado", "Tipo ID", "N\u00BA ID", "Tel\u00E9fono", "Email", "Ciudad", "Fecha alta", "Fecha alta", "Fecha baja"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			scrollPane.setViewportView(table);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBounds(528, 0, 139, 602);
			panelUsuarios.add(panel_1);
			
			JButton button_1 = new JButton("Nuevo");
			button_1.setEnabled(false);
			button_1.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_user_disable_32x32.png")));
			button_1.setMargin(new Insets(1, 1, 1, 1));
			button_1.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_user_32x32.png")));
			button_1.setBounds(10, 11, 119, 41);
			panel_1.add(button_1);
			
			JButton button_2 = new JButton("Eliminar");
			button_2.setEnabled(false);
			button_2.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/delete_user_disable_32x32.png")));
			button_2.setMargin(new Insets(1, 1, 1, 1));
			button_2.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/delete_user_32x32.png")));
			button_2.setBounds(10, 63, 119, 41);
			panel_1.add(button_2);
			
			JButton button_3 = new JButton("Modificar");
			button_3.setEnabled(false);
			button_3.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_user_disable_32x32.png")));
			button_3.setMargin(new Insets(1, 1, 1, 1));
			button_3.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_user_32x32.png")));
			button_3.setBounds(10, 114, 119, 41);
			panel_1.add(button_3);
			
			JButton btnDarPrestamo = new JButton("Dar prestamo");
			btnDarPrestamo.setEnabled(false);
			btnDarPrestamo.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/prestamo_disable_32x32.png")));
			btnDarPrestamo.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/notebook_32x32.png")));
			btnDarPrestamo.setMargin(new Insets(1,1,1,1));
			btnDarPrestamo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnDarPrestamo.setBounds(10, 166, 119, 41);
			panel_1.add(btnDarPrestamo);
			
			JButton btnCumplirSancin = new JButton("Ver sanciones");
			btnCumplirSancin.setEnabled(false);
			btnCumplirSancin.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/ver_sanciones_disable_32x32.png")));
			btnCumplirSancin.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/flag_32x32.png")));
			btnCumplirSancin.setMargin(new Insets(1, 1, 1, 1));
			btnCumplirSancin.setBounds(10, 218, 119, 41);
			panel_1.add(btnCumplirSancin);
			
			this.panelLibros = new JPanel();
			this.tabbedPaneGeneral.addTab("Libros", null, this.panelLibros, null);
			panelLibros.setLayout(null);
			
			separator_2 = new JSeparator();
			separator_2.setOrientation(SwingConstants.VERTICAL);
			separator_2.setBounds(528, -2, 2, 603);
			panelLibros.add(separator_2);
			
			panel_BuscardorLibro = new JPanel();
			panel_BuscardorLibro.setLayout(null);
			panel_BuscardorLibro.setBorder(new TitledBorder(null, "Buscador", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel_BuscardorLibro.setBounds(10, 11, 508, 138);
			panelLibros.add(panel_BuscardorLibro);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(10, 36, 488, 21);
			panel_BuscardorLibro.add(textField);
			
			JLabel label_1 = new JLabel("Buscar:");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_1.setBounds(10, 20, 39, 15);
			panel_BuscardorLibro.add(label_1);
			
			checkBoxOpAvLibros = new JCheckBox("Opciones avanzadas");
			checkBoxOpAvLibros.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				 
					if( getCheckBoxOpAvLibros().isSelected()) {
						
						getPanel_OpAvLibro().setVisible(true);
						getButton_BuscarLibro().setBounds(186, 197, 124, 51);
						getPanel_BuscardorLibro().setBounds(10, 11, 508, 259);
						getScrollPane_Libros().setBounds(10, 278, 508, 313);
					}
					else {getPanel_OpAvLibro().setVisible(false);
					getButton_BuscarLibro().setBounds(186, 77,124, 51);
					getPanel_BuscardorLibro().setBounds(10, 11, 508, 138);
					getScrollPane_Libros().setBounds(10, 160, 508, 431);}
				}
			});
			checkBoxOpAvLibros.setFont(new Font("Tahoma", Font.PLAIN, 10));
			checkBoxOpAvLibros.setBounds(10, 59, 117, 21);
			panel_BuscardorLibro.add(checkBoxOpAvLibros);
			
			panel_OpAvLibro = new JPanel();
			panel_OpAvLibro.setLayout(null);
			panel_OpAvLibro.setEnabled(false);
			panel_OpAvLibro.setVisible(false);
			panel_OpAvLibro.setBorder(new TitledBorder("Filtro"));
			panel_OpAvLibro.setBounds(10, 88, 488, 106);
			panel_BuscardorLibro.add(panel_OpAvLibro);
			
			JCheckBox checkBox_1 = new JCheckBox("T\u00EDtulo:");
			checkBox_1.setEnabled(false);
			checkBox_1.setBounds(6, 21, 55, 23);
			panel_OpAvLibro.add(checkBox_1);
			
			textField_1 = new JTextField();
			textField_1.setEnabled(false);
			textField_1.setColumns(10);
			textField_1.setBounds(77, 22, 299, 20);
			panel_OpAvLibro.add(textField_1);
			
			JCheckBox checkBox_2 = new JCheckBox("Autor:");
			checkBox_2.setEnabled(false);
			checkBox_2.setBounds(6, 47, 57, 23);
			panel_OpAvLibro.add(checkBox_2);
			
			textField_2 = new JTextField();
			textField_2.setEnabled(false);
			textField_2.setColumns(10);
			textField_2.setBounds(77, 48, 299, 20);
			panel_OpAvLibro.add(textField_2);
			
			JCheckBox checkBox_3 = new JCheckBox("Materia:");
			checkBox_3.setEnabled(false);
			checkBox_3.setBounds(6, 73, 65, 23);
			panel_OpAvLibro.add(checkBox_3);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setEnabled(false);
			comboBox_1.setEditable(true);
			comboBox_1.setBounds(77, 74, 118, 20);
			panel_OpAvLibro.add(comboBox_1);
			
			button_BuscarLibro = new JButton("Buscar");
			button_BuscarLibro.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/lupa.png")));
			button_BuscarLibro.setBounds(186, 77, 124, 51);
			panel_BuscardorLibro.add(button_BuscarLibro);
			button_BuscarLibro.setAlignmentX(Component.CENTER_ALIGNMENT);
			button_BuscarLibro.setFont(new Font("Tahoma", Font.BOLD, 12));
			
			scrollPane_Libros = new JScrollPane();
			scrollPane_Libros.setBackground(Color.WHITE);
			scrollPane_Libros.setBounds(10, 160, 508, 433);
			panelLibros.add(scrollPane_Libros);
			
			table_3 = new JTable();
			table_3.setFillsViewportHeight(true);
			table_3.setBackground(Color.WHITE);
			table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table_3.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"Titulo", "Autor", "ISBN", "Editorial", "Disp. Sala", "Disp. Prestamo", "Ejemplares"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table_3.getColumnModel().getColumn(0).setPreferredWidth(110);
			table_3.getColumnModel().getColumn(1).setPreferredWidth(110);
			table_3.getColumnModel().getColumn(3).setPreferredWidth(90);
			table_3.getColumnModel().getColumn(4).setPreferredWidth(59);
			table_3.getColumnModel().getColumn(5).setPreferredWidth(84);
			table_3.getColumnModel().getColumn(6).setPreferredWidth(64);
			scrollPane_Libros.setViewportView(table_3);
			
			JPanel panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBounds(528, -2, 139, 603);
			panelLibros.add(panel_2);
			
			JButton button_NuevoLibro = new JButton("Nuevo");
			button_NuevoLibro.setEnabled(false);
			button_NuevoLibro.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_one_book_disable_32x32.png")));
			button_NuevoLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button_NuevoLibro.setMargin(new Insets(1, 1, 1, 1));
			button_NuevoLibro.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_one_book_32x32.png")));
			button_NuevoLibro.setBounds(10, 11, 119, 41);
			panel_2.add(button_NuevoLibro);
			
			JButton button_EliminarLibro = new JButton("Eliminar");
			button_EliminarLibro.setEnabled(false);
			button_EliminarLibro.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/remove_one_book_disable_32x32.png")));
			button_EliminarLibro.setMargin(new Insets(1, 1, 1, 1));
			button_EliminarLibro.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/remove_one_book_32x32.png")));
			button_EliminarLibro.setBounds(10, 63, 119, 41);
			panel_2.add(button_EliminarLibro);
			
			JButton button_ModificarLibro = new JButton("Modificar");
			button_ModificarLibro.setEnabled(false);
			button_ModificarLibro.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_book_disable_32x32.png")));
			button_ModificarLibro.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_book_32x32.png")));
			button_ModificarLibro.setMargin(new Insets(1, 1, 1, 1));
			button_ModificarLibro.setBounds(10, 115, 119, 41);
			panel_2.add(button_ModificarLibro);
			
			JButton button_DarPrestamoLibro = new JButton("Dar prestamo");
			button_DarPrestamoLibro.setEnabled(false);
			button_DarPrestamoLibro.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/prestamo_disable_32x32.png")));
			button_DarPrestamoLibro.setMargin(new Insets(1, 1, 1, 1));
			button_DarPrestamoLibro.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/notebook_32x32.png")));
			button_DarPrestamoLibro.setBounds(10, 167, 119, 41);
			panel_2.add(button_DarPrestamoLibro);
			
			JButton btnAgregarCopia = new JButton("Agregar copia");
			btnAgregarCopia.setEnabled(false);
			btnAgregarCopia.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_two_book_disable_32x32.png")));
			btnAgregarCopia.setMargin(new Insets(1, 1, 1, 1));
			btnAgregarCopia.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_two_book_32x32.png")));
			btnAgregarCopia.setBounds(10, 219, 119, 41);
			panel_2.add(btnAgregarCopia);
			
			btnQuitarCopia = new JButton("Quitar copia");
			btnQuitarCopia.setEnabled(false);
			btnQuitarCopia.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/remove_two_book_disable_32x32.png")));
			btnQuitarCopia.setMargin(new Insets(1, 1, 1, 1));
			btnQuitarCopia.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/remove_two_book_32x32.png")));
			btnQuitarCopia.setBounds(10, 271, 119, 41);
			panel_2.add(btnQuitarCopia);
			
			this.panelPrestamos = new JPanel();
			this.tabbedPaneGeneral.addTab("Prestamos", null, this.panelPrestamos, null);
			panelPrestamos.setLayout(null);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setOrientation(SwingConstants.VERTICAL);
			separator_3.setBounds(528, 0, 2, 603);
			panelPrestamos.add(separator_3);
			
			JPanel panel_3 = new JPanel();
			panel_3.setRequestFocusEnabled(false);
			panel_3.setLayout(null);
			panel_3.setBounds(528, 0, 139, 603);
			panelPrestamos.add(panel_3);
			
			JScrollPane scrollPane_3 = new JScrollPane();
			scrollPane_3.setBackground(Color.WHITE);
			scrollPane_3.setBounds(10, 157, 508, 435);
			panelPrestamos.add(scrollPane_3);
			
			table_5 = new JTable();
			table_5.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table_5.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
					"N\u00BA", "Nombre y apellido socio", "T\u00EDtulo libro", "Autor libro", "Estado", "Fecha prestamo", "Fecha devoluci\u00F3n", "Tipo prestamo"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table_5.getColumnModel().getColumn(0).setPreferredWidth(26);
			table_5.getColumnModel().getColumn(1).setPreferredWidth(130);
			table_5.getColumnModel().getColumn(2).setPreferredWidth(108);
			table_5.getColumnModel().getColumn(3).setPreferredWidth(117);
			table_5.getColumnModel().getColumn(5).setPreferredWidth(89);
			table_5.getColumnModel().getColumn(6).setPreferredWidth(95);
			table_5.getColumnModel().getColumn(7).setPreferredWidth(84);
			table_5.setFillsViewportHeight(true);
			scrollPane_3.setViewportView(table_5);
			
			panel_4 = new JPanel();
			panel_4.setBorder(new TitledBorder(null, "Buscador", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel_4.setBounds(10, 11, 508, 138);
			panelPrestamos.add(panel_4);
			panel_4.setLayout(null);
			
			lblBuscar_1 = new JLabel("Buscar:");
			lblBuscar_1.setBounds(10, 21, 46, 14);
			panel_4.add(lblBuscar_1);
			
			textField_3 = new JTextField();
			textField_3.setBounds(10, 38, 367, 20);
			panel_4.add(textField_3);
			textField_3.setColumns(10);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"N\u00BA Prestamo", "Nom. y Ap. Socio", "DNI Socio", "T\u00EDtulo libro", "Autor libro"}));
			comboBox_2.setBounds(381, 38, 117, 20);
			panel_4.add(comboBox_2);
			
			JButton btnBuscar = new JButton("Buscar");
			btnBuscar.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/lupa.png")));
			btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnBuscar.setBounds(186, 70, 124, 51);
			panel_4.add(btnBuscar);
			
			JButton button_5 = new JButton("Eliminar");
			button_5.setEnabled(false);
			button_5.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/delete_prestamo_disable_32x32.png")));
			button_5.setRequestFocusEnabled(false);
			button_5.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/delete_prestamo_32x32.png")));
			button_5.setMargin(new Insets(1, 1, 1, 1));
			button_5.setBounds(10, 11, 119, 41);
			panel_3.add(button_5);
			
			JButton button_6 = new JButton("Modificar");
			button_6.setEnabled(false);
			button_6.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_prestamo_disable_32x32.png")));
			button_6.setRequestFocusEnabled(false);
			button_6.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_prestamo_32x32.png")));
			button_6.setMargin(new Insets(1, 1, 1, 1));
			button_6.setBounds(10, 63, 119, 41);
			panel_3.add(button_6);
			
			this.panelReservas = new JPanel();
			this.tabbedPaneGeneral.addTab("Reservas", null, this.panelReservas, null);
			panelReservas.setLayout(null);
			
			panel_7 = new JPanel();
			panel_7.setBorder(new TitledBorder(null, "Buscador", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			panel_7.setBounds(10, 11, 508, 138);
			panelReservas.add(panel_7);
			panel_7.setLayout(null);
			
			lblBuscar_2 = new JLabel("Buscar:");
			lblBuscar_2.setBounds(10, 21, 46, 14);
			panel_7.add(lblBuscar_2);
			
			textField_5 = new JTextField();
			textField_5.setBounds(10, 38, 367, 20);
			panel_7.add(textField_5);
			textField_5.setColumns(10);
			
			comboBox_3 = new JComboBox();
			comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Nom. y Ap. Socio", "DNI Socio", "N\u00BA Reserva", "T\u00EDtulo libro", "Autor libro"}));
			comboBox_3.setBounds(381, 38, 117, 20);
			panel_7.add(comboBox_3);
			
			btnBuscar_1 = new JButton("Buscar");
			btnBuscar_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnBuscar_1.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/lupa.png")));
			btnBuscar_1.setBounds(186, 70, 124, 51);
			panel_7.add(btnBuscar_1);
			
			separator_6 = new JSeparator();
			separator_6.setOrientation(SwingConstants.VERTICAL);
			separator_6.setBounds(528, 0, 2, 603);
			panelReservas.add(separator_6);
			
			panel_8 = new JPanel();
			panel_8.setLayout(null);
			panel_8.setRequestFocusEnabled(false);
			panel_8.setBounds(528, 0, 139, 603);
			panelReservas.add(panel_8);
			
			btnNuevaReserva = new JButton("Nueva reserva");
			btnNuevaReserva.setEnabled(false);
			btnNuevaReserva.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_reserva_disable_32x32.png")));
			btnNuevaReserva.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/add_reserva_32x32.png")));
			btnNuevaReserva.setRequestFocusEnabled(false);
			btnNuevaReserva.setMargin(new Insets(1, 1, 1, 1));
			btnNuevaReserva.setBounds(10, 11, 119, 41);
			panel_8.add(btnNuevaReserva);
			
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setEnabled(false);
			btnEliminar.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/delete_reserva_32x32.png")));
			btnEliminar.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/delete_reserva_disable_32x32.png")));
			btnEliminar.setRequestFocusEnabled(false);
			btnEliminar.setMargin(new Insets(1, 1, 1, 1));
			btnEliminar.setBounds(10, 63, 119, 41);
			panel_8.add(btnEliminar);
			
			btnModificar = new JButton("Modificar");
			btnModificar.setEnabled(false);
			btnModificar.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_reserva_disable_32x32.png")));
			btnModificar.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/edit_reserva_32x32.png")));
			btnModificar.setMargin(new Insets(1, 1, 1, 1));
			btnModificar.setBounds(10, 115, 119, 41);
			panel_8.add(btnModificar);
			
			btnDarPrestamo_1 = new JButton("Dar prestamo");
			btnDarPrestamo_1.setEnabled(false);
			btnDarPrestamo_1.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/prestamo_disable_32x32.png")));
			btnDarPrestamo_1.setMargin(new Insets(1, 1, 1, 1));
			btnDarPrestamo_1.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/notebook_32x32.png")));
			btnDarPrestamo_1.setBounds(10, 167, 119, 41);
			panel_8.add(btnDarPrestamo_1);
			
			scrollPane_4 = new JScrollPane();
			scrollPane_4.setBounds(10, 157, 508, 435);
			panelReservas.add(scrollPane_4);
			
			table_6 = new JTable();
			table_6.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table_6.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"N\u00BA", "Nombre Socio", "Apellido Socio", "T\u00EDtulo libro", "Autor libro", "Tipo reserva"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table_6.getColumnModel().getColumn(0).setPreferredWidth(27);
			table_6.getColumnModel().getColumn(1).setPreferredWidth(100);
			table_6.getColumnModel().getColumn(2).setPreferredWidth(100);
			table_6.getColumnModel().getColumn(3).setPreferredWidth(110);
			table_6.getColumnModel().getColumn(4).setPreferredWidth(100);
			table_6.getColumnModel().getColumn(5).setPreferredWidth(80);
			table_6.setFillsViewportHeight(true);
			scrollPane_4.setViewportView(table_6);
			
			this.panelInformes = new JPanel();
			this.tabbedPaneGeneral.addTab("Informes", null, this.panelInformes, null);
			panelInformes.setLayout(null);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 11, 508, 579);
			panelInformes.add(scrollPane_1);
			
			table_1 = new JTable();
			table_1.setFillsViewportHeight(true);
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column"
				}
			));
			scrollPane_1.setViewportView(table_1);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setOrientation(SwingConstants.VERTICAL);
			separator_4.setBounds(528, 0, 2, 603);
			panelInformes.add(separator_4);
			
			JPanel panel_5 = new JPanel();
			panel_5.setLayout(null);
			panel_5.setBounds(528, 0, 139, 603);
			panelInformes.add(panel_5);
			
			JButton btnLibrosPrestados = new JButton("Libros Prestados");
			btnLibrosPrestados.setHorizontalTextPosition(SwingConstants.CENTER);
			btnLibrosPrestados.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnLibrosPrestados.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/line_graph_32x32.png")));
			btnLibrosPrestados.setMargin(new Insets(1, 1, 1, 1));
			btnLibrosPrestados.setBounds(10, 11, 119, 57);
			panel_5.add(btnLibrosPrestados);
			
			JButton btnPrestamosConPlazo = new JButton("Prestamos vencidos");
			btnPrestamosConPlazo.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/line_graph_32x32.png")));
			btnPrestamosConPlazo.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnPrestamosConPlazo.setHorizontalTextPosition(SwingConstants.CENTER);
			btnPrestamosConPlazo.setMargin(new Insets(1, 1, 1, 1));
			btnPrestamosConPlazo.setBounds(10, 79, 119, 57);
			panel_5.add(btnPrestamosConPlazo);
			
			btnNewButton = new JButton("Libros m\u00E1s solicitados");
			btnNewButton.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/line_graph_32x32.png")));
			btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
			btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
			btnNewButton.setMargin(new Insets(1, 1, 1, 1));
			btnNewButton.setBounds(10, 147, 119, 57);
			panel_5.add(btnNewButton);
			
			separator_5 = new JSeparator();
			separator_5.setBounds(10, 215, 119, 2);
			panel_5.add(separator_5);
			
			btnNewButton_1 = new JButton("Guardar PDF");
			btnNewButton_1.setEnabled(false);
			btnNewButton_1.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/pdf_disable.png")));
			btnNewButton_1.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/pdf.png")));
			btnNewButton_1.setMargin(new Insets(1, 1, 1, 1));
			btnNewButton_1.setBounds(10, 227, 119, 57);
			panel_5.add(btnNewButton_1);
			
			btnImprimir = new JButton("Imprimir");
			btnImprimir.setEnabled(false);
			btnImprimir.setDisabledIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/print_disable_32x32.png")));
			btnImprimir.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/print_32x32.png")));
			btnImprimir.setBounds(10, 295, 119, 57);
			panel_5.add(btnImprimir);
			
			this.panelSolicitudes = new JPanel();
			this.tabbedPaneGeneral.addTab("Solicitudes", new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/notification.png")), this.panelSolicitudes, null);
			panelSolicitudes.setLayout(null);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(76, 11, 346, 251);
			panelSolicitudes.add(scrollPane_2);
			
			table_2 = new JTable();
			table_2.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
					{null, null, null},
				},
				new String[] {
					"New column", "New column", "New column"
				}
			));
			scrollPane_2.setViewportView(table_2);
			
			this.panelConfiguraciones = new JPanel();
			this.tabbedPaneGeneral.addTab("Configuraciones", null, this.panelConfiguraciones, null);
			
			this.panelLogin = new JPanel();
			this.tabbedPaneGeneral.addTab("Iniciar Sesión", null, this.panelLogin, null);
			this.panelLogin.setLayout(null);
			
			panel_6 = new JPanel();
			panel_6.setBorder(new TitledBorder(null, "Inicio de Sesión", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_6.setBounds(166, 320, 317, 160);
			panelLogin.add(panel_6);
			panel_6.setLayout(null);
			
			JLabel label_2 = new JLabel("Usuario:");
			label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_2.setBounds(22, 26, 57, 14);
			panel_6.add(label_2);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(116, 23, 191, 20);
			panel_6.add(textField_4);
			
			JLabel label_3 = new JLabel("Contrase\u00F1a:");
			label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			label_3.setBounds(22, 65, 85, 14);
			panel_6.add(label_3);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(117, 62, 190, 20);
			panel_6.add(passwordField);
			
			JButton button_4 = new JButton("Iniciar sesi\u00F3n");
			button_4.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/unlock_32x32.png")));
			button_4.setBounds(164, 98, 143, 51);
			panel_6.add(button_4);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(VistaAdministrador.class.getResource("/Resources/Imagenes/security.png")));
			label_4.setBounds(207, 25, 231, 256);
			panelLogin.add(label_4);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}catch(Exception e){
			System.out.println("Ha ocurrido un error en el:\n" +
					"Constructor: VistaPrincipal\n" +
					"Paquete:Vistas\n" +
					"Clase: VistaPrincipal");
		}
	}

	public JScrollPane getScrollPane_Inicio() {
		return scrollPane_Inicio;
	}

	public void setScrollPane_Inicio(JScrollPane scrollPane_Inicio) {
		this.scrollPane_Inicio = scrollPane_Inicio;
	}

	public JButton getBtnBuscarInicio() {
		return btnBuscarInicio;
	}

	public void setBtnBuscarInicio(JButton btnBuscarInicio) {
		this.btnBuscarInicio = btnBuscarInicio;
	}

	public JCheckBox getChckbxOpcionesAvanzadasInicio() {
		return chckbxOpcionesAvanzadasInicio;
	}

	public void setChckbxOpcionesAvanzadasInicio(
			JCheckBox chckbxOpcionesAvanzadasInicio) {
		this.chckbxOpcionesAvanzadasInicio = chckbxOpcionesAvanzadasInicio;
	}

	public JPanel getPanelFiltroInicio() {
		return panelFiltroInicio;
	}

	public void setPanelFiltroInicio(JPanel panelFiltroInicio) {
		this.panelFiltroInicio = panelFiltroInicio;
	}

	public JPanel getPanelBuscadorInicio() {
		return panelBuscadorInicio;
	}

	public void setPanelBuscadorInicio(JPanel panelBuscadorInicio) {
		this.panelBuscadorInicio = panelBuscadorInicio;
	}

	public JScrollPane getScrollPane_Libros() {
		return scrollPane_Libros;
	}

	public void setScrollPane_Libros(JScrollPane scrollPane_Libros) {
		this.scrollPane_Libros = scrollPane_Libros;
	}

	public JCheckBox getCheckBoxOpAvLibros() {
		return checkBoxOpAvLibros;
	}

	public void setCheckBoxOpAvLibros(JCheckBox checkBoxOpAvLibros) {
		this.checkBoxOpAvLibros = checkBoxOpAvLibros;
	}

	public JPanel getPanel_OpAvLibro() {
		return panel_OpAvLibro;
	}

	public void setPanel_OpAvLibro(JPanel panel_OpAvLibro) {
		this.panel_OpAvLibro = panel_OpAvLibro;
	}

	public JButton getButton_BuscarLibro() {
		return button_BuscarLibro;
	}

	public void setButton_BuscarLibro(JButton button_BuscarLibro) {
		this.button_BuscarLibro = button_BuscarLibro;
	}

	public JPanel getPanel_BuscardorLibro() {
		return panel_BuscardorLibro;
	}

	public void setPanel_BuscardorLibro(JPanel panel_BuscardorLibro) {
		this.panel_BuscardorLibro = panel_BuscardorLibro;
	}
}
