package day20_Arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        pattern30(1);
        int count=1;
        do {
            count+=3;
        }while (count<5);
        System.out.println(count);

    }
    public static void pattern31(int n){



    }


    public static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            int nospaces=n-row;
            for (int s = 0; s < nospaces; s++) {
                System.out.print("  ");
            }

            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    public static void pattern1(int n){
        for (int rows = 1; rows < n; rows++) {
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patterndiamond(int n){
        for (int rows = 1; rows <2*n; rows++) {
            int totalColsInRow=rows>n ? 2*n-rows-1:rows;
            int nospaces=n-totalColsInRow;
            for (int s= 0; s <nospaces; s++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols <totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}