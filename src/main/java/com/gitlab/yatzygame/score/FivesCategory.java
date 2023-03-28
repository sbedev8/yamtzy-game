package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.Arrays;

/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Fives" category in the Yatzy game.
 */
public class FivesCategory implements IScoreCategory{

    /**
     * Calculates the score for this category based on the sum of Fives dice values in a roll.
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        return diceRoll.getSumOfDiceValues(5);
    }
}

