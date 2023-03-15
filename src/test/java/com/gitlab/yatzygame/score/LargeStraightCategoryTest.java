package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeStraightCategoryTest {
    private final IScoreCategory strategy = new LargeStraightCategory();

    @Test
    public void testScoreWithoutLargeStraight() {
        int[] values = {2, 6, 6, 3, 4};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithLargeStraight() {
        int[] values = {2, 5, 6, 3, 4};
        int expectedScore = 20;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }


}
