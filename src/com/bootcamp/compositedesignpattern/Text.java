package com.bootcamp.compositedesignpattern;

public class Text implements Node {
    public Text() {
    }

    @Override
    public String refresh() {
        System.out.println("Text refresh!");
        return "Text";
    }
}
