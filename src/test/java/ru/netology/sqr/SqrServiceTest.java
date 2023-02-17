package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrServiceTest {

    @Test
    public void testTrueRange() {
        SqrService service = new SqrService();

        int actual = service.CalcSqr(200, 400);
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testFalseRange() {
        SqrService service = new SqrService();

        int actual = service.CalcSqr(500, 300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}