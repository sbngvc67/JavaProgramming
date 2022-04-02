package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {


        oddOrEven(5);
        ageOfPerson(1987);
        printNumbers(2,9);

    }
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }

    }
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("You age is: "+age);
    }
    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);
        }
    }

}
