package Group_Project;
/*
Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
 */

public class Car {
    double carPrice;
    String color;
    Car(){



    }
    double calculateSalePrice(){
        return carPrice;
    }
}
class Truck extends Car{
    double weight;
    Truck( double carPrice, double weight){
        super();
        this.carPrice=carPrice;

        this.weight=weight;


    }

    @Override
    double calculateSalePrice() {
        if (weight>2000){
            carPrice=carPrice-(carPrice*10/100);
        }else {
            carPrice=carPrice-(carPrice*20/100);
        }
        System.out.println("The Truck sale price is "+carPrice);

        return carPrice;
    }

}
class Sedan extends Car{
    double length;
    Sedan(double carPrice,double length){
        super();
        this.carPrice=carPrice;
        this.length=length;

    }

    @Override
    double calculateSalePrice() {
        if (length>20){
            carPrice=carPrice-(carPrice*5/100);
        }else {
            carPrice=carPrice-(carPrice*10/100);
        }
        System.out.println("The Sedan sale price is "+carPrice);
        return carPrice;
    }
}
class test3{
    public static void main(String[] args) {
        Car[] cars={new Truck(76500,1900),new Sedan(45000,13)};
        for (Car car:cars){
            car.calculateSalePrice();
        }
    }
}
