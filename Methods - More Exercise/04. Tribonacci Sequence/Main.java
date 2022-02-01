package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	BigInteger num = new BigInteger(scan.nextLine());
	BigInteger one = BigInteger.valueOf(1);
	BigInteger two = BigInteger.valueOf(1);
	BigInteger three = BigInteger.valueOf(2);
	BigInteger four = BigInteger.valueOf(4);
	if (num.intValue()>=1){System.out.print(one);}
    if (num.intValue()>=2){System.out.print(" " + two);}
    if (num.intValue()>=3){System.out.print(" " + three);}
    if (num.intValue()>=4){System.out.print(" " + four);}
if (!(num.intValue()==4)){
        for (int i = 0; i < num.intValue()-4 ; i++) {
            one = two;
            two = three;
            three  = four;
            four = one.add(two).add(three);
            System.out.print(" "+four);
        }}
    }
}
