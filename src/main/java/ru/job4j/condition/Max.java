package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int a, int b, int c) {

        return  Math.max(a, b) > c ? Math.max(a, b) : c;
    }

    public static int max(int a, int b, int c, int d) {
        return Math.max(a, b) > Math.max(c, d) ? Math.max(a, b) : Math.max(c, d);
    }
}
