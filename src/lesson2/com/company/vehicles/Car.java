package lesson2.com.company.vehicles;

import lesson2.com.company.details.Engine;

import lesson2.com.company.professions.Driver;


public class Car {
    String model;
    int price;

    public Car() {
    }

    public static void main(String[] args) {

        Driver dr = new Driver();
        Engine en = new Engine();
        System.out.println("I am driving");
    }
}

