package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<Double>> students = new LinkedHashMap<>();
        Map<String, Double> students2 = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            Double grade = Double.parseDouble(scan.nextLine());
            if (students.containsKey(name)) {
                students.get(name).add(grade);
            } else {
                List<Double> list = new ArrayList<>();
                list.add(grade);
                students.put(name, list);
            }
        }
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            Double avg = 0.00;
            int count = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                avg += entry.getValue().get(i);
                count++;
            }
            students2.put(entry.getKey(), avg / count);
        }

//        students2.entrySet().stream().sorted((e1,e2) -> Double.compare(e2.getValue(),e1.getValue())).;
        students2.entrySet().stream().sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue())).forEach(entry -> {
            if (entry.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            } ;
        });
    }
}
