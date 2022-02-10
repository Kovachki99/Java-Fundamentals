package com.company;

import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	BigInteger fact = BigInteger.ONE;
        for (int i = n; i > 0 ; i--) {
           fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
