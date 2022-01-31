package com.company;

import java.util.Scanner;

public class Main {
    public static int min(int numb, int numb2, int numb3){
        int min = Integer.MAX_VALUE;
        if(numb<min){min=numb;}
        if(numb2<min){min=numb2;}
        if(numb3<min){min=numb3;}
        return min;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int numb = Integer.parseInt(scan.nextLine());
	int numb2 = Integer.parseInt(scan.nextLine());
	int numb3 = Integer.parseInt(scan.nextLine());
	System.out.println(min(numb,numb2,numb3));
    }
}
