package day22_MultiDimensionalArray;

import java.util.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;
        int [][] result1=new int[matrix.length][];

        int j=0;
        for (int i = 0; i < matrix.length; i++, j++) {

            matrix[i][j]+=result1[i][j];
        }

        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}