package com.company;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static class Player {
        String player;
        Map<String,Integer> position;
        public int total;

        public Player(String player, Map<String,Integer> position) {
            this.player = player;
            this.position = position;
        }

        public String getPlayer() {
            return player;
        }

        public void setPlayer(String player) {
            this.player = player;
        }

        public Map<String, Integer> getPosition() {
            return position;
        }

        public void setPosition(Map<String, Integer> position) {
            this.position = position;
        }

        public void setTotal() {
            this.total = position.values().stream().mapToInt(Integer::intValue).sum();
        }

        public int getTotal() {
            return total;
        }
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Map<String,Player>players = new HashMap<>();
	String[]input  = scan.nextLine().split(" ");
	while (input.length!=2&&!input[0].equals("Season")){
	    if(input.length==5){
	        String player = input[0];
	        String position = input[2];
	        int skill = Integer.parseInt(input[4]);
	        if(!players.containsKey(player)){
	            Map<String,Integer> positions = new TreeMap<>();
	            positions.put(position,skill);
	            Player player1 = new Player(player,positions);
	            players.put(player,player1);
            }else{
	            if(players.get(player).getPosition().containsKey(position)&&players.get(player).getPosition().get(position)<skill){
	             players.get(player).getPosition().put(position,skill);
                }else if(!(players.get(player).getPosition().containsKey(position))){
	                players.get(player).getPosition().put(position,skill);
                }
            }
        }else if(input.length==3){
	        String player1 = input[0];
	        String player2 = input[2];
	        boolean samePosition = false;
	        if(players.containsKey(player1)&&players.containsKey(player2)){
	            for(Map.Entry<String,Integer>entry: players.get(player1).position.entrySet()) {
	                for(Map.Entry<String,Integer>entry1:players.get(player2).position.entrySet()){
	                    if(entry.getKey().equals(entry1.getKey())){
	                        samePosition = true;break;
                        }
	                    if(samePosition){break;}
                    }
                }
	            if(samePosition){
	                int player1Total = players.get(player1).position.values().stream().mapToInt(Integer::intValue).sum();
                    int player2Total = players.get(player2).position.values().stream().mapToInt(Integer::intValue).sum();
                    if(player1Total>player2Total){
                        players.remove(player2);
                    }else if(player2Total>player1Total){
                        players.remove(player1);
                    }
                }
            }
        }
	    input = scan.nextLine().split(" ");
    }
	for(Map.Entry<String,Player>entry: players.entrySet()){
	    entry.getValue().setTotal();
    }
	players.values().stream().sorted(Comparator.comparingInt(Player::getTotal).reversed()).forEach(entry -> {
        System.out.printf("%s: %d skill%n",entry.player,entry.total);
        entry.position.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).forEach(entry2 -> {
            System.out.printf("- %s <::> %d%n",entry2.getKey(),entry2.getValue());
        });
    });
    }
}
