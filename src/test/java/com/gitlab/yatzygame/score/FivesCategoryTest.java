package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FivesCategoryTest {
    private final IScoreCategory strategy = new FivesCategory();

    @Test
    public void testScoreWithNoFives() {
        DiceRoll values = new DiceRoll(1, 3, 4, 2, 6);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeFives() {
        DiceRoll values = new DiceRoll(5, 3, 5, 2, 1);
        int expectedScore = 10;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllFives() {
        DiceRoll values = new DiceRoll(5, 5, 5, 5, 5);
        int expectedScore = 25;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}
