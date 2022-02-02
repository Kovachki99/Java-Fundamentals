package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer>list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());;
        for (int i = list1.size()-1; i >= 0 ; i--) {
            if(list1.get(i)>0){System.out.print(list1.get(i)+" ");}else {list1.remove(i);}
            if(list1.isEmpty()){System.out.println("empty");}
        }
    }
}
