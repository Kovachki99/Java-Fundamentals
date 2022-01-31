package com.company;

import java.util.Scanner;

public class Main {
    public static void between(String one, String two){
        int start = Math.min(one.charAt(0),two.charAt(0));
        int end = Math.max(one.charAt(0),two.charAt(0));
        for (int i = start+1; i < end ; i++) {
            System.out.print(Character.toString((char) i));if(i!=end-1){System.out.print(" ");}
        }
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String first = scan.nextLine();
	String last = scan.nextLine();
	between(first,last);
    }
}
