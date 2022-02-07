package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[]words = Arrays
            .stream(scan.nextLine().split(" "))
            .filter(w -> w.length() % 2 == 0)
            .toArray(String[]::new);
            Stream.of(words).forEach(e ->System.out.println(e));



    }

}
