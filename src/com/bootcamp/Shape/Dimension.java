package com.bootcamp.Shape;

class Dimension {
    private double side;

    Dimension(double side) throws Exception {
        if (side < 0) throw new Exception("invalid side");
        this.side = side;
    }

    double getSide() {
        return side;
    }
}
