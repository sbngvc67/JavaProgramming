package week02;

public class PrimitivesExample {
    public static void main(String[] args) {

        byte num1; //declaring a variable
        num1 = 123; //Initializing a variable, assigning a value
        num1 = 121; //reassign a value
        short num2 = 12398; // Declare and initialize at the same line
        int distance = 1_000_000_000;
        long distanceMore = 3_000_000_000l; // we have to put L to define the variable
        long distanceShorter = 1_000_000_000; // if it does not pass the limit then we don't have to give

        float rate = 1000.5F;
        double dNumber = 123.6;

        System.out.println("----Castings-----");

        System.out.println("Before Swapping Values");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num2 = num1;

        System.out.println("After swapping");
        System.out.println("num2 = " + num2);

        System.out.println("Explicit Casting");
        num2= (short) distance; //
        System.out.println("num2 = " + num2); //concatenation

        System.out.println("Explicit casting of floating points");
        short rateTwo= (short) rate;
        System.out.println("rateTwo = " + rateTwo);















    }









}
