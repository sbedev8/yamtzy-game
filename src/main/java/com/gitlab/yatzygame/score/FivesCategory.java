package com.gitlab.yatzygame.score;

import java.util.Arrays;

/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Fives" category in the Yatzy game.
 */
public class FivesCategory implements IScoreCategory{

    /**
     * Calculates the score for this category based on the sum of Fives dice values in a roll.
     *
     * @param values the values of the dice in the roll
     * @return the sum of Fives values in the given array
     */
    @Override
    public int score(int[] values) {
        return Arrays.stream(values).filter(v -> v == 5).sum();
    }
}

