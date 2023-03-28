package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The FullHouseCategory class implements the IScoreCategory interface and represents the
 * "FullHouse" category in the Yatzy game.
 */

public class FullHouseCategory implements IScoreCategory{

    /**
     * This implementation of the FullHouseCategory score, which is the sum of all dice in the
     * event that the dice form a full house.
     *
     * @param diceRoll the dice roll
     * @return the score value
     */
    public int score(DiceRoll diceRoll) {
        return diceRoll.isFullHouse()  ? diceRoll.getSumOfAllDice() : 0;
    }
}

