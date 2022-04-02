package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int [] arr={1,1,1,2,2,3,4,4,4};
        arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");
        String [] words={"Java","Java","C#","Java","C#"};
        words=removeDuplicates(words);
        System.out.println(Arrays.toString(words));

        int [] ar={1,1,1,2,2,3,3,4,4,4,5,5,5};
        ar=Arrays.stream(ar).distinct().toArray();
        System.out.println(Arrays.toString(ar));


    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[]array){
        int[] result={};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each))
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }
    public static double[] removeDuplicates(double[]array){
        double[] result={};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each))
                result=ArraysUtility.addElement(result,each);
        }

        return result;
    }
    public static char[] removeDuplicates(char[]array){
        char[] result={};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each))
                result=ArraysUtility.addElement(result,each);
        }

        return result;
    }
    public static String[] removeDuplicates(String[]array){
        String[] result={};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each))
                result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

}
