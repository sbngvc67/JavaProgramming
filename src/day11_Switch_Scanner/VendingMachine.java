package day11_Switch_Scanner;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int value, change, quarters,dimes, nickels;

        System.out.println("Enter cents:");
        value= scan.nextInt();

        int q=value/25;
        int d=(value-(25*q))/10;
        int n=(value-(25*q+10*d))/5;
        int p=(value-(25*q+10*d+5*n))/1;

        if (value>=0 && value<=100){
            System.out.println("Your change is "+ q+ " quarters, "+ d+" dimes, " +n+ " nickels, and "+ p+ " pennies");
        }else{
            System.out.println("Invalid cents amount");
        }

    }
}

/*
Write a program that will determine the change given from the vending machine. The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

The given cents value should be more than 0 and less than 100. If the given cents is not in the range print "Invalid cents amount" and there should be no other output after
In valid cases print the change in this format: Your change is x quarters, x dimes, x nickels, and x pennies

Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */