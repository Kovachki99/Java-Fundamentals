package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String all = "";
        int counter = 0;
        String[] arrays = scan.nextLine().split("\\|");
        for (int i = arrays.length-1; i >= 0 ; i--) {
            arrays[i]=arrays[i].replaceAll("\\s+"," ").trim();
            if(arrays[i].equals("")){continue;}
            List<Integer>list = Arrays
                       .stream(arrays[i].split("\\s+"))
                       .map(e -> Integer.parseInt(e))
                       .collect(Collectors.toList());
            for (int j = 0; j < list.size() ; j++) {
                System.out.print(list.get(j));if(!(i==0&&j==list.size()-1)){System.out.print(" ");}
            }
        }
    }
}
