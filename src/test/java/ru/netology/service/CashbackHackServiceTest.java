package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateBonusLessBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 800;
        int actual = cashbackHackService.remain(200);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculateBonusEqualBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculateBonusExceedBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 100;
        int actual = cashbackHackService.remain(2900);
        Assert.assertEquals(expected,actual);
    }
}