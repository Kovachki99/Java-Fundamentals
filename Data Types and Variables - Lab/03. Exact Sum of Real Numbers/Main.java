package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	BigDecimal sum = new BigDecimal(0);
	double count  = Double.parseDouble(scan.nextLine());
        for (int i = 0; i < count ; i++) {
            BigDecimal number = new BigDecimal(scan.nextLine());
            sum = sum.add(number);


        }
        System.out.println(sum);
    }
}
