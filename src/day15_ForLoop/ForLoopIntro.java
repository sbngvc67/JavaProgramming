package day15_ForLoop;

public class ForLoopIntro {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("*******************************");

        for (int i=1; i<=2; i++){
            System.out.println("Hello World");
        }

        System.out.println();

        for (int i=1; i<=8; i++){
            System.out.println("* * * * * *");
        }
        System.out.println();
        for (int i=1; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.print("FINRA"+" ");
            }else if(i%3==0){
                System.out.print("FIN"+" ");
            }else if (i%5==0){
                System.out.print("RA"+" ");
            }else{
                System.out.print(i+" ");
            }
        }


    }
}
