package com.company;

import java.util.*;

public class Main {
	public static class Dwarf {
		String name;
		String hatColor;
		int physics;
		int sameHat;

		public Dwarf(String name, String hatColor, int physics) {
			this.name = name;
			this.hatColor = hatColor;
			this.physics = physics;
		}

		public int getPhysics() {
			return physics;
		}

		public void setSameHat(int sameHat) {
			this.sameHat = sameHat;
		}

		public int getSameHat() {
			return sameHat;
		}
	}

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Map<String,Dwarf> all = new LinkedHashMap<>();
	//Name,Dwarf(name;hat;physics)
		int i = 0;
	String[]input = scan.nextLine().split(" <:> ");
	while (!input[0].equals("Once upon a time")) {
		i++;
		String name = input[0];
		String hat = input[1];
		int physics = Integer.parseInt(input[2]);
		if(!all.containsKey(name)){
			Dwarf dwarf = new Dwarf(name,hat,physics);
			all.put(name,dwarf);
		}else {
			if(all.get(name).hatColor.equals(hat)){
				if(physics>all.get(name).physics){
					Dwarf dwarf = new Dwarf(name,hat,physics);
					all.put(name,dwarf);
				}
			} else {
				Dwarf dwarf = new Dwarf(name,hat,physics);
				all.put(name+i,dwarf);
			}
		}

		input = scan.nextLine().split(" <:> ");
	}
	for(Map.Entry<String,Dwarf>dwarfEntry:all.entrySet()){
		int same = 0;
		for(Map.Entry<String,Dwarf>dwarfMap:all.entrySet()){
			if(dwarfEntry.getValue().hatColor.equals(dwarfMap.getValue().hatColor)){
				same++;
			}
		}
		all.get(dwarfEntry.getKey()).setSameHat(same);
	}
	all.values().stream().sorted(Comparator.comparingInt(Dwarf::getPhysics).thenComparingInt(Dwarf::getSameHat).reversed()).forEach(entry -> {
		System.out.printf("(%s) %s <-> %d%n",entry.hatColor,entry.name,entry.physics);
	});
	}
}
