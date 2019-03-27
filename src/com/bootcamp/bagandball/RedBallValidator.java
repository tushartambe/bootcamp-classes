package com.bootcamp.bagandball;

import java.util.Map;

public class RedBallValidator implements Validator {

    @Override
    public boolean validate(Map<Color, Integer> ballsCount) {
        Integer totalGreenBalls = ballsCount.get(Color.GREEN);
        Integer totalRedBalls = ballsCount.get(Color.RED);
        return totalRedBalls < 2 * totalGreenBalls;
    }
}

