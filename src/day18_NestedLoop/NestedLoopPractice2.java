package day18_NestedLoop;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
