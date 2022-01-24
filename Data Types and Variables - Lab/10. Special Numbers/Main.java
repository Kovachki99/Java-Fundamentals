package com.company;

import java.util.Scanner;

public class Main {
    static int getSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= number; i++) {
            if (getSum(i) == 5) {
                System.out.printf("%d -> True%n", i);
            } else if (getSum(i) == 7) {
                System.out.printf("%d -> True%n", i);
            } else if (getSum(i) == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);

            }
        }
    }
}


