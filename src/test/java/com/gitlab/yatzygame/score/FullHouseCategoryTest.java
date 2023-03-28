package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FullHouseCategoryTest {
    private IScoreCategory category;

    @Before
    public void setUp() {
        category = new FullHouseCategory();
    }

    @Test
    public void testScoreWithoutFullHouse() {
        DiceRoll values = new DiceRoll(1, 6, 2, 2, 2);
        int expectedScore = 0;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithoutFullHouse_2() {
        DiceRoll values = new DiceRoll(1, 2, 2, 2, 2);
        int expectedScore = 0;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithFullHouse() {
        DiceRoll values = new DiceRoll(3, 3, 5, 5, 5);
        int expectedScore = 21;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testScoreWithAllSameKind() {
        DiceRoll values = new DiceRoll(5, 5, 5, 5, 5);
        int expectedScore = 0;
        int actualScore = category.score(values);
        assertEquals(expectedScore, actualScore);
    }

}
