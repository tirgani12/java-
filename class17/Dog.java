package class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;
    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }

    public static void main(String[] args) {
        Dog Husky=new Dog(" Husky"," Husky the dog"," white ", 2,  25.2);
        Husky.printInfo();
        Dog buldog=new Dog(" bulldog"," bulldog the dog"," Black ", 4, 27.1);
        buldog.printInfo();
        Dog labrador=new Dog(" Labrador"," Labrador","Brown ",6,34.6);
        labrador.printInfo();

    }
    void printInfo(){
        System.out.println("Name"+name+" Breed"+breed+" age"+age+" Weight"+weight);
    }

}
