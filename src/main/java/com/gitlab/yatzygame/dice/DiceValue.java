package com.gitlab.yatzygame.dice;

/**
 * Represents the possible values of a dice.
 */
public enum DiceValue {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    private final int value;

    DiceValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
