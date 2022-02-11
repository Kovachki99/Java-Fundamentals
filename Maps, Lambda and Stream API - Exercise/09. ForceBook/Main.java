package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Map<String, List<String>> forceBook  = new TreeMap<>();
	String input = scan.nextLine();
	while (!input.equals("Lumpawaroo")){
        String operation = "";
        String[]all = null;
        String forceSide = null;
        String forceUser = null;
	    if (input.contains("->")){all = input.split(" -> ");operation = "->";forceSide=all[1];forceUser=all[0];}
	    else if(input.contains("|")){all = input.split(" \\| ");operation = "|";forceSide=all[0];forceUser=all[1];}



	    if(operation.equals("|")){
	        boolean userExist = false;
	        boolean forceSideExist = false;

	        for(Map.Entry<String,List<String>>list : forceBook.entrySet()){
	            if (list.getValue().contains(forceUser)){userExist = true;break;}
            }
	        if(forceBook.containsKey(forceSide)){
	            forceSideExist = true;
            }

	         if(!userExist&&forceSideExist){
	            forceBook.get(forceSide).add(forceUser);
            }
	         if(!userExist&&!forceSideExist){
	             List<String> current = new ArrayList<>();
	             current.add(forceUser);
	             forceBook.put(forceSide,current);
             }

        }
	    else if(operation.equals("->")){
	        boolean exist = false;
	        for (Map.Entry<String,List<String>>entry: forceBook.entrySet()){
	            if(entry.getValue().contains(forceUser)){
                    for (int i = 0; i < entry.getValue().size() ; i++) {
                        if(entry.getValue().get(i).equals(forceUser)){
                            entry.getValue().remove(forceUser);exist=true;break;
                        }
                    }
                }
	            if(exist){break;}
            }

            if(!forceBook.containsKey(forceSide)){
                List<String>users = new ArrayList<>();
                users.add(forceUser);
                forceBook.put(forceSide,users);
                System.out.printf("%s joins the %s side!%n",forceUser,forceSide);
            }
            else {
                List<String>current = new ArrayList<>(forceBook.get(forceSide));
                if(!current.contains(forceUser)){
                    forceBook.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n",forceUser,forceSide);

            }

        }
	    input = scan.nextLine();
    }
	forceBook.entrySet().stream().sorted( (e1,e2) -> Integer.compare(e2.getValue().size(),e1.getValue().size())).forEach(entry ->{
	    for (Map.Entry<String,List<String>>list : forceBook.entrySet()){
	        Collections.sort(forceBook.get(entry.getKey()));
        }
	    if(entry.getValue().size()>0){
	    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
	    for (int i = 0; i <entry.getValue().size() ; i++) {
            System.out.printf("! %s%n", entry.getValue().get(i));
        }
    }});


    }


}
