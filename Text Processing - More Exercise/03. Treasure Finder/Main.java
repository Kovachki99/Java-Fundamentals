package com.company;

import java.io.OutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Integer>list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    String input = scan.nextLine();
while (!input.equals("find")){
    List<Character>output = new ArrayList<>();
    int loop = 0;
        for (int i = 0; i <input.length() ; i++) {
            if (loop>list1.size()-1){loop = 0;}
            int key = list1.get(loop);
            char number = (char) (Character.hashCode(input.charAt(i))-key);
           output.add(number);
            loop++;
        }
        System.out.print("Found ");
    //System.out.print(output);
    for (int i = 0; i < output.size() ; i++) {
        while (!output.get(i).equals('&')){
            output.remove(i);
        }
        break;
    }
    int indexEnd = 0;
    output.remove(0);
    for (Character character : output) {
        if (!character.equals('&')) {
            System.out.print(character);
        } else {
            break;
        }
    }
    System.out.print(" at ");
    for (int i = 0; i < output.size() ; i++) {
        while (!output.get(i).equals('<')){
            output.remove(i);
        }
        break;
    }
    output.remove(0);
    for (int i = 0; i < output.size(); i++) {
        if (!output.get(i).equals('>')){
            System.out.print(output.get(i));
        }else {break;}
    }
    System.out.println("");
input = scan.nextLine();
}}
    }

