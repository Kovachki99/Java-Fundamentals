package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static int VowelsCount(String asd){
int counter=0;
        for (int i = 0; i < asd.length() ; i++) {
            asd = asd.toLowerCase();
            if(asd.charAt(i)=='a'||asd.charAt(i)=='e'||asd.charAt(i)=='i'||asd.charAt(i)=='o'||asd.charAt(i)=='u'){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	System.out.println(VowelsCount(input));

    }
}
