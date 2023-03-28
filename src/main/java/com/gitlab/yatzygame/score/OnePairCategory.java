package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The OnePairScoreCategory class implements the IScoreCategory interface and represents the
 * "OnePair" category in the Yatzy game.
 */
public class OnePairCategory implements IScoreCategory{

    /**
     * This implementation of the onePair score() method calculates the score by finding the pair of dice with the highest value
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {

        Optional<Integer> pairValue = diceRoll.getPairsSortedDesc().stream().findFirst();

        return pairValue.map(v -> v * 2).orElse(0);

    }
}

