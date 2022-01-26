package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int loops = Integer.parseInt(scan.nextLine());
	int litersInTheTank = 0;
	int tank = 255;
        for (int i = 0; i < loops ; i++) {
            int currentLitters = Integer.parseInt(scan.nextLine());
            if(tank-currentLitters>=0){
                litersInTheTank+=currentLitters;tank=tank-currentLitters;
            } else {System.out.println("Insufficient capacity!");}

        }
        System.out.println(litersInTheTank);
    }
}
