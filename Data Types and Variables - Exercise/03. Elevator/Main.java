package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int people = Integer.parseInt(scan.nextLine());
	double capacity = Double.parseDouble(scan.nextLine());
	double loops = Math.ceil(people/capacity);
	System.out.printf("%.0f",loops);

    }
}
