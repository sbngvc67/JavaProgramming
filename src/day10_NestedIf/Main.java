package day10_NestedIf;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner scan= new Scanner(System.in);
        int quarter=25, dimes=10, nickels=5, pennies=1;
        quarter=25*pennies;
        dimes=10*pennies;
        nickels=5*pennies;
        boolean value=quarter%25==0;


        System.out.println("Enter cents: ");
        int result = scan.nextInt();
        System.out.println("Your change is "+value);





    }
}
/*
Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
 */