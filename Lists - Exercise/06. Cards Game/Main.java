package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
        List<Integer>list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        List<Integer>list2 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        while (!list1.isEmpty()&&!list2.isEmpty()){
            if(list1.get(0)>list2.get(0)){list1.add(list2.get(0));list1.add(list1.get(0));list2.remove(list2.get(0));list1.remove(list1.get(0));}
            else if (list1.get(0)<list2.get(0)){list2.add(list1.get(0));list2.add(list2.get(0));list1.remove(list1.get(0));list2.remove(list2.get(0));}
            else if(list1.get(0).equals(list2.get(0))){list1.remove(list1.get(0));list2.remove(list2.get(0));}
}
        String winner = "";
        boolean firstE = list1.isEmpty();
        boolean secondE = list2.isEmpty();
        if(secondE){winner = "First player";
            for (int i = 0; i < list1.size(); i++) {
                sum+=list1.get(i);
            }}
        if(firstE){winner = "Second player";
            for (int i = 0; i < list2.size(); i++) {
                sum+=list2.get(i);
            }}
            System.out.printf("%s wins! Sum: %d",winner,sum);
        }
    }

