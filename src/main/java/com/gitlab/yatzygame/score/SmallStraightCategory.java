package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.StraightValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The SmallStraightScoreCategory class implements the IScoreCategory interface and represents the
 * "SmallStraightScore" category in the Yatzy game.
 */

public class SmallStraightCategory implements IScoreCategory{

    /**
     * This implementation of the Small Straight score, which a sequence of five consecutive numbers ( from 1 to 5) in the rolled dice values
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {
        List<Integer> distinct = Arrays.stream(values).distinct().boxed().sorted().collect(Collectors.toList());
        return isSmallStraight(distinct) ? 15 : 0;
    }

    /**
     * @param distinct list of distinct integer values representing the dice rolled
     * @return  true if the list of integers represents a samll straight, which is defined as a sequence of 1, 2, 3, 4, 5 false otherwise
     */
    private boolean isSmallStraight(List<Integer> distinct) {
        List<Integer> smallStraight = StraightValue.SMALL_STRAIGHT.getValues();
        return distinct.equals(smallStraight);
    }
}

