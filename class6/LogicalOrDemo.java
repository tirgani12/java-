package class6;

public class LogicalOrDemo {
    public static void main(String[] args) {
        String day = "monday";
        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
            System.out.println("no class enjoy");
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("java class enjoy");
        } else if (day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Tuesday")) {
            System.out.println("manuel testing class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("review class");


        } else {
            System.out.println("wrong day entered");
        }
    }
}
