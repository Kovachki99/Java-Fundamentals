package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        int open = 0;
        int close = 0;
        for (int i = 1; i <= lines; i++) {
            String input = scan.nextLine();
            if (input.contains("(")){open+=1;}
            if (input.contains(")")){if (open<close){close+=1;break;} else {close+=1;}}
        if (close>open) {close+=1;break;}
        }
        if (close==open&&open!=0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
