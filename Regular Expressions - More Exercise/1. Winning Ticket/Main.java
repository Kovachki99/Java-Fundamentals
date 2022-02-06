package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<String>finalList2 = new ArrayList<>();

	Scanner scan = new Scanner(System.in);
	List<String>ticket1 = Arrays
            .stream(scan.nextLine().split(", "))
            .collect(Collectors.toList());
        for (int i = 0; i < ticket1.size(); i++) {
            String asd = "";
            List<String>finalList = new ArrayList<>();


	int first1 = 0;
	int first2 = 0;
	int first3 = 0;
	int first4 = 0;
	int second1 = 0;
	int second2 = 0;
	int second3 = 0;
	int second4 = 0;
        List<Character>oneHalf = new ArrayList<>();
        List<Character>secondHalf = new ArrayList<>();
        for (int j = 0; j <ticket1.get(i).length()/2 ; j++) {
            oneHalf.add(ticket1.get(i).charAt(j));

        }
        for (int k = ticket1.get(i).length()/2; k < ticket1.get(i).length() ; k++) {
            secondHalf.add(ticket1.get(i).charAt(k));
        }

        for (int a = 0; a < oneHalf.size(); a++) {
            if (oneHalf.get(a).equals('@')){first1++;}
            if (oneHalf.get(a).equals('#')){first2++;}
            if(oneHalf.get(a).equals('$')){first3++;}
            if (oneHalf.get(a).equals('^')){first4++;}

        }
        for (int b = 0; b < secondHalf.size() ; b++) {
            if (secondHalf.get(b).equals('@')){second1++;}
            if (secondHalf.get(b).equals('#')){second2++;}
            if(secondHalf.get(b).equals('$')){second3++;}
            if (secondHalf.get(b).equals('^')){second4++;}

        }
        int price = 0;
        String symbol = " ";
        if (first1>=6&&first1<=9||first1==10){symbol = "@";}
        if (first2>=6&&first2<=9||first2==10){symbol = "#";}
        if (first3>=6&&first3<=9||first3==10){symbol = "$";}
        if (first4>=6&&first4<=9||first4==10){symbol = "^";}

        if (first1==second1&&first2==second2&&first3==second3&&first4==second4){price = first1+first2+first3+first4;}
        String p = ""+price;
        if (price>=6&&price<=9){finalList.add("ticket");finalList.add(ticket1.get(i));finalList.add(p);finalList.add(symbol);   asd = finalList.get(0)+" \""+finalList.get(1)+"\" - "+finalList.get(2)+finalList.get(3);}
        if (price>=10){finalList.add("ticket");finalList.add(ticket1.get(i));finalList.add(p);finalList.add(symbol); asd = finalList.get(0)+" \""+finalList.get(1)+"\" - "+finalList.get(2)+finalList.get(3);}
        if (ticket1.get(i).length()==20&&price<6){finalList.add("ticket");finalList.add(ticket1.get(i));finalList.add("no match");asd = finalList.get(0)+" \""+finalList.get(1)+"\" - " + finalList.get(2);}
        if (ticket1.get(i).length()<20){finalList.add("invalid ticket");asd = finalList.get(0);}
       finalList2.add(asd);
    }
        for (int i = 0; i <finalList2.size() ; i++) {
            System.out.println(finalList2.get(i));
        }
    }
}
