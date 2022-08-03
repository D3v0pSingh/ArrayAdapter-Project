package com.example.fruitsadapter;

public class Fruits {

    private String fname;
    private String ftype;
    private int imageId;

    public Fruits(String fname, String ftype, int imageId) {
        this.fname = fname;
        this.ftype = ftype;
        this.imageId = imageId;
    }

    public String getFname() {
        return fname;
    }

    public String getFtype() {
        return ftype;
    }

    public int getImageId() {
        return imageId;
    }
}
