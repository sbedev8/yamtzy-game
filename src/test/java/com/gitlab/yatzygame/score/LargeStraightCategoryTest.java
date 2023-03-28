package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeStraightCategoryTest {
    private final IScoreCategory strategy = new LargeStraightCategory();

    @Test
    public void testScoreWithoutLargeStraight() {
        DiceRoll values = new DiceRoll(2, 6, 6, 3, 4);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithLargeStraight() {
        DiceRoll values = new DiceRoll(2, 5, 6, 3, 4);
        int expectedScore = 20;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }


}
