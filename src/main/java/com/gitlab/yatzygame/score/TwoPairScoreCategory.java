package com.gitlab.yatzygame.score;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The TwoPairScoreCategory class implements the IScoreCategory interface and represents the
 * "TwoPair" category in the Yatzy game.
 */

public class TwoPairScoreCategory implements IScoreCategory{

    /**
     * This implementation of the TwoPair score(), which is the sum of the two pairs of dice rolled.
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {

        // Utilisation de Collectors.groupingBy pour obtenir un Map des éléments et de leur nombre d'occurrences
        Map<Integer, Long> countEachElement = Arrays.stream(values).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Utilisation de Map.entrySet() et Stream pour récupérer tous les paires
        List<Integer> twoPairList = countEachElement.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        if (twoPairList.size() == 2) {
           return twoPairList.stream().map(v -> v * 2).mapToInt(Integer::intValue).sum();
       }

        return 0;

    }
}

