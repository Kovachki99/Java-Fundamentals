package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int start = Integer.parseInt(scan.nextLine());
	int end = Integer.parseInt(scan.nextLine());
        for (int i = start; i <=end ; i++) {
            System.out.print(Character.toString(i));
            if (i!=end){System.out.print(" ");}
        }
    }
}
