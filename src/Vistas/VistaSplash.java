package Vistas;

import java.awt.*;
import javax.swing.*;
import Controladores.ControladorAdministrador;

public class VistaSplash extends JFrame {
	
	private ImageIcon imagen;
	private static String RUTA_FONDO_SPLASH = "/Resources/Imagenes/Splash.jpg";
	private static String RUTA_ICONO = "/Resources/Imagenes/Logo.png";
	private JLabel lbl_ImgFondo;


	/**
	 * Create the frame.
	 */
	public VistaSplash() {
		try {
			this.setResizable(false);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setBounds(100, 100, 590, 298);
			this.setUndecorated(true);
			this.getContentPane().setLayout(null);
			this.setIconImage(new ImageIcon(getClass().getResource(RUTA_ICONO)).getImage());
			
			this.imagen = new ImageIcon(getClass().getResource(RUTA_FONDO_SPLASH));
			
			this.lbl_ImgFondo = new JLabel();
			this.lbl_ImgFondo.setIcon(imagen);
			this.lbl_ImgFondo.setHorizontalAlignment(SwingConstants.CENTER);
			this.lbl_ImgFondo.setBounds(0, 0, 590, 298);
			this.getContentPane().add(lbl_ImgFondo);
			
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			Thread.sleep(5000);
			this.dispose();
			new ControladorAdministrador();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
