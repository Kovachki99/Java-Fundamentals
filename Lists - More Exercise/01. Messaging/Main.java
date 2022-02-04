package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	List<Integer> list1 = Arrays
            .stream(scan.nextLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
	String input = scan.nextLine();
	StringBuilder something = new StringBuilder(input);
        for (int i = 0; i < list1.size() ; i++) {
            int sum = 0;
            int number = list1.get(i);
            while(number!=0){
                sum = sum + number%10;
                number = number/10;
            }int one = something.length();
            input=input.replace(" ","-");
            if (sum<=something.length()){System.out.print(something.charAt(sum));something.deleteCharAt(sum);}
            if (sum>something.length()){sum=sum-something.length();System.out.print(something.charAt(sum));something.deleteCharAt(sum);}

        }

    }
}
