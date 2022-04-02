package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        int [] result=reverse(arr);
        System.out.println(Arrays.toString(result));

        double [] arr1={1.5,2.5,3.5,4.5,5.5};
        double [] result1= ArraysUtility.reverse(arr1);
        System.out.println(Arrays.toString(result1));




    }

    public static int[] reverse(int[] array){
        int [] result=new int[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;

    }

}
