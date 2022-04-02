package day15_ForLoop;

import java.util.Scanner;

public class MinimumNUMBER {
    public static void main(String[] args) {

        int min=2147483647;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num= scan.nextInt();

            if (num<min){
                min=num;
            }
        }
        System.out.println("min = " + min);
        System.out.println("-------------------------------------");

        String str="Java";
        for (char i=str.charAt(str.length()-1); i<=0; i--) {
            System.out.println(str);

        }




    }
}