package com.company;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Character>list = new ArrayList<>();
	String input = scan.nextLine();
	int expl = 0;
	int startIndex = 0;
        for (int i = 0; i < input.length() ; i++) {
            list.add(input.charAt(i));
        }


        for (int i = 0; i < list.size() ; i++) {

            for (int k = 0; k <list.size() ; k++) {
                if(list.get(k).equals('>')&&Character.isDigit(list.get(k+1))){startIndex=k+1;break;}
            }
            int starting = i;
            while (list.get(i).equals('>')&&Character.isDigit(list.get(i+1))){
                expl+=Integer.parseInt(String.valueOf(list.get(i+1)));
                i+=1;
            }
            i = starting;
            int charCount = 0;
            for (int j = startIndex; j < list.size() ; j++) {
               charCount++;
            }
            if(expl<=charCount){
            for (int j = 0; j < expl ; j++) {
                if(!(list.get(startIndex).equals('>'))){list.remove(startIndex);list.add(startIndex,'*');}else{j--;}
                startIndex++;

        }}else{
                for (int j = 0; j < list.size()-1 ; j++) {
                    if(!(list.get(startIndex).equals('>'))){
                    list.remove(startIndex);
                    list.add(startIndex,'*');
                }else {j--;}
                    startIndex++;}
            }
        expl=0;
        }
        for (int i = 0; i < list.size(); i++) {
            if(!(list.get(i).equals('*'))){System.out.print(list.get(i));}
        }
    }
}
