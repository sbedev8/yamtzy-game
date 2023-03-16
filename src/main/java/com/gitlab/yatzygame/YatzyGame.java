package com.gitlab.yatzygame;

import com.gitlab.yatzygame.dice.DiceRoll;
import com.gitlab.yatzygame.dice.DiceValue;
import com.gitlab.yatzygame.score.ChanceScoreCategory;
import com.gitlab.yatzygame.score.FullHouseCategory;
import com.gitlab.yatzygame.score.TwoPairScoreCategory;

import java.util.Arrays;

public class YatzyGame {
    private final DiceRoll diceRoll;
    public YatzyGame(DiceRoll diceRoll) {
        this.diceRoll = diceRoll;
    }

    public static void main(String[] args) {

        DiceRoll diceRoll1 = new DiceRoll(DiceValue.FIVE, DiceValue.FIVE, DiceValue.FIVE, DiceValue.FOUR, DiceValue.FOUR);
        YatzyGame player = new YatzyGame(diceRoll1);
        int[] handValues = player.diceRoll.getDiceValues();

        int chanceScore = new ChanceScoreCategory().score(handValues);
        int fullHouseScore = new FullHouseCategory().score(handValues);
        int twoPairScore = new TwoPairScoreCategory().score(handValues);

        System.out.println(Arrays.toString(handValues));
        System.out.println("chance: " + chanceScore);
        System.out.println("Full House: " + fullHouseScore);
        System.out.println("Two pair: " + twoPairScore);

    }

}
