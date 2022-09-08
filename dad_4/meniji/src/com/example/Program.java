package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Meniji");
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JMenuBar main_bar = new JMenuBar();
        JMenu program_menu = new JMenu("Program");
        main_bar.add(program_menu);

        JMenuItem program_close_item = new JMenuItem("Close", KeyEvent.VK_X);
        program_close_item.setMnemonic(KeyEvent.VK_X);
        program_close_item.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        program_close_item.addActionListener(actionEvent ->{
            System.exit(0);
        });

        JMenu file_menu = new JMenu("File...");
        JMenuItem file_open = new JMenuItem("Open");
        JMenuItem file_save = new JMenuItem("Save");
        file_menu.add(file_open);
        file_menu.add(file_save);
        program_menu.add(file_menu);

        program_menu.add(program_close_item);

        JMenuItem about_item = new JMenuItem("About");
        main_bar.add(about_item);

        frame.setJMenuBar(main_bar);

        frame.setVisible(true);
    }
}
