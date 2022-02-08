package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Map<String,Map<String, List<String>>> colors = new LinkedHashMap<>();
	//Map<Colors,Map<Names,List<stats>>>
    Map<String,List<Double>> totalStats = new LinkedHashMap<>();
    //Map<Colors,Stats>
     int defaultHealth = 250;
     int defaultDamage = 45;
     int defaultArmor = 10;
	int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[]input = scan.nextLine().split(" ");
            String type = input[0];
            String name = input[1];
            String dmg = input[2];
            String health = input[3];
            String armor = input[4];
            if(colors.containsKey(type)){
                List<String>stats = new ArrayList<>();
                stats.add(dmg);
                stats.add(health);
                stats.add(armor);
                colors.get(type).put(name,stats);
            }else {
                List<String>stats = new ArrayList<>();
                stats.add(dmg);
                stats.add(health);
                stats.add(armor);
                Map<String,List<String>> dragons = new TreeMap<>();
                dragons.put(name,stats);
                colors.put(type,dragons);
            }
        }
        colors.entrySet().stream().forEach(entry -> {
            double totalDMG = 0;
            double totalHP = 0;
            double totalArmor = 0;
            for(Map.Entry<String,List<String>>entry1:entry.getValue().entrySet()){
                if(entry1.getValue().get(0).equals("null")){
                    totalDMG+=defaultDamage;entry1.getValue().set(0,""+defaultDamage);
                }else {
                    totalDMG+=Integer.parseInt(entry1.getValue().get(0));
                }
                if(entry1.getValue().get(1).equals("null")){
                    totalHP+=defaultHealth;entry1.getValue().set(1,""+defaultHealth);
                } else {
                    totalHP+=Integer.parseInt(entry1.getValue().get(1));
                }
                if(entry1.getValue().get(2).equals("null")){
                    totalArmor+=defaultArmor;entry1.getValue().set(2,""+defaultArmor);
                }else {
                    totalArmor+= Integer.parseInt(entry1.getValue().get(2));
                }
            }
            totalDMG = totalDMG/entry.getValue().entrySet().size();
            totalHP = totalHP/entry.getValue().entrySet().size();
            totalArmor = totalArmor/entry.getValue().entrySet().size();
            List<Double> statsFinal = new ArrayList<>();
            statsFinal.add(totalDMG);
            statsFinal.add(totalHP);
            statsFinal.add(totalArmor);
            totalStats.put(entry.getKey(),statsFinal);
        });
        totalStats.entrySet().stream().forEach(entry -> {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1),entry.getValue().get(2));
            for(Map.Entry<String,List<String>>listEntry:colors.get(entry.getKey()).entrySet()){
                System.out.printf("-%s -> damage: %s, health: %s, armor: %s%n",listEntry.getKey(),listEntry.getValue().get(0),listEntry.getValue().get(1),listEntry.getValue().get(2));
            }
        });
    }
}
