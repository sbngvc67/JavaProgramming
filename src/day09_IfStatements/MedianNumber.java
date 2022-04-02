package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=1000, b=5, c=2000;

        boolean aIsMedian= (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian= (b>a && b<c) || (b>c && b<a);
        boolean cIsMedian= !aIsMedian && !bIsMedian;
        
        if (aIsMedian){//If a is the median number
            System.out.println(a+" is the median number");
        }
        if (bIsMedian){//If b is the median number
            System.out.println(b+" is the median number");
        }
        if (cIsMedian){//If c is the median number
            System.out.println(c+" is the median number");
        }


       /* if (a<b && a>c){

        }
*/

    }
}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */