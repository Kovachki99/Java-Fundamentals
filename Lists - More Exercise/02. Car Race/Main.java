package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        int counter = 0;
        int counter2 = 0;
        int counterOne = 0;
        int counterTwo = 0;
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < (list1.size() - 1) / 2; i++) {
            list2.add(list1.get(i));
        }
        for (int i = list1.size() - 1; i > list1.size() / 2; i--) {
            list3.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) == 0) {
                counter++;
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i) == 0) {
                counter2++;
            }
        }
       if(counter!=0){ for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
            if (list2.get(i) == 0) {
                counterOne++;
            }
            if (counterOne == counter) {
                break;
            }
            list2.remove(list2.get(i));
            list2.add(i, 0);
        }}
        sum = sum * 0.8;
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }
        if(counter2!=0){for (int i = 0; i < list3.size(); i++) {
            sum2 += list3.get(i);
            if (list3.get(i) == 0) {
                counterTwo++;
            }
            if (counterTwo == counter2) {
                break;
            }
            list3.remove(list3.get(i));
            list3.add(i, 0);
        }}
        sum2 = sum2 * 0.8;
        for (int i = 0; i < list3.size(); i++) {
            sum2 += list3.get(i);
        }
        if (sum<=sum2){System.out.printf("The winner is left with total time: %.1f",sum);}
        if (sum2<sum){System.out.printf("The winner is right with total time: %.1f",sum2);}
    }
}
