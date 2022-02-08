package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        Map<String,String> contestsAndPasswords = new HashMap<>();
        Map<String,Map<String, Map<String,Integer>>> all = new HashMap<>();
        //MAP<CONTEST,MAP<PASSWORD,MAP<NAMES,POINTS>>>
		List<String>names = new ArrayList<>();
		Map<String,Integer> totals = new TreeMap<>();

	String[] input = scan.nextLine().split(":");
	while (!input[0].equals("end of contests")){
	    String contest = input[0];
	    String password = input[1];
	    if(!contestsAndPasswords.containsKey(contest)){
	        contestsAndPasswords.put(contest,password);
        }
	    input = scan.nextLine().split(":");
    }
	for(Map.Entry<String,String>entry:contestsAndPasswords.entrySet()){
	    Map<String,Map<String,Integer>> current = new HashMap<>();
	    Map<String,Integer> users = new TreeMap<>();
	    current.put(entry.getValue(),users);
	    all.put(entry.getKey(),current);
        }

	input = scan.nextLine().split("=>");
	while (!input[0].equals("end of submissions")){
	    String contest = input[0];
	    String password = input[1];
	    String username = input[2];
	    int points = Integer.parseInt(input[3]);
	    if (all.containsKey(contest)){
	        if(all.get(contest).containsKey(password)){
	            if(all.get(contest).get(password).containsKey(username)){
	            	if(all.get(contest).get(password).get(username)<points){
	                all.get(contest).get(password).remove(username);
	                all.get(contest).get(password).put(username,points);
	            	}
                }else {
	                all.get(contest).get(password).put(username,points);
                }
            }
        }
	    input = scan.nextLine().split("=>");
    }

		all.entrySet().stream().forEach(entry -> {
			for(Map.Entry<String,Map<String,Integer>>entry1:entry.getValue().entrySet()){
				for(Map.Entry<String,Integer>last:entry1.getValue().entrySet()){
					if(names.contains(last.getKey())){

					}else {
						names.add(last.getKey());
					}
				}
			}
		});

		String best = "";
	int totalPoints = 0;
	for( Map.Entry<String,Map<String, Map<String,Integer>>>entry:all.entrySet()){
	    for (Map.Entry<String, Map<String,Integer>>entry2:entry.getValue().entrySet()){
	        for(Map.Entry<String,Integer>entry3:entry2.getValue().entrySet()){
	            if(!totals.containsKey(entry3.getKey())){
	            	totals.put(entry3.getKey(),entry3.getValue());
				}else {
	            	totals.put(entry3.getKey(),totals.get(entry3.getKey())+entry3.getValue());
				}
            }
        }
    }
	best = totals.entrySet().stream().max((e1,e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey();
	totalPoints = totals.entrySet().stream().max((e1,e2) -> e1.getValue().compareTo(e2.getValue())).get().getValue();
		//MAP<CONTEST,MAP<PASSWORD,MAP<NAMES,POINTS>>>
		System.out.printf("Best candidate is %s with total %d points.%n",best,totalPoints);
		System.out.println("Ranking: ");
		Collections.sort(names);
		for (int i = 0; i < names.size() ; i++) {
			System.out.println(names.get(i));
			Map<String,Integer> allPointsofCurrentOne = new LinkedHashMap<>();
			for( Map.Entry<String,Map<String, Map<String,Integer>>>entry:all.entrySet()){
				for (Map.Entry<String, Map<String,Integer>>entry2:entry.getValue().entrySet()){
					for(Map.Entry<String,Integer>entry3:entry2.getValue().entrySet()){
						if (entry3.getKey().equals(names.get(i))){
							allPointsofCurrentOne.put(entry.getKey(),entry3.getValue());
						}
					}
				}
			}
			allPointsofCurrentOne.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry -> {
				System.out.printf("#  %s -> %d%n",entry.getKey(),entry.getValue());
			});
		}
    }
}
