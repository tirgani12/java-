package class22;

public class Employee {
    String name;
    static int baseSalary=30000;
   static int baseHoliday=10;
    void printSalary(){
        System.out.println(baseSalary);
    }
    void printHoliday(){
        System.out.println(baseHoliday);
    }
}
class OfficeBoy extends Employee{

}
class Manager extends Employee{
    void printSalary()
    {
        System.out.println((baseSalary*4)+200000);
    }
}
class Devlopper extends Employee{
    void printSalary(){
        System.out.println((baseSalary*3)+30000);
    }

}
class QA extends Employee{
    void printSalary(){
        System.out.println((baseSalary*2)+30000);
    }
    void printHoliday(){
        System.out.println(baseHoliday+5);
    }
}