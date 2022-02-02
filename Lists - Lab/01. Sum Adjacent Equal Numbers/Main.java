package com.company;

import javax.swing.text.Style;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double>list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < list1.size() ; i++) {
            if(i!=list1.size()-1){
            if (list1.get(i).equals(list1.get(i + 1))) {
                list1.set(i, (list1.get(i) +list1.get(i+1)));
                list1.remove(i+1);
                i = -1;}}
            }
        String output = format1(list1, " ");
       System.out.print(output);
       //System.out.println(list1.toString().replaceAll("[\\[\\],]", ""));

    }

    static String format1 (List<Double> items,String delimiter){
        String output = "";
        for (Double item : items)
            output += (new DecimalFormat("0.#").format(item)+ delimiter);
        return output;
    }
}
