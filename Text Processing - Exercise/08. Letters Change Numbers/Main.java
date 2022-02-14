package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String number = "";
	int position = 0;
	double sum = 0;
	String []input = scan.nextLine().split("\\s+");
		for (int i = 0; i <input.length ; i++) {
			for (int j = 0; j <input[i].length() ; j++) {
				if(Character.isDigit(input[i].charAt(j))){number += ""+input[i].charAt(j);}
			}
			double currentNumber = Double.parseDouble(number);
			if(Character.isUpperCase(input[i].charAt(0))){
				 position = input[i].charAt(0)-64;
				 currentNumber=currentNumber/position;
			}
			else if(!(Character.isUpperCase(input[i].charAt(0)))){
				position = input[i].charAt(0)-96;
				currentNumber=currentNumber*position;
			}
			if(Character.isUpperCase(input[i].charAt(input[i].length()-1))){
				position = input[i].charAt(input[i].length()-1)-64;
				currentNumber-=position;
			}
			else if(!(Character.isUpperCase(input[i].charAt(input[i].length()-1)))){
				position = input[i].charAt(input[i].length()-1)-96;
				currentNumber+=position;
			}
			sum+=currentNumber;
			number="";
		}
		System.out.printf("%.2f",sum);
    }
}
