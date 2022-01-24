package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        char b = scan.next().charAt(0);
        char c = scan.next().charAt(0);
        String result = new StringBuilder().append(a).append(b).append(c).toString();
        System.out.println(result);


    }
}
