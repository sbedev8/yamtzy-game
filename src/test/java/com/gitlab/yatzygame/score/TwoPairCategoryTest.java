package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoPairCategoryTest {
    private final IScoreCategory strategy = new TwoPairCategory();

    @Test
    public void testScoreWithoutTwoPair() {
        int[] values = {1, 6, 4, 5, 2};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithonePair() {
        int[] values = {1, 3, 2, 2, 5};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithTwoPair() {
        int[] values = {1, 6, 2, 2, 6};
        int expectedScore = 16;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithTwoPairOtherValues() {
        int[] values = {5, 5, 5, 1, 1};
        int expectedScore = 12;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
