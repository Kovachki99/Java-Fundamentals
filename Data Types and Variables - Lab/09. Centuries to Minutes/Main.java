package com.company;

import javax.xml.datatype.DatatypeConstants;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int centuries = Integer.parseInt(scan.nextLine());
	double years = centuries*100;
	double days = years*365.2422;
	double hrs = days*24;
	double minutes = hrs * 60;
	System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries,years,days,hrs,minutes);
    }
}
