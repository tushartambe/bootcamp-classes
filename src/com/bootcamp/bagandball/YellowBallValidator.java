package com.bootcamp.bagandball;

import java.util.Collection;
import java.util.Map;

public class YellowBallValidator implements Validator {
    @Override
    public boolean validate(Map<Color, Integer> ballCount) {
        Collection<Integer> totalBalls = ballCount.values();
        Integer totalBallCount = getTotalBallsCount(totalBalls);
        Integer totalYellowBalls = ballCount.get(Color.YELLOW);
        return Math.floor(totalBallCount * 0.4) > totalYellowBalls;
    }

    private Integer getTotalBallsCount(Collection<Integer> totalBalls) {
        Integer totalBallCount = 0;
        for (Integer count : totalBalls) {
            totalBallCount += count;
        }
        return totalBallCount;
    }
}
