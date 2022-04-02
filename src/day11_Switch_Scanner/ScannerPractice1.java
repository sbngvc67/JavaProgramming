package day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //nextInt()         Returns input as an int
        //nextDouble()      Returns input as a double
        //nextBoolean()     Returns input as a boolean
        //next()            Returns input as a String, reads the input only until a space
        //nextLine()        Returns input as a String, reads the entire input until the new line (press enter)


        //1.Ask the user to enter an integer number
        System.out.println("Enter an integer number:");
        int num1=input.nextInt();

        //2.Ask the user to enter a decimal number
        System.out.println("Enter an decimal number:");
        double num2=input.nextDouble();

        input .nextLine();

        //3.Ask the user to enter a word
        System.out.println("Enter your name:");
        String str=input.nextLine();

        System.out.println("str = " + str);


    }
}
