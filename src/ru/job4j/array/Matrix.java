package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int i = 1; i < data.length + 1; i++) {
            for (int j = 1; j < data.length + 1; j++) {
                data[i - 1][j - 1] = i * j;
            }
        }
        return data;
    }
}
