package day13_StringClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int laptopPrice=0;


        System.out.println("Select screen size:");
        double screenSize=scan.nextDouble();
        if (screenSize==13.3){
            laptopPrice+=200;
        }else if (screenSize==15.0){
            laptopPrice+=300;
        }else{
            laptopPrice+=400;
        }

        System.out.println("Select CPU type:");
        String cpuType=scan.next();
        switch (cpuType){
            case "i3": laptopPrice+=150; break;
            case "i5": laptopPrice+=250; break;
            default: laptopPrice+=350; break;
        }

        System.out.println("Select RAM size:");
        byte ram=scan.nextByte();

        switch (ram){
            case 4: laptopPrice+=50; break;
            case 8: laptopPrice+=100; break;
            default: laptopPrice+=150; break;
        }


        System.out.println("Select storage type:");
        String storageType=scan.next();


        System.out.println("Enter memory size:");
        int memorySize=scan.nextInt();
        if (scan.equals("HDD")){
            laptopPrice+=50*(memorySize/500);
        }else{
            laptopPrice+=100*(memorySize/500);
        }

        System.out.println("Enter screen resolution:");
        String screenResolution=scan.next();
        switch(screenResolution){
            case "FULLHD": laptopPrice += 100; break;
                case "4K": laptopPrice += 200;
    }

        System.out.println("Laptop price is: $"+laptopPrice);












    }
}
