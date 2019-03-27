package com.bootcamp.bagandball;

class Ball {
    private Color color;

    Ball(Color color) {
        this.color = color;
    }

    public boolean isOfColor(Color color) {
        return this.color.equals(color);
    }

    public Color getColor() {
        return this.color;
    }
}
