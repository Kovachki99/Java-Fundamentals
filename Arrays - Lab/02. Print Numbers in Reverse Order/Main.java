package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = Integer.parseInt(scan.nextLine());
	int []numbers  = new int[count];
        for (int i = 0; i < count ; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers[i] = number;}



        for (int  i = numbers.length -1 ; i >= 0 ; i--) {
            System.out.print(numbers[i] + " ");


        }}
    }

