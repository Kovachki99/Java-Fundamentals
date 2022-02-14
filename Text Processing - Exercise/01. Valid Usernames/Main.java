package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<String>list1 = new ArrayList<>();
        boolean valid = true;
	String []list2 = scan.nextLine().split(", ");
        for (int i = 0; i <list2.length ; i++) {
            list1.add(list2[i]);
        }
        for (int i = 0; i <list1.size() ; i++) {
            if (list1.get(i).length()>=3&&list1.get(i).length()<=16){
                for (int j = 0; j <list1.get(i).length() ; j++) {
                    char asd = list1.get(i).charAt(j);
                    if(Character.isLetter(asd)||Character.isDigit(asd)||asd=='_'||asd=='-'){continue;}else {valid=false;break;}
                }
                if(valid){System.out.println(list1.get(i));}
                valid=true;
            }
        }
    }
}
