package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str="I love Java, Java is my favorite programming language";
        String result="";
/*
        String reverseWord="";
        reverseWord+=str.charAt(11);reverseWord+=str.charAt(10);reverseWord+=str.charAt(9);reverseWord+=str.charAt(8);
        reverseWord+=str.charAt(7);reverseWord+=str.charAt(6);reverseWord+=str.charAt(5);reverseWord+=str.charAt(4);
        reverseWord+=str.charAt(3);reverseWord+=str.charAt(2);reverseWord+=str.charAt(1);reverseWord+=str.charAt(0);

        System.out.println("reverseWord = " + reverseWord);
*/


        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        System.out.println(result);
    }}
