package com.bootcamp.Shape;

public class Square implements Shape{
    private Dimension side;

    public Square(Dimension side) {
        this.side = side;
    }

    @Override
    public double calculateArea(){
        return side.getSide() * side.getSide();
    }

    @Override
    public double calculatePerimeter(){
        return 4*(side.getSide());

    }
}

