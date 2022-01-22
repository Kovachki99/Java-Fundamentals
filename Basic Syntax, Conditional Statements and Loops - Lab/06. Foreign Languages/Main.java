package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String country = scan.nextLine();
	if (country.equals("USA")||country.equals("England")){System.out.println("English");}
	else if (country.equals("Spain")||country.equals("Mexico")||country.equals("Argentina")){System.out.println("Spanish");}
	else {System.out.println("unknown");}
    }
}
