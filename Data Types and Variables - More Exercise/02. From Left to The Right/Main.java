package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int getSum(long n)
    {
        long sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return (int) sum;
    }
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	long number = 0;
	int count = Integer.parseInt(scan.nextLine());
        for (int q = 0; q <count ; q++) {
        List<Long>one = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Long::parseLong)
                .collect(Collectors.toList());
        for (int j = 0; j < count ; j++) {
            if (one.get(0)>one.get(1)){number = one.get(0);} else {number = one.get(1);}
            int value = String.valueOf(number).length();
            for (int i = 0; i < value; i++) {
                sum = getSum(number);
            }
        }  System.out.println(Math.abs(sum));
        }
    }
}
