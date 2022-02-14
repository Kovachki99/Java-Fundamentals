package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int removed = 0;
	String input = scan.nextLine();
        List<Character>list1 = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list1.add(input.charAt(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            if(i==list1.size()-1){break;}
            for (int j = i+1;list1.get(i)==list1.get(j); j++) {
                list1.remove(j);
                list1.add(j,'-');
                if(j==list1.size()-1){break;}
            }
        }
        for (int i = 0; i <list1.size() ; i++) {
            if(Character.isLetter(list1.get(i))){System.out.print(list1.get(i));}
        }

    }
}
