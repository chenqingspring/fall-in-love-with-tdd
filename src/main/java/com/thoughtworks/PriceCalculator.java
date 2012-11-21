package com.thoughtworks;

public class PriceCalculator {

    public static final double FREE = 0.0;
    public static final double START_PRICE = 6.0;

    public Double calculate(int distance) {
        double tax = (distance - 8) * 1.5 * 0.5;
        double price_of_kms = (distance - 2) * 1.5;
        if (distance <= 0) return FREE;
        if (distance <= 2) return START_PRICE;
        if (distance > 8) {
            return START_PRICE + price_of_kms + tax;
        }
        return START_PRICE + price_of_kms;
    }
}
