package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, diameter
        double PI = 3.14;
        double radius = 5.5;

        double diameter = radius * 2; //10 * 2
        double area = radius * radius * PI; //10 * 10 * 3.14
        double Perimeter = diameter * PI; //10 * 2 *3.14

        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("Perimeter = " + Perimeter);
        System.out.println("diameter = " + diameter);
    }



}
/*
Create a class named Circle, write a program that can calculate the area perimeter
 of any PI,radius, diameter, area, perimeter

 Hints: PI = 3.14
        area = radius * radius * PI
        Perimeter = diameter * PI
 */