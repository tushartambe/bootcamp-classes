package com.bootcamp.chance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void shouldThrowExceptionWhenProbabilityIsLessThanLowerBound() {
        assertThrows(ProbabilityException.class, () -> new Probability(-1));
    }

    @Test
    void shouldThrowExceptionIfValueIsGreaterThanUpperBound() {
        assertThrows(ProbabilityException.class, () -> new Probability(2));
    }

    @Test
    @DisplayName("should  not throw exception when value is valid")
    void shouldNotThrowExceptionIfValueIsValid() {
        assertDoesNotThrow(() -> new Probability(0.9));
    }

    @Test
    void shouldGiveTheProbabilityOfNotGetting() throws ProbabilityException {
        Probability probabilityOfGetting = new Probability(0.2);
        Probability probabilityOfNotGetting = probabilityOfGetting.not();
        Probability expectedProbabilityOfNotGetting = new Probability(0.8);
        assertEquals(expectedProbabilityOfNotGetting, probabilityOfNotGetting);
    }

    @Test
    void shouldGiveTheProbabilityOfGettingBothOccurances() throws ProbabilityException {
        Probability probability = new Probability(0.5);
        Probability anotherProbability = new Probability(0.3);
        Probability probabilityOfGettingBoth = probability.and(anotherProbability);
        Probability expectedProbability = new Probability(.15);
        assertEquals(expectedProbability, probabilityOfGettingBoth);
    }

    @Test
    void shouldGiveTheProbabilityOfGettingAtleastOneOccurance() throws ProbabilityException {
        Probability probability = new Probability(0.5);
        Probability anotherProbability = new Probability(0.5);
        Probability probabilityOfGettingAtleastOne = probability.or(anotherProbability);
        Probability expectedProbability = new Probability(.75);
        assertEquals(expectedProbability, probabilityOfGettingAtleastOne);
    }


}