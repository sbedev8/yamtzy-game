package com.gitlab.yatzygame.score;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The AcesScoreCategory class implements the IScoreCategory interface and represents the
 * "Yatzy" category in the Yatzy game.
 */
public class OnePairScoreCategory implements IScoreCategory{

    /**
     * the OnePairScore function checks if the five dice have the same value if so it returns a score=50
     *
     * @param values the values of the dice in the roll
     * @return the score value
     */
    @Override
    public int score(int[] values) {

        // Utilisation de Collectors.groupingBy avec la méthode identity pour obtenir un Map des éléments et de leur nombre d'occurrences
        Map<Integer, Long> countEachElement = Arrays.stream(values).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Utilisation de Map.entrySet() et Stream pour récupérer le paire le plus grand
        Optional<Integer> pair = countEachElement.entrySet().stream()
                .filter(entry -> entry.getValue() == 2)
                .map(Map.Entry::getKey).min(Collections.reverseOrder());  // == .sorted(Collections.reverseOrder()).findFirst();

        return pair.map(p -> p * 2).orElse(0);

    }
}

