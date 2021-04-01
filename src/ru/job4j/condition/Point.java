package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double step1 = x2 - x1;
        double step2 = y2 - y1;
        double step3 = Math.pow(step1, 2);
        double step4 = Math.pow(step2, 2);
        double step5 = step3 + step4;
        double rsl = Math.sqrt(step5);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(3, 4, 5, 6);
        double result3 = Point.distance(11, 10, 20, 23);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (3, 4) to (5, 6) " + result2);
        System.out.println("result (11, 10) to (20, 23) " + result3);
    }
}
