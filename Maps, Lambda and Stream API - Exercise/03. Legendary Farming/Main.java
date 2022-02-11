package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        Map<String, Integer>keyMaterials = new TreeMap<>();
        Map<String,Integer>junk = new TreeMap<>();
	String[]input = scan.nextLine().toLowerCase(Locale.ROOT).split(" ");
	boolean shards = false;
	boolean fragments = false;
	boolean motes = false;
	keyMaterials.put("shards",0);
	keyMaterials.put("fragments",0);
	keyMaterials.put("motes",0);
	while (!shards&&!fragments&&!motes) {
        for (int i = 0; i < input.length; i += 2) {
            int count = Integer.parseInt(input[i]);
            String material = input[i + 1];

            if(material.equals("shards")||material.equals("fragments")||material.equals("motes")){
                if(keyMaterials.containsKey(material)){
                    keyMaterials.put(material,keyMaterials.get(material)+count);
                }
                else {
                    keyMaterials.put(material,count);
                }
            }else {
                if (!junk.containsKey(material)) {
                    junk.put(material, count);
                } else {
                    int current = junk.get(material);
                    current += count;
                    junk.put(material, current);
                }
            }
            if (keyMaterials.containsKey("shards") && keyMaterials.get("shards") >= 250) {
                System.out.println("Shadowmourne obtained!");
                shards = true;int add = keyMaterials.get("shards");
                add-=250;
                keyMaterials.put("shards",add);
                break;
            }
            if (keyMaterials.containsKey("fragments") && keyMaterials.get("fragments") >= 250) {
                System.out.println("Valanyr obtained!");
                fragments = true;int add = keyMaterials.get("fragments");
                add-=250;
                keyMaterials.put("fragments",add);
                break;
            }
            if (keyMaterials.containsKey("motes") && keyMaterials.get("motes") >= 250) {
                System.out.println("Dragonwrath obtained!");
                motes = true;int add = keyMaterials.get("motes");
                add-=250;
                keyMaterials.put("motes",add);
                break;
            }
        }
        if(!shards&&!motes&&!fragments){input = scan.nextLine().toLowerCase(Locale.ROOT).split(" ");}
    }
	keyMaterials.entrySet().stream().sorted((e1,e2)->Integer.compare(e2.getValue(),e1.getValue())).forEach( entry -> {
	    String name = entry.getKey();
	    int count = entry.getValue();
	    System.out.printf("%s: %d%n",name,count);
    });
	junk.entrySet().stream().forEach(entry -> {
	    System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
    });
    }
}
