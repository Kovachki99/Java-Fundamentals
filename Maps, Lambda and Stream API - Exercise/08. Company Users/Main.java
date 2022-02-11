package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        Map<String,List<String>>companies = new TreeMap<>();
	String[] command = scan.nextLine().split(" -> ");
	while (!(command[0].equals("End"))){
	    String company = command[0];
	    String id = command[1];
	    if(!(companies.containsKey(company))){
	        List<String>employees = new ArrayList<>();
	        employees.add(id);
	        companies.put(company,employees);
        } else {
	        List<String>current = companies.get(company);
	        boolean exist = false;
            for (int i = 0; i < current.size(); i++) {
                if (current.get(i).equals(id)){exist=true;break;}
            }
            if(!exist){
                companies.get(company).add(id);
            }
        }
	    command = scan.nextLine().split(" -> ");
    }
	for(Map.Entry<String,List<String>>entry: companies.entrySet()){
	    System.out.printf("%s%n",entry.getKey());
        for (int i = 0; i < entry.getValue().size(); i++) {
            System.out.printf("-- %s%n",entry.getValue().get(i));
        }
    }

    }
}
