package com.gitlab.yatzygame;

import com.gitlab.yatzygame.dice.DiceRoll;
import com.gitlab.yatzygame.score.*;

import java.util.Arrays;
import java.util.Scanner;

public class YatzyGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Roll Dice");
            System.out.println("2. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Launching RollDice...");
                    rollingTheDice();
                    break;
                case 2:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        } while (choice != 2);

        scanner.close();

    }

    private static void rollingTheDice() {
        int[] rollDice = new DiceRoll().getDiceValues();

        int AcesScore = new AcesCategory().score(rollDice);
        int TwosScore = new TwosCategory().score(rollDice);
        int ThreesScore = new ThreesCategory().score(rollDice);
        int FoursScore = new FoursCategory().score(rollDice);
        int FivesScore = new FivesCategory().score(rollDice);
        int SixesScore = new SixesCategory().score(rollDice);

        int OnePairScore = new OnePairCategory().score(rollDice);
        int TwoPairScore = new TwoPairCategory().score(rollDice);
        int ThreeOfAkindScore = new ThreeOfAkindCategory().score(rollDice);
        int FourOfAkindScore = new FourOfAkindCategory().score(rollDice);
        int LargeStraightScore = new LargeStraightCategory().score(rollDice);
        int SmallStraightScore = new SmallStraightCategory().score(rollDice);
        int ChanceScore = new ChanceCategory().score(rollDice);
        int FullHouse = new FullHouseCategory().score(rollDice);
        int YatzyScore = new YatzyCategory().score(rollDice);


        System.out.println("####### Roll dice ########\n"+ Arrays.toString(rollDice));

        System.out.println("\n####### Scores ########");

        System.out.println("Aces score: " + AcesScore);
        System.out.println("Twos score: " + TwosScore);
        System.out.println("Threes score: " + ThreesScore);
        System.out.println("Fours score: " + FoursScore);
        System.out.println("Fives score: " + FivesScore);
        System.out.println("Sixes score: " + SixesScore);

        System.out.println("OnePair score: " + OnePairScore);
        System.out.println("TwoPair score: " + TwoPairScore);
        System.out.println("ThreeOfAkind score: " + ThreeOfAkindScore);
        System.out.println("FourOfAkind score: " + FourOfAkindScore);
        System.out.println("LargeStraight: " + LargeStraightScore);
        System.out.println("SmallStraight: " + SmallStraightScore);
        System.out.println("Chance score: " + ChanceScore);
        System.out.println("FullHouse: " + FullHouse);
        System.out.println("Yatzy score: " + YatzyScore);
    }

}
