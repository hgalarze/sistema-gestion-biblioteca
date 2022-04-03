package Controladores;

import java.awt.event.*;
import Vistas.VistaAcerca;

public class ControladorAcerca implements ActionListener{
	
	private VistaAcerca vistaAcerca;
	
	public ControladorAcerca(){
		this.vistaAcerca = new VistaAcerca(this);
		this.vistaAcerca.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Aceptar")){
			this.vistaAcerca.dispose();
		}
	}

}
