package Group_Project;
 /*
    1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
     */

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("The area of a circle is "+Math.PI*radius*radius);

    }

    @Override
    public void  calculatePerimeter() {
        System.out.println("The perimeter of a circle is "+2*Math.PI*radius);
    }
}
class Square implements Shape{

    double side;

    Square(double side){
        this.side=side;

    }
    @Override
    public void calculateArea() {
        System.out.println("The area of a square is "+side*side);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of a square is "+ 4*side);

    }
}
class Test1{
    public static void main(String[] args) {
        Shape [] shapes={new Circle(2.5),new Square(3.5)};
        for (Shape shape:shapes){
            shape.calculateArea();
            shape.calculatePerimeter();
        }
    }
}
