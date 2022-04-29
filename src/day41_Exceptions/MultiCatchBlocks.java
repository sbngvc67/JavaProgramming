package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee=null;

        try {
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("First");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fourth");
            e.printStackTrace();
        }
        System.out.println("Test Completed");
        System.out.println("-----------------------------------");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
}
