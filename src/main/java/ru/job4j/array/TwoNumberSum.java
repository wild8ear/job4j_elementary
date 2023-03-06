package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] rsl = {};
        int i = 0;
        int j = 0;
        while (i < array.length - 1) {
            if (array[i] + array[j] == target && j != 0) {
                rsl = new int[]{i, j};
                break;
            }
            if (j == array.length - 1) {
                i++;
                j = i;
            }
            j++;
        }
        return rsl;
    }
}
