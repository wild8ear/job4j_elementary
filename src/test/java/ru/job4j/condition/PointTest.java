package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to30Then3() {
        int x1 = 0;
        int x2 = 3;
        int y1 = 0;
        int y2 = 0;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to40Then4() {
        int x1 = 0;
        int x2 = 4;
        int y1 = 0;
        int y2 = 0;
        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to50Then5() {
        int x1 = 0;
        int x2 = 5;
        int y1 = 0;
        int y2 = 0;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}