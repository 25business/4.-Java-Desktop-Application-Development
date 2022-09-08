package com.example.gallery;

import com.example.Program;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;

public class GalleryHeader extends JPanel {
    private JLabel heading;

    public GalleryHeader() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.heading = new JLabel("Asian themed gallery");

        try {
            InputStream font_buffer = Program.class.getResourceAsStream("resources/go3v2.ttf");
            Font custom_font = Font.createFont(Font.TRUETYPE_FONT, font_buffer).deriveFont(Font.PLAIN, 42.0F);
            this.heading.setFont(custom_font);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        this.heading.setPreferredSize(new Dimension(Integer.MAX_VALUE, 60));
        this.heading.setHorizontalAlignment(SwingConstants.CENTER);
        this.heading.setVerticalAlignment(SwingConstants.CENTER);
        this.setBackground(new Color(255, 236, 140));
        this.add(this.heading, BorderLayout.CENTER);
    }
}
