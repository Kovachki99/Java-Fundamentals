package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	int hrs = Integer.parseInt(scan.nextLine());
	int minutes = Integer.parseInt(scan.nextLine());

	minutes = minutes+30;

	if (minutes>=60){
	    hrs+=1;minutes-=60;
    }
	if (hrs>=24){hrs=0;}
	System.out.printf("%d:%02d",hrs,minutes);

    }
}
