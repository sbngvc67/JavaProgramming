package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1= 25;
        int num2= -25;
        System.out.println(num1<0); //false
        System.out.println(num2<0); //true

        System.out.println("-----------------------------------");

        int a =25;
        System.out.println(++a); //26 //pre increment: increases the value by 1 right away
        System.out.println(--a); //24 //pre decrement: decreases the value by 1 right away

        System.out.println("-----------------------------------");

        int b=25;
        System.out.println(b++);  //25
        System.out.println(b);  //26

        System.out.println("-----------------------------------");

        int x=200;
        System.out.println(--x);  //199

        int y=200;
        System.out.println(y--);  //200
        System.out.println(y);    //199

        System.out.println("_______________________________-");

        int z=45;

        System.out.println(++z); //46, z=46
        System.out.println(z++); //46, z=47
        System.out.println(z);   //47


        int q=30;

        System.out.println(--q); //29, q=29
        System.out.println(q--); //29, q=28
        System.out.println(q);   //28




    }
}
