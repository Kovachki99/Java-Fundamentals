package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static class FibonacciMemoize1 {
    private Map<Integer, Integer> memoizeTable = new HashMap<>();
    public int fibonacciMemoize(int n) {
        if (n == 0){return 0;}
        if (n == 1){return 1;}
        if (this.memoizeTable.containsKey(n)){
            return this.memoizeTable.get(n);
        }
        int result = fibonacciMemoize(n-1)+fibonacciMemoize(n-2);
        this.memoizeTable.put(n,result);
        return result;

    }}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        FibonacciMemoize1 fibonacciMemoize1 = new FibonacciMemoize1();
        System.out.println(fibonacciMemoize1.fibonacciMemoize(n));
    }

}
