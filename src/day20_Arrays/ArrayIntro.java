package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String[] myGroup =new String[5]; // 0 ~ 4
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        //myGroup[5]="Saban";
        //myGroup[-1]="Adam";

        System.out.println(Arrays.toString(myGroup)); // ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("-----------------------------------------------------");
        String[] days={"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number=5;

        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

        System.out.println("***************************************************************************************************");

        String[] months={"January", "February","March","April","May","June","July","August","September","October","November","December"};
                        // 0            1           2       3   4       5       6       7       8           9       10          11

        System.out.println(Arrays.toString(months));

        int num=1;

        if (num<1 || num>12){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(months[num-1]);


    }
}
