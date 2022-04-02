package week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {

        String name= "";//hard coded way
        //output goes to console ---- print println

        //How can I receive Input for my java class?
        //1. create your scanner object
        Scanner input= new Scanner(System.in); //you dont see anything

        //2.prompt the user for putting out
        System.out.println("Put your name ; ");//printed out to console

        //3.get the input
        name= input.next(); //reads the data from the console

        //4.Use the value that I read

        System.out.println("name = " + name);

        //Step 1 and 3 are MUST, steps 2-4 depends on the situation
        //we need to import scanner

        System.out.println("I love Java");




    }


}
