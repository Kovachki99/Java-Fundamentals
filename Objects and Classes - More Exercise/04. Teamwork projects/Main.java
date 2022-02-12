package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Team> list = new ArrayList<>();
        List<Team>disband = new ArrayList<>();
	int count = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < count; i++) {
            String[]command = scan.nextLine().split("-");
            String creator = command[0];
            String name = command[1];
            Team current = new Team(name,creator);
            boolean alreadyInteam = false;
            boolean alreadyExist = false;
            for (int j = 0; j < list.size() ; j++) {
                if(list.get(j).creator.equals(current.creator)){
                    alreadyInteam = true;break;
                }
            }
            for (int j = 0; j <list.size() ; j++) {
                if(list.get(j).name.equals(name)){
                    alreadyExist = true;break;
                }
            }
            if(alreadyExist){System.out.printf("Team %s was already created!%n",current.name);}
            else if(!alreadyExist&&alreadyInteam){
                System.out.printf("%s cannot create another team!%n",current.creator);}
            else if(!alreadyExist&&!alreadyExist){list.add(current);
                System.out.printf("Team %s has been created by %s!%n",current.name,current.creator);}

        }
        String[]command2 = scan.nextLine().split("->");
        while (!command2[0].contains("end of assignment")){
            String user = command2[0];
            String team = command2[1];
            boolean teamExist = false;
            boolean alreadyMember = false;
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i).name.equals(team)){teamExist =true;break;}
            }
            for (int i = 0; i <list.size() ; i++) {
                if(list.get(i).users == null){}
                else if(list.get(i).users.contains(user)){
                    alreadyMember = true;break;
                }
            }
            for (int i = 0; i <list.size() ; i++) {
                if(list.get(i).creator.equals(user)){
                    alreadyMember = true;break;
                }
            }

            if(!teamExist){
                System.out.printf("Team %s does not exist!%n",team);
            }
            else { if (!alreadyMember){
                for (int i = 0; i <list.size() ; i++) {
                    if(list.get(i).name.equals(team)){
                        list.get(i).usersAdd(user);break;
                    }
                }}
                else {
                    System.out.printf("Member %s cannot join team %s!%n",user,team);
            }
            }
            command2 = scan.nextLine().split("->");
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).name);
//        }

        for (int i = 0; i <list.size() ; i++) {
            Collections.sort(list.get(i).users);
        }
        list.sort(Comparator.comparing(Team::count));
        Collections.reverse(list);
        list.sort(Comparator.comparing(Team::getName));

//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i).name);
//        }








        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).users.size()<=0){
                disband.add(list.get(i));
                list.remove(list.get(i));
                i--;
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).name);
            System.out.println("- "+list.get(i).creator);
            for (int j = 0; j <list.get(i).users.size() ; j++) {
                System.out.printf("-- %s%n",list.get(i).users.get(j));
            }
        }
        System.out.println("Teams to disband:");
        for (int i = 0; i < disband.size() ; i++) {
            System.out.println(disband.get(i).name);
        }
    }
}
