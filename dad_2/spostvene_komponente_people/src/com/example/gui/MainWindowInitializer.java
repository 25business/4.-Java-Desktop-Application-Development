package com.example.gui;

import com.example.Person;
import com.example.events.EditAction;

import javax.swing.*;

public class MainWindowInitializer {

    public static MainWindow pack() {
        MainWindow window = new MainWindow();

        Person[] people = new Person[] {
                new Person(1, "John", "Smith", 27),
                new Person(2, "Jane", "Lilith", 25),
                new Person(3, "Mark", "Hoarst", 31)
        };

        JComboBox<Person> combo_people = new JComboBox<>(people);
        JButton button_edit = new JButton("Edit");

        JLabel label_first_name = new JLabel("First name:");
        JLabel label_last_name = new JLabel("Last name:");
        JLabel label_age = new JLabel("Age:");
        JTextField text_first_name = new JTextField();
        JTextField text_last_name = new JTextField();
        JTextField text_age = new JTextField();
        combo_people.setBounds(10, 10, 200, 25);
        button_edit.setBounds(10, 40, 120, 25);
        label_first_name.setBounds(10, 80, 150, 25);
        label_last_name.setBounds(10, 110, 150, 25);
        label_age.setBounds(10, 140, 150, 25);
        text_first_name.setBounds(160, 80, 150, 25);
        text_last_name.setBounds(160, 110, 150, 25);
        text_age.setBounds(160, 140, 150, 25);

        button_edit.addActionListener(new EditAction(combo_people,
                text_first_name, text_last_name, text_age));

        window.add(combo_people);
        window.add(button_edit);
        window.add(label_first_name);
        window.add(label_last_name);
        window.add(label_age);
        window.add(text_first_name);
        window.add(text_last_name);
        window.add(text_age);

        return window;
    }
}
