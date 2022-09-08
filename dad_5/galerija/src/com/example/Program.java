package com.example;

import com.example.gallery.GalleryHeader;
import com.example.gallery.GalleryMain;
import com.example.gallery.GalleryThumbnails;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static final int MIN_WIDTH = 1200;
    public static final int MIN_HEIGHT = 960;
    public static final  GalleryMain galleryMain = new GalleryMain();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Slike");
        frame.setSize(MIN_WIDTH, MIN_HEIGHT);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setMinimumSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        GalleryHeader galleryHeader = new GalleryHeader();
        frame.add(galleryHeader, BorderLayout.PAGE_START);

        GalleryThumbnails galleryThumbnails = new GalleryThumbnails();
        frame.add(galleryThumbnails, BorderLayout.PAGE_END);

        frame.add(galleryMain, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
