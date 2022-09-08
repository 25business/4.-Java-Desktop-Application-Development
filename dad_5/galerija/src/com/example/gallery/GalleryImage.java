package com.example.gallery;

public class GalleryImage {
    private String thumbnail;
    private String image;

    public GalleryImage(String thumbnail, String image) {
        this.thumbnail = thumbnail;
        this.image = image;
    }

    public String thumbnail_path() {
        return System.getenv("JAVA_RESOURCES") + "/dad5/" + thumbnail;
    }
    public String image_path() {
        return System.getenv("JAVA_RESOURCES") + "/dad5/" + image;
    }

    public static GalleryImage[] load_images() {
        return new GalleryImage[] {
                new GalleryImage("slika1_thumbnail.jpg", "slika1.jpg"),
                new GalleryImage("slika2_thumbnail.jpg", "slika2.jpg"),
                new GalleryImage("slika3_thumbnail.jpg", "slika3.jpg"),
                new GalleryImage("slika4_thumbnail.jpg", "slika4.jpg")
        };
    }
}
