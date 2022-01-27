package com.company;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int length = Integer.parseInt(scan.nextLine());
	String input = scan.nextLine();
	String current = "";
	int currentSum = 0;
	String bestCurrent = "";
	int bestSum = 0;
	int straight = 0;
	int bestStraight = 0;
	int startIndex = 0;
	int bestStartIndex = Integer.MAX_VALUE;
	int bestSample = 0;
	int sample = 0;
	while (!(input.equals("Clone them!"))){
	    sample++;
	    current = input;
        List<Integer>list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){list.add(Integer.parseInt(String.valueOf(input.charAt(i))));}
        }
        for (int i = 0; i < list.size() ; i++) {
            if(i!= list.size()-1&&list.get(i).equals(1)&&list.get(i+1).equals(1)){straight+=1;}
        }
        for (int i = 0; i <list.size() ; i++) {
            if(i!=list.size()-1&&list.get(i).equals(1)&&list.get(i+1).equals(1)){startIndex = i;break;}
        }
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(1)){currentSum+=1;}
        }
        if(straight>=bestStraight&&startIndex<bestStartIndex){bestCurrent=current;bestSum=currentSum;bestStraight=straight;bestStartIndex=startIndex;bestSample=sample;}
        else if(straight==bestStraight&&startIndex==bestStartIndex&&currentSum>bestSum){bestCurrent=current;bestSum=currentSum;bestStraight=straight;bestStartIndex=startIndex;bestSample=sample;}
        currentSum=0;
        straight = 0;
        list.clear();
        input = scan.nextLine();
        }
	System.out.printf("Best DNA sample %d with sum: %d.%n",bestSample,bestSum);
        for (int i = 0; i <bestCurrent.length() ; i++) {
            if(Character.isDigit(bestCurrent.charAt(i))){System.out.print(bestCurrent.charAt(i));if(i!=bestCurrent.length()-1){System.out.print(" ");}}
        }
    }
}
