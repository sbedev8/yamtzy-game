package com.gitlab.yatzygame.score;

import com.gitlab.yatzygame.dice.DiceRoll;

/**
 * The IScoreCategory interface defines a contract for classes that represent a score category in the Yatzy game
 */
public interface IScoreCategory {
    public int score(DiceRoll diceRoll);
}
