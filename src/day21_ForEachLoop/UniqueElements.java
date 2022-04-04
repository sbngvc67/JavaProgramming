package day21_ForEachLoop;

import java.io.FilterOutputStream;

public class UniqueElements {
    public static void main(String[] args) {


        String [] words={"Layan", "Cihad","Oleksandr","Olga","Adam","Adam"};

        for (String each : words) {
            int count=0;
            for (String elements : words) {
                if (elements.equals(each)){
                    count++;
                }
        }
            if (count==1){
                System.out.println(each);

            }


        }

        }



    }

