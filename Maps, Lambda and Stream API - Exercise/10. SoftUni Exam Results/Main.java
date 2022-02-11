package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        Map<String,String> languages = new LinkedHashMap<>();
        Map<String,Integer> points = new TreeMap<>();
        Map<String,Integer> submission = new TreeMap<>();
        String[]input = scan.nextLine().split("-");
        while (!input[0].equals("exam finished")){
            if(input.length==3) {
                String currentName = input[0];
                String currentLanguage = input[1];
                int currentPoints = Integer.parseInt(input[2]);

                if (!languages.containsKey(currentName)) {
                    languages.put(currentName, currentLanguage);
                    points.put(currentName, currentPoints);
                } else {
                    if(points.get(currentName)<currentPoints){
                    points.put(currentName, currentPoints);}
                }

                if (!submission.containsKey(currentLanguage)) {
                    submission.put(currentLanguage, 1);
                } else {
                    submission.put(currentLanguage, submission.get(currentLanguage) + 1);
                }
            }
            if(input.length==2){
                String name = input[0];
                if(languages.containsKey(name)){
                    languages.remove(name);
                }
                if(points.containsKey(name)){
                    points.remove(name);
                }
            }
            input = scan.nextLine().split("-");
        }
        System.out.println("Results:");
        points.entrySet().stream().sorted((e1,e2) -> Integer.compare(e2.getValue(),e1.getValue())).forEach(entry -> {
            System.out.printf("%s | %d%n",entry.getKey(),entry.getValue());
        });

        System.out.println("Submissions:");
        submission.entrySet().stream().sorted((e1,e2) -> Integer.compare(e2.getValue(),e1.getValue())).forEach(entry -> {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        });

    }
}
