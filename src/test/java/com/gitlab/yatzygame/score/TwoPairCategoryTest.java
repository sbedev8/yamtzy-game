package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoPairCategoryTest {
    private final IScoreCategory strategy = new TwoPairCategory();

    @Test
    public void testScoreWithoutTwoPair() {
        DiceRoll values = new DiceRoll(1, 6, 4, 5, 2);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithonePair() {
        DiceRoll values = new DiceRoll(1, 3, 2, 2, 5);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithTwoPair() {
        DiceRoll values = new DiceRoll(1, 6, 2, 2, 6);
        int expectedScore = 16;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithTwoPairOtherValues() {
        DiceRoll values = new DiceRoll(5, 5, 5, 1, 1);
        int expectedScore = 12;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
