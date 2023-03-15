package com.gitlab.yatzygame.score;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The ThreeOfAkindScoreCategory class implements the IScoreCategory interface and represents the
 * "ThreeOfAkindScore" category in the Yatzy game.
 */

public class ThreeOfAkindScoreCategory implements IScoreCategory{

    /**
     * This implementation of the ThreeOfAkind score(), which is the sum of the Three Of A kind of dice rolled.
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {

        // Utilisation de Collectors.groupingBy pour obtenir un Map des éléments et de leur nombre d'occurrences
        Map<Integer, Long> countEachElement = Arrays.stream(values).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Utilisation de Map.entrySet() et Stream pour récupérer le key = 3 occurences
        Optional<Integer> threeOfAkind = countEachElement.entrySet().stream()
                .filter(entry -> entry.getValue() >= 3)
                .map(Map.Entry::getKey).findFirst();

           return threeOfAkind.map(v -> v * 3).orElse(0);

    }
}

