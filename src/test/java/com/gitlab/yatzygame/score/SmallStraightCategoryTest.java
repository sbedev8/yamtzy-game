package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallStraightCategoryTest {
    private final IScoreCategory strategy = new SmallStraightCategory();

    @Test
    public void testScoreWithoutSmallStraight() {
        int[] values = {2, 2, 1, 3, 5};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSmallStraight() {
        int[] values = {2, 3, 1, 5, 4};
        int expectedScore = 15;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }


}
