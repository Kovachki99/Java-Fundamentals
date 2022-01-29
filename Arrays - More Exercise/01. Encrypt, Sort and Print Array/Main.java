package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Integer>list1 = new ArrayList<>();
	int number = 0;
	int sum = 0;
	int count = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < count ; i++) {
            String input = scan.nextLine();
            for (int j = 0; j <input.length() ; j++) {
                char letter = input.charAt(j);
                switch (letter){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U': number = input.charAt(j)*input.length();break;
                    default: number = input.charAt(j)/input.length();break;
                }
                sum +=number;
            }
            list1.add(sum);
            sum=0;
        }
        list1.sort(Comparator.comparing(Integer::intValue));
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }
    }
}
