package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwosCategoryTest {

    private final IScoreCategory strategy = new TwosCategory();

    @Test
    public void testScoreWithNoTwos() {
        DiceRoll values = new DiceRoll(1, 3, 5, 4, 6);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeTwos() {
        DiceRoll values = new DiceRoll(5, 4, 2, 2, 1);
        int expectedScore = 4;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllTwos() {
        DiceRoll values = new DiceRoll(2, 2, 2, 2, 2);
        int expectedScore = 10;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }
}