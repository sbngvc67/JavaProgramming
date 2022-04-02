package day12_Scanner;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();

        //your code here
        double result, burger=10.0, chicken=10.0, soda=2.0 , fries=3.5;


        if (in.equals("burger")){
            result=burger;
        }else if (in.equals("chicken")){
            result=chicken;
        }else if (in.equals("soda")){
            result=soda;
        }else{
            result=fries;
        }


/*
        (in=="burger")? System.out.println(burger) :(in=="chicken")? System.out.println(chicken) :(in=="soda")? System.out.println(soda) :System.out.println(fries);

        System.out.println();

*/
        System.out.println(result);



    }
}