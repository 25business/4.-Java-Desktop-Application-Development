package com.example.gallery;

import javax.swing.*;
import java.awt.*;

public class ThumbnailLabel extends JLabel {
    private GalleryImage image_info;

    public ThumbnailLabel(GalleryImage image_info) {
        this.image_info = image_info;
        this.setIcon(new ImageIcon(image_info.thumbnail_path()));
        this.setPreferredSize(new Dimension(150,150));
    }

    public GalleryImage getImage_info() { return this.image_info; }
}
