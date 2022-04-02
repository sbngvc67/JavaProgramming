package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA=new ArrayList<>(scores);
        gradeOfA.removeIf(p-> !(p<=100 && p>=90));
        System.out.println("gradeOfA = " + gradeOfA);


        ArrayList<Integer> gradeOfB=new ArrayList<>(scores);
        gradeOfB.removeIf(p-> !(p<=89 && p>=80));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC=new ArrayList<>(scores);
        gradeOfC.removeIf(p-> !(p<=79 && p>=70));
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer> gradeOfD=new ArrayList<>(scores);
        gradeOfD.removeIf(p-> !(p<=69 && p>=60));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer> gradeOfF=new ArrayList<>(scores);
        gradeOfF.removeIf(p-> !(p<=59 && p>=0));
        System.out.println("gradeOfF = " + gradeOfF);

        System.out.println("Total number of A: "+gradeOfA.size());
        System.out.println("Total number of B: "+gradeOfB.size());
        System.out.println("Total number of C: "+gradeOfC.size());
        System.out.println("Total number of D: "+gradeOfD.size());
        System.out.println("Total number of F: "+gradeOfF.size());





    }
}
