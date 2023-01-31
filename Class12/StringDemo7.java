package Class12;

public class StringDemo7 {
    public static void main(String[] args) {
       String str="I love Java";
       boolean startsWith=str.startsWith("I love");
        System.out.println(startsWith);

        System.out.println(str.endsWith("java"));
        //Method chaining is when multiple methods are called on the same line be chained
        // only those methods can be chained witch returns a string
        System.out.println(str.toLowerCase().startsWith("i"));
        //system.out println(str.length().startsWith("i"));
        System.out.println(str.contains("java"));

        }
    }







