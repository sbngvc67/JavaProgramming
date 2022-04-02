package week05;

import java.util.Scanner;

public class EmailExmpleFromReplit {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a valid email: craig_federighi@apple.com ");
        String email=input.next();

        int indexof_=email.indexOf("_");
        int indexofAtSign=email.indexOf("@");
        int indexofDot=email.indexOf(".");

        String firstName=email.substring(0,indexof_);
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);

        String lastName=email.substring(indexof_+1,indexofAtSign);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);

        String domain=email.substring(indexofAtSign+1,indexofDot);
        System.out.println("domain = " + domain);



/*
        String second = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        first = first.toUpperCase().charAt(0) + first.substring(1).toLowerCase();
        second = second.toUpperCase().charAt(0) + second.substring(1).toLowerCase();

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("domain = " + domain);
*/




    }
}
