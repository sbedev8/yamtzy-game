package com.gitlab.yatzygame.score;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The OnePairScoreCategory class implements the IScoreCategory interface and represents the
 * "OnePair" category in the Yatzy game.
 */
public class OnePairScoreCategory implements IScoreCategory{

    /**
     * This implementation of the onePair score() method calculates the score by finding the pair of dice with the highest value
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {

        // Utilisation de Collectors.groupingBy pour obtenir un Map des éléments et de leur nombre d'occurrences
        Map<Integer, Long> countEachElement = Arrays.stream(values).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Utilisation de Map.entrySet() et Stream pour récupérer le paire le plus grand
        Optional<Integer> pair = countEachElement.entrySet().stream()
                .filter(entry -> entry.getValue() >= 2)
                .map(Map.Entry::getKey).min(Collections.reverseOrder());  // == .sorted(Collections.reverseOrder()).findFirst();

        return pair.map(p -> p * 2).orElse(0);

    }
}

