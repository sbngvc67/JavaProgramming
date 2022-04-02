package day26_CustomMethodsPractice.day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {



        int [] numbers={10, 5, 4, 20, 9, 7};
        int min=numbers[0];// 10
/*
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i]; //assigning greater number to variable max
            }
        }

 */
        for (int number : numbers) {
            if (number<min){
                min=number;
            }
        }
        System.out.println(min);




    }
}
