package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Integer>general = new ArrayList<>();
        int[]list1 = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int j : list1) {
            general.add(j);
        }
        int maxPeople = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().split(" ");
        while(!(input[0].equals("end"))){
            if(input[0].equals("Add")){general.add(Integer.parseInt(input[1]));}
            else{
                for (int i = 0; i <general.size() ; i++) {
                    if(general.get(i)+Integer.parseInt(input[0])<=maxPeople){int people = general.get(i);general.remove(i);general.add(i,people+Integer.parseInt(input[0]));break;}

                }
            }
            input=scan.nextLine().split(" ");
        }
        for (int j = 0; j<general.size();j++){
            System.out.print(general.get(j));if(j!=general.size()-1){System.out.print(" ");}
        }
    }
}
