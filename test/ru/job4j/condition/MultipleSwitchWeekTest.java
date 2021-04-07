package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMonThen1() {
        String day1 = "Monday";
        int result1 = MultipleSwitchWeek.numberOfDay(day1);
        int expected = 1;
        Assert.assertEquals(expected, result1);
        String day2 = "Понедельник";
        int result2 = MultipleSwitchWeek.numberOfDay(day2);
        Assert.assertEquals(expected, result2);
    }

    @Test
    public void whenTuesThen2() {
        String day1 = "Tuesday";
        int result1 = MultipleSwitchWeek.numberOfDay(day1);
        int expected = 2;
        Assert.assertEquals(expected, result1);
        String day2 = "Вторник";
        int result2 = MultipleSwitchWeek.numberOfDay(day2);
        Assert.assertEquals(expected, result2);
    }

    @Test
    public void whenWedThen3() {
        String day1 = "Wednesday";
        int result1 = MultipleSwitchWeek.numberOfDay(day1);
        int expected = 3;
        Assert.assertEquals(expected, result1);
        String day2 = "Среда";
        int result2 = MultipleSwitchWeek.numberOfDay(day2);
        Assert.assertEquals(expected, result2);
    }

    @Test
    public void whenThurThen4() {
        String day = "Thursday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFriThen5() {
        String day = "Friday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSatThen6() {
        String day = "Saturday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSunThen7() {
        String day = "Sunday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenErThenmin1() {
        String day = "Error";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}