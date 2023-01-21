package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConverter140RubThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter120RubThen2Dollar() {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(120);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}