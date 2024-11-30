package Redo;

import java.util.Arrays;

public class MaximumPopulation {
    public int maximumPopulation(int[][] logs) {
        int[] people = new int[100];
        for (int[] log : logs) {
            for (int i = log[0]; i < log[1]; i++) {
                people[i - 1950] += 1;
            }
        }
        System.out.println(Arrays.toString(people));
        int maxpopulation = 0;
        int maxpopulationyear = 0;
        for (int j = 0; j < people.length; j++) {
            if (maxpopulation < people[j]) {
                maxpopulation = people[j];
                maxpopulationyear = j;
            }
        }
        return 1950 + maxpopulationyear;
    }

    public int maximumPopulationOptimized(final int[][] logs) {
        final int[] dates = new int[101];

        for (final int[] log : logs) {
            dates[log[0] - 1950]++;
            dates[log[1] - 1950]--;
        }

        int prefix = 0, maxCount = 0, date = 0;

        for (int i = 0; i < 101; ++i) {
            prefix += dates[i];

            if (prefix > maxCount) {
                maxCount = prefix;
                date = i;
            }
        }

        return date + 1950;
    }
}