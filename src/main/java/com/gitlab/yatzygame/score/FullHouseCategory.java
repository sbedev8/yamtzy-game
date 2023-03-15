package com.gitlab.yatzygame.score;

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
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {

        // Utilisation de Collectors.groupingBy pour obtenir un Map des éléments et de leur nombre d'occurrences
        Map<Integer, Long> countEachElement = Arrays.stream(values).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        //on compte le nombre d'occurrences de chaque valeur de dice,
        //puis on vérifie s'il y a un brelan et une paire, qui sont les conditions requises pour un Full House.
        boolean hasThreeOfAKind = countEachElement.values().stream()
                .anyMatch(count -> count == 3);

        boolean hasPair = countEachElement.values().stream()
                .filter(count -> count >= 2)
                .count() == 2;

        return hasThreeOfAKind && hasPair ? Arrays.stream(values).sum() : 0;

    }
}

