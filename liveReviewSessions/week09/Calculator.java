package week09;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(5.2,20.5));
        add(5.2,20.5);




    }
    public static double add(double num1, double num2){
        double result=num1+num2;
        return result;
    }
    public static double subtract(double num1, double num2){
        return num1-num2;
    }
    public static double multiply(double num1, double num2){
        return num1*num2;
    }
    public static double divide(double num1, double num2){
        return num1/num2;
    }

}
