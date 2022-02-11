package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[]array1 = scan.nextLine().split(" ");

        Map<Character,Integer> newOne = new LinkedHashMap<>();
        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array1[i].length(); j++) {
               if(!newOne.containsKey(array1[i].charAt(j))){
                   newOne.put(array1[i].charAt(j),1);
               }
               else {
                   int count = newOne.get(array1[i].charAt(j));
                   count++;
                   newOne.put(array1[i].charAt(j),count);
               }
            }
        }
        for (Map.Entry<Character,Integer>smtg:newOne.entrySet()) {
            System.out.printf("%c -> %d%n",smtg.getKey(),smtg.getValue());
        }
    }
}
