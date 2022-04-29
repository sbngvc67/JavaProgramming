package week15;

import java.util.Scanner;

public class RuntimeErrorExample {
    public static void main(String[] args) {

        System.out.println("Hello");
        int x=5;
        Scanner scan=new Scanner(System.in);
        int y= scan.nextInt();

        //if there is a line of code that I might get exception expectation
        try {
            System.out.println(x/y);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("How are you today");
        System.out.println("Some more lines of code");
        System.out.println("We swallowed the excepiton");



    }
}
