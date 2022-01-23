package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	List<String>list1 = new ArrayList<>();
	int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < number ; i++) {
            int letter= Integer.parseInt(scan.nextLine());
            switch (letter){
                case 1:break;
                case 2:list1.add("a");break;
                case 22:list1.add("b");break;
                case 222:list1.add("c");break;
                case 3:list1.add("d");break;
                case 33:list1.add("e");break;
                case 333:list1.add("f");break;
                case 4:list1.add("g");break;
                case 44:list1.add("h");break;
                case 444:list1.add("i");break;
                case 5:list1.add("j");break;
                case 55:list1.add("k");break;
                case 555:list1.add("l");break;
                case 6:list1.add("m");break;
                case 66:list1.add("n");break;
                case 666:list1.add("o");break;
                case 7:list1.add("p");break;
                case 77:list1.add("q");break;
                case 777:list1.add("r");break;
                case 7777 :list1.add("s");break;
                case 8:list1.add("t");break;
                case 88:list1.add("u");break;
                case 888:list1.add("v");break;
                case 9:list1.add("w");break;
                case 99:list1.add("x");break;
                case 999:list1.add("y");break;
                case 9999 :list1.add("z");break;
                case 0:list1.add("-");break;
            }

        }
    System.out.print(list1.toString().replaceAll("[\\]\\[\\,/., ]","").replaceAll("-"," "));
    }
}
