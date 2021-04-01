package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(3, 4, 5, 6);
        double result3 = Point.distance(11, 10, 20, 23);
        System.out.println("result1 (0, 0) to (2, 0) " + result1);
        System.out.println("result2 (3, 4) to (5, 6) " + result2);
        System.out.println("result3 (11, 10) to (20, 23) " + result3);
    }
}
