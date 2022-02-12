package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
        List<Employee>employeeList = new ArrayList<>();
        List<String>deps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[]command = scan.nextLine().split(" ");
            String name = command[0];
            double salary = Double.parseDouble(command[1]);
            String position = command[2];
            String department = command[3];
            String email ="n/a";
            int age = -1;
            if(command.length==4){}
            else if(command.length==5&&!command[4].contains("@")){age = Integer.parseInt(command[4]);}
            else if(command.length==5&&command[4].contains("@")){email = command[4];}
            else if(command.length==6&&command[4].contains("@")){age = Integer.parseInt(command[5]);email = command[4];}
            Employee newEmployee = new Employee(name,salary,position,department,email,age);
            employeeList.add(newEmployee);
            if(!deps.contains(department)){deps.add(department);}
        }
        String dep = "";
        double depAVG = 0;
        double depAVGBest = Double.MIN_VALUE;
        String bestDep = "";
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        Collections.reverse(employeeList);
        for (int i = 0; i < deps.size() ; i++) {
            int counter = 0;
            dep = deps.get(i);
            for (int j = 0; j < employeeList.size() ; j++) {
                if(employeeList.get(j).department.equals(deps.get(i))){
                    depAVG += employeeList.get(j).salary;
                    counter++;
                }
            }
            depAVG = depAVG/counter;
            if(depAVG>depAVGBest){depAVGBest=depAVG;bestDep = dep;depAVG=0;}
        }
        System.out.printf("Highest Average Salary: %s%n",bestDep);
        for (int i = 0; i <employeeList.size() ; i++) {
            if(employeeList.get(i).department.equals(bestDep)){
                System.out.printf("%s %.2f %s %d%n",employeeList.get(i).name,employeeList.get(i).salary,employeeList.get(i).email,employeeList.get(i).age);
            }
        }
    }
}
