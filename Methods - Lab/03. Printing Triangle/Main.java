package com.company;

import java.util.Scanner;

public class Main {
    public static void printNums(int n)
    {
        int i, j,num,k;

        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
            // initialising starting number
            num=1;

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");

                //incrementing value of num
                num++;
            }


            // ending line after each row
            System.out.println();
        }
        for(n=i; n>1; n--)
        {
            // initialising starting number
            num=1;

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(k=i; k>1;k--)
            {
                // printing num with a space
                System.out.print(num+ " ");

                //incrementing value of num
                num++;
            }
            i--;


            // ending line after each row
            System.out.println();

        }
    }

    // Driver Function
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    {
        int n = Integer.parseInt(scan.nextLine());;
        printNums(n);
    }
}}