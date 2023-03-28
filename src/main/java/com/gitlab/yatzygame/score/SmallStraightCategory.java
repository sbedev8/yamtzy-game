package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;
import com.gitlab.yatzygame.dice.StraightValue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * The SmallStraightScoreCategory class implements the IScoreCategory interface and represents the
 * "SmallStraightScore" category in the Yatzy game.
 */

public class SmallStraightCategory implements IScoreCategory{

    /**
     * This implementation of the Small Straight score, which a sequence of five consecutive numbers ( from 1 to 5) in the rolled dice values
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        return diceRoll.isSmallStraight() ? 15 : 0;
    }
}
