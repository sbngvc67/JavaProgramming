package week05;

import java.util.Scanner;

public class OscarsTask {
    public static void main(String[] args) {
        /*
        scanner to get email input
        boolean result set to true at the beginning
        if (condition){
        result=false
        }
        indexof("@")<1: 0 (no character before @ sign) OR -1 (there is no @ sign)
        indexof("@")>=email.length()-3  (a@a.a: indexof("@):length()-4)
        what if we have 2 @ signs:
        the index of @ sign== last index of @ sign

        DOT Conditions
        indexof(".")<1: 0 (no character before dot sign)  or  -1 (there is no dot sign)
        indexofDotSign==email.length()-1: problem
        the index of @ sign > bigger than indexofDotSign (@.):problem
        the index of @ sign +1== indexofDotSign (@.): there is no character in between: problem

         */

        Scanner input= new Scanner(System.in);
        System.out.println("Please put a valid email address: test@example.com");

        String email=input.next();

        boolean result= true;

        int atSignIndex=email.indexOf("@");
        int dotIndex=email.lastIndexOf(".");

        if (atSignIndex<1 || atSignIndex>=email.length()-3 || atSignIndex!=email.lastIndexOf("@")){
            // indexof("@")<1: 0 (no character before @ sign) OR -1 (there is no @ sign)
            result=false;
        }

        if (dotIndex<1 || dotIndex==email.length()-1 || atSignIndex > dotIndex || atSignIndex+1==dotIndex){
            result=false;
        }

        System.out.println("result = " + result);





    }
}
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */