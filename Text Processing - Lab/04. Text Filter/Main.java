package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<String>list1 = Arrays
                .stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());
String censure = "";
    String text = scan.nextLine();
    //System.out.print(list1);
        for (int i = 0; i < list1.size() ; i++) {
            censure="";
            for (int j = 0; j < text.length() ; j++) {
                if (text.contains(list1.get(i))){
                    for (int k = 0; k <list1.get(i).length() ; k++) {
                       censure += "*";
                    }
                    text = text.replace(""+list1.get(i),censure);

                }
            }
        }
        System.out.print(text);
    }
}
