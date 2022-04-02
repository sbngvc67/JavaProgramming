package week05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result=word;
        if (word.substring(0,1).equalsIgnoreCase("x")){result=word.substring(1);}
        if (word.substring(word.length()-1).equalsIgnoreCase("x")){result=word.substring(0,word.length()-1);}
        if (word.toLowerCase().startsWith("x")){result=word.substring(1);}
        if (word.toLowerCase().endsWith("x")){result=word.substring(0,word.length()-1);}
        System.out.println(result);}}