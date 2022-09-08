package com.example;

import com.example.data.PeopleDataLoader;
import com.example.data.PeopleTableModel;
import com.example.data.Person;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Tabele");
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Object[][] table_data =  PeopleDataLoader.load();
        String[] table_headers = new String[] {
                "ID", "First name", "Last name", "Age"
        };
        //JTable table = new JTable(table_data, table_headers);
        JTable table = new JTable(new PeopleTableModel());

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane table_container = new JScrollPane(table);

        frame.add(table_container, BorderLayout.CENTER);

        JButton btn_pick = new JButton("Get data");
        frame.add(btn_pick, BorderLayout.PAGE_END);

        btn_pick.addActionListener( actionEvent -> {
            int selected_row = table.getSelectedRow();
            //var selected_rows = table.getSelectedRows();
            //System.out.println(Arrays.toString(selected_rows));
            //var first_name = table.getModel().getValueAt(selected_row, 1);
            //System.out.println(first_name);
            /*
            var person_id = table.getModel().getValueAt(selected_row, 0);
            Person p = PeopleDataLoader.get_for_id((int)person_id);
            System.out.println(p.getFirst_name() + " " +
                    p.getLast_name());
             */

            var table_model = (PeopleTableModel)table.getModel();
            Person p = table_model.getPersonAtRow(selected_row);
            System.out.println(p.getFirst_name() + " " +
                    p.getLast_name());

        });

        frame.setVisible(true);
    }
}
