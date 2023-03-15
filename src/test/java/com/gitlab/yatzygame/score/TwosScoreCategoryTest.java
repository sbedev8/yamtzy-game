package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwosScoreCategoryTest {

    private final IScoreCategory strategy = new TwosScoreCategory();

    @Test
    public void testScoreWithNoTwos() {
        int[] values = {1, 3, 5, 4, 6};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeTwos() {
        int[] values = {5, 4, 2, 2, 1};
        int expectedScore = 4;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllTwos() {
        int[] values = {2, 2, 2, 2};
        int expectedScore = 8;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}