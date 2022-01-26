package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	int numb = Integer.parseInt(scan.nextLine());
	int numb2 = Integer.parseInt(scan.nextLine());
	int numb3 = Integer.parseInt(scan.nextLine());
	int numb4 = Integer.parseInt(scan.nextLine());
	System.out.println(((numb+numb2)/numb3)*numb4);

    }
}
