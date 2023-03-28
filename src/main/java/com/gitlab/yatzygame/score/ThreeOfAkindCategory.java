package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The ThreeOfAkindScoreCategory class implements the IScoreCategory interface and represents the
 * "ThreeOfAkindScore" category in the Yatzy game.
 */

public class ThreeOfAkindCategory implements IScoreCategory{

    /**
     * This implementation of the ThreeOfAkind score(), which is the sum of the Three Of A kind of dice rolled.
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        int threeOfAkindValue = diceRoll.getFirstValueWithCountGreaterThan(3);
        return threeOfAkindValue * 3 ;
    }
}

