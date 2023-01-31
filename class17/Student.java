package class17;

import javax.naming.Name;

public class Student {
    String name;
    String id;
    int age;
    double weight;

    Student(String studentName,String studentId,int studentAge,double studentWeight){
       name= studentName;
       id= studentId;
       age=studentAge;
       weight=studentWeight;

    }
     void printInfo(){
        System.out.println(" Name "+name+" Id "+id+" age "+age+" Weight "+weight);
    }

    public static void main(String[] args) {
        Student Ali=new Student(" Ali "," ab7658 ",  +45  ,  78.7  );
        Ali.printInfo();
        Student Youssef=new Student(" Youssef "," ab7665 ",  25, 108.5);
        Youssef.printInfo();
        Student Amina=new Student(" Amina "," ab7050 ",   16,  68.2);
        Amina.printInfo();
        Student Sara=new Student(" Sara "," ab6600 ",    32,  88.3);
        Sara.printInfo();
        Student Ibrahim=new Student(" Ibrahim "," ab5008 ",  65,  58.7);
        Ibrahim.printInfo();
        
    }





}
