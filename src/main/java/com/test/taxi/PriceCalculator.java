package com.test.taxi;

public class PriceCalculator {

    public static final double FREE = 0;
    public static final double START_PRICE = 6.0;
    public static final double PER_KM = 1.5;
    public static final double TAX = 0.5;
    public static final int NOT_START = 0;
    public static final int START_DISTANCE = 2;
    public static final int TAX_DISTANCE = 8;
    public static final double WAIT_COST = 0.25;

    public double getPrice(int distance) {
        double pricePerKM = START_PRICE + (distance - START_DISTANCE) * PER_KM;
        double taxPerKM = (distance - TAX_DISTANCE) * PER_KM * TAX;

        if (distance <= NOT_START) return FREE;
        if (distance <= START_DISTANCE) return START_PRICE;
        if (distance <= TAX_DISTANCE) {
            return pricePerKM;
        }
        return pricePerKM + taxPerKM;
    }

    public Double getPrice(int distance, int min) {
        if (distance <= NOT_START) return FREE;
        if (min <= 0) return getPrice(distance);
        return getPrice(distance) + min * WAIT_COST;
    }
}
