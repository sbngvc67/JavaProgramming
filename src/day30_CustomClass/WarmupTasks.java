package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

       // int [] arr={1,2,3,4,5,6,7,8};
        //System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------------");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int size= list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize= list.size();
        int totalNumberOf0=size-newSize;
        System.out.println("totalNumberOf0 = " + totalNumberOf0);

        for (int i = 0; i < totalNumberOf0; i++) {
            list.add(0);
        }


       // list.addAll(Arrays.asList(0,0,0,0));
        System.out.println("list = " + list);

        System.out.println("----------------------------------");
        String str="ABCD123$%#@&456EFG!";

        ArrayList<Character> chars=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters=new ArrayList<>(chars);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);
        
        ArrayList<Character> digits=new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialCh=new ArrayList<>(chars);
        specialCh.removeAll(letters);
        specialCh.removeAll(digits);
        System.out.println("specialCh = " + specialCh);








    }
}
