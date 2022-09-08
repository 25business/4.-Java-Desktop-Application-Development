package com.example.data;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PeopleTableModel extends AbstractTableModel {
    private String[] table_headings;
    private ArrayList<Person> people;
    private Object[][] table_data;

    public PeopleTableModel() {
        this.table_headings = new String[] {
          "TM ID", "First Name", "Last Name", "Age"
        };
        people = PeopleDataLoader.get_people();
        table_data = new Object[people.size()][3];
        for(int i = 0; i < table_data.length; i++) {
            table_data[i] = people.get(i).to_table_row();
        }
    }
    public String getColumnName(int col) {
        return table_headings[col].toString();
    }

    public Person getPersonAtRow(int row_index) {
        return people.get(row_index);
    }

    @Override
    public int getRowCount() {
        return this.table_data.length;
    }

    @Override
    public int getColumnCount() {
        return this.table_headings.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: default: return people.get(rowIndex).getId();
            case 1: return people.get(rowIndex).getFirst_name();
            case 2: return people.get(rowIndex).getLast_name();
            case 3: return people.get(rowIndex).getAge();
        }
    }

    public boolean isCellEditable(int row, int col)
    { return true; }

    public void setValueAt(Object value, int row, int col) {
        table_data[row][col] = value;
        switch (col) {
            case 0: people.get(row).setId((int) value); break;
            case 1: people.get(row).setFirst_name((String)value); break;
            case 2: people.get(row).setLast_name((String)value); break;
            case 3: people.get(row).setAge((int)value); break;
        }
        // UPDATE Query
        fireTableCellUpdated(row, col);
    }
}
