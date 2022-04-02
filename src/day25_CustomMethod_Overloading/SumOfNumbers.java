package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println(sumOfNumbers(5,9));
        System.out.println(sumOfNumbers(4,3,89));
        sumOfNumbers(10,20,30);


    }

    public static int sumOfNumbers(int num1,int num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1,int num2, int num3){
        return num1+num2+num3;
    }


}
