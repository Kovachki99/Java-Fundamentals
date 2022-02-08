package com.company;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static class Contest{
        Map<String,Integer> usernames;
        int total;

        public Contest(Map<String, Integer> usernames) {
            this.usernames = usernames;
        }

        public void setTotal() {
            this.total = usernames.size();
        }
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Map<String,Contest>contests = new LinkedHashMap<>();
	Map<String,Integer> individual = new TreeMap<>();
	String[]input = scan.nextLine().split(" -> ");

    while (!input[0].equals("no more time")){
        String username = input[0];
        String contest = input[1];
        int points = Integer.parseInt(input[2]);
        if (!contests.containsKey(contest)){
            Map<String,Integer>usernames = new TreeMap<>();
            usernames.put(username,points);
            Contest contest1 = new Contest(usernames);
            contests.put(contest,contest1);
        }else {
            if(contests.get(contest).usernames.containsKey(username)){
                if(contests.get(contest).usernames.get(username)>points){

                }else {
                    contests.get(contest).usernames.put(username,points);
                }
            }else {
                contests.get(contest).usernames.put(username,points);
            }
        }

        input = scan.nextLine().split(" -> ");
    }
    for(Map.Entry<String,Contest>entry: contests.entrySet()){
        entry.getValue().setTotal();
    }
    contests.entrySet().stream().forEach(entry -> {
        System.out.printf("%s: %d participants%n",entry.getKey(),entry.getValue().total);
        AtomicInteger counter = new AtomicInteger(1);
        entry.getValue().usernames.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry2 -> {
            System.out.printf("%d. %s <::> %d%n",counter.getAndIncrement(),entry2.getKey(),entry2.getValue());
            if(!individual.containsKey(entry2.getKey())){
                individual.put(entry2.getKey(),entry2.getValue());
            }else {
                individual.put(entry2.getKey(),individual.get(entry2.getKey())+entry2.getValue());
            }
        });
    });
        System.out.printf("Individual standings:%n");
    AtomicInteger counter2 = new AtomicInteger(1);
    individual.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> {
        System.out.printf("%d. %s -> %d%n",counter2.getAndIncrement(),entry.getKey(),entry.getValue());
    });
    }
    }
