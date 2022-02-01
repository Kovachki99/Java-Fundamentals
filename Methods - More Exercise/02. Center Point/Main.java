package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int firstY = Integer.parseInt(scan.nextLine());
	int firstX = Integer.parseInt(scan.nextLine());
	int secondY = Integer.parseInt(scan.nextLine());
	int secondX = Integer.parseInt(scan.nextLine());
	int sum1 = firstX + firstY;
	int sum2 = secondX+secondY;
	if (sum1>sum2){System.out.printf("(%d, %d)",secondY,secondX);}else {System.out.printf("(%d, %d)",firstY,firstX);}
    }
}
