package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets=new char[26]; //[Z ~ A]

        /*char ch2='A';
        for (int i = alphabets.length-1; i>=0; i--, ch2++) {
            alphabets[i]=ch2;
        }
*/
         char ch='Z';
        for (int i = 0; i<alphabets.length; i++, ch--) {
            alphabets[i]=ch;
        }

        System.out.println(Arrays.toString(alphabets));


    }
}
