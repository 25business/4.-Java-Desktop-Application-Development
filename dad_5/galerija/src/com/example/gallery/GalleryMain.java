package com.example.gallery;

import com.example.Program;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GalleryMain extends JPanel {
    private JLabel main_image;
    // int current_index;

    public GalleryMain() {
        super();
        GalleryImage default_image = GalleryImage.load_images()[0];
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        main_image = new JLabel();
        setMainImage(default_image.image_path());
        main_image.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createVerticalGlue());
        this.add(main_image);
        this.add(Box.createVerticalGlue());
    }

    public void setMainImage(String image_path) {
        try {
            BufferedImage main_icon_source = ImageIO.read(new File(image_path));
            ImageIcon main_icon = new ImageIcon(main_icon_source);
            Image icon_image = main_icon.getImage();
            icon_image = scaleImage(icon_image, main_icon_source.getWidth(), main_icon_source.getHeight());
            main_icon = new ImageIcon(icon_image);
            main_image.setIcon(main_icon);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Image scaleImage(Image original, int ow, int oh) {
        int scaled_w = 0;
        int scaled_h = 0;
        double ratio = 1.0;
        if(ow > oh) {
            ratio = ow > Program.MIN_WIDTH ? Program.MIN_WIDTH / (double)ow : 1;
        } else {
            ratio = oh > Program.MIN_HEIGHT ? Program.MIN_HEIGHT / (double)ow : 1;
        }
        scaled_w = (int)(ratio * ow);
        scaled_h = (int)(ratio * oh);

        Image image_scaled = original.getScaledInstance(scaled_w, scaled_h, Image.SCALE_SMOOTH);
        return image_scaled;
    }
}
