package com.company;

import java.util.Scanner;

public class Main {
    public static int oddSumM(int input){
        int number = input;
        int oddSum = 0;
        if (number<0){number=Math.abs(number);}


        while (number > 0) {
            if (number % 2 == 0) {oddSum+=0;
            }else {oddSum= oddSum + number%10;}
            number = number / 10;
        }
        return oddSum;

    }
    public static int evenSumM(int input){
        int number = input;
        int evenSum = 0;
        if (number<0){number=Math.abs(number);}


        while (number > 0) {
            if (number % 2 == 0) {
                evenSum= evenSum+ number%10;
            }
            number = number / 10;
    }
        return evenSum;
    }
    public static int evenOddSum(int number1,int number2){
        int sum = number1*number2;

        return sum;

 }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String number = scan.nextLine();
	int number1 = Integer.parseInt(number);
	System.out.println(evenOddSum(evenSumM(number1),oddSumM(number1)));


        }
    }

