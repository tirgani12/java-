package taskClass17;

public class Student {
    String name;
    String address;
    Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("My name is "+name+" My age is "+address);
    }

    public static void main(String[] args) {
        Student student=new Student("John","123 boston");
        student.displayInfo();

    }

}
