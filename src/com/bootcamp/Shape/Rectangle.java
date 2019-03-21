package com.bootcamp.Shape;

public class Rectangle implements Shape{
    private Dimension length;
    private Dimension breadth;

    public Rectangle(Dimension length, Dimension breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea(){
        return length.getSide() * breadth.getSide();
    }

    @Override
    public double calculatePerimeter(){
        return 2*(length.getSide() + breadth.getSide());

    }
}
