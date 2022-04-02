package day15_ForLoop;

public class ForLoopPractice2 {
    public static void main(String[] args) {

        for (char str=65; str<=90; str++ ){
            System.out.print(str+ " ");
        }
        System.out.println();

        for (int str=65; str<=90; str++ ){
            System.out.print((char)str+ " ");
        }

        System.out.println();

        for (char str='A'; str<='Z'; str++ ){
            System.out.print(str+ " ");
        }

        System.out.println();

        for (char str='a'; str<='z'; str++ ){
            System.out.print(str+ " ");
        }

        System.out.println();

        for (char str='z'; str>='a'; str-- ){
            System.out.print(str+ " ");
        }

        System.out.println("------------*************************----------------**************");

        for (char i=1; 1<=40000; i++){
            System.out.print(i+ " ");
        }






    }
}
