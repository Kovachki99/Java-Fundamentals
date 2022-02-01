package com.company;

import java.util.Scanner;

public class Main {
    static String catch1(String type,String input){
        switch (type){
            case "int": int number = Integer.parseInt(input)*2;System.out.printf("%d",number);break;
            case "real": double number2 = Double.parseDouble(input)*1.5;System.out.printf("%.2f",number2);break;
            default:System.out.printf("$%s$%n",input);break;
        }
        return input;
    }
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String type = scan.nextLine();
	String input = scan.nextLine();
	catch1(type,input);
    }
}
