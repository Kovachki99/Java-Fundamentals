package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
        List<String> list1 = new ArrayList<>(Arrays.asList(input.split(" ")));
        for (int i = 0; i <list1.size() ; i++) {
            switch (list1.get(i)){
                case ".-":System.out.print("A");list1.remove(list1.get(i));i-=1;break;
                case "-...":System.out.print("B");list1.remove(list1.get(i));i-=1;break;
                case "-.-.":System.out.print("C");list1.remove(list1.get(i));i-=1;break;
                case "-..":System.out.print("D");list1.remove(list1.get(i));i-=1;break;
                case ".":System.out.print("E");list1.remove(list1.get(i));i-=1;break;
                case "..-.":System.out.print("F");list1.remove(list1.get(i));i-=1;break;
                case "--.":System.out.print("G");list1.remove(list1.get(i));i-=1;break;
                case "....":System.out.print("H");list1.remove(list1.get(i));i-=1;break;
                case "..":System.out.print("I");list1.remove(list1.get(i));i-=1;break;
                case ".---":System.out.print("J");list1.remove(list1.get(i));i-=1;break;
                case "-.-":System.out.print("K");list1.remove(list1.get(i));i-=1;break;
                case ".-..":System.out.print("L");list1.remove(list1.get(i));i-=1;break;
                case "--":System.out.print("M");list1.remove(list1.get(i));i-=1;break;
                case "-.":System.out.print("N");list1.remove(list1.get(i));i-=1;break;
                case"---":System.out.print("O");list1.remove(list1.get(i));i-=1;break;
                case".--.":System.out.print("P");list1.remove(list1.get(i));i-=1;break;
                case"--.-":System.out.print("Q");list1.remove(list1.get(i));i-=1;break;
                case".-.":System.out.print("R");list1.remove(list1.get(i));i-=1;break;
                case "...":System.out.print("S");list1.remove(list1.get(i));i-=1;break;
                case"-":System.out.print("T");list1.remove(list1.get(i));i-=1;break;
                case "..-":System.out.print("U");list1.remove(list1.get(i));i-=1;break;
                case "...-":System.out.print("V");list1.remove(list1.get(i));i-=1;break;
                case ".--":System.out.print("W");list1.remove(list1.get(i));i-=1;break;
                case "-..-":System.out.print("X");list1.remove(list1.get(i));i-=1;break;
                case "-.--":System.out.print("Y");list1.remove(list1.get(i));i-=1;break;
                case "--..":System.out.print("Z");list1.remove(list1.get(i));i-=1;break;
                default:System.out.print(" ");break;
            }
        }
    }
}

