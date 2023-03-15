package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FivesScoreCategoryTest {
    private final IScoreCategory strategy = new FivesScoreCategory();

    @Test
    public void testScoreWithNoFives() {
        int[] values = {1, 3, 4, 2, 6};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeFives() {
        int[] values = {5, 3, 5, 2, 1};
        int expectedScore = 10;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllFives() {
        int[] values = {5, 5, 5, 5, 5};
        int expectedScore = 25;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}
