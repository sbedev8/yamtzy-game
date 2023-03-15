package com.github.java.score;

import java.util.Arrays;

public class ChanceScoreCategory implements IScoreCategory {
    @Override
    public int score(int[] values) {
        return Arrays.stream(values).sum();
    }
}