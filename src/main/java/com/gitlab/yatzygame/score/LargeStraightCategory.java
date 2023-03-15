package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.StraightValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The LargeStraightCategory class implements the IScoreCategory interface and represents the
 * "LargeStraight" category in the Yatzy game.
 */
public class LargeStraightCategory implements IScoreCategory{

    /**
     * This implementation of the Large Straight score, which a sequence of five consecutive numbers ( from 2 to 6) in the rolled dice values
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {
        List<Integer> distinct = Arrays.stream(values).distinct().boxed().sorted().collect(Collectors.toList());
        return isLargeStraight(distinct) ? 20 : 0;
    }

    /**
     * @param distinct list of distinct integer values representing the dice rolled
     * @return  true if the list of integers represents a large straight, which is defined as a sequence of 2, 3, 4, 5, 6 false otherwise
     */
    private boolean isLargeStraight(List<Integer> distinct) {
        List<Integer> smallStraight = StraightValue.LARGE_STRAIGHT.getValues();
        return distinct.equals(smallStraight);
    }
}

