package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     *
     * @param is the initial number given for the loan
     *           returns the updated number after each deduction
     * @return the total amount remaining after deducting 10% from the three loop
     */
    static int getRemainingAmountIn3Months(int amount) {
        int remainingAmount;
        for (int i = 1; i <= 3; i++) {
            remainingAmount = amount - (amount * 10/100);
            amount = remainingAmount;
        }
        return amount;
    }

        public static void main (String[]args){
            try (Scanner scanner = new Scanner(System.in)) {
                int amount = scanner.nextInt();
                System.out.println(getRemainingAmountIn3Months(amount));
            }
        }
    }

