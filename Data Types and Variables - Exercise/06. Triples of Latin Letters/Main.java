package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int numb = Integer.parseInt(scan.nextLine());
        for (int i = 97; i < 97+numb ; i++) {
            for (int j = 97;j < 97+numb ; j++) {
                for (int k = 97; k < 97+numb ; k++) {
                    System.out.printf("%s%s%s%n",Character.toString(i),Character.toString(j),Character.toString(k));
                }
            }
        }
    }
}
