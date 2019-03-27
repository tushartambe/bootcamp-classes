package com.bootcamp.bagandball;

import java.util.Map;

public class BlueBallValidator implements Validator {
    @Override
    public boolean validate(Map<Color, Integer> ballCount) {
        return true;
    }
}
