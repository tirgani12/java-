package class29;

import java.util.ArrayList;

public class ArrauListDemo {
    public static void main(String[] args) {
        //Dog d1=new Dog("Jacky","Persian",15);
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Jacky", "Persian", 15));
        dogs.add(new Dog("John", "Russan", 18));
        dogs.add(new Dog("Emily", "German", 11));
        dogs.add(new Dog("Bob", "French", 20));
        for (Dog d : dogs) {
            d.printDogName();

        }

    }
}