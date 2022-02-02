package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> list2 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int a = 0;
        if (list1.size()>list2.size()){a = list1.size();}else {a = list2.size();}
        for (int i = 0; i <= a ; i++) {
            if (i<list1.size()){System.out.print(list1.get(i)+" ");}
            if (i<list2.size()){System.out.print(list2.get(i)+" ");}
        }
    }
}


