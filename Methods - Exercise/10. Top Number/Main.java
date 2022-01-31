package com.company;

import java.util.Scanner;

public class Main {
    public static void top(String input){
        for (int i = 1; i <= Integer.parseInt(input); i++) {
            String length = ""+i;
            int sum = 0;
            for (int j = 0; j < length.length() ; j++) {
                sum+=Integer.parseInt(String.valueOf(length.charAt(j)));;
            }
            if (sum%8==0){
                boolean top = false;
                for (int j = 0; j < length.length() ; j++) {
                    int digit = Integer.parseInt(String.valueOf(length.charAt(j)));
                    if(digit%2!=0){top=true;break;}else{continue;}
                }
                if(top){System.out.println(i);}
            }
        }
    }
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	top(input);
    }
}
