package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourOfAkindCategoryTest {
    private final IScoreCategory strategy = new FourOfAkindCategory();

    @Test
    public void testScoreWithoutFourOfAkind() {
        DiceRoll values = new DiceRoll(1, 6, 2, 2, 2);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithFourOfAkind() {
        DiceRoll values = new DiceRoll(1, 5, 5, 5, 5);
        int expectedScore = 20;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllSameKind() {
        DiceRoll values = new DiceRoll(5, 5, 5, 5, 5);
        int expectedScore = 20;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
