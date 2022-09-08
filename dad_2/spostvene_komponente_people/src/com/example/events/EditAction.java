package com.example.events;

import com.example.Person;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditAction implements ActionListener {
    private JComboBox<Person> people_combo;
    private JTextField text_first_name;
    private JTextField text_last_name;
    private JTextField text_age;

    public EditAction(JComboBox<Person> people_combo, JTextField text_first_name, JTextField text_last_name, JTextField text_age) {
        this.people_combo = people_combo;
        this.text_first_name = text_first_name;
        this.text_last_name = text_last_name;
        this.text_age = text_age;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Person person = (Person)people_combo.getSelectedItem();
        text_first_name.setText(person.getFirst_name());
        text_last_name.setText(person.getLast_name());
        text_age.setText(String.valueOf(person.getAge()));
    }
}
