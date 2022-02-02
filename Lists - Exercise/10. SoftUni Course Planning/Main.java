package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String>list = Arrays
                .stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());
        String[]input = scan.nextLine().split(":");
        while (!(input[0].equals("course start"))){
            if(input[0].equals("Add")){
                boolean exist = list.contains(input[1]);
                if(!(exist)){list.add(input[1]);}
            }
            if(input[0].equals("Insert")){
                boolean exist = list.contains(input[1]);
                if(!(exist)){list.add(Integer.parseInt(input[2]),input[1]);}
            }
            if(input[0].equals("Swap")){
                boolean ex = list.contains(input[1]);
                boolean exE = list.contains(input[1]+"-Exercise");
                boolean ex2 = list.contains(input[2]);
                boolean ex2E = list.contains(input[2]+"-Exercise");
                if((ex&&ex2)&&(!exE&&!ex2E)){Collections.swap(list,list.indexOf(input[1]),list.indexOf(input[2]));}
                else if((ex&&ex2)&&(exE&&ex2E)){list.remove(input[1]+"-Exercise");list.remove(input[2]+"-Exercise");
                    Collections.swap(list,list.indexOf(input[1]),list.indexOf(input[2]));list.add(list.indexOf(input[1])+1,input[1]+"-Exercise");
                    list.add(list.indexOf(input[2])+1,input[2]+"-Exercise");}
                if ((ex&&ex2)&&(exE&&!ex2E)){list.remove(input[1]+"-Exercise");Collections.swap(list,list.indexOf(input[1]),list.indexOf(input[2]));
                    list.add(list.indexOf(input[1])+1,input[1]+"-Exercise");}
                if((ex&&ex2)&&(ex2E&&!exE)){list.remove(input[2]+"-Exercise");Collections.swap(list,list.indexOf(input[1]),list.indexOf(input[2]));
                    list.add(list.indexOf(input[2])+1,input[2]+"-Exercise");}
            }
            if (input[0].equals("Remove")){
                boolean exist = list.contains(input[1]);
                boolean existExer = list.contains(input[1]+"-Exercise");
                if(exist){list.remove(input[1]);}
                if(existExer){list.remove(input[1]+"-Exercise");}
            }
            if(input[0].equals("Exercise")){
               boolean lesson = list.contains(input[1]);
               boolean ex = list.contains(input[1]+"-Exercise");
               if(!ex&&!lesson){list.add(input[1]);list.add(input[1]+"-Exercise");}
               if(!ex&&lesson){list.add(list.indexOf(input[1])+1,input[1]+"-Exercise");}
            }
            input = scan.nextLine().split(":");
        }
        int number = 1;
        for (String s : list) {
            System.out.print(number + ".");
            System.out.print(s);
            System.out.println("");
            number++;
        }
    }
}
