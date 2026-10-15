package com.devknot.demo;

public class PriceService {
    public int calculatePercentage(int total, int percentage) {
        if (total < 0 || percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        return total * percentage / 100;
    }
}
