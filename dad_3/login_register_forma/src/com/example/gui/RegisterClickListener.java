package com.example.gui;

import com.example.Program;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterClickListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        Program.MAIN_CARD_LAYOUT.show(Program.MAIN_CONTAINER, "REGISTER");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
