package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        //123Enter

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullname=input.nextLine();

        System.out.println("Enter your Programming Language: ");
        String programming= input.nextLine();

        System.out.println("fullname = " + fullname);
        System.out.println("programming = " + programming);







    }
}
