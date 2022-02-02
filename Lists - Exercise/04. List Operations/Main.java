package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Integer>list = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());



    String[]command = scan.nextLine().split(" ");
    while (!command[0].equals("End")){
        if (command[0].equals("Add")){list.add(Integer.parseInt(command[1]));}
        else if(command[0].equals("Insert")&&(Integer.parseInt(command[2])<0||Integer.parseInt(command[2])>=list.size())){System.out.println("Invalid index");}
        else if(command[0].equals("Insert")&&Integer.parseInt(command[2])<list.size()&& !(Integer.parseInt(command[2])<0)){list.add(Integer.parseInt(command[2]),Integer.parseInt(command[1]));}
        else if(command[0].equals("Remove")&&(Integer.parseInt(command[1])>=0&&Integer.parseInt(command[1])<list.size())){list.remove(Integer.parseInt(command[1]));}
        else if(command[0].equals("Remove")&&(Integer.parseInt(command[1])<0||Integer.parseInt(command[1])>=list.size())){System.out.println("Invalid index");}
        else if(command[0].equals("Shift")&&command[1].equals("left")){
            for (int i = 0; i < Integer.parseInt(command[2]) ; i++) {
                int current = list.get(0);
                list.remove(0);
                list.add(current);
            }
        }
        else if(command[0].equals("Shift")&&command[1].equals("right")){
            for (int i = 0; i < Integer.parseInt(command[2]) ; i++) {
                int current = list.get(list.size()-1);
                list.remove(list.size()-1);
                list.add(0,current);
            }
        }
        command = scan.nextLine().split(" ");
    }
    for(int i = 0;i< list.size();i++){
        System.out.print(list.get(i));if(i!=list.size()-1){System.out.print(" ");}
    }
    }
}
