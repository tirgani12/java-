package taskClass17;

public class Task1 {
    /*
    1) Write a java class that will have a constructor:
     one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1
     */
    String name;
    int age;
    Task1(String setName,int setAge){
        name=setName;
        age=setAge;
    }
    Task1() {

    }

    public static void main(String[] args) {
        Task1 person1=new Task1("john",67 );
        Task1 person2=new Task1();
        System.out.println(person1);
        System.out.println(person2);
    }

}
