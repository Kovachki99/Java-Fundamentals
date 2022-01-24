package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int current = 0;
        for (int i = 1; i <= number; i++) {
            current+= i;

            int sum = 0;

            while (current > 0) {
                sum = sum + current % 10;
                current = current / 10;
            }


           if  (sum == 5 || sum == 7 || sum == 11){
            System.out.printf("%d -> True%n",i);}
            else {System.out.printf("%d -> False%n",i);}


        }

    }
}
