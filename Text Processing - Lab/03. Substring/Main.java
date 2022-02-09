package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String word = scan.nextLine();
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.contains(input)) {
                int number = word.indexOf(input);
                word = word.replace(""+input,"");
            }
        }
        System.out.println(word);
    }
}
