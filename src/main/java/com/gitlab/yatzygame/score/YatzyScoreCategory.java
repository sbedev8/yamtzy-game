package com.gitlab.yatzygame.score;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Yatzy" category in the Yatzy game.
 */
public class YatzyScoreCategory implements IScoreCategory{

    /**
     * the yatzy function checks if the five dice have the same value if so it returns a score=50
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {

        Map<Integer, Long> countForEachElement = Arrays.stream(values).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        if (countForEachElement.size() == 1) {
            return 50;
        }
        return 0;
    }
}

