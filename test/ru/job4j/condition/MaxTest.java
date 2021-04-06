package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax15To7Then15() {
        int left = 15;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 15;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To70Then70() {
        int left = 15;
        int right = 70;
        int result = Max.max(left, right);
        int expected = 70;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax25To25Then25() {
        int left = 25;
        int right = 25;
        int result = Max.max(left, right);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }
}