package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(100/3);
        System.out.println(10/4); //2
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a = 100;
        double b= a/6; //16
        //double b= 16;

        System.out.println(b);

        double c=a/6d;

        System.out.println("c = " + c);

        System.out.println(100d);





    }



}
/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
    %: Remainder

    integer / integer ====> integer 10/3 3
    decimal / integer ====> decimal 10.0/3=3.3333335
    integer / decimal ====> decimal
    decimal / decimal ====> decimal


 */