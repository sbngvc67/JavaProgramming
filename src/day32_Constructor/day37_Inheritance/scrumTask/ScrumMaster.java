package day32_Constructor.day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

    public void arrange(){
        System.out.println(jobTitle+" "+name+" is arranging the meetings");
    }

}
