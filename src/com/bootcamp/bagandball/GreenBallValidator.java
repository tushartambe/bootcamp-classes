package com.bootcamp.bagandball;

import java.util.Map;

public class GreenBallValidator implements Validator {

    @Override
    public boolean validate(Map<Color,Integer> ballsCount) {
        Integer totalGreenBalls = ballsCount.get(Color.GREEN);
        return totalGreenBalls < 3;
    }
}
