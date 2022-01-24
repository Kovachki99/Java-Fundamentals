package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	String city = scan.nextLine();
	int population = Integer.parseInt(scan.nextLine());
	int area = Integer.parseInt(scan.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",city,population,area);
    }
}
