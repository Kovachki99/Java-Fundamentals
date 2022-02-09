package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean isDigit(char a){
        if (Character.isDigit(a)){
            return true;
        }
        return false;
    }
    static boolean isLetter(char a){
        if (Character.isLetter(a)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
        List<Character>list1 = new ArrayList<>();
        List<Character>list2 = new ArrayList<>();
        List<Character>list3 = new ArrayList<>();
        for (int i = 0; i < input.length() ; i++) {
            if(isDigit(input.charAt(i))){list1.add(input.charAt(i));}
            if(isLetter(input.charAt(i))){list2.add(input.charAt(i));}
            if(!isLetter(input.charAt(i))&&!isDigit(input.charAt(i))) {list3.add(input.charAt(i));}
        }
        System.out.println(list1.toString().replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")
                .replace(" ","")//remove the left bracket
                .trim());
        System.out.println(list2.toString().replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")
                .replace(" ","")//remove the left bracket
                .trim());
        System.out.println(list3.toString().replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")
                .replace(" ","")//remove the left bracket
                .trim());
    }
}
