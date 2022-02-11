package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        Map<String,Integer> mine = new LinkedHashMap<>();
	String command = scan.nextLine();
	while (!(command.equals("stop"))){
	    int quantity = Integer.parseInt(scan.nextLine());
	    if(!mine.containsKey(command)){
	        mine.put(command,quantity);
        }
	    else{
	        int newQuantity = mine.get(command);
	        newQuantity+=quantity;
	        mine.put(command,newQuantity);
        }
	    command = scan.nextLine();
    }
        for (Map.Entry<String,Integer>entry : mine.entrySet()){
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
