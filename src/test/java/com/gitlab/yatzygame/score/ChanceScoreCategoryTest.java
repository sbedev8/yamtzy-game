package com.gitlab.yatzygame.score;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceScoreCategoryTest {

    private final IScoreCategory category = new ChanceScoreCategory();

    @Test
    public void testScoreWithChance() {
        int[] values = {1, 3, 2, 1, 2};
        int expectedScore = 9;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

}