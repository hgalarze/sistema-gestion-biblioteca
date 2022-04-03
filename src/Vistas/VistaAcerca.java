package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;

import Controladores.ControladorAcerca;

import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Cursor;
import java.awt.Dialog.ModalityType;

public class VistaAcerca extends JDialog {

	// Attributes //
	
	private JPanel contentPane;
	private JSeparator separator;
	private JPanel panelImagen;
	private JLabel lblLogo;
	private JTextPane txtNombreSistema;
	private JLabel lblVersion;
	private JTextPane txtLicencia;
	private JButton btnAceptar;
	private ControladorAcerca controladorAcerca;
	private JLabel label;

	/**
	 * Constructor de la ventana "Acerca de..." que muestra información del sistema.
	 * @param controladorAcerca Controlador para la ventana "Acerca de..."
	 */
	public VistaAcerca(ControladorAcerca controladorAcerca) {
		try{
			this.setIconImage(Toolkit.getDefaultToolkit().getImage(VistaAcerca.class.getResource("/Resources/Imagenes/Logo.png")));
			this.setModalityType(ModalityType.DOCUMENT_MODAL);
			this.setModal(true);
			this.setResizable(false);
			this.controladorAcerca = controladorAcerca;
			this.setTitle("Acerca del Sistema de Gestión de Biblioteca");
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setBounds(100, 100, 534, 260);
			this.contentPane = new JPanel();
			this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			this.setContentPane(this.contentPane);
			this.contentPane.setLayout(null);
			
			this.label = new JLabel("");
			this.label.setIcon(new ImageIcon(VistaAcerca.class.getResource("/Resources/Imagenes/licenciaPermisos.png")));
			this.label.setBounds(14, 192, 88, 31);
			this.contentPane.add(this.label);
			
			this.separator = new JSeparator();
			this.separator.setBounds(0, 148, 532, 2);
			this.contentPane.add(this.separator);
			
			this.panelImagen = new JPanel();
			this.panelImagen.setBackground(Color.WHITE);
			this.panelImagen.setBounds(0, 0, 532, 150);
			this.contentPane.add(this.panelImagen);
			this.panelImagen.setLayout(null);
			
			this.lblLogo = new JLabel("");
			this.lblLogo.setIcon(new ImageIcon(VistaAcerca.class.getResource("/Resources/Imagenes/Logo_mediano.png")));
			this.lblLogo.setBounds(417, 28, 80, 95);
			this.panelImagen.add(this.lblLogo);
			
			this.txtNombreSistema = new JTextPane();
			this.txtNombreSistema.setDisabledTextColor(Color.BLACK);
			this.txtNombreSistema.setEnabled(false);
			this.txtNombreSistema.setOpaque(false);
			this.txtNombreSistema.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			this.txtNombreSistema.setEditable(false);
			this.txtNombreSistema.setFont(new Font("Tahoma", Font.PLAIN, 20));
			this.txtNombreSistema.setText("Sistema de Gestión de Biblioteca");
			this.txtNombreSistema.setBounds(10, 11, 216, 56);
			this.panelImagen.add(this.txtNombreSistema);
			
			this.lblVersion = new JLabel("1.0.0");
			this.lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 12));
			this.lblVersion.setBounds(13, 69, 173, 14);
			this.panelImagen.add(this.lblVersion);
			
			this.btnAceptar = new JButton("Aceptar");
			this.btnAceptar.setBounds(428, 194, 85, 29);
			this.contentPane.add(this.btnAceptar);
			this.btnAceptar.addActionListener(this.controladorAcerca);
			
			this.txtLicencia = new JTextPane();
			this.txtLicencia.setEnabled(false);
			this.txtLicencia.setEditable(false);
			this.txtLicencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
			this.txtLicencia.setBackground(SystemColor.control);
			this.txtLicencia.setText("Esta obra está sujeta a la licencia Reconocimiento-NoComercial-SinObraDerivada 3.0 Unported de Creative Commons.");
			this.txtLicencia.setBounds(10, 154, 396, 34);
			this.contentPane.add(this.txtLicencia);
			this.setLocationRelativeTo(null);
		}catch(Exception e){
			
		}
	}
}
