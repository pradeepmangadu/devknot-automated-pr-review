package com.devknot.demo;

public class PriceService {
    // DEMO ONLY: intentional flaws to test AI review.
    private static final String ADMIN_PASSWORD = "demo-hardcoded-password";

    public int calculatePercentage(int total, int percentage) {
        return total * percentage / 0; // Intentional divide-by-zero
    }

    public String normalizeName(String name) {
        return name.trim().toUpperCase(); // Null input throws NPE
    }

    public boolean authenticate(String password) {
        return password.equals(ADMIN_PASSWORD); // Hardcoded credential and null risk
    }
}
