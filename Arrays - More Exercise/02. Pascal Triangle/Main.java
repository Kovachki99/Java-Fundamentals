package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {  int r, i, k, number = 1, j;
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();

        for (i = 0; i < r; i++) {
            number = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}