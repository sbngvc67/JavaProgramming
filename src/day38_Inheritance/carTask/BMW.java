package day38_Inheritance.carTask;

import day38_Inheritance.carTask.Car;

public class BMW extends Car {
    public BMW(String brand, String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" is breaking down");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is a racing car");
    }

}
