package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int total = 0;
	String[] strings = scan.nextLine().split(" ");
	int minLength = 0;
	int maxLength = 0;
	if(strings[0].length() >= strings[1].length()){minLength=strings[1].length();maxLength=strings[0].length();}else {minLength=strings[0].length();maxLength=strings[1].length();}
	int lastIndex = 0;


            for (int j = 0; j < minLength ; j++) {
                total+=strings[0].charAt(j)*strings[1].charAt(j);
                lastIndex = j;
            }
        for (int i = lastIndex+1; i < maxLength ; i++) {
            if(maxLength==strings[0].length()) {
                total += strings[0].charAt(i);
            }
            if(maxLength==strings[1].length()) {
                total += strings[1].charAt(i);
            }
        }
            System.out.println(total);

    }
}
