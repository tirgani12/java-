package HomeWorkClass13;

public class HomeWork2 {
    public static void main(String[] args) {
        /*2) Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */
        String str="vgt675JUI980%$lk)(";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]","").length());
        System.out.println(str);
    }
}
