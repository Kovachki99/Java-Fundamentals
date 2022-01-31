package com.company;

import java.util.Scanner;

public class Main {
    public static void middle(String one){
        int chars = one.length();
        if(chars%2!=0){System.out.println(one.charAt(one.length()/2));}
        if(chars%2==0){System.out.print(one.charAt((one.length()/2)-1));System.out.print(one.charAt((one.length()/2)));}

    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	middle(input);
    }
}
