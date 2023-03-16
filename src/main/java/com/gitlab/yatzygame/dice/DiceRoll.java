package com.gitlab.yatzygame.dice;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Represents a set of five dice values.
 */
public class DiceRoll {
    // An array to store the values of the five dice.
     private final int[] diceValues ;

    public DiceRoll(DiceValue d1, DiceValue d2, DiceValue d3, DiceValue d4, DiceValue d5) {
        diceValues = new int[5];
        diceValues[0] = d1.getValue();
        diceValues[1] = d2.getValue();
        diceValues[2] = d3.getValue();
        diceValues[3] = d4.getValue();
        diceValues[4] = d5.getValue();
    }

    public DiceRoll() {
        Random random = new Random();
        this.diceValues = random.ints(5, 1, 7).toArray();
    }

    /**
     * Returns the values of the five dice as an array.
     * @return the values of the five dice
     */
    public int[] getDiceValues() {
        return diceValues;
    }

}

