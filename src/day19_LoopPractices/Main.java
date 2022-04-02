package day19_LoopPractices;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name= input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String answer=input.nextLine();
        if (answer.equalsIgnoreCase("no")){
            System.out.println("Guest's list: "+name);
        }

        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name:");
            String name2= input.nextLine();
            System.out.println("Do you want to enter new guest name:");
            answer=input.nextLine();
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Guest's list: "+name+", "+name2);
            }else if (answer.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name:");
                name= input.nextLine();
            }
        }




        // your code
        // ------------------------------------------


    }
}