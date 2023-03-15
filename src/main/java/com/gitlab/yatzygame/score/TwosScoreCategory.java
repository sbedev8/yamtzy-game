package com.gitlab.yatzygame.score;

import java.util.Arrays;
/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Twos" category in the Yatzy game.
 */
public class TwosScoreCategory implements IScoreCategory {
    /**
     * Calculates the score for this category based on the sum of Twos dice values in a roll.
     *
     * @param values the values of the dice in the roll
     * @return the sum of Twos values in the given array
     */
    public int score(int[] values) {
        return Arrays.stream(values).filter(v -> v == 2).sum();
    }
}