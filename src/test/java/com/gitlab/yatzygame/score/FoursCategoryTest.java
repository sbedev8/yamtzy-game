package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoursCategoryTest {
    private final IScoreCategory strategy = new FoursCategory();

    @Test
    public void testScoreWithNoFours() {
        DiceRoll values = new DiceRoll(1, 3, 5, 2, 6);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeFours() {
        DiceRoll values = new DiceRoll(5, 3, 4, 2, 1);
        int expectedScore = 4;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllFours() {
        DiceRoll values = new DiceRoll(4, 4, 4, 4, 4);
        int expectedScore = 20;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}
