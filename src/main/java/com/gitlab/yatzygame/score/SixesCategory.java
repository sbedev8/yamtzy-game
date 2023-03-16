package com.gitlab.yatzygame.score;

import java.util.Arrays;

/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Sixes" category in the Yatzy game.
 */
public class SixesCategory implements IScoreCategory{

    /**
     * Calculates the score for this category based on the sum of Sixes dice values in a roll.
     *
     * @param values the values of the dice in the roll
     * @return the sum of Sixes values in the given array
     */
    @Override
    public int score(int[] values) {
        return Arrays.stream(values).filter(v -> v == 6).sum();
    }
}

