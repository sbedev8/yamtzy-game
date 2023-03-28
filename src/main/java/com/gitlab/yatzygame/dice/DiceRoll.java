package com.gitlab.yatzygame.dice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents a set of five dice values.
 */
public class DiceRoll {
    // An array to store the values of the five dice.
    private final List<Integer> diceValues;

    public DiceRoll(DiceValue d1, DiceValue d2, DiceValue d3, DiceValue d4, DiceValue d5) {
        diceValues = Arrays.asList(d1.getValue(), d2.getValue(), d3.getValue(), d4.getValue(), d5.getValue());
    }

    public DiceRoll(int d1, int d2, int d3, int d4, int d5) {
        diceValues = Arrays.asList(d1, d2, d3, d4, d5);
    }

    public DiceRoll() {
        Random random = new Random();
        diceValues = random.ints(5, 1, 7).boxed().collect(Collectors.toList());
    }

    /**
     * Returns the values of the five dice as an array.
     *
     * @return the values of the five dice
     */
    public List<Integer> getDiceValues() {
        return diceValues;
    }

    /**
     * Computes the sum of the values of the rolled dice that have a specific value.
     *
     * @param searchedValue the specific value to search for among the rolled dice values.
     * @return the sum of the values of the rolled dice.
     */
    public int getSumOfDiceValues(int searchedValue) {
        return diceValues.stream()
                .filter(diceValue -> diceValue == searchedValue)
                .mapToInt(Integer::intValue).sum();
    }

    /**
     * Returns the sum of all dice values.
     *
     * @return the sum of all dice values
     */
    public int getSumOfAllDice() {
        return diceValues.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Returns a map containing the count of each unique dice value.
     *
     * @return a map containing the count of each unique dice value
     */
    public Map<Integer, Long> countDices() {
        // Utilisation de Collectors.groupingBy pour obtenir un Map des éléments et de leur nombre d'occurrences
        return diceValues.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    }

    /**
     * Returns a stream of dice values with a count greater than the specified count.
     *
     * @param count the count of dice value
     * @return a stream of dice values
     */
    public Stream<Integer> getValuesWithCountGreaterThan(int count) {
        return countDices().entrySet().stream()
                .filter(entry -> entry.getValue() >= count)
                .map(Map.Entry::getKey);
    }

    /**
     * Returns a list of pairs of dice values sorted in descending order of count.
     *
     * @return a list of pairs of dice values
     */
    public List<Integer> getPairsSortedDesc() {
        return getValuesWithCountGreaterThan(2)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    /**
     * Returns the first dice value with a count greater than the specified count, or 0 if no value is found.
     *
     * @param count the count for a dice value to be returned
     * @return the first dice value
     */
    public int getFirstValueWithCountGreaterThan(int count) {
        return getValuesWithCountGreaterThan(count)
                .findFirst()
                .orElse(0);
    }

    /**
     * Returns whether the dice values form a full house.
     *
     * @return true if the dice values form a full house, false otherwise
     */
    public boolean isFullHouse() {
        int threeOfAkindValue = getFirstValueWithCountGreaterThan(3);
        boolean hasPair = countDices().values().stream()
                .filter(count -> count >= 2)
                .count() == 2;

        return threeOfAkindValue != 0 && hasPair;
    }

    /**
     * Returns a sorted list of dice values in ascending order.
     *
     * @return a sorted list
     */
    private List<Integer> sortDiceValues() {
        return diceValues.stream().sorted().collect(Collectors.toList());
    }

    /**
     * Returns whether the dice values form a small straight.
     *
     * @return true if the dice values form a small straight, false otherwise
     */
    public boolean isSmallStraight() {
        List<Integer> smallStraight = StraightValue.SMALL_STRAIGHT.getValues();
        return sortDiceValues().equals(smallStraight);
    }

    /**
     * Returns whether the dice values form a large straight.
     *
     * @return true if the dice values form a large straight, false otherwise
     */
    public boolean isLargeStraight() {
        List<Integer> smallStraight = StraightValue.LARGE_STRAIGHT.getValues();
        return sortDiceValues().equals(smallStraight);
    }

    /**
     * Returns whether the dice values form a Yatzy.
     *
     * @return true if the dice values form a Yatzy, false otherwise
     */
    public boolean isYatzy() {
        return countDices().size() == 1;
    }

}

