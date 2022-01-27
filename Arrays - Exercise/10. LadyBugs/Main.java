package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeField = Integer.parseInt(scan.nextLine());
        String[] indexes = scan.nextLine().split(" ");
        int[]bugs = new int[sizeField];
        for (int i = 0; i < indexes.length ; i++) {
          int current = Integer.parseInt(indexes[i]);
          if(current>=0&&current< bugs.length){
              bugs[current]=1;
          }}
          String[] command = scan.nextLine().split(" ");
          while (!command[0].equals("end")){
              int index = Integer.parseInt(command[0]);
              int flyLength = Integer.parseInt(command[2]);
              if(index<0||index> bugs.length-1||bugs[index]==0||flyLength==0){
                  command=scan.nextLine().split(" ");
                  continue;
              }
              bugs[index]=0;
              if(command[1].equals("right")){
                  index+=flyLength;
                  while (index< bugs.length-1&&bugs[index]==1){
                      index+=flyLength;
                  }
                  if (index < bugs.length - 1) {
                      bugs[index]=1;
                  }
              }
              if(command[1].equals("left")){
                  index-=flyLength;
                  while (index>=0&&bugs[index]==1){
                      index-=flyLength;
                  }
                  if(index>=0){
                      bugs[index]=1;
                  }
              }
              command = scan.nextLine().split(" ");
          }
        System.out.print(Arrays.toString(bugs).replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\,",""));
    }
}
