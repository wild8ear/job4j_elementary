package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenThis12Another23Then1dot41() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThis24Another21Then3() {
        Point a = new Point(2, 4);
        Point b = new Point(2, 1);
        double expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThis35Another36Then1() {
        Point a = new Point(3, 5);
        Point b = new Point(3, 6);
        double expected = 1;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThis356Another367Then1dot41() {
        Point a = new Point(3, 5, 6);
        Point b = new Point(3, 6, 7);
        double expected = 1.41;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThis212Another467Then3() {
        Point a = new Point(2, 1, 2);
        Point b = new Point(4, 6, 7);
        double expected = 7.34;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThis386Another321Then7dot81() {
        Point a = new Point(3, 8, 6);
        Point b = new Point(3, 2, 1);
        double expected = 7.81;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}