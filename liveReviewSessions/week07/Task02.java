package week07;

public class Task02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) { // handle rows

            for (int j = 1; j <=i; j++) { // handles columns
                //System.out.print(j%2==0? 0 : 1);
                if (j%2==1){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();

        }





    }
}
