package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number1 = Integer.parseInt(scan.nextLine());
	int number2 = Integer.parseInt(scan.nextLine());
        for (int i = number1; i <=number2 ; i++) {
          String currentNum = "" + i ;
          int oddSum = 0;
          int evenSum = 0;
            for (int j = 0; j < currentNum.length() ; j++) {
                int currentDigit = Integer.parseInt(""+currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum+=currentDigit;
                }
                else { oddSum +=currentDigit;}}
                if (oddSum==evenSum){
                    System.out.print(i + " ");
                }

                
            }

        }

    }

