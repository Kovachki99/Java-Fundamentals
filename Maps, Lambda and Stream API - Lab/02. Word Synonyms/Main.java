package com.company;

import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();
            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
            }
        words.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString().replace("[", "")
                    .replace("]", ""));});}
        }


