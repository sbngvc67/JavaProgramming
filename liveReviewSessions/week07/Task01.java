package week07;

public class Task01 {
    public static void main(String[] args) {
/*
        String result="";
        int count =0;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.println(i);
                count++;
                if (result.contains(""+i)){
                    continue;
                }

                result+=i;
                result+=count;
            }
            System.out.println(result);
            
        }

 */

        int rowCount=5;
        for (int row=1; row <=rowCount ; row++) {

            int value=row;
            for (int col = 1; col <=row ; col++) {
                System.out.print(value+" ");
                value+=rowCount-col;
            }
            System.out.println();

        }

    }
}
