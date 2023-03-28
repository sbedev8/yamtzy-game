package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeOfAkindCategoryTest {
    private final IScoreCategory strategy = new ThreeOfAkindCategory();

    @Test
    public void testScoreWithoutThreeOfAkind() {
        DiceRoll values = new DiceRoll(1, 6, 2, 5, 2);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithThreeOfAkind() {
        DiceRoll values = new DiceRoll(1, 3, 5, 5, 5);
        int expectedScore = 15;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllSameKind() {
        DiceRoll values = new DiceRoll(2, 2, 2, 2, 2);
        int expectedScore = 6;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
