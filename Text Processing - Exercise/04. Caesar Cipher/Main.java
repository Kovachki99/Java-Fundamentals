package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
        for (int i = 0; i < input.length() ; i++) {
            char charValue = (char) (input.charAt(i)+3);
            System.out.print(charValue);
        }
    }
}
