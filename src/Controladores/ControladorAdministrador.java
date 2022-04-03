package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vistas.VistaAdministrador;

public class ControladorAdministrador implements ActionListener{
	
	private VistaAdministrador vistaAdministrador;
	
	public ControladorAdministrador(){
		this.vistaAdministrador = new VistaAdministrador(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		System.out.println(arg.getActionCommand());
		if (arg.getActionCommand().equals("Salir")){
			this.salir();
		}
		if (arg.getActionCommand().equals("Acerca de SGB")){
			new ControladorAcerca();
		}
	}
	
	private void salir(){
		System.exit(0);
	}
	
	
}
