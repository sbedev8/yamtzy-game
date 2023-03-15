package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.*;

public class AcesScoreCategoryTest {
    private final IScoreCategory category = new AcesScoreCategory();

    @Test
    public void testScoreWithNoAces() {
        int[] values = {2, 3, 5, 4, 6};
        int expectedScore = 0;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeAces() {
        int[] values = {5, 1, 2, 2, 1};
        int expectedScore = 2;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllAces() {
        int[] values = {1, 1, 1, 1, 1};
        int expectedScore = 5;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }
}