package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class PriceCalculatorTest {


    @Test

    public void should_pay_6_when_1_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.calculate(1);
        Assert.assertThat(price, is(6.0));
    }

    @Test

    public void should_pay_6_when_2_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.calculate(2);
        Assert.assertThat(price, is(6.0));
    }

    @Test
    public void should_pay_0_when_0_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.calculate(0);
        Assert.assertThat(price, is(0.0));
    }

    @Test
    public void should_pay_0_when_m1_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.calculate(-1);
        Assert.assertThat(price, is(0.0));
    }

    @Test
    public void should_pay_7p5_when_3_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.calculate(3);
        Assert.assertThat(price, is(7.5));
    }

    @Test
    public void should_pay_15_when_8_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.calculate(8);
        Assert.assertThat(price, is(15.0));
    }

    @Test
    public void should_pay_17P25_when_9_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.calculate(9);
        Assert.assertThat(price, is(17.25));
    }


}
