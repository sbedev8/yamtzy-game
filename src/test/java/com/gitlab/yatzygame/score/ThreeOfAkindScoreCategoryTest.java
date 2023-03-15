package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeOfAkindScoreCategoryTest {
    private final IScoreCategory strategy = new ThreeOfAkindScoreCategory();

    @Test
    public void testScoreWithoutThreeOfAkind() {
        int[] values = {1, 6, 2, 5, 2};
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithThreeOfAkind() {
        int[] values = {1, 3, 5, 5, 5};
        int expectedScore = 15;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllSameKind() {
        int[] values = {2, 2, 2, 2, 2};
        int expectedScore = 6;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
