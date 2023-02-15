package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when12to23Then1dot41() {
        int x1 = 1;
        int x2 = 2;
        int y1 = 2;
        int y2 = 3;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to41Then3() {
        int x1 = 2;
        int x2 = 2;
        int y1 = 4;
        int y2 = 1;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to56Then1() {
        int x1 = 3;
        int x2 = 3;
        int y1 = 5;
        int y2 = 6;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}