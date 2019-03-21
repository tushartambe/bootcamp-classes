package com.bootcamp.chance;

class Probability {
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 1;
    private final double value;

    Probability(double value) throws ProbabilityException {
        validate(value);
        this.value = value;
    }

    private void validate(double value) throws ProbabilityException {
        if (value < LOWER_BOUND || value > UPPER_BOUND) throw new ProbabilityException();
    }

    Probability not() throws ProbabilityException {
        return new Probability(UPPER_BOUND - this.value);
    }

    Probability and(Probability anotherProbability) throws ProbabilityException {
        return new Probability(this.value * anotherProbability.value);
    }

    Probability or(Probability anotherProbability) throws ProbabilityException {
        double totalProbabilityValue = this.value + anotherProbability.value;
        Probability compoundProbability = and(anotherProbability);
        return new Probability(totalProbabilityValue - compoundProbability.value);
    }

    @Override
    public boolean equals(Object probability) {
        if (this == probability) return true;
        if (!(probability instanceof Probability)) return false;
        Probability that = (Probability) probability;
        return Double.compare(that.value, value) == 0;
    }
}
