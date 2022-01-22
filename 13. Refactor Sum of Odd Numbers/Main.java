package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1;count<n; i+=2) {
            count++;
            sum += i;
           System.out.println(i);
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
