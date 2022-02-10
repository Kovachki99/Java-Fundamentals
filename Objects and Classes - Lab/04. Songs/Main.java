package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String setTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];
            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);
        }
        String typeList = scan.nextLine();
        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
