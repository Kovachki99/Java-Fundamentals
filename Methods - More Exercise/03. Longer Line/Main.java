package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstY = Integer.parseInt(scan.nextLine());
        int firstX = Integer.parseInt(scan.nextLine());
        int secondY = Integer.parseInt(scan.nextLine());
        int secondX = Integer.parseInt(scan.nextLine());
        int thirdY = Integer.parseInt(scan.nextLine());
        int thirdX = Integer.parseInt(scan.nextLine());
        int fourthY = Integer.parseInt(scan.nextLine());
        int fourthX = Integer.parseInt(scan.nextLine());
        double one = lineLength(firstX, firstY, secondX, secondY);
        double two = lineLength(thirdX, thirdY, fourthX, fourthY);
        double first = lineLength(firstX,firstY,0,0);
        double second =lineLength(secondX,secondY,0,0);
        double third = lineLength(thirdX,thirdY,0,0);
        double fourth = lineLength(fourthX,fourthY,0,0);

        if (one > two&&first<second) {System.out.printf("(%d, %d)(%d, %d)",firstY,firstX,secondY,secondX);}
        if (one > two&&first>second) {System.out.printf("(%d, %d)(%d, %d)",secondY,secondX,firstY,firstX);}
        if (one<two&&fourth>third){System.out.printf("(%d, %d)(%d, %d)",thirdY,thirdX,fourthY,fourthX);}
        if (one<two&&fourth<third){System.out.printf("(%d, %d)(%d, %d)",fourthY,fourthX,thirdY,thirdX);}
        if(one==two&&first<second){System.out.printf("(%d, %d)(%d, %d)",firstY,firstX,secondY,secondX);}
        if(one==two&&first>second){System.out.printf("(%d, %d)(%d, %d)",secondY,secondX,firstY,firstX);}
    }
    private static double lineLength(double x1, double y1, double x2, double y2) {
        double lineLenght = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return lineLenght;
    }
}




