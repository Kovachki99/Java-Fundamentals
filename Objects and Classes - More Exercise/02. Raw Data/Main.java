package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class Car{
        String model;
        public String getModel(){
        return model;}
    }
        public static class Engine {
            String enginePower;
            String engineSpeed;
        }
        public static class Cargo(String CargoWeight,String cargoType) {

        }
        public static class tyre{
            String tyre1Pressure;
            String tyre1Age;
            String tyre2Pressure;
            String tyre2Age;
            String tyre3Pressure;
            String tyre3Age;
            String tyre4Pressure;
            String tyre4Age;
        }


        public Car(String model, String engineSpeed, String enginePower, String cargoWeight, String cargoType,String tyre1Pressure,String tyre1Age,String tyre2Pressure,String tyre2Age,String tyre3Pressure,String tyre3Age,String tyre4Pressure,String tyre4Age) {
            this.model = model;

        }
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        List<Car>cars = new ArrayList<>();
	int numb = Integer.parseInt(scan.nextLine());
	String line = scan.nextLine();
        for (int i = 0; i <numb ; i++) {
            String[] current = line.split(" ");
            String model = current[0];
            String EngineSpeed = current[1];
            String EnginePower = current[2];
            String cargoWeight = current[3];
            String cargoType = current[4];
            String tyre1Pressure = current[5];
            String Tyre1Age = current[6];
            String tyre2Pressure = current[7];
            String Tyre2Age = current[8];
            String tyre3Pressure = current[9];
            String Tyre3Age = current[10];
            String tyre4Pressure = current[11];
            String Tyre4Age = current[12];
            Car car = new Car(model,EngineSpeed,EnginePower,cargoWeight,cargoType,tyre1Pressure,Tyre1Age,tyre2Pressure,Tyre2Age,tyre3Pressure,Tyre3Age,tyre4Pressure,Tyre4Age);
            cars.add(car);
        }
        line = scan.nextLine();
        if (cars
    }
}
