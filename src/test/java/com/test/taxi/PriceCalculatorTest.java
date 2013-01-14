package com.test.taxi;

import com.test.taxi.PriceCalculator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriceCalculatorTest {
    @Test
    public void should_pay_0_when_minus_1_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(-1);
        assertThat(price, is(0.0));
    }

    @Test
    public void should_pay_0_when_0_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(0);
        assertThat(price, is(0.0));
    }

    @Test
    public void should_pay_6_when_1_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(1);
        assertThat(price, is(6.0));
    }

    @Test
    public void should_pay_6_when_2_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(2);
        assertThat(price, is(6.0));
    }

    @Test
    public void should_pay_7p5_when_3_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(3);
        assertThat(price, is(7.5));
    }

    @Test
    public void should_pay_15_when_8_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(8);
        assertThat(price, is(15.0));
    }

    @Test
    public void should_pay_17p25_when_9_km() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(9);
        assertThat(price, is(17.25));
    }

    @Test
    public void should_pay_0_when_minus_1_km_wait_10_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(-1, 10);
        assertThat(price, is(0.0));
    }

    @Test
    public void should_pay_0_when_0_km_wait_10_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(0, 10);
        assertThat(price, is(0.0));
    }

    @Test
    public void should_pay_8p5_when_1_km_wait_10_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(1, 10);
        assertThat(price, is(8.5));
    }

    @Test
    public void should_pay_6_when_1_km_wait_minus_10_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(1, -10);
        assertThat(price, is(6.0));
    }

    @Test
    public void should_pay_8p5_when_2_km_wait_10_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(2, 10);
        assertThat(price, is(8.5));
    }

    @Test
    public void should_pay_10_when_3_km_wait_20_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(3, 20);
        assertThat(price, is(12.5));
    }

    @Test
    public void should_pay_20_when_8_km_wait_20_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(8, 20);
        assertThat(price, is(20.0));
    }

    @Test
    public void should_pay_24p75_when_9_km_wait_30_min() {
        PriceCalculator priceCalculator = new PriceCalculator();
        Double price = priceCalculator.getPrice(9, 30);
        assertThat(price, is(24.75));
    }
}