package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SixesScoreCategoryTest {
    private final IScoreCategory strategy = new SixesScoreCategory();

    @Test
    public void testScoreWithNoSixes() {
        int[] values = {1, 3, 4, 2, 2};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeSixes() {
        int[] values = {6, 3, 6, 6, 1};
        int expectedScore = 18;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllSixes() {
        int[] values = {6, 6, 6, 6, 6};
        int expectedScore = 30;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}
