package day12_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        System.out.println("Enter your full name"); //nextLine()
        String fullname=scan.nextLine();

        System.out.println("Enter your building number"); //next()
        int bnumber= scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your Street name"); // nextLine()
        String streetName=scan.nextLine();


        System.out.println("Enter your city name"); //nextLine()
        String cityName=scan.nextLine();


        System.out.println("Enter your state"); //next()
        String state=scan.next();


        System.out.println("Enter your zipcode");//next()
        String zipCode=scan.next();

        String shippingAddres=fullname+"\n"+bnumber+"\n"+streetName+"\n"+cityName+"\n"+state+"\n"+zipCode;

        System.out.println("shippingAddres = " + shippingAddres);









    }
}
