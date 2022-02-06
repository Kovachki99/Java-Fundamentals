package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int lostGames = Integer.parseInt(scan.nextLine());
	int brokenKeyboardTotal = 0;
	int brokenHeadsetsTotal = 0;
	int brokenHeadsets = 0;
	int brokenMouseTotal = 0;
	int brokenMouse = 0;
	int brokenKeyboard = 0;
	int brokenDisplay = 0;
	int lostGamesCounter1 = 1;
	int lostGamesCounter2 = 1;
        for (int i = 1; i <= lostGames ; i++) {
        	if (lostGamesCounter1>=2){brokenHeadsetsTotal+=1;brokenHeadsets+=1;lostGamesCounter1 = 0;}
        	if(lostGamesCounter2>=3){brokenMouseTotal+=1;brokenMouse+=1;lostGamesCounter2 = 0;}
        	if(brokenHeadsets==1&&brokenMouse==1){brokenKeyboard+=1;brokenKeyboardTotal+=1;}
        	if(brokenKeyboard>=2){brokenDisplay+=1;brokenKeyboard=0;}
			lostGamesCounter1++;
			lostGamesCounter2++;
        	brokenHeadsets=0;
        	brokenMouse=0;
        }
		double headsetPrice = Double.parseDouble(scan.nextLine())*brokenHeadsetsTotal;
		double mousePrice = Double.parseDouble(scan.nextLine())*brokenMouseTotal;
		double keyboardPrice = Double.parseDouble(scan.nextLine())*brokenKeyboardTotal;
		double displayPrice = Double.parseDouble(scan.nextLine())*brokenDisplay;
        double total = headsetPrice+mousePrice+keyboardPrice+displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",total);
    }
}
