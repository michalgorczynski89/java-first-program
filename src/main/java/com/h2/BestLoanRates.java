package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {

    public static final Map<Integer,Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static float getRates(int loanTermInYears){
        return bestRates.getOrDefault(loanTermInYears, 0.0f);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name\n");
        String name = scanner.nextLine();
        System.out.print("Hello " + name + "\n");

        System.out.print("Enter the loan term (in years)\n");
        int loanTermInYears = scanner.nextInt();
        float bestRate = getRates(loanTermInYears);

        if (Math.abs(bestRate) < 0.00001f) {
            System.out.print(String.format("No available rates for term: %d years", loanTermInYears));
        } else {
            System.out.print(String.format("Best Available Rate: %.2f%%", bestRate));
        }
        scanner.close();
    }
}
