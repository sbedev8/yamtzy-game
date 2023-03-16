package com.gitlab.yatzygame.score;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The FourOfAkindScoreCategory class implements the IScoreCategory interface and represents the
 * "FourOfAkindScore" category in the Yatzy game.
 */

public class FourOfAkindCategory implements IScoreCategory{

    /**
     * This implementation of the FourOfAkind score(), which is the sum of the Four Of A kind of dice rolled.
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {

        // Utilisation de Collectors.groupingBy pour obtenir un Map des éléments et de leur nombre d'occurrences
        Map<Integer, Long> countEachElement = Arrays.stream(values).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Utilisation de Map.entrySet() et Stream pour récupérer le key = 4 occurences
        Optional<Integer> fourOfAkind = countEachElement.entrySet().stream()
                .filter(entry -> entry.getValue() >= 4)
                .map(Map.Entry::getKey).findFirst();

           return fourOfAkind.map(v -> v * 4).orElse(0);

    }
}

