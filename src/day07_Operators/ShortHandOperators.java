package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment: =
        int number=100;
        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200
        
        String word="Java Programming";
        System.out.println("word = " + word);

        word="Wooden Spoon";
        System.out.println("word = " + word);

        word="Cydeo";
        System.out.println("word = " + word);

        //Addition Assignment:
        int x=100;
        System.out.println("x = " + x);
        System.out.println(x+200);

        //x= x+200;
        x+=200;
        System.out.println("x = " + x);

        String str="Wooden";
        str+=" Spoon";
        System.out.println("str = " + str);

        double num1=2.5; //2.5
        num1+=5.5;
        System.out.println("num1 = " + num1); //8.0

        double availableBalance=1000.50;
        //deposit 300$
        availableBalance+=300;

        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 500$

        availableBalance-=500;
        System.out.println("availableBalance = " + availableBalance);
        //withdrawing 200$, then depositing 400$

        availableBalance-=200;

        System.out.println("availableBalance = " + availableBalance);

        double salary= 50000.50;
        salary*=2;
        System.out.println("salary = " + salary);

        double doge=0.00000001;
        doge*=1000000;
        System.out.println("doge = " + doge);

        double num2=25000;
        num2 /=2;

        System.out.println("num2 = " + num2);

        double num3=100;
        num3%=3;
        System.out.println("num3 = " + num3);

        int amount=127; //  cents
        int quarters=amount/25;
        int cent=amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cent = " + cent);

        int cents2=127;

        cents2%=25;
        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------------");

        int y=300;
        y%=16;

        System.out.println("y = " + y);

        System.out.println("---------------------------------");

        int balance=3500;
        balance%=153;

        System.out.println("balance = " + balance);




    }}
