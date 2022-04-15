package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
       // System.out.println(AccessModifiersTest4.name1); //default is visible outside the package in subclass only

        System.out.println(AccessModifiersTest4.name2); //protected is visible outside the package in subclass only

        //AccessModifiersTest4.method1();
        AccessModifiersTest4.method2();





    }
}
