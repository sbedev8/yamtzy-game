package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreesCategoryTest {
    private final IScoreCategory strategy = new ThreesCategory();

    @Test
    public void testScoreWithNoThrees() {
        int[] values = {1, 4, 5, 4, 6};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeThrees() {
        int[] values = {5, 3, 3, 2, 1};
        int expectedScore = 6;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllThrees() {
        int[] values = {3, 3, 3, 3, 3};
        int expectedScore = 15;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}
