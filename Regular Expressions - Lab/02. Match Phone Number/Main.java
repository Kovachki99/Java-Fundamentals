package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
	String phone = scan.nextLine();
	Pattern pattern = Pattern.compile(regex);
	Matcher phoneMatcher = pattern.matcher(phone);
        List<String>matchedPhones = new LinkedList<>();
        while (phoneMatcher.find()){
            matchedPhones.add(phoneMatcher.group());
        }
        System.out.println(String.join( ", ",matchedPhones));
    }
}
