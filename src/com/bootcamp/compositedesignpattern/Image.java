package com.bootcamp.compositedesignpattern;

public class Image implements Node {
    Image() {
    }

    @Override
    public String refresh() {
        System.out.println("Image refresh!");
        return "Image";
    }
}
