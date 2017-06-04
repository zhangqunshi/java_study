package com.nastation.c13;

import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class Table2 extends JApplet {

	public void init() {
		// TableModel dataModel = new AbstractTableModel() {
		//     public int getColumnCount() { return 10; }
		//     public int getRowCount() { return 10;}
		//     public Object getValueAt(int row, int col) { return new Integer(row*col); }
		// };
		// JTable table = new JTable(dataModel);
		
		Object[][] rowData = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		Object[] columnNames = {
				"kris1", "kris2", "kris3", "kris4"
		};
		
		JTable table = new JTable(rowData, columnNames);

		JScrollPane scrollpane = new JScrollPane(table);

		add(scrollpane);

	}

}
