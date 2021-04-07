package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void monday() {
        int day = 1;
        String expected = "Понедельник";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void saturday() {
        int day = 6;
        String expected = "Суббота";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void error() {
        int day = 8;
        String expected = "Ошибка";
        String result = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, result);
    }
}