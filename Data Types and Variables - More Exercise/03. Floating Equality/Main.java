package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numb1 = Double.parseDouble(scan.nextLine());
		double numb2 = Double.parseDouble(scan.nextLine());
		double pi = 0.000001;
		if (numb1 > numb2) {
			numb1 = numb1 - numb2;
			if (numb1 > pi) {
				System.out.println("False");
			}if (numb1<=pi) {
				System.out.println("True"); }
		}
		else if (numb2 > numb1) {
			numb2 = numb2 - numb1;
			if (numb2>pi){
				System.out.println("False");}
			if (numb2<=pi) {System.out.println("True");
			}
		}


		}
	}

