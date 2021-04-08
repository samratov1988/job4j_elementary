package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double per = percent / 100;
        while (amount > 0) {
            amount = (int) ((amount + amount * per) - salary);
            year++;
        }
        return year;
    }
}
