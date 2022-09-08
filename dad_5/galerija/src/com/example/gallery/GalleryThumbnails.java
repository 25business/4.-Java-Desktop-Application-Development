package com.example.gallery;

import javax.swing.*;
import java.awt.*;

public class GalleryThumbnails extends JPanel {

    public GalleryThumbnails() {
        super();
        this.setLayout(new FlowLayout());
        GalleryImage[] galleryImages = GalleryImage.load_images();

        for(GalleryImage gi : galleryImages) {
            ThumbnailLabel thumbnail = new ThumbnailLabel(gi);
            thumbnail.addMouseListener(new ThumbnailClickAction());
            this.add(thumbnail);
        }
    }
}
