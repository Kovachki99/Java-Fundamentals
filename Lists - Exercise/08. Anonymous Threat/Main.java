package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void listMerging(List<String>list,int startIndex,int endIndex){
        int diff = Math.abs(startIndex-endIndex);
        for (int i = 0; i < diff ; i++) {
            String current = list.get(startIndex)+list.get(startIndex+1);
            list.set(startIndex,current);
            list.remove(startIndex+1);
        }
    }
    public static void listDivider(List<String>list,int index, int parts){
        String get = list.get(index);
        list.remove(index);
        double chars = get.length()/parts;
        String current = "";
        List<String>allParts = new ArrayList<>();
        if(get.length()%parts==0){
            for (int i = 0; i < get.length(); i++) {
                current+=get.charAt(i);
                if(current.length()==chars){allParts.add(current);current="";}
            }
            list.addAll(index,allParts);
        }
        else if(get.length()%parts!=0){
            int currentParts = 0;
            if(chars>2.50){chars-=1;}
            for (int i = 0; i < get.length() ; i++) {
                current+=get.charAt(i);
                if(current.length()==chars&&currentParts!=parts-1){allParts.add(current);current="";currentParts++;}

            }
            if(currentParts==parts-1){allParts.add(current);}
            list.addAll(index,allParts);
        }
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<String>list = Arrays
                .stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());
        String[] command = scan.nextLine().split(" ");

        while (!(command[0].equals("3:1"))){
            if(command[0].equals("merge")){
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if(startIndex<0){startIndex=0;}
                else if(startIndex>list.size()-1){command=scan.nextLine().split(" ");continue;}
                if(endIndex>=list.size()){endIndex=list.size()-1;}
                listMerging(list,startIndex,endIndex);





            }
            if(command[0].equals("divide")){
                int index = Integer.parseInt(command[1]);
                int parts = Integer.parseInt(command[2]);
                listDivider(list,index,parts);
            }
            command=scan.nextLine().split(" ");
        }
        System.out.println(list.toString().replaceAll("(^\\[|\\]$)", "").replaceAll(",",""));

    }
}