package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int diff = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (diff >= coins[i]) {
                diff = diff - coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] out = change(50, 21);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
