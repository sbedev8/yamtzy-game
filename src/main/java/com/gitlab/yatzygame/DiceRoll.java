package com.gitlab.yatzygame;

/**
 * Represents a set of five dice values.
 */
public class DiceRoll {
    // An array to store the values of the five dice.
     private final int[] diceValues = new int[5];

    public DiceRoll(DiceValue d1, DiceValue d2, DiceValue d3, DiceValue d4, DiceValue d5) {

        diceValues[0] = d1.getValue();
        diceValues[1] = d2.getValue();
        diceValues[2] = d3.getValue();
        diceValues[3] = d4.getValue();
        diceValues[4] = d5.getValue();
    }

    /**
     * Returns the values of the five dice as an array.
     * @return the values of the five dice
     */
    public int[] getDiceValues() {
        return diceValues;
    }

}

