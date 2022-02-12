package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Car {
        private String model;
        private String engine;
        private Integer weight;
        private String color;

        public String getModel(){
            return model;
        }
        public void setModel(){
            this.model = model;
        }
        public String getEngine(){
            return engine;
        }
        public void setEngine(){
            this.engine = engine;
        }
        public Integer getWeight(){
            return weight;
        }
        public void setWeight(){
            this.weight = weight;
        }
        public String getColor(){
            return color;
        }
        public void setColor(){
            this.color = color;
        }

    public Car (String model,String engine,Integer weight,String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    }
    public class engine {
        private String model;
        private Integer power;
        private Integer displacement;
        private String efficiency;

    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Car>cars = new ArrayList<>();
	int numb = Integer.parseInt(scan.nextLine());
        String line = scan.nextLine();
        for (int i = 0; i <numb ; i++) {
           String []current = line.split(" ");
           String model = current[0];
           String engine = current[1];
           Integer weight = 0;
           String color = " ";

           if (current[2].contains("[a-z]")){color = current[2];}
            if (current[2].contains("[0-9]")){color = current[3];}
           Car car = new Car(model,engine,weight,color);
           cars.add(car);
           line = scan.nextLine();
        }
        System.out.println(cars);

    }
}
