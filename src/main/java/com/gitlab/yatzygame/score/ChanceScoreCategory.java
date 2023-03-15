package com.gitlab.yatzygame.score;

import java.util.Arrays;

/**
 * The ChanceScoreCategory class implements the IScoreCategory interface and represents the
 * "Chance" category in the Yatzy game.
 */
public class ChanceScoreCategory implements IScoreCategory {

    /**
     * Calculates the score for this category based on the sum of all dice values in a roll.
     *
     * @param values the values of the dice in the roll
     * @return the sum of all values in the given array
     */
    @Override
    public int score(int[] values) {
        return Arrays.stream(values).sum();
    }
}