package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> exchange(List<Integer>one,String[]command) {
        if(Integer.parseInt(command[1])>=one.size()||Integer.parseInt(command[1])<0){System.out.println("Invalid index");}
        else{
        List<Integer> current = new ArrayList<>();
        List<Integer>current2 = new ArrayList<>();
        List<Integer>finale = new ArrayList<>();
        int index = Integer.parseInt(command[1]);
        for (int i = index+1; i <one.size() ; i++) {
            current.add(one.get(i));
        }
        for (int i = 0; i <= index ; i++) {
            current2.add(one.get(i));
        }
        finale.addAll(current);
        finale.addAll(current2);
        one.clear();
        one.addAll(finale);}
    return one;}
    public static void indexOfMaxMin(List<Integer>list,String[]command){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int charMin = 0;
        int charMax = 0;
        if(command[1].equals("even")){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
            if (list.get(i)>=max){max=list.get(i);charMax=i;}
            if (list.get(i)<=min){min=list.get(i);charMin =i;}
        }}}
        if(command[1].equals("odd")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)%2!=0){
                    if (list.get(i)>=max){max=list.get(i);charMax=i;}
                    if (list.get(i)<=min){min=list.get(i);charMin=i;}
                }}}
   if(command[0].equals("max")&&max!=Integer.MIN_VALUE){System.out.println(charMax);}
   if(command[0].equals("min")&&min!=Integer.MAX_VALUE){System.out.println(charMin);}
   if(command[0].equals("max")&&max==Integer.MIN_VALUE){System.out.println("No matches");}
   if(command[0].equals("min")&&min==Integer.MAX_VALUE){System.out.println("No matches");}
}
public static void FirstAndLast(List<Integer>list,String[]command){
        List<Integer>even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();
    for (int i = 0; i <list.size() ; i++) {
        if(list.get(i)%2==0){even.add(list.get(i));}else {odd.add(list.get(i));}
    }
    if(command[2].equals("even")) {
        if(Integer.parseInt(command[1]) > list.size()){System.out.println("Invalid count");}
        else if (Integer.parseInt(command[1])>=even.size()){System.out.println(even);}
        else{

        if (command[0].equals("first")) {
            System.out.print("[");
            for (int i = 0; i < Integer.parseInt(command[1]); i++) {
                System.out.print(even.get(i));if(i!=Integer.parseInt(command[1])-1){System.out.print(", ");}else {System.out.print("]");System.out.println("");}
            }
        }
        if (command[0].equals("last")) {
            System.out.print("[");
            for (int i = even.size() - (Integer.parseInt(command[1])); i < even.size(); i++) {
                System.out.print(even.get(i));if(i!=even.size()-1){System.out.print(", ");}else {System.out.print("]");System.out.println("");}
            }}
        }
    }
    if(command[2].equals("odd")){
        if(Integer.parseInt(command[1]) > list.size()){System.out.println("Invalid count");}
        else if(Integer.parseInt(command[1])>= odd.size()){System.out.println(odd);}
        else{
        if (command[0].equals("first")) {
            System.out.print("[");
            for (int i = 0; i < Integer.parseInt(command[1]); i++) {
                System.out.print(odd.get(i));if(i!=Integer.parseInt(command[1])-1){System.out.print(", ");}else {System.out.print("]");System.out.println("");}
            }
        }
        if (command[0].equals("last")) {
            System.out.print("[");
            for (int i = odd.size() - (Integer.parseInt(command[1])); i < odd.size(); i++) {
                System.out.print(odd.get(i));if(i!=odd.size()-1){System.out.print(", ");}else {System.out.print("]");System.out.println("");}
        }}
    }}
}
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
        String[] command = scan.nextLine().split(" ");
        while (!(command[0].equals("end"))){
            if(command[0].equals("exchange")){exchange(general,command);}
            if(command[0].equals("max")||command[0].equals("min")){indexOfMaxMin(general,command);}
            if(command[0].equals("first")||command[0].equals("last")){FirstAndLast(general,command);}
            command = scan.nextLine().split(" ");
    }
        System.out.println(general);
    }
}
