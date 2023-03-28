package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The FourOfAkindScoreCategory class implements the IScoreCategory interface and represents the
 * "FourOfAkindScore" category in the Yatzy game.
 */

public class FourOfAkindCategory implements IScoreCategory{

    /**
     * This implementation of the FourOfAkind score(), which is the sum of the Four Of A kind of dice rolled.
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        int threeOfAkindValue = diceRoll.getFirstValueWithCountGreaterThan(4);
        return threeOfAkindValue * 4 ;
    }
}

