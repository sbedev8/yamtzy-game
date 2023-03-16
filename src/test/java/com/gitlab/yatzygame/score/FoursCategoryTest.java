package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoursCategoryTest {
    private final IScoreCategory strategy = new FoursCategory();

    @Test
    public void testScoreWithNoFours() {
        int[] values = {1, 3, 5, 2, 6};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeFours() {
        int[] values = {5, 3, 4, 2, 1};
        int expectedScore = 4;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllFours() {
        int[] values = {4, 4, 4, 4, 4};
        int expectedScore = 20;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}
