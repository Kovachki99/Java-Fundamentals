package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<String>input = Arrays
                .stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());
        //System.out.println(input);
        Random rnd = new Random();
        int max = input.size();
        List<String>output = new ArrayList<>();


        for (int i = 0; i < max ; i++) {
            int number = rnd.nextInt(input.size());
            output.add(input.get(number));
            input.remove(input.get(number));

        }
        for (int i = 0; i <output.size() ; i++) {
            System.out.println(output.get(i));
        }

    }
}
