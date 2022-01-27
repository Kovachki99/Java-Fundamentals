package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	String [] array = input.split(" ");
        for (int i = 0; input.equals(" ") ; i++) {
            input = scan.nextLine();
            array[i] = input;
        }
        for (int i = array.length - 1 ; i >= 0 ; i--) {

            System.out.print(array[i]+ " ");
        }


}
    }
