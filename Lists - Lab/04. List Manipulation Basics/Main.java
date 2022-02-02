package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        List<Integer> all = new ArrayList<>();
        while (true) {
            if (all.size() <= 0) {
                int[] array = Arrays
                        .stream(scan.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                for (int text : array) {
                    all.add(text);
                }
            }
            String line = scan.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    all.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    var arr = all;
                    var indexOFIt = arr.indexOf(numberToRemove);
                    all.remove(indexOFIt);
                    break;
                case "RemoveAt":
                    int indexToRemoveAt = Integer.parseInt(tokens[1]);
                    all.remove(indexToRemoveAt);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    all.add(indexToInsert, numberToInsert);
                    break;
                    case "Contains":
                 int numberToContain = Integer.parseInt(tokens[1]);
                 arr = all;
                  indexOFIt = arr.indexOf(numberToContain);
                   if (indexOFIt!=-1){
                   System.out.println("Yes");} else {System.out.println("No such number");}
                break;
                case "Print": if (tokens[1].contains("even")){
                    for (Integer integer : all) {
                        if (integer % 2 == 0) {
                            System.out.print(integer+ " ");
                        }
                        }System.out.println(" ");break;
                }
                if (tokens[1].contains("odd")){
                    for (Integer integer : all) {
                        if (!(integer % 2 == 0)) {
                           System.out.print(integer + " ");
                        }
                   }System.out.println(" ");break;}
                case "Get":
                    for (Integer value : all) {
                        sum += value;
                    }
                    System.out.print(sum);System.out.println(" ");break;
                case "Filter":
                    int number = Integer.parseInt(tokens[2]);

                    if (tokens[1].equals("<")){
                        for (Integer integer : all) {
                            if (integer<number){System.out.print(integer+" ");}

                        }System.out.println(" ");
                    }
                    else if (tokens[1].equals(">")){
                        for (Integer integer : all) {
                            if (integer>number){System.out.print(integer+" ");}

                        }System.out.println(" ");
                    }
                    else if (tokens[1].equals("<=")){
                        for (Integer integer : all) {
                            if (integer<=number){System.out.print(integer+" ");}

                        }System.out.println(" ");
                    }
                    else if (tokens[1].equals(">=")){
                        for (Integer integer : all) {
                            if (integer>=number){System.out.print(integer+" ");}

                        }System.out.println(" ");
                    }

        }
    }
}
}



