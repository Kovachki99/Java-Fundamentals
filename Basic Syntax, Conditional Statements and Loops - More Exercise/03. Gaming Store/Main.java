package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double outFall4 = 39.99;
	double csog = 15.99;
	double zplinter = 19.99;
	double honored2 = 59.99;
	double roverWatch = 29.99;
	double roverWatchOrigins = 39.99;
	double money = Double.parseDouble(scan.nextLine());
	double spent = 0;
	String input = scan.nextLine();
	while (!input.equals("Game Time")){
	    switch (input){
            case "OutFall 4":if(money<outFall4){System.out.println("Too Expensive");
            }else { money -= outFall4;System.out.println("Bought OutFall 4");spent+=outFall4;
            }
                break;
            case "CS: OG": if(money<csog){System.out.println("Too Expensive");
            }else {money -= csog;System.out.println("Bought CS: OG");spent+=csog;
            }
                break;
            case "Zplinter Zell": if(money<zplinter){System.out.println("Too Expensive");
            }else {money -= zplinter;System.out.println("Bought Zplinter Zell");spent+=zplinter;
            }
                break;
            case "Honored 2":if(money<honored2){System.out.println("Too Expensive");
            }else {money -= honored2;System.out.println("Bought Honored 2");spent+=honored2;
            }
                break;
            case "RoverWatch":if(money<roverWatch){System.out.println("Too Expensive");
            }else {money -= roverWatch;System.out.println("Bought RoverWatch");spent+=roverWatch;
            }
                break;
            case "RoverWatch Origins Edition": if(money<roverWatchOrigins){System.out.println("Too Expensive");
            }else {money -= roverWatchOrigins;System.out.println("Bought RoverWatch Origins Edition");spent+=roverWatchOrigins;
            }
                break;
            default:System.out.println("Not Found");break;}
        if (money==0){System.out.println("Out of money!");break;}
            input = scan.nextLine();



        }
        if (money>0){System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spent,money);}
    }
    }

