package com.company;

import java.util.Scanner;

public class Main {
    public static String Getmax(String type, String input1, String input2){
        String result = " ";
        switch (type){
            case "int":
                int number1 = Integer.parseInt(input1);
                int number2 = Integer.parseInt(input2);

                if (number1>number2){result = input1;}else {result = input2;}break;
            case "string":
                if (input1.compareTo(input2)>=0){
                    result = input1;break;
                }
                result =  input2;break;
            case "char":
                char a1 = input1.charAt(0);
                char a2 = input2.charAt(0);
                if (a1>a2){result = input1;} else {result = input2;}break;
        }
        return result;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String type = scan.nextLine();
	String input1 = scan.nextLine();
	String input2 = scan.nextLine();
	System.out.println(Getmax(type,input1,input2));


    }
}
