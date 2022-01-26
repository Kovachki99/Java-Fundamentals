package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = Integer.parseInt(scan.nextLine());
	String type = scan.nextLine();
	double radius = Double.parseDouble(scan.nextLine());
	int height = Integer.parseInt(scan.nextLine());
	double volume = 0;
	String currentType  = "";
        for (int i = 0; i < count ; i++) {
            double currentVolume = Math.PI*(radius*radius)*height;
            if(currentVolume>=volume){volume=currentVolume;currentType=type;}
            if(i!=count-1){type = scan.nextLine();
            radius = Double.parseDouble(scan.nextLine());
            height = Integer.parseInt(scan.nextLine());}
        }
        System.out.println(currentType);
    }
}
