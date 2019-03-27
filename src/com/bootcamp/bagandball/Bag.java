package com.bootcamp.bagandball;

import java.util.Map;

class Bag {

    private Balls balls;
    private Integer capacity;
    private static Map<Color, Validator> validators;

    static {
        validators.put(Color.GREEN, new GreenBallValidator());
        validators.put(Color.BLUE, new BlueBallValidator());
        validators.put(Color.YELLOW, new YellowBallValidator());
        validators.put(Color.RED, new RedBallValidator());
    }

    Bag(Integer capacity) {
        this.capacity = capacity;
        this.balls = new Balls();
    }


    void add(Ball ball) {
        if (this.capacity < this.balls.getTotalCount()) {
            this.balls.add(ball,validators.get(ball.getColor()));
        }
    }

    Map getSummary() {
        return this.balls.getSummary();
    }
}
