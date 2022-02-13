package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String start = scan.nextLine();
	String end = scan.nextLine();
	String input = scan.nextLine();
	int indexStart = 0;
	int indexEnd = 0;
	int sum = 0;
	indexStart  = start.charAt(0);
	indexEnd = end.charAt(0);
        for (int i = 0; i <input.length() ; i++) {
            if (input.charAt(i)>indexStart&&input.charAt(i)<indexEnd){sum+=input.charAt(i);}
        }
        System.out.println(sum);
    }
}
