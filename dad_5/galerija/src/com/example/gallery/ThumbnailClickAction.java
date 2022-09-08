package com.example.gallery;

import com.example.Program;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ThumbnailClickAction implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
       ThumbnailLabel clicked_label = (ThumbnailLabel) e.getSource();
       GalleryImage image_info = clicked_label.getImage_info();
       Program.galleryMain.setMainImage(image_info.image_path());
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
