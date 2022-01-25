package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int key = Integer.parseInt(scan.nextLine());
	int list = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < list ; i++) {
            String input = scan.nextLine();
            char realWord = (char) (input.hashCode()+key);
            System.out.print(realWord);
        }
    }
}
