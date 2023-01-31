package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true || false || false);
        boolean boughtCHO = true;
        boolean boughtFlowers = true;
        if (boughtCHO || boughtFlowers) {
            System.out.println("i am happy");
        } else {

            System.out.println(" i am sad");
        }
        boolean wifi=true;
        boolean fiveG=true;
        if (wifi||fiveG){
            System.out.println(" you are good for browsing the internet");
        }else {
            System.out.println("either connect to wifi or to 5g");
        }
    }
}