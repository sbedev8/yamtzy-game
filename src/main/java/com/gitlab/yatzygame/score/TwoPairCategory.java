package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The TwoPairScoreCategory class implements the IScoreCategory interface and represents the
 * "TwoPair" category in the Yatzy game.
 */

public class TwoPairCategory implements IScoreCategory{

    /**
     * This implementation of the TwoPair score(), which is the sum of the two pairs of dice rolled.
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        List<Integer> twoPairList = diceRoll.getPairsSortedDesc();
        return twoPairList.size()==2 ? twoPairList.stream().map(v -> v * 2).mapToInt(Integer::intValue).sum() : 0 ;
    }
}

