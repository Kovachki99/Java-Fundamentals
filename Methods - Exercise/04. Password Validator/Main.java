package com.company;

import java.util.Scanner;

public class Main {
    public static boolean Chars(String current){
        return current.length() >= 6 && current.length() <= 10;
    }
    public static boolean lettersAndDigits(String current){
        for (int i = 0; i < current.length() ; i++) {
            if(Character.isLetter(current.charAt(i))||Character.isDigit(current.charAt(i))){
                continue;
            }
            else return false;
        }
        return true;
    }
    public static boolean contains(String current){
        int counter = 0;
        for (int i = 0; i <current.length() ; i++) {
            if(Character.isDigit(current.charAt(i))){counter++;}
        }
        return counter >= 2;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String currentPassword  = scan.nextLine();
	if(Chars(currentPassword)&&lettersAndDigits(currentPassword)&&contains(currentPassword)){System.out.println("Password is valid");}
	if(!Chars(currentPassword)){System.out.println("Password must be between 6 and 10 characters");}
	if(!lettersAndDigits(currentPassword)){System.out.println("Password must consist only of letters and digits");}
	if(!contains(currentPassword)){System.out.println("Password must have at least 2 digits");}

    }
    }

