package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Integer> list1 = new ArrayList<>();
        List<Character> listInput = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Character> skip = new ArrayList<>();
        List<Character> take = new ArrayList<>();
        StringBuilder asd = new StringBuilder();
        int all = 0;
        int lastLoop = 0;
        int totalSkips = 0;
        int counter = 0;


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0'
                    && input.charAt(i) <= '9') {
                String number = Character.toString(input.charAt(i));
                int number1 = Integer.parseInt(number);
                list1.add(number1);
            } else {
                listInput.add(input.charAt(i));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 != 0) {
                even.add(list1.get(i));
            } else {
                odd.add(list1.get(i));
            }
        }

        for (int i = 0; i < list1.size()-1; i++) {
            for (int j = 0; j < odd.get(i); j++) {
               // System.out.println(listInput.get(j));
                counter++;

            }

            for (int j = 0; j < even.get(i); j++) {
                counter++;
            }
        }

        System.out.println(listInput);
        System.out.println(counter);

        System.out.println(even);
        System.out.println(odd);
        System.out.println(list1);
        System.out.println(listInput);

    }
        }






