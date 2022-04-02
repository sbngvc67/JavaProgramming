package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your gender");
        String gender=scan.nextLine();

        System.out.println("Enter your full name");
        String fullName=scan.nextLine();

        System.out.println("Enter your phone number");
        Long phoneNumber=scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode=scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your school name");
        String schoolName=scan.nextLine();

        System.out.println("Enter your city name");
        String cityName=scan.nextLine();

        System.out.println("Enter your state name");
        String stateName=scan.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber=scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street name");
        String streetName=scan.nextLine();

        String myInfo=age+"\n"+gender+"\n"+fullName+"\n"+phoneNumber+"\n"+zipCode+"\n"+schoolName+"\n"
                +cityName+"\n"+stateName+"\n"+buildingNumber+"\n"+streetName;

        System.out.println("myInfo = " + myInfo);
        scan.close();

    }
}
