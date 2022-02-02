package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Integer>list1 = new ArrayList<>();
	int[]numbers = Arrays
            .stream(scan.nextLine().split(" "))
            .mapToInt(e -> Integer.parseInt(e))
            .toArray();
        for (int i = 0; i < numbers.length ; i++) {
            list1.add(numbers[i]);
        }
        String[] input = scan.nextLine().split(" ");
        while(!(input[0].equals("end"))){
            if (input[0].equals("Insert")){list1.add(Integer.parseInt(input[2]),Integer.parseInt(input[1]));}
            if(input[0].equals("Delete")){
                for (int i = 0; i <list1.size() ; i++) {
                    if(list1.get(i).equals(Integer.parseInt(input[1]))){
                        list1.remove(i);
                    }
                }
            }
            input=scan.nextLine().split(" ");
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));if(i!=list1.size()-1){System.out.print(" ");}
        }
    }
}
