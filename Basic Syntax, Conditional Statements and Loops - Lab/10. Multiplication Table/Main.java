package com.company;

public class Main {

    public static void main(String[] args) {
	int one = 1;
	int two = 1;


	while (one<11&&two<11){
		int result=one*two;
		System.out.printf("%d * %d = %d%n",one,two,result);
	    two+=1;
	    if (two==11){
	    	two=1;one+=1;
		}
    }
    }
}
