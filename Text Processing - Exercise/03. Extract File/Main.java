package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <count ; i++) {
            int index = 0;
            int indexEnd = 0;
            int indexAge = 0;
            int indexAgeEnd = 0;
            String text = scan.nextLine();
           if (text.contains("@")){index = text.indexOf("@");indexEnd=text.indexOf("|");}
           if (text.contains("#")){indexAge = text.indexOf("#");indexAgeEnd = text.indexOf("*");}
          System.out.print(text.substring(index+1,indexEnd));System.out.print(" is ");
           System.out.print(text.substring(indexAge+1,indexAgeEnd));System.out.print(" years old.");System.out.println("");

        }


    }
}
