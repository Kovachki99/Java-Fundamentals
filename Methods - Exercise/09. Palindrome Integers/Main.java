package com.company;

import java.util.Scanner;

public class Main {
    public static boolean palindrome(String one){
        String backwards = "";
        for (int i = one.length()-1; i >=0 ; i--) {
            backwards+=one.charAt(i);
        }
        return one.equals(backwards);
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	while (!input.equals("END")){
	    if(palindrome(input)){System.out.println("true");}else{System.out.println("false");}
	    input= scan.nextLine();
    }
    }
}
