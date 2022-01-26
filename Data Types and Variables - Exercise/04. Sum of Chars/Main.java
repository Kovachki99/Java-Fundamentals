package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int chars = Integer.parseInt(scan.nextLine());
	int sum = 0;
       if(chars!=0) {
           String chaar = scan.nextLine();
       for (int i = 0; i <= chars-1; i++) {
            char current = chaar.charAt(0);
            sum += current;
            if(i!=chars-1){chaar = scan.nextLine();}
        }}
        System.out.printf("The sum equals: %d",sum);
    }
}
