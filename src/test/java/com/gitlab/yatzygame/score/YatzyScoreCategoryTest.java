package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzyScoreCategoryTest {
    private final IScoreCategory strategy = new YatzyScoreCategory();

    @Test
    public void testScoreWithNoYatzy() {
        int[] values = {1, 3, 4, 2, 2};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithYatzy() {
        int[] values = {6, 6, 6, 6, 6};
        int expectedScore = 50;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
