package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallStraightCategoryTest {
    private final IScoreCategory strategy = new SmallStraightCategory();

    @Test
    public void testScoreWithoutSmallStraight() {
        DiceRoll values = new DiceRoll(2, 2, 1, 3, 5);
        int expectedScore = 0;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSmallStraight() {
        DiceRoll values = new DiceRoll(2, 3, 1, 5, 4);
        int expectedScore = 15;
        int actualScore = strategy.score(values);
        assertEquals(expectedScore, actualScore);
    }


}
