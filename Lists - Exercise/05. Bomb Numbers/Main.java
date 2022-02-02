package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer>list = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    List<Integer>bombAndPower = Arrays
    .stream(scan.nextLine().split(" "))
    .map(Integer::parseInt)
    .collect(Collectors.toList());
    int bomb = bombAndPower.get(0);
    int power = bombAndPower.get(1);
    int sum = 0;
    int bombRight = 0;
    int bombLeft = 0;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)==bomb){
//                System.out.println(list);
                list.remove(list.get(i));
//                System.out.println(list);
                int index = i;
                for (int j = index; j < list.size() ; j++) {
                    if(bombRight==power){break;}
                    bombRight++;
                    if(bombRight==power){break;}
                }
                for (int j = index-1; j >= 0 ; j--) {
                    if(bombLeft==power){break;}
                    bombLeft++;
                    if(bombLeft==power){break;}
                }
                while (!(bombRight==0)){
//                    System.out.println(list);
                    list.remove(i);
                    bombRight--;
//                    System.out.println(list);
                }
                int bombleftReal = bombLeft;
                while (!(bombLeft==0)){
                   // System.out.println(list);
                    list.remove(i-bombleftReal);
                    bombLeft--;
                   // System.out.println(list);
                }
                i=-1;
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
