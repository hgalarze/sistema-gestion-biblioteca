import javax.swing.UIManager;

import Vistas.VistaSplash;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new VistaSplash();
		}catch(Exception e){
			
		}

	}

}
