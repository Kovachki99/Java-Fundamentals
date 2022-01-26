package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Integer>list1 = new ArrayList<>();
        int sum = 0;
	String numb = scan.nextLine();
        for (int i = 0; i < numb.length() ; i++) {
            list1.add(Integer.parseInt(String.valueOf(numb.charAt(i))));
        }
        for (int i = 0; i <list1.size() ; i++) {
            sum +=list1.get(i);
        }
	System.out.println(sum);
    }
}
