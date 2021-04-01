package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, I am " + name);
    }
    public static void old(int age) {
        System.out.println("I am " + age + " years old.");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);
        ArgMethod.old(age);
    }
}
