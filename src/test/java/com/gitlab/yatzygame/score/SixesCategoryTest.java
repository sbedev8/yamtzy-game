package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SixesCategoryTest {
    private final IScoreCategory strategy = new SixesCategory();

    @Test
    public void testScoreWithNoSixes() {
        DiceRoll values = new DiceRoll(1, 3, 4, 2, 2);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeSixes() {
        DiceRoll values = new DiceRoll(6, 3, 6, 6, 1);
        int expectedScore = 18;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllSixes() {
        DiceRoll values = new DiceRoll(6, 6, 6, 6, 6);
        int expectedScore = 30;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}
