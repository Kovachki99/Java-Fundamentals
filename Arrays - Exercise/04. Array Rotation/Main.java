package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer>list1 = new ArrayList<>();
	int[] array1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
	int rotations = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <array1.length ; i++) {
            list1.add(array1[i]);
        }
        for (int i = 0; i <rotations ; i++) {
            int numb = list1.get(0);
            list1.remove(0);
            list1.add(list1.size(),numb);
        }
        System.out.println(list1.toString().replaceAll("\\[","").replaceAll("\\]","").replaceAll(",",""));
    }
}
