package week10;

import java.util.ArrayList;

public class ArrayListExample01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //How can I put primitives into Arraylist:with the help of autoboxing
            arr.add(i);
        }
        System.out.println(arr);
    }
}
