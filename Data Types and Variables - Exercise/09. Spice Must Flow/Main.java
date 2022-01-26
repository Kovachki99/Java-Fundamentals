package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int firstDay = Integer.parseInt(scan.nextLine());
	int total = 0;
	int days = 0;
	while (!(firstDay<100)){
	    total+=firstDay;
	    firstDay-=10;
	    total-=26;
	    days+=1;
        }
	total-=26;
	if(total<0){total=0;}
	System.out.println(days);
	System.out.println(total);
    }
}
