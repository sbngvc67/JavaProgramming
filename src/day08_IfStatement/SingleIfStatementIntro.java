package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number=101;

        /*
        System.out.println("Odd number");
        System.out.println("Even Number");

         */

        boolean evenNumber= number%2 ==0;
        boolean oddNumber=!evenNumber;

        if(evenNumber){
            System.out.println(number+" is even number.");
        }

        if(oddNumber){
            System.out.println(number+" is odd number.");

            int n=-200;


            if(n>0){
                System.out.println(n+" is positive");
            }
            if(n<0){
                System.out.println(n+" is negative");

            }
            if(n==0){
                System.out.println(n+ " is equal to zero");

            }



        }





    }
}
