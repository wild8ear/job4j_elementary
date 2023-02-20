package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {5, 5, 4, 8, 7, 3, 5, 5};
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 5, 4, 7, 8, 3, 5, 5};
        assertThat(result).containsExactly(expected);
    }
}
