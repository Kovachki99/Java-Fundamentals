package com.company;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int one = Integer.parseInt(scan.nextLine());
		int two = Integer.parseInt(scan.nextLine());
		int tree = Integer.parseInt(scan.nextLine());
		if (one>two&&one>tree){if (two>tree){System.out.println(one);System.out.println(two);System.out.println(tree);}
		else {System.out.println(one);System.out.println(tree);System.out.println(two);}}
		if (two>one&&two>tree)if (one>tree){System.out.println(two);System.out.println(one);System.out.println(tree);}
		else {System.out.println(two);System.out.println(tree);System.out.println(one);}
		if (tree>one&&tree>two){if (one > two){System.out.println(tree);System.out.println(one);System.out.println(two);}
		else {System.out.println(tree);System.out.println(two);System.out.println(one);}
		}
	}
}
