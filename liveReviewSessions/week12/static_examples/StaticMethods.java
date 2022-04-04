package week12.static_examples;

public class StaticMethods {
    public int num=10;

    public static int count=5;

    public static void displayMessage(String message){
        System.out.println("message = " + message);
       // System.out.println(num); instance cannot be called from static method
        //this num has many copies
    }

    public void instanceMethod(){
        System.out.println("InstamceMethod");
        System.out.println("count = " + count); // I can call static field from instance method

        System.out.println("num = " + num);
        displayMessage("hello from instance method");
    }

}
