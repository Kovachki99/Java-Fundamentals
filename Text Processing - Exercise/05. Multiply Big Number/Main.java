package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int plus = 0;
        List<Integer>list1 = new ArrayList<>();
        String bigNumber= scan.nextLine().replaceFirst("^0+(?!$)", "");
        int x = Integer.parseInt(scan.nextLine());
        if(x!=0){for (int i = bigNumber.length()-1; i >= 0 ; i--) {
            int digit = Integer.parseInt(String.valueOf(bigNumber.charAt(i)))*x+plus;
            if(digit<10){list1.add(digit);plus=0;}
            if(digit>=10){list1.add(digit%10);plus=digit/10;}
        }
        if(plus>0){list1.add(plus);}
        for (int i = list1.size()-1; i >= 0 ; i--) {
            System.out.print(list1.get(i));
        }}
        else {System.out.print(0);}
    }
}

