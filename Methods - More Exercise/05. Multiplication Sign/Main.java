package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int counter = 0;
			int numb1 = Integer.parseInt(scan.nextLine());
			int numb2 = Integer.parseInt(scan.nextLine());
			int numb3 = Integer.parseInt(scan.nextLine());
			if (numb1<0){counter++;}
			if (numb2<0){counter++;}
			if (numb3<0){counter++;}
		if(numb1!=0&&numb2!=0&&numb3!=0)
		{if(counter==1||counter==3){System.out.println("negative");}else{System.out.println("positive");}}
		else {System.out.println("zero");}

		}
}

