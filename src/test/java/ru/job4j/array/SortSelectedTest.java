package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith3numbers() {
        int[] data = new int[] {8, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith5numbers() {
        int[] data = new int[] {3, 4, 2, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 2, 3, 4, 6};
        assertThat(result).containsExactly(expected);
    }
}