package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Test;

import static org.junit.Assert.*;

public class AcesCategoryTest {
    private final IScoreCategory category = new AcesCategory();

    @Test
    public void testScoreWithNoAces() {
        DiceRoll values = new DiceRoll(2, 3, 5, 4, 6);
        int expectedScore = 0;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithSomeAces() {
        DiceRoll values = new DiceRoll(5, 1, 2, 2, 1);
        int expectedScore = 2;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllAces() {
        DiceRoll values = new DiceRoll(1, 1, 1, 1, 1);
        int expectedScore = 5;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }
}