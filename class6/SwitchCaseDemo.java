package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country = "USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()) {//convert the text to lowercase USA=>usa
            case "usa":
                System.out.println("Burger");
                break;
            case "italy":
                System.out.println("pasta");
                break;
            case "morocco":
                System.out.println("couscous");
                break;
            default:
                System.out.println("wrong country");

        }
    }
}