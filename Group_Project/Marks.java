package Group_Project;
/*
We have to calculate the average of marks
        obtained in three subjects by student A and by
        student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
        the average percentage of marks. Provide
        implementation of abstract method in classes
        'A' and 'B'. The constructor of student A takes the
        marks in three subjects as its parameters and
        the marks in four subjects as its parameters for
        student B. Test your code

 */

abstract public class  Marks {
    ;
    double average;
    abstract double getPercentage();
}
 class A  {
     double subject1;
     double subject2;
     double subject3;
     double average;
    A(double subject1, double subject2, double subject3 ) {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;



    }
    double getPercentage() {
        average=((subject1+subject2+subject3)/3);
        System.out.println("The student A average percentage of marks is " +average+"%");
        return average;
    }



    }
class B{
    double subject1;
    double subject2;
    double subject3;
    double subject4;
    double average;
    B(double subject1,double subject2,double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;

    }
    double getPercentage(){
        average=((subject1+subject2+subject3+subject4)/4);
        System.out.println("The student B average percentage of marks is "+average+"%");
        return average;
    }
}
class Test2{
    public static void main(String[] args) {
        A a=new A(65.5,47.5,98.5);
        B b=new B(78,35.5,70,54.5);
        a.getPercentage();
        b.getPercentage();

    }

}
