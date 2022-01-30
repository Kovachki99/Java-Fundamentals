package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String calculationType = scan.nextLine();
	int number1 = Integer.parseInt(scan.nextLine());
	int number2 = Integer.parseInt(scan.nextLine());
	switch (calculationType){
        case "add":System.out.println(number1+number2);break;
        case "multiply":System.out.println(number1*number2);break;
        case "subtract":System.out.println(number1-number2);break;
        case "divide":System.out.println(number1/number2);break;

    }
    }
}
