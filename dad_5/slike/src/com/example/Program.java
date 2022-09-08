package com.example;

import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Slike");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel image_panel = new JPanel();
        image_panel.setLayout(new BoxLayout(image_panel, BoxLayout.Y_AXIS));

        JLabel slika_1 = new JLabel();
        slika_1.setIcon(new ImageIcon(System.getenv("JAVA_RESOURCES") + "/dad5/grand_canyon.jpeg" ));
        image_panel.add(slika_1);

        try {
            JLabel slika_2 = new JLabel();
            BufferedImage buffered_2 = ImageIO.read(new URL("https://picsum.photos/320/180"));
            slika_2.setIcon(new ImageIcon(buffered_2));
            image_panel.add(slika_2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            String img3_base64 = """
                    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""";
            byte[] img3_bytes = Base64.decodeBase64(img3_base64);
            JLabel slika_3 = new JLabel();
            slika_3.setIcon(new ImageIcon(img3_bytes));
            image_panel.add(slika_3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        frame.add(image_panel);
        frame.setVisible(true);
    }
}
