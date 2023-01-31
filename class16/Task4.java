package class16;

public class Task4 {
    /*
    4)Create a method that will say Hello in different language based on the country that will
    passed when method is executed



     */
    String sayHello(String countryName) {
        switch (countryName) {
            case "USA":
                return "Hello";
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            default:
                return "country not supported";
        }

    }

    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println(task4.sayHello("USA"));
    }

}