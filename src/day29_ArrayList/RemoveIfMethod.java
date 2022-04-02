package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("list = " + list);
       /*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2!=0){
                list.remove(i);
            }
        }

        */
        System.out.println("list = " + list);

        list.removeIf(p -> p<=5); //Lambda expression
        System.out.println("list-5 = " + list);

        System.out.println("--------------------------------");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(i -> i%2==0);
        System.out.println("list2 = " + list2);
        System.out.println("******************************");
        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));
        names.removeIf(p -> p.startsWith("J"));
        System.out.println("names = " + names);
        System.out.println("--------------------------------------------------");
        
        ArrayList<String> names1=new ArrayList<>();
        names1.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));
        names1.removeIf(p -> !StringUtility.isPalindrome(p));
        System.out.println("names1 = " + names1);




    }
}
