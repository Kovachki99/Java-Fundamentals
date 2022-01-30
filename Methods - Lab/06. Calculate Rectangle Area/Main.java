package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int length = Integer.parseInt(scan.nextLine());
	int width = Integer.parseInt(scan.nextLine());
	int area = length*width;
	System.out.println(area);
    }
}
