package class4;

public class NestIfDemo6 {
    public static void main(String[] args) {
        int money = 100;
        String day = "sunday";
        boolean mood = true;
        if (money > 700) {
            if (mood) {
                System.out.println("lets go shopping");
            }
        } else {
            System.out.println("lets save some money first");
        }
    }
}
