package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort63829Then23689() {
        int[] data = new int[] {6, 3, 8, 2, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 6, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort541Then145() {
        int[] data = new int[] {5, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}