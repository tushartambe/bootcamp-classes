package com.bootcamp.bagandball;

import java.util.*;

class Balls {

    private List<Ball> balls;
    private Map<Color, Integer> ballsCount;

    Balls() {
        this.ballsCount = new HashMap<>();
        this.balls = new ArrayList<>();
    }

    void add(Ball ball, Validator validator) {
        if (!validator.validate(ballsCount)){
//            throw new BallCannotBeAddedException("Ball doesn't fit in rule");
        };
        Color ballColor = ball.getColor();
        this.ballsCount.putIfAbsent(ballColor, 0);
        Integer ballCount = this.ballsCount.get(ballColor);
        ballCount++;
        this.ballsCount.put(ballColor, ballCount);
        this.balls.add(ball);
    }

    Map getSummary() {
        StringBuilder summary = new StringBuilder();
        return Collections.unmodifiableMap(this.ballsCount);
    }

    Integer getTotalCount() {
        return this.balls.size();
    }
}
