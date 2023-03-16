package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnePairScoreCategoryTest {
    private final IScoreCategory strategy = new OnePairScoreCategory();

    @Test
    public void testScoreWithoutOnePair() {
        int[] values = {1, 6, 4, 5, 2};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithOnePair() {
        int[] values = {1, 3, 2, 2, 5};
        int expectedScore = 4;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithOnePairOtherValues() {
        int[] values = {1, 2, 2, 2, 5};
        int expectedScore = 4;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithTwoPair() {
        int[] values = {1, 6, 2, 2, 6};
        int expectedScore = 12;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
