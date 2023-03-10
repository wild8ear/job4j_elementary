package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax3To2Then2() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2To1Then3() {
        int a = 3;
        int b = 2;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To2Then2() {
        int a = 2;
        int b = 2;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To5Then5() {
        int a = 2;
        int b = 2;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2To1To6Then6() {
        int a = 3;
        int b = 2;
        int c = 1;
        int d = 6;
        int result = Max.max(a, b, c, d);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8To2To2To6Then8() {
        int a = 8;
        int b = 2;
        int c = 2;
        int d = 6;
        int result = Max.max(a, b, c, d);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To4To2To2Then4() {
        int a = 2;
        int b = 4;
        int c = 2;
        int d = 2;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}