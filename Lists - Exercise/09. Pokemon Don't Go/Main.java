package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void listChanger(List<Integer> list, int element){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>element){list.set(i,list.get(i)-element);}
            else if(list.get(i)<=element){list.set(i,list.get(i)+element);}
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer>list = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        int sum =0;
        int index = Integer.parseInt(scan.nextLine());
        while (!list.isEmpty()) {
            if(index>=0&&index<list.size()){
                int element = list.get(index);
                sum+=element;
                list.remove(index);
                listChanger(list,element);
            }
            else if(index>=list.size()){
                int element = list.get(list.size()-1);
                sum+=element;
                list.set(list.size()-1,list.get(0));
                listChanger(list,element);
            }
            else if(index<0){
                int element = list.get(0);
                sum+=element;
                list.set(0,list.get(list.size()-1));
                listChanger(list,element);
            }



            if (!list.isEmpty()){index = Integer.parseInt(scan.nextLine());}
        }
        System.out.print(sum);
    }
}
