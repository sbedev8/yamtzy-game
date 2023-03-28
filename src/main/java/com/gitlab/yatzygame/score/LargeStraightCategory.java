package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import com.gitlab.yatzygame.dice.StraightValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The LargeStraightCategory class implements the IScoreCategory interface and represents the
 * "LargeStraight" category in the Yatzy game.
 */
public class LargeStraightCategory implements IScoreCategory{

    /**
     * This implementation of the Large Straight score, which a sequence of five consecutive numbers ( from 2 to 6) in the rolled dice values
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        return diceRoll.isLargeStraight() ? 20 : 0;
    }

}

