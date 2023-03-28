package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.Arrays;

/**
 * The ChanceScoreCategory class implements the IScoreCategory interface and represents the
 * "Chance" category in the Yatzy game.
 */
public class ChanceCategory implements IScoreCategory {

    /**
     * Calculates the score for this category based on the sum of all dice values in a roll.
     *
     * @param diceRoll the dice roll
     * @return the sum of all values
     */
    @Override
    public int score(DiceRoll diceRoll) {
        return diceRoll.getSumOfAllDice();
    }
}