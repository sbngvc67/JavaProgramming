package day26_CustomMethodsPractice.day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int [] numbers={10, 5, 4, 20, 1, 0};
        int max=numbers[0];// 10
/*
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i]; //assigning greater number to variable max
            }
        }

 */
        for (int number : numbers) {
            if (number>max){
                max=number;
            }
        }
        System.out.println(max);



    }
}