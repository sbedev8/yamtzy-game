package com.gitlab.yatzygame;

import java.util.Arrays;
import java.util.List;

/**
 * An enum representing the different straight categories in the Yatzy game.
 */
public enum StraightValue {
    SMALL_STRAIGHT(Arrays.asList(DiceValue.ONE.getValue(), DiceValue.TWO.getValue(), DiceValue.THREE.getValue(), DiceValue.FOUR.getValue(), DiceValue.FIVE.getValue())),  // 1 2 3 4 5
    LARGE_STRAIGHT(Arrays.asList(DiceValue.TWO.getValue(), DiceValue.THREE.getValue(), DiceValue.FOUR.getValue(), DiceValue.FIVE.getValue(), DiceValue.SIX.getValue()));  // 2 3 4 5 6
    private final List<Integer> values;

    StraightValue(List<Integer> values) {
        this.values = values;
    }

    public List<Integer> getValues() {
        return values;
    }
}
