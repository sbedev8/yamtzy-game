package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Yatzy" category in the Yatzy game.
 */
public class YatzyCategory implements IScoreCategory{

    /**
     * the yatzy function checks if the five dice have the same value if so it returns a score=50
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        return diceRoll.isYatzy()  ? 50 : 0;
    }
}

