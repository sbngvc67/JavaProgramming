package day11_Switch_Scanner;

import java.util.Scanner;

public class VendingMachine2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int itemPrice, change, quarters,dimes, nickels;

        System.out.println("Enter price in cents:");
        itemPrice=scan.nextInt();

        if (itemPrice<25 || itemPrice>100 || itemPrice%5 !=0) {
            System.out.println("Invalid Price");
        }else{
            change=100-itemPrice; //40
            quarters=change/25; // 40/25=1,15 cents remaining
            int remainigCentsAfterQuarter= change % 25; //15
            dimes= remainigCentsAfterQuarter/10; //15/10=1 and 5 cent remaining

            int remainigCentsAfterdimes= remainigCentsAfterQuarter % 10;
            nickels=remainigCentsAfterdimes/5;

            System.out.println("Your change is "+ quarters+ " quarters, "+ dimes+" dimes, and " +nickels+ " nickels");
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