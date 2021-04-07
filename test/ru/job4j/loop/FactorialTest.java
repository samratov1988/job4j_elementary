package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int num = 5;
        int result = Factorial.calc(num);
        int expected = 120;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int num = 0;
        int result = Factorial.calc(num);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}