package com.company;

import java.util.Scanner;

public class Main {
    public static int Sum(int one,int two){
        return one+two;
    }
    public static int Subtract(int one,int two){
        return one-two;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int one =Integer.parseInt(scan.nextLine());
	int two = Integer.parseInt(scan.nextLine());
	int three = Integer.parseInt(scan.nextLine());
	System.out.println(Subtract(Sum(one,two),three));
    }
}
