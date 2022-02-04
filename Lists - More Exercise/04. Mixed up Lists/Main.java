package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> ArrayOne = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> ArrayTwo = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> List1 = new ArrayList<>();
        List<Integer> finale = new ArrayList<>();
        int number = 0;
        number = Math.max(ArrayOne.size(), ArrayTwo.size());
        if (ArrayOne.size() > ArrayTwo.size()) {
            for (int i = ArrayTwo.size() - 1; i >= 0; i--) {
                // System.out.print(ArrayTwo.get(i)+" ");
                List1.add(0, ArrayTwo.get(i));
                ArrayTwo.remove(ArrayTwo.get(i));
                List1.add(ArrayOne.get(i));
                ArrayOne.remove(ArrayOne.get(i));
            }
            for (int i = 0; i < List1.size(); i++) {
                int best = Math.max(ArrayOne.get(0), ArrayOne.get(1));
                int min = Math.min(ArrayOne.get(0), ArrayOne.get(1));
                if (min < List1.get(i) && best > List1.get(i)) {
                    finale.add(List1.get(i));
                }
            }
        }
        if (ArrayOne.size() < ArrayTwo.size()) {
            for (int i = ArrayOne.size() - 1; i >= 0; i--) {
                // System.out.print(ArrayTwo.get(i)+" ");
                List1.add( ArrayTwo.get(i+2));
                ArrayTwo.remove(ArrayTwo.get(i+2));
                List1.add(0, ArrayOne.get(i));
                ArrayOne.remove(ArrayOne.get(i));
            }
            for (int i = 0; i < List1.size(); i++) {
                int best = Math.max(ArrayTwo.get(0), ArrayTwo.get(1));
                int min = Math.min(ArrayTwo.get(0), ArrayTwo.get(1));
                if (min < List1.get(i) && best > List1.get(i)) {
                    finale.add(List1.get(i));
                }
            }}
            finale.sort(Comparator.comparing(Integer::byteValue));
            System.out.println(finale.toString().replaceAll("[\\[,\\]]", ""));
        }
    }


