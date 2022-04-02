package day29_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println("list = " + list);
        
        list.retainAll(Arrays.asList(2,4,7));
        System.out.println("list = " + list);

        list.contains(Arrays.asList(2,4,7));
        System.out.println("contain list = " + list);

        System.out.println("-----------------------");

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println("retain numbers = " + numbers);
        System.out.println("--------------------------");

        ArrayList<String> jobTitles=new ArrayList<>();
            jobTitles.addAll(Arrays.asList("QA","SDET","DEVELOPER","QA","SDET","SCRUM MASTER","BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("--------------------------");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1=nums.contains(10);
        boolean r2=nums.containsAll(Arrays.asList(5,2,10));
        System.out.println("r2 = " + r2);
        System.out.println("nums = " + nums);
        System.out.println("----------------------------");

        String[] names={"Josh","Jack","Daniel","Shay","Breanna"};
        ArrayList<String> namesList=new ArrayList<>(Arrays.asList(names));
        //namesList.addAll(Arrays.asList(names));
        System.out.println("nameslist = " + namesList);
        System.out.println("-------------------------------");
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(arr));
        System.out.println("list2 = " + list2);
        System.out.println("----------------------");

        int [] arr2={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3=new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);
    }

    public static ArrayList<Integer> convertArrayToArrayList(int [] array){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }

}
