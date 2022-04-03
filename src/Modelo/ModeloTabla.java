package Modelo;

import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel{

	public ModeloTabla() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isEditable(){
		return false;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
