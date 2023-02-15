package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int i = left > right ? left : right;
        return i;
    }
}
