package com.company;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double money = Double.parseDouble(scan.nextLine());
	int hit = 0;
        List<Integer>list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<>(list1);
    String input = scan.nextLine();
    while (!input.equals("Hit it again, Gabsy!")){
         hit = Integer.parseInt(input);
        for (int i = 0; i < list1.size() ; i++) {
            int result = list1.get(i)-hit;
            list1.remove(list1.get(i));
            list1.add(i, result );
            if (list1.get(i)<=0){if(money>=list2.get(i)*3){list1.remove(list1.get(i));list1.add(i,list2.get(i));money=money-list2.get(i)*3;}
            else {list1.remove(list1.get(i));list2.remove(list2.get(i));i--;}}



        }

        input= scan.nextLine();



    }String formattedString = list1.toString()
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
    System.out.println(formattedString);
    System.out.printf("Gabsy has %.2flv.",money);}


    }

