package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a valid upper bound");
        int num= scan.nextInt();
        int sum=0;
        boolean check=true;
        for (; check ; ){

        if (num>=1) {
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            check=false;
        }else{
            System.out.println("Please enter a valid number");
            num= scan.nextInt();
            check=true;
        }
        System.out.print(sum);


    }
}}
