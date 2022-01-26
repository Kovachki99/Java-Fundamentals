package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = Integer.parseInt(scan.nextLine());
	int orgN = N;
	int M = Integer.parseInt(scan.nextLine());
	int Y = Integer.parseInt(scan.nextLine());
	int targets = 0;
		while (!(N<M)){
	    N=N-M;
	    targets++;
	    if(N==orgN/2&&Y>0){N=N/Y;}
    }
	System.out.println(N);
	System.out.println(targets);
    }
}
