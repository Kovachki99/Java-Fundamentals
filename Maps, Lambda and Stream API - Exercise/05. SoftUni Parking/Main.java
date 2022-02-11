package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        Map<String,String> parking = new LinkedHashMap<>();
	int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scan.nextLine().split(" ");
            if(command[0].equals("register")){
                String username = command[1];
                String licensePlateNumber = command[2];
                if(parking.containsKey(username)){
                    System.out.printf("ERROR: already registered with plate number %s%n",parking.get(username));
                } else {
                    parking.put(username,licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n",username,licensePlateNumber);
                }
            }
            else if (command[0].equals("unregister")){
                String username = command[1];
                if(parking.containsKey(username)){
                    System.out.printf("%s unregistered successfully%n",username);
                    parking.remove(username);
                } else {
                    System.out.printf("ERROR: user %s not found%n",username);
                }
            }
        }
        for(Map.Entry<String ,String> current : parking.entrySet()){
            System.out.printf("%s => %s%n",current.getKey(),current.getValue());
        }
    }
}
