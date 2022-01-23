package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number = Integer.parseInt(scan.nextLine());
        if (number%10==9){System.out.println("nine");}
        if (number%10==8){System.out.println("eight");}
        if (number%10==7){System.out.println("seven");}
        if (number%10==6){System.out.println("six");}
        if (number%10==5){System.out.println("five");}
        if (number%10==4){System.out.println("four");}
        if (number%10==3){System.out.println("tree");}
        if (number%10==2){System.out.println("two");}
        if (number%10==1){System.out.println("one");}
        if (number%10==0){System.out.println("zero");}
        }
    }

