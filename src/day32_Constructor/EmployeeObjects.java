package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Aaron");
        Employee employee2=new Employee("Yuliya",'F');
        Employee employee3=new Employee("Olga",'F',"SDET");
        Employee employee4=new Employee("Olga",'F',"SDET",200000);




        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);





    }
}
