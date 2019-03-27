package com.bootcamp.bagandball;

import java.util.Map;

public interface Validator {
    boolean validate(Map<Color, Integer> ballCount);
}
