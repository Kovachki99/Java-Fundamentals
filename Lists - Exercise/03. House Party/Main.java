package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	List<String>list1 = new ArrayList<>();
	int loops = Integer.parseInt(scan.nextLine());
	String[]command = scan.nextLine().split(" ");
        for (int i = 0; i <loops ; i++) {
            if(command.length==3&&!list1.contains(command[0])){list1.add(command[0]);}
            else if(command.length==3&&list1.contains(command[0])){System.out.printf("%s is already in the list!%n",command[0]);}
            else if(command.length==4&&list1.contains(command[0])){list1.remove(command[0]);}
            else if(command.length==4&&!list1.contains(command[0])){System.out.printf("%s is not in the list!%n",command[0]);}
            if(i<loops-1){command = scan.nextLine().split(" ");}
        }
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }
    }
}
