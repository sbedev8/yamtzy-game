package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.Arrays;

/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Aces" category in the Yatzy game.
 */
public class AcesCategory implements IScoreCategory {

    /**
     * Calculates the score for this category based on the sum of Aces dice values in a roll.
     *
     * @param diceRoll the dice roll
     * @return the sum of Aces values
     */
    public int score(DiceRoll diceRoll) {
        return diceRoll.getSumOfDiceValues(1);
    }
}