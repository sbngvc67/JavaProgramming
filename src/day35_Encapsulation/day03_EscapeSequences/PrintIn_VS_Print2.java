package day35_Encapsulation.day03_EscapeSequences;

public class PrintIn_VS_Print2 {

    public static void main(String[] args) {

        System.out.println("Knock Knock"); //first it prints Knock Knock, then it appends a new line
        System.out.println("Who is this");

        System.out.println("This is Java");

        System.out.println("------------");

        System.out.print("Knock Knock"); // prints Knock Knock, does not append a new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("----------------------------");


        System.out.println("Hello everyone? how are you all today?");

        System.out.println("----------------------");

        System.out.print("Hello everyone? how are you all today?");
        System.out.print("Today we will learn Escape Sequences, ");
        System.out.print(", and next week we will learn Variables");
    }






}
