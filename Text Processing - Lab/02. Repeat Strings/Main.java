package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	int count = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <count ; i++) {
            System.out.print(input);
        }
    }
}
