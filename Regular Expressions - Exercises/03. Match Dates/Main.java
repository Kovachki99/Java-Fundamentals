package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
	String datesString = scan.nextLine();
	Pattern pattern = Pattern.compile(regex);
	Matcher dates = pattern.matcher(datesString);
	while(dates.find()){
	    String day = dates.group("day");
	    String month = dates.group("month");
	    String year = dates.group("year");
	    System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
    }
    }
}
