package class21;

public class Task {
    void calculateArea(double length, double width) {
        System.out.println("Area of rectangle is " + (length * width));

    }

    void calculateArea(double side) {
        System.out.println("Area of square is " + (side * side));
    }
}
 class TaskTester{
    public static void main(String[] args) {
        Task task=new Task();
        task.calculateArea(10);
        task.calculateArea(10,20);

    }
}